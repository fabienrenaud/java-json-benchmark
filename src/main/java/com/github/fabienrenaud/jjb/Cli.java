package com.github.fabienrenaud.jjb;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.github.fabienrenaud.jjb.support.Api;
import com.github.fabienrenaud.jjb.support.BenchSupport;
import com.github.fabienrenaud.jjb.support.Libapi;
import com.github.fabienrenaud.jjb.support.Library;
import io.airlift.airline.Cli.CliBuilder;
import io.airlift.airline.Command;
import io.airlift.airline.Help;
import io.airlift.airline.Option;
import io.airlift.airline.OptionType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.ChainedOptionsBuilder;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.io.File;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author Fabien Renaud
 */
public final class Cli {

    private Cli() {
    }

    public static void main(String[] args) throws RunnerException {
        CliBuilder<Runnable> builder = io.airlift.airline.Cli.<Runnable>builder("bench")
            .withDescription("Benchmark JSON libraries")
            .withDefaultCommand(Help.class)
            .withCommands(Help.class, InfoCommand.class, SerializationCommand.class, DeserializationCommand.class);

        io.airlift.airline.Cli<Runnable> gitParser = builder.build();
        gitParser.parse(args).run();
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "mode")
    @JsonSubTypes({@JsonSubTypes.Type(value = DeserializationCommand.class, name = "Deserialization"), @JsonSubTypes.Type(value = SerializationCommand.class, name = "Serialization")})
    public static abstract class AbstractCommand implements Runnable {

        /*
         * JMH options
         */
        @Option(type = OptionType.GLOBAL, name = "-f", description = "JMH: forks. Defaults to 2.")
        public int forks = 2;
        @Option(type = OptionType.GLOBAL, name = "-wi", description = "JMH: warmup iterations. Defaults to 5.")
        public int warmupIterations = 5;
        @Option(type = OptionType.GLOBAL, name = "-i", description = "JMH: measurement iterations. Defaults to 10.")
        public int measurementIterations = 10;
        @Option(type = OptionType.GLOBAL, name = "-m", description = "JMH: measurement time in seconds. Defaults to 3.")
        public int measurementTime = 3;
        @Option(type = OptionType.GLOBAL, name = "-t", description = "JMH: number of threads. Defaults to 16.")
        public int threads = 16;

        /*
         * JSON options
         */
        @Option(name = "--libs", description = "Libraries to test (csv). Defaults to all supported. See 'info' to know more.")
        public String libraries = "";
        @Option(name = "--apis", description = "APIs to benchmark (csv). Available: stream, databind. Defaults to all supported. See 'info' to know more.")
        public String apis = "";
        @Option(name = "--number", description = "Number of random payloads to generate. One is randomly picked for each benchmark iteration. Defaults to 1.")
        public int numberOfPayloads = 1;
        @Option(name = "--size", description = "Size of each payload in Kb. Defaults to 1.")
        public int sizeOfEachPayloadInKb = 1;
        @Option(name = "--datatype", description = "Type of data to test. Defaults to 'users'. See 'info' to know more.")
        public String dataType = "users";

        private String mode;

        public AbstractCommand() {
        }

        public AbstractCommand(final String mode) {
            this.mode = mode;
        }

        @Override
        public void run() {
            if (libraries == null || libraries.contains("javaxjson")) {
                JsonUtils.printJavaxJsonProvider();
            }

            ChainedOptionsBuilder b = new OptionsBuilder()
                .forks(forks)
                .warmupIterations(warmupIterations)
                .measurementIterations(measurementIterations)
                .measurementTime(new TimeValue(measurementTime, TimeUnit.SECONDS))
                .threads(threads);
//                .addProfiler(StackProfiler.class);

            List<String> includes = includes();
            if (includes.isEmpty()) {
                exit("No tests to run. Check 'info' to see what you can do.");
            }
            for (String i : includes) {
                b.include(i);
            }

            File config = Config.save(this);

            Options opt = b.build();
            try {
                new Runner(opt).run();
            } catch (RunnerException ex) {
                throw new RuntimeException(ex);
            } finally {
                config.delete();
            }
        }

        private BenchSupport validateBenchSupport() {
            try {
                return BenchSupport.valueOf(dataType.toUpperCase());
            } catch (Exception ex) {
                exit("Datatype: '" + dataType + "' does not exist.");
                throw new RuntimeException(ex);
            }
        }

        private Set<Library> validateLibraries(BenchSupport bs) {
            Set<Library> libs = Library.fromCsv(libraries);
            Set<Library> supportedLibs = bs.supportedLibs();
            if (libs.isEmpty()) {
                return supportedLibs;
            }

            StringBuilder errorMsg = new StringBuilder();
            for (Library l : libs) {
                if (!supportedLibs.contains(l)) {
                    errorMsg.append("Datatype: '").append(dataType).append("' does not support library '").append(l).append("'").append(System.getProperty("line.separator"));
                }
            }
            if (errorMsg.length() > 0) {
                exit(errorMsg.toString());
            }
            return libs;
        }

        private List<String> includes() {
            List<String> includes = new ArrayList<>();

            BenchSupport bs = validateBenchSupport();
            Set<Library> libs = validateLibraries(bs);
            Set<Api> lApis = Api.fromCsv(apis);
            for (Libapi la : bs.libapis()) {
                if (libs.contains(la.lib())) {
                    for (Api a : la.api()) {
                        if (lApis.isEmpty() || lApis.contains(a)) {
                            includes.add(".*\\." + a + "\\." + mode + "\\." + la.lib() + ".*");
                        }
                    }
                }
            }

            return includes;
        }

        private void exit(final String msg) {
            System.err.print(msg);
            System.err.println();
            System.exit(2);
        }

    }

    @Command(name = "deser", description = "Runs the deserialization benchmarks")
    public static final class DeserializationCommand extends AbstractCommand {

        public DeserializationCommand() {
            super("Deserialization");
        }

    }

    @Command(name = "ser", description = "Runs the serialization benchmarks")
    public static final class SerializationCommand extends AbstractCommand {

        public SerializationCommand() {
            super("Serialization");
        }

    }

    @Command(name = "info")
    public static final class InfoCommand implements Runnable {

        @Override
        public void run() {
            System.out.println();
            System.out.println("Datatypes:");
            for (BenchSupport bs : BenchSupport.values()) {
                System.out.println("  + " + bs.name().toLowerCase());
                for (Libapi la : bs.libapis()) {
                    System.out.println(String.format("      Lib: %-20s | Api: %s", la.lib(), la.api()));
                }
                System.out.println();
            }
        }
    }
}
