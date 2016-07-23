package com.github.fabienrenaud.jjb;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
 *
 * @author Fabien Renaud
 */
public final class Cli {

    private Cli() {
    }

    public static void main(String[] args) throws RunnerException {
        CliBuilder<Runnable> builder = io.airlift.airline.Cli.<Runnable>builder("bench")
            .withDescription("Benchmark JSON libraries")
            .withDefaultCommand(Help.class)
            .withCommands(Help.class, SerializationCommand.class, DeserializationCommand.class);

        io.airlift.airline.Cli<Runnable> gitParser = builder.build();
        gitParser.parse(args).run();
    }

    @JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "mode"
    )
    @JsonSubTypes({
        @JsonSubTypes.Type(value = DeserializationCommand.class, name = "Deserialization"),
        @JsonSubTypes.Type(value = SerializationCommand.class, name = "Serialization")
    })
    public static abstract class AbstractCommand implements Runnable {

        private static final Set<String> LIBRARIES = new HashSet<>(Arrays.asList("jackson", "jackson_afterburner", "genson", "fastjson", "gson", "orgjson", "jsonp", "jsonio", "boon", "johnson", "jsonsmart"));

        /*
         * JMH options
         */
        @Option(type = OptionType.GLOBAL, name = "-f", description = "JMH: forks. Defaults to 2.")
        public int forks = 2;
        @Option(type = OptionType.GLOBAL, name = "-wi", description = "JMH: warmup iterations. Defaults to 3.")
        public int warmupIterations = 3;
        @Option(type = OptionType.GLOBAL, name = "-i", description = "JMH: measurement iterations. Defaults to 5.")
        public int measurementIterations = 5;
        @Option(type = OptionType.GLOBAL, name = "-m", description = "JMH: measurement time in seconds. Defaults to 2.")
        public int measurementTime = 2;
        @Option(type = OptionType.GLOBAL, name = "-t", description = "JMH: number of threads. Defaults to 16.")
        public int threads = 16;

        /*
         * JSON options
         */
        @Option(name = "--libs", description = "Libraries to test (csv). Defaults to all. Available: jackson, jackson_afterburner, genson, fastjson, gson, orgjson, jsonp, jsonio, boon, johnson, jsonsmart")
        public String libraries;
        @Option(name = "--apis", description = "APIs to benchmark (csv). Available: stream, databind. Defaults to 'stream,databind'")
        public String apis = "stream,databind";
        @Option(name = "--number", description = "Number of random payloads to generate. One is randomly picked for each benchmark iteration. Defaults to 1.")
        public int numberOfPayloads = 1;
        @Option(name = "--size", description = "Size of each payload in Kb. Defaults to 1.")
        public int sizeOfEachPayloadInKb = 1;
        @Option(name = "--datatype", description = "Type of data to test. Available: users. Defaults to 'users'")
        public String dataType = "users";

        private String mode;

        public AbstractCommand() {
        }

        public AbstractCommand(final String mode) {
            this.mode = mode;
        }

        @Override
        public void run() {
            File config = Config.save(this);
            if (libraries == null || libraries.contains("jsonp")) {
                JsonUtils.printJavaxJsonProvider();
            }

            ChainedOptionsBuilder b = new OptionsBuilder()
                .forks(forks)
                .warmupIterations(warmupIterations)
                .measurementIterations(measurementIterations)
                .measurementTime(new TimeValue(measurementTime, TimeUnit.SECONDS))
                .threads(threads);
//                .addProfiler(StackProfiler.class);

            for (String i : includes()) {
                b.include(i);
            }

            Options opt = b.build();
            try {
                new Runner(opt).run();
            } catch (RunnerException ex) {
                throw new RuntimeException(ex);
            } finally {
                config.delete();
            }
        }

        private List<String> includes() {
            List<String> l = new ArrayList<>();

            String[] packageNames = apis.split(",");
            for (String p : packageNames) {
                for (String s : suffixes()) {
                    // e.g: .*.databind.Serialization.*
                    l.add(".*." + p + "." + mode + "." + s);
                }
            }
            return l;
        }

        private List<String> suffixes() {
            if (libraries == null) {
                return Arrays.asList("*");
            }

            List<String> list = new ArrayList<>();
            for (String l : libraries.split(",")) {
                if (!LIBRARIES.contains(l)) {
                    throw new IllegalArgumentException("Invalid value: " + l);
                }
                list.add(l + "*");
            }
            return list;
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
}
