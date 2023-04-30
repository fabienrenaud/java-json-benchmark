Benchmark runs by date

## 2023-04-30

| Library      | Version  |
|--------------|----------|
| avaje-jsonb  | 1.4      |
| boon         | 0.34     |
| dsl-json     | 1.10.0   |
| fastjson     | 2.0.27   |
| flexjson     | 3.3      |
| genson       | 1.6      |
| gson         | 2.10.1   |
| jackson      | 2.14.2   |
| jodd json    | 6.0.3    |
| johnzon      | 1.2.19   |
| jakarta      | 2.1.1    |
| json-io      | 4.14.0   |
| simplejson   | 1.1.1    |
| json-smart   | 2.4.10   |
| logansquare  | 1.3.7    |
| minimal-json | 0.9.5    |
| mjson        | 1.4.1    |
| moshi        | 1.14.0   |
| nanojson     | 1.8      |
| org.json     | 20230227 |
| purejson     | 1.0.1    |
| qson         | 1.1.1    |
| tapestry     | 5.8.2    |
| underscore   | 1.88     | 
| yasson       | 3.0.2    |

**`Users` model**

![json deserialization performance for primitive types, String, List and simple POJOs][20230430-graph-users-deser]
![json serialization performance for primitive types, String, List and simple POJOs][20230430-graph-users-ser]

**`Clients` model**
![json deserialization performance for primitive types, String, List and simple POJOs, arrays, enum, UUID, LocalDate][20230430-graph-clients-deser]
![json serialization performance for primitive types, String, List and simple POJOs, arrays, enum, UUID, LocalDate][20230430-graph-clients-ser]


**JMH configuration and hardware**

```
# JMH version: 1.35
# VM version: JDK 17.0.6, OpenJDK 64-Bit Server VM, 17.0.6+10-LTS
# VM invoker: /usr/lib/jvm/java-17-amazon-corretto.x86_64/bin/java
# VM options: -Xms2g -Xmx2g --add-opens=java.base/java.time=ALL-UNNAMED
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 10 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 16 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
```

**Links**

* [google spreadsheet][20230430-spreadsheet]
* [raw-results-2023-04-30.md](/archive/raw-results-2023-04-30.md)

## 2021-11-27

| Library      | Version  |
|--------------|----------|
| jackson      | 2.13.0   |
| genson       | 1.6      |
| fastjson     | 1.2.78   |
| gson         | 2.8.9    |
| org.json     | 20210307 |
| javax-json   | 1.1.4    |
| json-io      | 4.13.0   |
| flexjson     | 3.3      |
| boon         | 0.34     |
| json-smart   | 2.4.7    |
| johnzon      | 1.2.15   |
| logansquare  | 1.3.7    |
| dsl-json     | 1.9.9    |
| simplejson   | 1.1.1    |
| nanojson     | 1.7      |
| jodd json    | 6.0.3    |
| moshi        | 1.12.0   |
| tapestry     | 5.7.3    |
| jsoniter     | 0.9.23   |
| minimal-json | 0.9.5    |
| mjson        | 1.4.1    |
| underscore   | 1.71     | 
| purejson     | 1.0.1    |
| yasson       | 1.0.9    |

**`Users` model**

![json deserialization performance for primitive types, String, List and simple POJOs][20211127-graph-users-deser]
![json serialization performance for primitive types, String, List and simple POJOs][20211127-graph-users-ser]

**`Clients` model**
![json deserialization performance for primitive types, String, List and simple POJOs, arrays, enum, UUID, LocalDate][20211127-graph-clients-deser]
![json serialization performance for primitive types, String, List and simple POJOs, arrays, enum, UUID, LocalDate][20211127-graph-clients-ser]


**JMH configuration and hardware**

Same as below, JMH 1.33.

**Links**

* [google spreadsheet][20211127-spreadsheet]
* [raw-results-2021-11-27.md](/archive/raw-results-2021-11-27.md)


## 2020-03-01

| Library      | Version  |
|--------------|----------|
| jackson      | 2.10.2   |
| genson       | 1.6      |
| fastjson     | 1.2.62   |
| gson         | 2.8.6    |
| org.json     | 20090211 |
| javax-json   | 1.1.4    |
| json-io      | 4.12.0   |
| flexjson     | 3.3      |
| boon         | 0.34     |
| json-smart   | 2.3      |
| johnzon      | 1.2.3    |
| logansquare  | 1.3.7    |
| dsl-json     | 1.9.5    |
| simplejson   | 1.1.1    |
| nanojson     | 1.4      |
| jodd json    | 5.1.3    |
| moshi        | 1.9.2    |
| tapestry     | 5.4.5    |
| jsoniter     | 0.9.23   |
| minimal-json | 0.9.5    |
| mjson        | 1.4.1    |
| underscore   | 1.52     | 
| purejson     | 1.0.1    |

**`Users` model**

![json deserialization performance for primitive types, String, List and simple POJOs][20200301-graph-users-deser]
![json serialization performance for primitive types, String, List and simple POJOs][20200301-graph-users-ser]

**`Clients` model**
![json deserialization performance for primitive types, String, List and simple POJOs, arrays, enum, UUID, LocalDate][20200301-graph-clients-deser]
![json serialization performance for primitive types, String, List and simple POJOs, arrays, enum, UUID, LocalDate][20200301-graph-clients-ser]


**JMH configuration and hardware**

Same as below, JMH 1.23.

**Links**

 * [google spreadsheet][20200301-spreadsheet]
 * [raw-results-2020-03-01.md](/archive/raw-results-2020-03-01.md)

## 2018-04-08

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
| purejson     | 1.0.1    |

**`Users` model**

![json deserialization performance for primitive types, String, List and simple POJOs](https://docs.google.com/spreadsheets/d/e/2PACX-1vTK4izjhdoGGdV-2d9KQ4UG4XrDQgm-xXUeI2KLptc0no92BMLP7rs01tr_VzrJeYP1P3IHu5_3ZtJ6/pubchart?oid=1217359585&format=image)
![json serialization performance for primitive types, String, List and simple POJOs](https://docs.google.com/spreadsheets/d/e/2PACX-1vTK4izjhdoGGdV-2d9KQ4UG4XrDQgm-xXUeI2KLptc0no92BMLP7rs01tr_VzrJeYP1P3IHu5_3ZtJ6/pubchart?oid=296776676&format=image)

**`Clients` model**
![json deserialization performance for primitive types, String, List and simple POJOs, arrays, enum, UUID, LocalDate](https://docs.google.com/spreadsheets/d/e/2PACX-1vTK4izjhdoGGdV-2d9KQ4UG4XrDQgm-xXUeI2KLptc0no92BMLP7rs01tr_VzrJeYP1P3IHu5_3ZtJ6/pubchart?oid=684555912&format=image)
![json serialization performance for primitive types, String, List and simple POJOs, arrays, enum, UUID, LocalDate](https://docs.google.com/spreadsheets/d/e/2PACX-1vTK4izjhdoGGdV-2d9KQ4UG4XrDQgm-xXUeI2KLptc0no92BMLP7rs01tr_VzrJeYP1P3IHu5_3ZtJ6/pubchart?oid=2004244401&format=image)


**JMH configuration and hardware**

Same as below, JMH 1.20.

**Links**

 * [google spreadsheet](https://docs.google.com/spreadsheets/d/111HkglyS4ONv1xPQXKabDDXn_rKxQaUiMaNoEtXb1wE/edit?usp=sharing)
 * [raw-results-2018-04-08.md](/archive/raw-results-2018-04-08.md)
 

## 2017-05-21

| Library     | Version |
|-------------|---------|
| jackson     | 2.8.8   |
| genson      | 1.4     |
| fastjson    | 1.2.32  |
| gson        | 2.8.0   |
| org.json    | 20090211   |
| javax-json  | 1.0, 1.0.4 |
| json-io     | 4.9.12  |
| flexjson    | 3.3     |
| boon        | 0.34    |
| json-smart  | 2.3     |
| johnzon     | 1.1.0   |
| logansquare | 1.3.7   |
| dsl-json    | 1.4.1   |
| simplejson  | 1.1.1   |
| nanojson    | 1.2     |
| jodd json   | 3.8.5   |
| moshi       | 1.5.0   |
| tapestry    | 5.4.3   |
| jsoniter    | 0.9.11  |

![json deserialization performance](https://docs.google.com/spreadsheets/d/16GSfiTSRP2WKu3XxqNPIW_0KvZ2PezjFMHqTHrG-XZU/pubchart?oid=746064058&format=image)

![json serialization performance](https://docs.google.com/spreadsheets/d/16GSfiTSRP2WKu3XxqNPIW_0KvZ2PezjFMHqTHrG-XZU/pubchart?oid=1130150523&format=image)

**JMH configuration and hardware**

Same as below, JMH 1.19.

**Links**

 * [google spreadsheet](https://docs.google.com/spreadsheets/d/16GSfiTSRP2WKu3XxqNPIW_0KvZ2PezjFMHqTHrG-XZU/edit?usp=sharing)
 * [raw-results-2016-11-21.md](/archive/raw-results-2017-05-21.md)

## 2016-11-21

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
| json-smart  | 2.2.1   |
| johnzon     | 0.9.5   |
| logansquare | 1.3.7   |
| dsl-json    | 1.1.2   |
| simplejson  | 1.1.1   |
| nanojson    | 1.2     |
| jodd json   | 3.8.0   |
| moshi       | 1.3.1   |

![json deserialization performance](https://docs.google.com/spreadsheets/d/e/2PACX-1vTD4k5AtnQ7TN08y94UAZdx5YS_HyEKdhHteqS-xw9WRyluGiVYPIjryBx1JYtC2MOAAYQjU4wWajhH/pubchart?oid=746064058&format=image)

![json serialization performance](https://docs.google.com/spreadsheets/d/e/2PACX-1vTD4k5AtnQ7TN08y94UAZdx5YS_HyEKdhHteqS-xw9WRyluGiVYPIjryBx1JYtC2MOAAYQjU4wWajhH/pubchart?oid=1130150523&format=image)

**JMH configuration and hardware**

Same as below, JMH 1.15.

**Links**

 * [google spreadsheet](https://docs.google.com/spreadsheets/d/1NUPQP7MlNkTam165Rc1SoUpcw_YdpLQp29Eg4eSfqbM/edit?usp=sharing)
 * [raw-results-2016-11-21.md](/archive/raw-results-2016-11-21.md)


## 2016-11-13

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
| json-smart  | 2.2.1   |
| johnzon     | 0.9.5   |
| logansquare | 1.3.7   |
| dsl-json    | 1.1.2   |
| simplejson  | 1.1.1   |
| nanojson    | 1.2     |
| jodd json   | 3.8.0   |

![json deserialization performance](https://docs.google.com/spreadsheets/d/1a2fbeSP2OBnULNOZ5koAi6EtS0cTvywPOTDyrlPJ8ek/pubchart?oid=746064058&format=image)

![json serialization performance](https://docs.google.com/spreadsheets/d/1a2fbeSP2OBnULNOZ5koAi6EtS0cTvywPOTDyrlPJ8ek/pubchart?oid=1130150523&format=image)

**JMH configuration and hardware**

Same as below, JMH 1.15.

**Links**

 * [google spreadsheet](https://docs.google.com/spreadsheets/d/1a2fbeSP2OBnULNOZ5koAi6EtS0cTvywPOTDyrlPJ8ek/edit?usp=sharing)
 * [raw-results-2016-11-13.md](/archive/raw-results-2016-11-13.md)
 * [Special run on an Amazon EC2 c3.2xlarge instance](/archive/raw-results-2016-11-13-ec2_c3_2xlarge.md)

## 2016-07-25

| Library     | Version |
|-------------|---------|
| jackson     | 2.7.5   |
| genson      | 1.4     |
| fastjson    | 1.2.12  |
| gson        | 2.7     |
| org.json    | 20090211   |
| javax-json  | 1.0, 1.0.4 |
| json-io     | 4.5.0   |
| flexjson    | 3.3     |
| boon        | 0.33    |
| json-smart  | 2.2.1   |
| johnzon     | 0.9.3-incubating |
| logansquare | 1.3.7   |
| dsl-json    | 1.1.1   |

![json deserialization performance 2016-07-25](https://docs.google.com/spreadsheets/d/1QJ8vwMXTHidMX4jo6aldGRt7d7DzPqvQJ4ETaevKT-c/pubchart?oid=782651865&format=image)

![json serialization performance 2016-07-25](https://docs.google.com/spreadsheets/d/1QJ8vwMXTHidMX4jo6aldGRt7d7DzPqvQJ4ETaevKT-c/pubchart?oid=69104817&format=image)

**JMH configuration and hardware**

    # JMH 1.12 (released 113 days ago, please consider updating!)
    # VM version: JDK 1.8.0_45, VM 25.45-b02
    # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/bin/java
    # VM options: -XX:+AggressiveOpts -Xms2G -Xmx2G
    # Warmup: 3 iterations, 1 s each
    # Measurement: 5 iterations, 2 s each
    # Timeout: 10 min per iteration
    # Threads: 16 threads, will synchronize iterations
    # Benchmark mode: Throughput, ops/time
    
    Model Name: MacBook Pro
    Processor Name: Intel Core i7
    Processor Speed: 2.6 GHz
    Number of Processors: 1
    Total Number of Cores: 4
    L2 Cache (per Core): 256 KB
    L3 Cache: 6 MB
    Memory: 16 GB

**Links**

 * [google spreadsheet](https://docs.google.com/spreadsheets/d/1QJ8vwMXTHidMX4jo6aldGRt7d7DzPqvQJ4ETaevKT-c/edit?usp=sharing)
 * [raw-results-2016-07-25.md](/archive/raw-results-2016-07-25.md)



[20200301-spreadsheet]: https://docs.google.com/spreadsheets/d/14GZ7zbn0sXT3zIgS-2Nv4F9UGdCIrvI4Ctg_vzKbF0Q/edit?usp=sharing
[20200301-graph-users-deser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vSRA9tHwuThs4VSvTSaeP3e0XKsthz89oUvYpaDkybhoXbQYP2xOmf9Idtyz8Kmxoxx2grrL-kZYWEY/pubchart?oid=1217359585&format=image
[20200301-graph-users-ser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vSRA9tHwuThs4VSvTSaeP3e0XKsthz89oUvYpaDkybhoXbQYP2xOmf9Idtyz8Kmxoxx2grrL-kZYWEY/pubchart?oid=296776676&format=image
[20200301-graph-clients-deser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vSRA9tHwuThs4VSvTSaeP3e0XKsthz89oUvYpaDkybhoXbQYP2xOmf9Idtyz8Kmxoxx2grrL-kZYWEY/pubchart?oid=684555912&format=image
[20200301-graph-clients-ser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vSRA9tHwuThs4VSvTSaeP3e0XKsthz89oUvYpaDkybhoXbQYP2xOmf9Idtyz8Kmxoxx2grrL-kZYWEY/pubchart?oid=2004244401&format=image

[20211127-spreadsheet]: https://docs.google.com/spreadsheets/d/18XdXQi7GJmVgWBuo0BAsjbPUHW-qDHge1k4WT8uOEIU/edit?usp=sharing
[20211127-graph-users-deser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vSJsmkX9LTVyohgO8R8tZjIxdRCZugLLNeW42TLwsqdZEeNnSo0sGpVVQ2X8G2Ws7Cw9JXN9J46WZGE/pubchart?oid=1217359585&format=image
[20211127-graph-users-ser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vSJsmkX9LTVyohgO8R8tZjIxdRCZugLLNeW42TLwsqdZEeNnSo0sGpVVQ2X8G2Ws7Cw9JXN9J46WZGE/pubchart?oid=296776676&format=image
[20211127-graph-clients-deser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vSJsmkX9LTVyohgO8R8tZjIxdRCZugLLNeW42TLwsqdZEeNnSo0sGpVVQ2X8G2Ws7Cw9JXN9J46WZGE/pubchart?oid=684555912&format=image
[20211127-graph-clients-ser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vSJsmkX9LTVyohgO8R8tZjIxdRCZugLLNeW42TLwsqdZEeNnSo0sGpVVQ2X8G2Ws7Cw9JXN9J46WZGE/pubchart?oid=2004244401&format=image

[20230430-spreadsheet]: https://docs.google.com/spreadsheets/d/1KB2V8kxtXIgudNO4SpfYqZKn3z5OnFBP6bZVB9K2RUE/edit?usp=sharing
[20230430-graph-users-deser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vQjiR_OOk6FXipfmKiZCil9yAdM4BSPViKIOh0lvAEHcD-gVy_lGiUX86VBhr_xrzcz4VsLSHIzq2qY/pubchart?oid=1217359585&format=image
[20230430-graph-users-ser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vQjiR_OOk6FXipfmKiZCil9yAdM4BSPViKIOh0lvAEHcD-gVy_lGiUX86VBhr_xrzcz4VsLSHIzq2qY/pubchart?oid=296776676&format=image
[20230430-graph-clients-deser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vQjiR_OOk6FXipfmKiZCil9yAdM4BSPViKIOh0lvAEHcD-gVy_lGiUX86VBhr_xrzcz4VsLSHIzq2qY/pubchart?oid=684555912&format=image
[20230430-graph-clients-ser]: https://docs.google.com/spreadsheets/d/e/2PACX-1vQjiR_OOk6FXipfmKiZCil9yAdM4BSPViKIOh0lvAEHcD-gVy_lGiUX86VBhr_xrzcz4VsLSHIzq2qY/pubchart?oid=2004244401&format=image
