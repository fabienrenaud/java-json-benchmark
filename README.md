[![Build Status](https://travis-ci.org/fabienrenaud/java-json-benchmark.svg?branch=master)](https://travis-ci.org/fabienrenaud/java-json-benchmark)

# Benchmark of Java JSON libraries

## Purpose

This project benchmarks the throughput performance of a variety of Java Json libraries using [JMH](http://openjdk.java.net/projects/code-tools/jmh/).
It covers the following libraries:

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
* [tapestry](https://tapestry.apache.org/json.html)
* [jsoniter](http://jsoniter.com)
* [minimal-json](https://github.com/ralfstx/minimal-json)
* [mjson](https://github.com/bolerio/mjson)
* [underscore-java](https://github.com/javadev/underscore-java)

When available, both databinding and 'stream' (custom packing and unpacking) implementations are tested.
Two different kinds of [models](/src/main/java/com/github/fabienrenaud/jjb/model/) are evaluated with payloads of 1, 10, 100 and 1000 KB size:
* [`Users`](/src/main/java/com/github/fabienrenaud/jjb/model/Users.java): uses primitive types, String, List and simple POJOs; and
* [`Clients`](/src/main/java/com/github/fabienrenaud/jjb/model/Clients.java): adds arrays, enum, UUID, LocalDate

This benchmark is written to:
* randomly generate payloads upon static loading of the JVM/benchmark; the *seed* is also shared across runs
* read data from RAM
* write data to reusable output streams (when possible); this reduces allocation pressure
* consume all output streams; to avoid dead code elimination optimization

Not evaluated are: RAM utilization, compression, payloads > 1 MB.

## Results

The benchmarks are written with [JMH](http://openjdk.java.net/projects/code-tools/jmh/) and for Java 8.

The results here-below were computed on April the 8th, 2018 with the following libraries and versions:

| Library      | Version  |
|--------------|----------|
| jackson      | 2.9.5    |
| genson       | 1.4      |
| fastjson     | 1.2.47   |
| gson         | 2.8.2    |
| org.json     | 20090211 |
| javax-json   | 1.1.2    |
| json-io      | 4.10.0   |
| flexjson     | 3.3      |
| boon         | 0.34     |
| json-smart   | 2.3      |
| johnzon      | 1.1.1    |
| logansquare  | 1.3.7    |
| dsl-json     | 1.7.1    |
| simplejson   | 1.1.1    |
| nanojson     | 1.2      |
| jodd json    | 4.3.0    |
| moshi        | 1.5.0    |
| tapestry     | 5.4.3    |
| jsoniter     | 0.9.22   |
| minimal-json | 0.9.5    |

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
# JMH version: 1.20
# VM version: JDK 1.8.0_161, VM 25.161-b14
# VM invoker: /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.161-0.b14.36.amzn1.x86_64/jre/bin/java
# VM options: -XX:+AggressiveOpts -Xms2g -Xmx2g
# Warmup: 5 iterations, 1 s each
# Measurement: 10 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 16 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
```

## Run

By default, running `./run ser` (`./run deser` respectively) will run
all -- stream and databind -- serialization (deserialization respectively)
benchmarks with 1 KB payloads of _Users_.

You can also specificy which libs, apis, payload-sizes and number of
iterations (and more) you want to run. For example:

    ./run deser --apis stream --libs genson,jackson
    ./run ser --apis databind,stream --libs jackson
    ./run deser --apis stream --libs dsljson,jackson --size 10 --datatype users

Type `./run help ser` or `./run help deser` to print help for those
commands.

If you wish to run _all_ benchmarks used to generate the reports above,
you can run `./run-everything`. This will take several hours to complete, so
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


[jmh-results]: /archive/raw-results-2018-04-21.md
[spreadsheet]: https://docs.google.com/spreadsheets/d/111HkglyS4ONv1xPQXKabDDXn_rKxQaUiMaNoEtXb1wE/edit?usp=sharing
[graph-users-deser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vTK4izjhdoGGdV-2d9KQ4UG4XrDQgm-xXUeI2KLptc0no92BMLP7rs01tr_VzrJeYP1P3IHu5_3ZtJ6/pubchart?oid=1217359585&format=image
[graph-users-ser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vTK4izjhdoGGdV-2d9KQ4UG4XrDQgm-xXUeI2KLptc0no92BMLP7rs01tr_VzrJeYP1P3IHu5_3ZtJ6/pubchart?oid=296776676&format=image
[graph-clients-deser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vTK4izjhdoGGdV-2d9KQ4UG4XrDQgm-xXUeI2KLptc0no92BMLP7rs01tr_VzrJeYP1P3IHu5_3ZtJ6/pubchart?oid=684555912&format=image
[graph-clients-ser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vTK4izjhdoGGdV-2d9KQ4UG4XrDQgm-xXUeI2KLptc0no92BMLP7rs01tr_VzrJeYP1P3IHu5_3ZtJ6/pubchart?oid=2004244401&format=image
