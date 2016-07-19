package com.github.fabienrenaud.jjb;

import io.airlift.airline.*;
import io.airlift.airline.Cli.CliBuilder;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.ChainedOptionsBuilder;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Fabien Renaud
 */
public final class Main {

    private Main() {
    }

    public static void main(String[] args) throws RunnerException {
        CliBuilder<Runnable> builder = Cli.<Runnable>builder("bench")
            .withDescription("Benchmark JSON libraries")
            .withDefaultCommand(Help.class)
            .withCommands(Help.class, SerializationCommand.class, DeserializationCommand.class);

        Cli<Runnable> gitParser = builder.build();
        gitParser.parse(args).run();
    }

    public static abstract class AbstractCommand implements Runnable {

        private static final Set<String> LIBRARIES = new HashSet<>(Arrays.asList("jackson", "jackson_afterburner", "genson", "fastjson", "gson", "orgjson", "jsonp", "jsonio", "boon", "johnson", "jsonsmart"));

        /*
         * JMH options
         */
        @Option(type = OptionType.GLOBAL, name = "-f", description = "JMH: forks. Defaults to 1.")
        public int forks = 1;
        @Option(type = OptionType.GLOBAL, name = "-wi", description = "JMH: warmup iterations. Defaults to 5.")
        public int warmupIterations = 5;
        @Option(type = OptionType.GLOBAL, name = "-i", description = "JMH: measurement iterations. Defaults to 5.")
        public int measurementIterations = 5;
        @Option(type = OptionType.GLOBAL, name = "-m", description = "JMH: measurement time. Defaults to 1.")
        public int measurementTime = 1;
        @Option(type = OptionType.GLOBAL, name = "-t", description = "JMH: number of threads. Defaults to 1.")
        public int threads = 1;

        /*
         * JSON options
         */
        @Option(name = "--libs", description = "Libraries to test (csv). Defaults to all. Available: jackson, jackson_afterburner, genson, fastjson, gson, orgjson, jsonp, jsonio, boon, johnson, jsonsmart")
        public String libraries;
        @Option(name = "--apis", description = "APIs to benchmark (csv). Available: stream, databind")
        public String apis;
        @Option(name = "--number", description = "Number of random payloads to generate. One is randomly picked for each benchmark iteration. Defaults to 1.")
        public int numberOfPayloads = 1;
        @Option(name = "--size", description = "Size of each payload in Kb. Defaults to 1.")
        public int sizeOfEachPayloadInKb = 1;

        @Override
        public void run() {
            JsonSource.saveParams(new JsonSource.InitParams(sizeOfEachPayloadInKb, numberOfPayloads));
            if (libraries == null || libraries.contains("jsonp")) {
                JsonHelp.printJsonpInfo();
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
                JsonSource.deleteParams();
            }
        }

        protected abstract String mode();

        private List<String> includes() {
            List<String> l = new ArrayList<>();
            switch (mode()) {
                case "ser":
                    for (String p : prefixes()) {
                        for (String s : suffixes()) {
                            l.add(".*" + p + "Serialization" + s);
                        }
                    }
                    break;
                case "deser":
                    for (String p : prefixes()) {
                        for (String s : suffixes()) {
                            l.add(".*" + p + "Deserialization" + s);
                        }
                    }
                    break;
                default:
                    throw new IllegalStateException("Invalid mode: " + mode());
            }
            return l;
        }

        private List<String> prefixes() {
            List<String> l = new ArrayList<>();
            if (apis == null) {
                apis = "stream,databind";
            }
            for (String t : apis.split(",")) {
                switch (t) {
                    case "stream":
                        l.add("Stream");
                        break;
                    case "databind":
                        l.add("Databind");
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid value: " + t);
                }
            }
            return l;
        }

        private List<String> suffixes() {
            if (libraries == null) {
                return Arrays.asList(".*");
            }

            List<String> list = new ArrayList<>();
            for (String l : libraries.split(",")) {
                if (!LIBRARIES.contains(l)) {
                    throw new IllegalArgumentException("Invalid value: " + l);
                }
                list.add("." + l + "*");
            }
            return list;
        }
    }

    @Command(name = "deser", description = "Runs the deserialization benchmarks")
    public static final class DeserializationCommand extends AbstractCommand {

        @Override
        protected String mode() {
            return "deser";
        }

    }

    @Command(name = "ser", description = "Runs the serialization benchmarks")
    public static final class SerializationCommand extends AbstractCommand {

        @Override
        protected String mode() {
            return "ser";
        }

    }
}
