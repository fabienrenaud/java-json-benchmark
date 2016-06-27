# Benchmark of Java JSON libraries

## Purpose

The purpose of this project is to evaluate serialization and deserialization performance of JSON libraries in Java.
The following libraries are evaluated:

* [Jackson](https://github.com/FasterXML/jackson)
* [Genson](https://owlike.github.io/genson/)
* [fastjson](https://github.com/alibaba/fastjson)
* [GSON](https://github.com/google/gson)
* [org.json](https://github.com/stleary/JSON-java)
* [jsonp](https://jsonp.java.net/) (from Oracle)

This benchmark is mainly made of three tests: 1) deserialization; 2) deserialization with usage of data; and 3) serialization; with both _stream_ and _databind_ APIs when available.
Tested payloads are rather *small*, between 1k and 3k of data, and were generated using [json-generator.com](http://www.json-generator.com/) and borrowed from [here](https://github.com/terencetaih/aws-speed/tree/master/JsonProcess).

Each benchmark has been written to read strings, write strings and make reuse of factories when possible. All JSON files are statically loaded and cached upon startup of the app and are therefore not impacting the results.

This benchmark does NOT evaluate:

* compression performance or efficiency
* big JSON payload

## Results

This benchmark was performed using [JMH](http://openjdk.java.net/projects/code-tools/jmh/) and Java 8.
Read below for JMH, java and hardware info.

[All graphs and sheets are available in this google doc.](https://docs.google.com/spreadsheets/d/1QJ8vwMXTHidMX4jo6aldGRt7d7DzPqvQJ4ETaevKT-c/edit?usp=sharing)

## Deserialization performance

[comment]: # "From tsv to md:"
[comment]: # "Search:  ([\w/]+)\t([\w\d\.]+)\t([\w\d\.%]+)"
[comment]: # "Replace: | $1 | $2 | $3 |"

![json deserialization performance chart](https://docs.google.com/spreadsheets/d/1QJ8vwMXTHidMX4jo6aldGRt7d7DzPqvQJ4ETaevKT-c/pubchart?oid=1355965597&format=image)

| Benchmark | Score | Normalized |
|-----------|-------|------------|
| stream/jsonp | 1798.703 | 11.68% |
| stream/orgjson | 2777.25 | 18.03% |
| databind/gson | 5826.899 | 37.82% |
| stream/gson | 6162.872 | 40.00% |
| databind/fastjson | 7583.584 | 49.22% |
| stream/genson | 8368.202 | 54.32% |
| databind/genson | 10771.937 | 69.92% |
| databind/jackson | 11959.803 | 77.63% |
| stream/jackson | 12540.903 | 81.40% |
| databind/jackson+afterburner | 15406.066 | 100.00% |


## Serialization performance

![json serialization performance chart](https://docs.google.com/spreadsheets/d/1QJ8vwMXTHidMX4jo6aldGRt7d7DzPqvQJ4ETaevKT-c/pubchart?oid=363435330&format=image)

| Benchmark | Score | Normalized |
|-----------|-------|------------|
| stream/jsonp | 2064.798 | 11.02% |
| stream/orgjson | 3783.445 | 20.19% |
| databind/gson | 6694.711 | 35.73% |
| stream/gson | 8872.723 | 47.36% |
| stream/genson | 11093.761 | 59.21% |
| databind/genson | 12593.659 | 67.21% |
| databind/fastjson | 16602.705 | 88.61% |
| stream/jackson | 16824.881 | 89.80% |
| databind/jackson | 18636.068 | 99.46% |
| databind/jackson+afterburner | 18736.422 | 100.00% |

### Raw

    Benchmark                                           Mode  Cnt       Score      Error  Units
    DatabindDeserialization.fastjson                   thrpt  200    7583.584 ±   21.673  ops/s
    DatabindDeserialization.genson                     thrpt  200   10771.937 ±   25.329  ops/s
    DatabindDeserialization.gson                       thrpt  200    5826.899 ±   29.657  ops/s
    DatabindDeserialization.jackson                    thrpt  200   11959.803 ±   48.962  ops/s
    DatabindDeserialization.jackson_afterburner        thrpt  200   15406.066 ±   43.674  ops/s
    DatabindDeserializationAndUse.fastjson             thrpt  200  154765.696 ±  489.935  ops/s
    DatabindDeserializationAndUse.genson               thrpt  200  222165.921 ± 1631.449  ops/s
    DatabindDeserializationAndUse.gson                 thrpt  200  105576.233 ± 1538.662  ops/s
    DatabindDeserializationAndUse.jackson              thrpt  200  223898.654 ± 6260.501  ops/s
    DatabindDeserializationAndUse.jackson_afterburner  thrpt  200  288214.616 ± 4066.547  ops/s
    DatabindSerialization.fastjson                     thrpt  200   16602.705 ±  257.693  ops/s
    DatabindSerialization.genson                       thrpt  200   12593.659 ±  160.228  ops/s
    DatabindSerialization.gson                         thrpt  200    6694.711 ±   25.784  ops/s
    DatabindSerialization.jackson                      thrpt  200   18636.068 ±   72.491  ops/s
    DatabindSerialization.jackson_afterburner          thrpt  200   18736.422 ±   80.026  ops/s
    StreamDeserialization.genson                       thrpt  200    8368.202 ±   62.644  ops/s
    StreamDeserialization.gson                         thrpt  200    6162.872 ±   29.215  ops/s
    StreamDeserialization.jackson                      thrpt  200   12540.903 ±   41.660  ops/s
    StreamDeserialization.jsonp                        thrpt  200    1798.703 ±   10.576  ops/s
    StreamDeserialization.orgjson                      thrpt  200    2777.250 ±   25.970  ops/s
    StreamDeserializationAndUse.genson                 thrpt  200  163831.580 ± 2338.978  ops/s
    StreamDeserializationAndUse.gson                   thrpt  200  114557.053 ± 1094.192  ops/s
    StreamDeserializationAndUse.jackson                thrpt  200  262022.113 ±  975.289  ops/s
    StreamDeserializationAndUse.jsonp                  thrpt  200   34900.546 ±  182.006  ops/s
    StreamDeserializationAndUse.orgjson                thrpt  200   55125.074 ±  518.994  ops/s
    StreamSerialization.genson                         thrpt  200   11093.761 ±   62.037  ops/s
    StreamSerialization.gson                           thrpt  200    8872.723 ±   20.691  ops/s
    StreamSerialization.jackson                        thrpt  200   16824.881 ±   32.982  ops/s
    StreamSerialization.jsonp                          thrpt  200    2064.798 ±   22.508  ops/s
    StreamSerialization.orgjson                        thrpt  200    3783.445 ±   13.994  ops/s

## Benchmark configuration

### JMH

    # JMH 1.12 (released 87 days ago)
    # VM version: JDK 1.8.0_45, VM 25.45-b02
    # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/bin/java
    # VM options: -XX:+AggressiveOpts -Xms2G -Xmx2G
    # Warmup: 20 iterations, 1 s each
    # Measurement: 20 iterations, 1 s each
    # Timeout: 10 min per iteration
    # Threads: 1 thread, will synchronize iterations
    # Benchmark mode: Throughput, ops/time
    # Benchmark: com.github.fabienrenaud.jjb.DatabindDeserialization.fastjson

### Hardware

    Model Name: MacBook Pro
    Processor Name: Intel Core i7
    Processor Speed: 2.6 GHz
    Number of Processors: 1
    Total Number of Cores: 4
    L2 Cache (per Core): 256 KB
    L3 Cache: 6 MB
    Memory: 16 GB

### JVM options

    -server -XX:+AggressiveOpts -Xms2G -Xmx2G 

## Run

Checkout the project and just run the `./run.sh` script.
It will compile the project and start the benchmark.

The benchmark took about 3 hours to complete on my machine.

## Contribute

Any help to improve the existing benchmarks or write ones for other libraries are welcome.
Pull requests are welcome.
