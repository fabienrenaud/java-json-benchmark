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
* [json-io](https://github.com/jdereg/json-io)

This benchmark tests throughput performance of serialization and deserialization algorithms of the databind and stream API when available.
Random payloads of various sizes are generated at runtime before each bench. Current results present 4x4 configurations sets:

 * iterations: benchmarks that serialize/deserialize 1, 10, 50 or 100 payloads at once (via a loop). Each payload is different.
 * payload size: each iteration group serializes/deserializes various sizes of payloads. 4 are currently evaluated: 1 KB, 10 KB, 100 KB and 1 MB.

Each benchmark has been written to read bytes from RAM and write to output streams in RAM when possible. All data is randomly generated upon static loading of each fork before any bench is invoked and have therefore no impact on the results.

This benchmark does NOT evaluate:

* compression performance or efficiency
* payloads bigger than 1.1 MB (would be easy to do though)


## Results

This benchmark was performed using [JMH](http://openjdk.java.net/projects/code-tools/jmh/) and Java 8.
Read below for JMH and hardware info.

[All graphs and sheets are available in this google doc.](https://docs.google.com/spreadsheets/d/1QJ8vwMXTHidMX4jo6aldGRt7d7DzPqvQJ4ETaevKT-c/edit?usp=sharing)

## Deserialization performance

[comment]: # "From tsv to md:"
[comment]: # "Search:  ([\w/]+)\t([\w\d\.]+)\t([\w\d\.%]+)"
[comment]: # "Replace: | $1 | $2 | $3 |"

### 1 payload per iteration

![json deserialization performance chart](https://docs.google.com/spreadsheets/d/1QJ8vwMXTHidMX4jo6aldGRt7d7DzPqvQJ4ETaevKT-c/pubchart?oid=782651865&format=image)

### 10 payload per iteration

### 50 payload per iteration

### 100 payload per iteration

## Serialization performance

### 1 payload per iteration

### 10 payload per iteration

### 50 payload per iteration

### 100 payload per iteration

## Benchmark configuration

### JMH

    # JMH 1.12 (released 94 days ago, please consider updating!)
    # VM version: JDK 1.8.0_45, VM 25.45-b02
    # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/bin/java
    # VM options: -XX:+AggressiveOpts -Xms2G -Xmx2G
    # Warmup: 5 iterations, 1 s each
    # Measurement: 5 iterations, 5 s each
    # Timeout: 10 min per iteration
    # Threads: 1 thread, will synchronize iterations
    # Benchmark mode: Throughput, ops/time

### Hardware

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
benchmarks with 1 iteration and 1 KB payloads.

You can also specificy which libs, apis, payload-sizes and number of 
iterations (and more) you want to run. For example:

    ./bench deser --apis stream --libs genson,jackson 
    ./bench ser --apis databind,stream --libs jackson 
    ./bench deser --apis stream --libs genson,jackson --size 10 --number 50
 
Type `./bench help ser` or `./bench help deser` to print help for those
commands.

If you wish to run _all_ benchmarks used to generate the reports above,
you can run `./bench-all`. This will take several hours to complete, so
be patient.

## Contribute

Any help to improve the existing benchmarks or write ones for other
libraries is welcome.

Pull requests are welcome.
