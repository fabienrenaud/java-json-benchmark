2016-11-13

You can also see results of the [benchmark performed on an Amazon EC2 c3.2xlarge instance here](/archive/raw-results-2016-11-13-ec2_c3_2xlarge.md).

# JMH: Deserialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 10 | 377295.125 | ±37946.359 | ops/s | 
| dsljson/databind | thrpt | 10 | 1231399.303 | ±147285.838 | ops/s | 
| fastjson/databind | thrpt | 10 | 501958.120 | ±61465.405 | ops/s | 
| flexjson/databind | thrpt | 10 | 145415.349 | ±16838.810 | ops/s | 
| genson/databind | thrpt | 10 | 562073.691 | ±12664.012 | ops/s | 
| gson/databind | thrpt | 10 | 394535.756 | ±28402.971 | ops/s | 
| jackson/databind | thrpt | 10 | 651673.449 | ±151553.585 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 653925.987 | ±60102.686 | ops/s | 
| jodd/databind | thrpt | 10 | 685949.840 | ±63861.466 | ops/s | 
| johnzon/databind | thrpt | 10 | 208622.534 | ±6023.412 | ops/s | 
| jsonsmart/databind | thrpt | 10 | 535964.536 | ±53022.128 | ops/s | 
| logansquare/databind | thrpt | 10 | 451925.615 | ±45744.603 | ops/s | 
| genson/stream | thrpt | 10 | 549697.618 | ±73231.435 | ops/s | 
| gson/stream | thrpt | 10 | 386360.366 | ±48171.917 | ops/s | 
| jackson/stream | thrpt | 10 | 743762.733 | ±115631.258 | ops/s | 
| javaxjson/stream | thrpt | 10 | 45074.830 | ±5123.794 | ops/s | 
| jsonio/stream | thrpt | 10 | 225071.600 | ±8213.887 | ops/s | 
| jsonsimple/stream | thrpt | 10 | 167837.388 | ±41635.236 | ops/s | 
| nanojson/stream | thrpt | 10 | 143243.808 | ±2939.021 | ops/s | 
| orgjson/stream | thrpt | 10 | 175323.817 | ±3939.036 | ops/s | 

# JMH: Deserialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 10 | 56889.870 | ±2826.191 | ops/s | 
| dsljson/databind | thrpt | 10 | 160465.873 | ±9068.105 | ops/s | 
| fastjson/databind | thrpt | 10 | 73352.421 | ±12062.522 | ops/s | 
| flexjson/databind | thrpt | 10 | 14912.743 | ±4140.447 | ops/s | 
| genson/databind | thrpt | 10 | 68261.280 | ±4834.273 | ops/s | 
| gson/databind | thrpt | 10 | 48139.883 | ±1899.722 | ops/s | 
| jackson/databind | thrpt | 10 | 84732.643 | ±15388.586 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 96893.607 | ±3643.867 | ops/s | 
| jodd/databind | thrpt | 10 | 69140.205 | ±3677.099 | ops/s | 
| johnzon/databind | thrpt | 10 | 22784.636 | ±2792.537 | ops/s | 
| jsonsmart/databind | thrpt | 10 | 63452.487 | ±2641.168 | ops/s | 
| logansquare/databind | thrpt | 10 | 85076.885 | ±4091.580 | ops/s | 
| genson/stream | thrpt | 10 | 80159.093 | ±2626.244 | ops/s | 
| gson/stream | thrpt | 10 | 47344.006 | ±6470.399 | ops/s | 
| jackson/stream | thrpt | 10 | 97926.396 | ±3885.931 | ops/s | 
| javaxjson/stream | thrpt | 10 | 29621.443 | ±3739.452 | ops/s | 
| jsonio/stream | thrpt | 10 | 27943.299 | ±2318.258 | ops/s | 
| jsonsimple/stream | thrpt | 10 | 24150.524 | ±1218.450 | ops/s | 
| nanojson/stream | thrpt | 10 | 36522.142 | ±2191.608 | ops/s | 
| orgjson/stream | thrpt | 10 | 23844.165 | ±1427.851 | ops/s | 

# JMH: Deserialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 10 | 6041.373 | ±404.585 | ops/s | 
| dsljson/databind | thrpt | 10 | 15160.035 | ±2038.121 | ops/s | 
| fastjson/databind | thrpt | 10 | 7058.902 | ±228.075 | ops/s | 
| flexjson/databind | thrpt | 10 | 1553.649 | ±404.827 | ops/s | 
| genson/databind | thrpt | 10 | 6996.182 | ±261.585 | ops/s | 
| gson/databind | thrpt | 10 | 4823.637 | ±582.616 | ops/s | 
| jackson/databind | thrpt | 10 | 8952.645 | ±467.998 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 9420.328 | ±344.265 | ops/s | 
| jodd/databind | thrpt | 10 | 6831.818 | ±338.565 | ops/s | 
| johnzon/databind | thrpt | 10 | 2396.311 | ±89.016 | ops/s | 
| jsonsmart/databind | thrpt | 10 | 5828.886 | ±853.696 | ops/s | 
| logansquare/databind | thrpt | 10 | 8605.492 | ±424.334 | ops/s | 
| genson/stream | thrpt | 10 | 8254.021 | ±648.220 | ops/s | 
| gson/stream | thrpt | 10 | 5129.919 | ±189.317 | ops/s | 
| jackson/stream | thrpt | 10 | 9625.135 | ±1265.631 | ops/s | 
| javaxjson/stream | thrpt | 10 | 3915.537 | ±687.285 | ops/s | 
| jsonio/stream | thrpt | 10 | 2500.270 | ±1289.801 | ops/s | 
| jsonsimple/stream | thrpt | 10 | 2319.061 | ±181.740 | ops/s | 
| nanojson/stream | thrpt | 10 | 4891.101 | ±598.836 | ops/s | 
| orgjson/stream | thrpt | 10 | 2336.842 | ±166.926 | ops/s | 

# JMH: Deserialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 10 | 300.096 | ±52.849 | ops/s | 
| dsljson/databind | thrpt | 10 | 1355.301 | ±67.493 | ops/s | 
| fastjson/databind | thrpt | 10 | 574.790 | ±41.136 | ops/s | 
| flexjson/databind | thrpt | 10 | 120.264 | ±13.043 | ops/s | 
| genson/databind | thrpt | 10 | 633.870 | ±33.697 | ops/s | 
| gson/databind | thrpt | 10 | 399.832 | ±36.436 | ops/s | 
| jackson/databind | thrpt | 10 | 796.391 | ±23.821 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 855.435 | ±27.033 | ops/s | 
| jodd/databind | thrpt | 10 | 577.679 | ±39.094 | ops/s | 
| johnzon/databind | thrpt | 10 | 138.642 | ±28.397 | ops/s | 
| jsonsmart/databind | thrpt | 10 | 542.049 | ±27.937 | ops/s | 
| logansquare/databind | thrpt | 10 | 795.103 | ±59.616 | ops/s | 
| genson/stream | thrpt | 10 | 682.506 | ±55.110 | ops/s | 
| gson/stream | thrpt | 10 | 412.820 | ±54.186 | ops/s | 
| jackson/stream | thrpt | 10 | 872.737 | ±20.896 | ops/s | 
| javaxjson/stream | thrpt | 10 | 230.344 | ±39.381 | ops/s | 
| jsonio/stream | thrpt | 10 | 178.687 | ±42.317 | ops/s | 
| jsonsimple/stream | thrpt | 10 | 151.020 | ±33.381 | ops/s | 
| nanojson/stream | thrpt | 10 | 335.509 | ±51.495 | ops/s | 
| orgjson/stream | thrpt | 10 | 151.324 | ±34.891 | ops/s | 

# JMH: Serialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 10 | 344665.003 | ±14083.764 | ops/s | 
| dsljson/databind | thrpt | 10 | 1959518.562 | ±116768.353 | ops/s | 
| fastjson/databind | thrpt | 10 | 1302272.897 | ±158262.389 | ops/s | 
| flexjson/databind | thrpt | 10 | 2114.451 | ±459.118 | ops/s | 
| genson/databind | thrpt | 10 | 618341.107 | ±65192.400 | ops/s | 
| gson/databind | thrpt | 10 | 422890.381 | ±43781.707 | ops/s | 
| jackson/databind | thrpt | 10 | 1340652.343 | ±136031.657 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 1449218.518 | ±193419.511 | ops/s | 
| jodd/databind | thrpt | 10 | 406306.905 | ±43077.137 | ops/s | 
| johnzon/databind | thrpt | 10 | 518622.346 | ±35043.824 | ops/s | 
| jsonsmart/databind | thrpt | 10 | 680639.642 | ±71168.857 | ops/s | 
| logansquare/databind | thrpt | 10 | 1398410.292 | ±204354.645 | ops/s | 
| genson/stream | thrpt | 10 | 631734.602 | ±31614.509 | ops/s | 
| gson/stream | thrpt | 10 | 258199.211 | ±21251.662 | ops/s | 
| jackson/stream | thrpt | 10 | 1401861.795 | ±172751.937 | ops/s | 
| javaxjson/stream | thrpt | 10 | 6989.940 | ±1594.286 | ops/s | 
| jsonio/stream | thrpt | 10 | 222130.840 | ±26985.054 | ops/s | 
| jsonsimple/stream | thrpt | 10 | 155637.407 | ±30967.177 | ops/s | 
| nanojson/stream | thrpt | 10 | 713571.920 | ±69433.144 | ops/s | 
| orgjson/stream | thrpt | 10 | 194337.883 | ±6402.734 | ops/s | 

# JMH: Serialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 10 | 51400.765 | ±1530.670 | ops/s | 
| dsljson/databind | thrpt | 10 | 222018.906 | ±49597.388 | ops/s | 
| fastjson/databind | thrpt | 10 | 112289.608 | ±2709.955 | ops/s | 
| flexjson/databind | thrpt | 10 | 574.256 | ±239.834 | ops/s | 
| genson/databind | thrpt | 10 | 97161.550 | ±4080.191 | ops/s | 
| gson/databind | thrpt | 10 | 46955.088 | ±3401.363 | ops/s | 
| jackson/databind | thrpt | 10 | 157941.674 | ±21935.608 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 167036.956 | ±7398.249 | ops/s | 
| jodd/databind | thrpt | 10 | 44247.566 | ±3997.950 | ops/s | 
| johnzon/databind | thrpt | 10 | 58572.283 | ±1066.543 | ops/s | 
| jsonsmart/databind | thrpt | 10 | 75978.951 | ±8938.597 | ops/s | 
| logansquare/databind | thrpt | 10 | 157054.927 | ±10013.276 | ops/s | 
| genson/stream | thrpt | 10 | 87957.861 | ±3578.328 | ops/s | 
| gson/stream | thrpt | 10 | 24925.739 | ±763.672 | ops/s | 
| jackson/stream | thrpt | 10 | 153592.401 | ±11158.358 | ops/s | 
| javaxjson/stream | thrpt | 10 | 603.792 | ±160.847 | ops/s | 
| jsonio/stream | thrpt | 10 | 29264.751 | ±13304.965 | ops/s | 
| jsonsimple/stream | thrpt | 10 | 18241.034 | ±2251.905 | ops/s | 
| nanojson/stream | thrpt | 10 | 98591.644 | ±5538.352 | ops/s | 
| orgjson/stream | thrpt | 10 | 18385.311 | ±683.796 | ops/s | 

# JMH: Serialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 10 | 4843.074 | ±173.741 | ops/s | 
| dsljson/databind | thrpt | 10 | 25561.346 | ±726.745 | ops/s | 
| fastjson/databind | thrpt | 10 | 7773.299 | ±294.560 | ops/s | 
| flexjson/databind | thrpt | 10 | 192.724 | ±67.263 | ops/s | 
| genson/databind | thrpt | 10 | 10588.505 | ±253.191 | ops/s | 
| gson/databind | thrpt | 10 | 4927.995 | ±166.371 | ops/s | 
| jackson/databind | thrpt | 10 | 15617.140 | ±804.595 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 15642.997 | ±530.087 | ops/s | 
| jodd/databind | thrpt | 10 | 3948.071 | ±639.527 | ops/s | 
| johnzon/databind | thrpt | 10 | 5804.796 | ±558.123 | ops/s | 
| jsonsmart/databind | thrpt | 10 | 8111.359 | ±456.947 | ops/s | 
| logansquare/databind | thrpt | 10 | 14553.244 | ±2705.751 | ops/s | 
| genson/stream | thrpt | 10 | 8550.884 | ±310.553 | ops/s | 
| gson/stream | thrpt | 10 | 2799.779 | ±95.127 | ops/s | 
| jackson/stream | thrpt | 10 | 15584.002 | ±3520.185 | ops/s | 
| javaxjson/stream | thrpt | 10 | 57.882 | ±3.779 | ops/s | 
| jsonio/stream | thrpt | 10 | 3339.134 | ±290.905 | ops/s | 
| jsonsimple/stream | thrpt | 10 | 1872.026 | ±260.121 | ops/s | 
| nanojson/stream | thrpt | 10 | 9827.885 | ±256.130 | ops/s | 
| orgjson/stream | thrpt | 10 | 1730.896 | ±89.902 | ops/s | 

# JMH: Serialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 10 | 365.548 | ±9.586 | ops/s | 
| dsljson/databind | thrpt | 10 | 2251.817 | ±358.630 | ops/s | 
| fastjson/databind | thrpt | 10 | 589.421 | ±11.630 | ops/s | 
| flexjson/databind | thrpt | 10 | 55.844 | ±17.802 | ops/s | 
| genson/databind | thrpt | 10 | 1020.981 | ±57.527 | ops/s | 
| gson/databind | thrpt | 10 | 497.705 | ±18.139 | ops/s | 
| jackson/databind | thrpt | 10 | 1634.870 | ±61.544 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 1347.588 | ±163.458 | ops/s | 
| jodd/databind | thrpt | 10 | 394.758 | ±12.973 | ops/s | 
| johnzon/databind | thrpt | 10 | 569.916 | ±36.657 | ops/s | 
| jsonsmart/databind | thrpt | 10 | 775.034 | ±59.249 | ops/s | 
| logansquare/databind | thrpt | 10 | 1433.244 | ±287.023 | ops/s | 
| genson/stream | thrpt | 10 | 819.950 | ±48.213 | ops/s | 
| gson/stream | thrpt | 10 | 265.113 | ±21.240 | ops/s | 
| jackson/stream | thrpt | 10 | 1673.287 | ±88.942 | ops/s | 
| javaxjson/stream | thrpt | 10 | 5.748 | ±0.815 | ops/s | 
| jsonio/stream | thrpt | 10 | 322.813 | ±17.763 | ops/s | 
| jsonsimple/stream | thrpt | 10 | 164.394 | ±12.174 | ops/s | 
| nanojson/stream | thrpt | 10 | 887.503 | ±41.173 | ops/s | 
| orgjson/stream | thrpt | 10 | 115.378 | ±7.872 | ops/s | 

# Environment
 
## JMH configuration

    # JMH 1.15 (released 44 days ago)
    # VM version: JDK 1.8.0_45, VM 25.45-b02
    # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/bin/java
    # VM options: -XX:+AggressiveOpts -Xms2G -Xmx2G
    # Warmup: 3 iterations, 1 s each
    # Measurement: 5 iterations, 2 s each
    # Timeout: 10 min per iteration
    # Threads: 16 threads, will synchronize iterations
    # Benchmark mode: Throughput, ops/time

## Hardware

    Model Name: MacBook Pro
    Processor Name: Intel Core i7
    Processor Speed: 2.6 GHz
    Number of Processors: 1
    Total Number of Cores: 4
    L2 Cache (per Core): 256 KB
    L3 Cache: 6 MB
    Memory: 16 GB