[![Java CI](https://github.com/fabienrenaud/java-json-benchmark/actions/workflows/gradle.yml/badge.svg)](https://github.com/fabienrenaud/java-json-benchmark/actions/workflows/gradle.yml)

# Benchmark of Java JSON libraries

## Purpose

This project benchmarks the throughput performance of a variety of Java Json libraries
using [JMH](http://openjdk.java.net/projects/code-tools/jmh/).
It covers the following libraries:

* [avaje-jsonb](https://github.com/avaje/avaje-jsonb)
* [boon](https://github.com/boonproject/boon)
* [dsl-json](https://github.com/ngs-doo/dsl-json)
* [fastjson](https://github.com/alibaba/fastjson)
* [flexjson](http://flexjson.sourceforge.net/)
* [genson](https://owlike.github.io/genson/)
* [gson](https://github.com/google/gson)
* [jackson](https://github.com/FasterXML/jackson)
* [jakarta-json](https://jsonp.java.net/) (from Oracle)
* [johnzon](http://johnzon.apache.org/)
* [json-io](https://github.com/jdereg/json-io)
* [json-simple](https://code.google.com/archive/p/json-simple/)
* [json-smart](http://netplex.github.io/json-smart/)
* [logansquare](https://github.com/bluelinelabs/LoganSquare)
* [minimal-json](https://github.com/ralfstx/minimal-json)
* [mjson](https://github.com/bolerio/mjson)
* [moshi](https://github.com/square/moshi)
* [nanojson](https://github.com/mmastrac/nanojson)
* [org.json](https://github.com/stleary/JSON-java)
* [purejson](https://senthilganeshs.github.io/jsonp/)
* [qson](https://github.com/quarkusio/qson)
* [tapestry](https://tapestry.apache.org/json.html)
* [underscore-java](https://github.com/javadev/underscore-java)
* [wast](https://github.com/wycst)

When available, both databinding and 'stream' (custom packing and unpacking) implementations are tested.
Two different kinds of [models](/src/main/java/com/github/fabienrenaud/jjb/model/) are evaluated with payloads of 1, 10,
100 and 1000 KB size:

* [`Users`](/src/main/java/com/github/fabienrenaud/jjb/model/Users.java): uses primitive types, String, List and simple
  POJOs; and
* [`Clients`](/src/main/java/com/github/fabienrenaud/jjb/model/Clients.java): adds arrays, enum, UUID, LocalDate

This benchmark is written to:

* randomly generate payloads upon static loading of the JVM/benchmark; the *seed* is also shared across runs
* read data from RAM
* write data to reusable output streams (when possible); this reduces allocation pressure
* consume all output streams; to avoid dead code elimination optimization

Not evaluated are: RAM utilization, compression, payloads > 1 MB.

## Results

The benchmarks are written with [JMH](http://openjdk.java.net/projects/code-tools/jmh/) and for Java 17.

The results here-below were computed on January the 30th, 2024 with the following libraries and versions:

| Library      | Version  |
|--------------|----------|
| avaje-jsonb  | 1.9      |
| boon         | 0.34     |
| dsl-json     | 1.10.0   |
| fastjson     | 2.0.46   |
| flexjson     | 3.3      |
| genson       | 1.6      |
| gson         | 2.10.1   |
| jackson      | 2.16.0   |
| jodd json    | 6.0.3    |
| johnzon      | 1.2.21   |
| jakarta      | 2.1.3    |
| json-io      | 4.40.0   |
| simplejson   | 1.1.1    |
| json-smart   | 2.4.11   |
| logansquare  | 1.3.7    |
| minimal-json | 0.9.5    |
| mjson        | 1.4.1    |
| moshi        | 1.15.0   |
| nanojson     | 1.8      |
| org.json     | 20231013 |
| purejson     | 1.0.1    |
| qson         | 1.1.1    |
| tapestry     | 5.8.3    |
| underscore   | 1.97     | 
| yasson       | 3.0.3    |
| wast         | 0.0.12.1 |

[All graphs and sheets are available in this google doc.][spreadsheet]

[Raw JMH results are available here][jmh-results]

### `Users` model

Uses: primitive types, String, List and simple POJOs

**Deserialization performance**
![json deserialization performance for primitive types, String, List and simple POJOs][graph-users-deser]

**Serialization performance**
![json serialization performance for primitive types, String, List and simple POJOs][graph-users-ser]

### `Clients` model

Uses: primitive types, String, List and simple POJOs, arrays, enum, UUID, LocalDate

Note: fewer libraries are tested with this model due to lack of support for some of the evaluated types.

**Deserialization performance**
![json deserialization performance for primitive types, String, List and simple POJOs, arrays, enum, UUID, LocalDate][graph-clients-deser]

**Serialization performance**
![json serialization performance for primitive types, String, List and simple POJOs, arrays, enum, UUID, LocalDate][graph-clients-ser]

### Benchmark configuration

Tests were run on an [Amazon EC2 c5.xlarge](https://aws.amazon.com/ec2/instance-types/c5/) (4 vCPU, 8 GiB RAM)

JMH info:

```
# JMH version: 1.35
# VM version: JDK 17.0.10, OpenJDK 64-Bit Server VM, 17.0.10+7-LTS
# VM invoker: /usr/lib/jvm/java-17-amazon-corretto.x86_64/bin/java
# VM options: -Xms2g -Xmx2g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 10 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 16 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
```

## Run

### Local run

Prerequisites:

* JDK 17; and JAVA_HOME set.
* make

By default, running `./run ser` (`./run deser` respectively) will run
all -- stream and databind -- serialization (deserialization respectively)
benchmarks with 1 KB payloads of _Users_.

You can also specify which libs, apis, payload-sizes and number of
iterations (and more) you want to run. For example:

    ./run deser --apis stream --libs genson,jackson
    ./run ser --apis databind,stream --libs jackson
    ./run deser --apis stream --libs dsljson,jackson --size 10 --datatype users

Type `./run help ser` or `./run help deser` to print help for those
commands.

If you wish to run _all_ benchmarks used to generate the reports above,
you can run `./run-everything`. This will take several hours to complete, so
be patient.

## Run on AWS

Prerequisites:

* JDK 17; and JAVA_HOME set.
* make
* [packer](https://www.packer.io/)
* [awscli](https://docs.aws.amazon.com/cli/latest/userguide/getting-started-install.html) and configured
  via `aws configure`

Then, simply run:

```
make packer
```

## Contribute

Any help to improve the existing benchmarks or write ones for other
libraries is welcome.

Adding a JSON library to the benchmark requires little work and you can
find numerous examples in the commit history. For instance:

* Addition of moshi: https://github.com/fabienrenaud/java-json-benchmark/commit/6af2c0a7091b12a9dc768e49499682b97ea57ff6
* Addition of jodd: https://github.com/fabienrenaud/java-json-benchmark/commit/288a4e61496588ed4c0a80e1f107f34f9a2c985c
* Addition of
  json-simple: https://github.com/fabienrenaud/java-json-benchmark/commit/1e1e559c39a6eddc3dd7d7cea777fc7861415469

Pull requests are welcome.


[jmh-results]: /archive/raw-results-2024-01-30.md
[spreadsheet]: https://docs.google.com/spreadsheets/d/1a4kgv2R-IxANE_itV-qJwCnEBvc0HqHGh4bp4AXTFoY/edit?usp=sharing
[graph-users-deser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vQDBLUYgQ9BhFL_yxZidD1dRG-VYn2aFjMAwc2p6pl_J72XME4lopY8LcyHzTdC5QhISqIrSdkL-Vyt/pubchart?oid=1217359585&format=image
[graph-users-ser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vQDBLUYgQ9BhFL_yxZidD1dRG-VYn2aFjMAwc2p6pl_J72XME4lopY8LcyHzTdC5QhISqIrSdkL-Vyt/pubchart?oid=296776676&format=image
[graph-clients-deser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vQDBLUYgQ9BhFL_yxZidD1dRG-VYn2aFjMAwc2p6pl_J72XME4lopY8LcyHzTdC5QhISqIrSdkL-Vyt/pubchart?oid=684555912&format=image
[graph-clients-ser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vQDBLUYgQ9BhFL_yxZidD1dRG-VYn2aFjMAwc2p6pl_J72XME4lopY8LcyHzTdC5QhISqIrSdkL-Vyt/pubchart?oid=2004244401&format=image