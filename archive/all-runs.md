Benchmark runs by date

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