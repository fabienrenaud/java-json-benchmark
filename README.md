# Benchmark of Java JSON libraries

## Purpose

The purpose of this project is to evaluate serialization and deserialization performance of JSON libraries in Java.
The following libraries are evaluated:

* [jackson](https://github.com/FasterXML/jackson)
* [genson](https://owlike.github.io/genson/)
* [fastjson](https://github.com/alibaba/fastjson)
* [gson](https://github.com/google/gson)
* [org.json](https://github.com/stleary/JSON-java)
* [javax-json](https://jsonp.java.net/) (from Oracle)
* [json-io](https://github.com/jdereg/json-io)
* [flexjson](http://flexjson.sourceforge.net/)
* [boon](https://github.com/boonproject/boon)
* [json-smart](http://netplex.github.io/json-smart/)
* [johnzon](http://johnzon.apache.org/)
* [logansquare](https://github.com/bluelinelabs/LoganSquare)
* [dsl-json](https://github.com/ngs-doo/dsl-json)
* [json-simple](https://code.google.com/archive/p/json-simple/)
* [nanojson](https://github.com/mmastrac/nanojson)
* [moshi](https://github.com/square/moshi)

This benchmark tests throughput performance of serialization and deserialization algorithms of the databind and stream API when available.
Random payloads of various sizes are generated at runtime before each benchmark.

Four different sizes of payloads are evaluated in the charts below: 1 KB, 10 KB, 100 KB and 1 MB. And it is possible to generate on the fly any size of payloads.

Each benchmark has been written to read bytes from RAM and write to reusable output streams in RAM when possible, strings are rarely generated. All data is randomly generated upon static loading.

This benchmark does NOT evaluate:

* compression performance or efficiency
* payloads bigger than 1.1 MB (would be easy to do though)
* RAM utilization

## Results

The benchmarks are written with [JMH](http://openjdk.java.net/projects/code-tools/jmh/) and for Java 8.

The results here-below were computed on November the 21st, 2016 with the following libraries and versions:

| Library     | Version |
|-------------|---------|
| jackson     | 2.8.4   |
| genson      | 1.4     |
| fastjson    | 1.2.20  |
| gson        | 2.8.0   |
| org.json    | 20090211   |
| javax-json  | 1.0, 1.0.4 |
| json-io     | 4.9.0   |
| flexjson    | 3.3     |
| boon        | 0.34    |
| json-smart  | 2.3     |
| johnzon     | 0.9.5   |
| logansquare | 1.3.7   |
| dsl-json    | 1.1.2   |
| simplejson  | 1.1.1   |
| nanojson    | 1.2     |
| jodd json   | 3.8.0   |
| moshi       | 1.3.1   |

[All graphs and sheets are available in this google doc.](https://docs.google.com/spreadsheets/d/1NUPQP7MlNkTam165Rc1SoUpcw_YdpLQp29Eg4eSfqbM/edit?usp=sharing)

### Deserialization performance

![json deserialization performance](https://docs.google.com/spreadsheets/d/e/2PACX-1vTD4k5AtnQ7TN08y94UAZdx5YS_HyEKdhHteqS-xw9WRyluGiVYPIjryBx1JYtC2MOAAYQjU4wWajhH/pubchart?oid=746064058&format=image)

[Raw JMH results here][jmh-results]

### Serialization performance

![json serialization performance](https://docs.google.com/spreadsheets/d/e/2PACX-1vTD4k5AtnQ7TN08y94UAZdx5YS_HyEKdhHteqS-xw9WRyluGiVYPIjryBx1JYtC2MOAAYQjU4wWajhH/pubchart?oid=1130150523&format=image)

[Raw JMH results here][jmh-results]

### Benchmark configuration

#### JMH

    # JMH 1.15 (released 52 days ago)
    # VM version: JDK 1.8.0_45, VM 25.45-b02
    # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/bin/java
    # VM options: -XX:+AggressiveOpts -Xms2G -Xmx2G
    # Warmup: 3 iterations, 1 s each
    # Measurement: 5 iterations, 2 s each
    # Timeout: 10 min per iteration
    # Threads: 16 threads, will synchronize iterations
    # Benchmark mode: Throughput, ops/time

#### Hardware

    Model Name: MacBook Pro
    Processor Name: Intel Core i7
    Processor Speed: 2.6 GHz
    Number of Processors: 1
    Total Number of Cores: 4
    L2 Cache (per Core): 256 KB
    L3 Cache: 6 MB
    Memory: 16 GB

## Run

By default, running `./bench ser` (`./bench deser` respectively) will run 
all -- stream and databind -- serialization (deserialization respectively)
benchmarks with 1 KB payloads of _Users_.

You can also specificy which libs, apis, payload-sizes and number of 
iterations (and more) you want to run. For example:

    ./bench deser --apis stream --libs genson,jackson 
    ./bench ser --apis databind,stream --libs jackson 
    ./bench deser --apis stream --libs dsljson,jackson --size 10 --datatype users
 
Type `./bench help ser` or `./bench help deser` to print help for those
commands.

If you wish to run _all_ benchmarks used to generate the reports above,
you can run `./bench-all`. This will take several hours to complete, so
be patient.

## Contribute

Any help to improve the existing benchmarks or write ones for other
libraries is welcome.

Adding a JSON library to the benchmark requires little work and you can
find numerous examples in the commit history. For instance:

 * Addition of moshi: https://github.com/fabienrenaud/java-json-benchmark/commit/6af2c0a7091b12a9dc768e49499682b97ea57ff6
 * Addition of jodd: https://github.com/fabienrenaud/java-json-benchmark/commit/288a4e61496588ed4c0a80e1f107f34f9a2c985c
 * Addition of json-simple: https://github.com/fabienrenaud/java-json-benchmark/commit/1e1e559c39a6eddc3dd7d7cea777fc7861415469
 

Pull requests are welcome.

[jmh-results]: /archive/raw-results-2016-11-21.md
