2022-10-22

# *users* data type

## JMH: Deserialization - 1000 KB

| # | Benchmark | mode: | Throughput, | ops/time |  | 
| javaxjson/stream |  |  |  | 
|  |  |  |  |  |  | 
| # | Run | progress: | 66.67% | complete, | ETA | 
| # | Fork: | 1 | of | 2 |  | 
| OpenJDK | 64-Bit | Server | VM | warning: | -XX:ThreadPriorityPolicy=1 | 
| # | Warmup | Iteration | 1: | Using | SEED=302604088310502 | 
| 97.561 | ops/s |  |  |  |  | 
| Iteration | 1: | 236.208 | ops/s |  |  | 
|  |  |  |  |  |  | 
| # | Run | progress: | 68.18% | complete, | ETA | 
| # | Fork: | 2 | of | 2 |  | 
| OpenJDK | 64-Bit | Server | VM | warning: | -XX:ThreadPriorityPolicy=1 | 
| # | Warmup | Iteration | 1: | Using | SEED=302618047231209 | 
| 152.718 | ops/s |  |  |  |  | 
| Iteration | 1: | 241.265 | ops/s |  |  | 
|  |  |  |  |  |  | 
|  |  |  |  |  |  | 
| javaxjson/stream": |  |  |  |  | 
| 238.736 | ops/s |  |  |  |  | 
|  |  |  |  |  |  | 
|  |  |  |  |  |  | 
| # | JMH | version: | 1.33 |  |  | 
| # | VM | version: | JDK | 17.0.4, | OpenJDK | 
| # | VM | invoker: | /home/mintozzy/.sdkman/candidates/java/22.2.r17-grl/bin/java |  |  | 
| # | VM | options: | -XX:ThreadPriorityPolicy=1 | -XX:+UnlockExperimentalVMOptions | -XX:+EnableJVMCIProduct | 
| # | Blackhole | mode: | full | + | dont-inline | 
| # | Warmup: | 1 | iterations, | 10 | s | 
| # | Measurement: | 1 | iterations, | 2 | s | 
| # | Timeout: | 10 | min | per | iteration | 
| # | Threads: | 16 | threads, | will | synchronize | 
| # | Benchmark | mode: | Throughput, | ops/time |  | 
| jsonio/stream |  |  |  | 
|  |  |  |  |  |  | 
| # | Run | progress: | 69.70% | complete, | ETA | 
| # | Fork: | 1 | of | 2 |  | 
| OpenJDK | 64-Bit | Server | VM | warning: | -XX:ThreadPriorityPolicy=1 | 
| # | Warmup | Iteration | 1: | Using | SEED=302631891832633 | 

## JMH: Deserialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 2 | 54005.389 | ops/s |  | 
| avajejsonb_jackson/databind | thrpt | 2 | 36925.350 | ops/s |  | 
| dsljson/databind | thrpt | 2 | 69102.664 | ops/s |  | 
| dsljson_reflection/databind | thrpt | 2 | 48574.896 | ops/s |  | 
| fastjson/databind | thrpt | 2 | 37747.513 | ops/s |  | 
| flexjson/databind | thrpt | 2 | 6884.114 | ops/s |  | 
| genson/databind | thrpt | 2 | 29363.905 | ops/s |  | 
| gson/databind | thrpt | 2 | 29921.616 | ops/s |  | 
| jackson/databind | thrpt | 2 | 37711.584 | ops/s |  | 
| jackson_afterburner/databind | thrpt | 2 | 43057.176 | ops/s |  | 
| jackson_blackbird/databind | thrpt | 2 | 40909.535 | ops/s |  | 
| jodd/databind | thrpt | 2 | 30561.517 | ops/s |  | 
| johnzon/databind | thrpt | 2 | 13691.347 | ops/s |  | 
| jsonsmart/databind | thrpt | 2 | 36760.182 | ops/s |  | 
| logansquare/databind | thrpt | 2 | 38064.617 | ops/s |  | 
| moshi/databind | thrpt | 2 | 26968.731 | ops/s |  | 
| yasson/databind | thrpt | 2 | 6910.953 | ops/s |  | 
| genson/stream | thrpt | 2 | 45845.491 | ops/s |  | 
| gson/stream | thrpt | 2 | 40362.608 | ops/s |  | 
| jackson/stream | thrpt | 2 | 40131.419 | ops/s |  | 
| javaxjson/stream | thrpt | 2 | 14664.587 | ops/s |  | 
| jsonio/stream | thrpt | 2 | 8390.436 | ops/s |  | 
| jsonsimple/stream | thrpt | 2 | 10104.037 | ops/s |  | 
| minimaljson/stream | thrpt | 2 | 28654.995 | ops/s |  | 
| mjson/stream | thrpt | 2 | 10137.066 | ops/s |  | 
| moshi/stream | thrpt | 2 | 29554.606 | ops/s |  | 
| nanojson/stream | thrpt | 2 | 25102.768 | ops/s |  | 
| orgjson/stream | thrpt | 2 | 11259.996 | ops/s |  | 
| purejson/stream | thrpt | 2 | 6771.798 | ops/s |  | 
| tapestry/stream | thrpt | 2 | 36592.065 | ops/s |  | 

## JMH: Deserialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 2 | 624962.583 | ops/s |  | 
| avajejsonb_jackson/databind | thrpt | 2 | 466918.677 | ops/s |  | 
| dsljson/databind | thrpt | 2 | 820010.890 | ops/s |  | 
| dsljson_reflection/databind | thrpt | 2 | 583335.098 | ops/s |  | 
| fastjson/databind | thrpt | 2 | 297191.131 | ops/s |  | 
| flexjson/databind | thrpt | 2 | 80740.006 | ops/s |  | 
| genson/databind | thrpt | 2 | 353564.220 | ops/s |  | 
| gson/databind | thrpt | 2 | 343625.586 | ops/s |  | 
| jackson/databind | thrpt | 2 | 455998.590 | ops/s |  | 
| jackson_afterburner/databind | thrpt | 2 | 493959.078 | ops/s |  | 
| jackson_blackbird/databind | thrpt | 2 | 468453.693 | ops/s |  | 
| jodd/databind | thrpt | 2 | 309085.725 | ops/s |  | 
| johnzon/databind | thrpt | 2 | 171410.990 | ops/s |  | 
| jsonsmart/databind | thrpt | 2 | 399677.771 | ops/s |  | 
| logansquare/databind | thrpt | 2 | 230431.332 | ops/s |  | 
| moshi/databind | thrpt | 2 | 368204.261 | ops/s |  | 
| yasson/databind | thrpt | 2 | 85356.962 | ops/s |  | 
| genson/stream | thrpt | 2 | 422320.899 | ops/s |  | 
| gson/stream | thrpt | 2 | 413403.114 | ops/s |  | 
| jackson/stream | thrpt | 2 | 466533.498 | ops/s |  | 
| javaxjson/stream | thrpt | 2 | 40338.546 | ops/s |  | 
| jsonio/stream | thrpt | 2 | 99302.659 | ops/s |  | 
| jsonsimple/stream | thrpt | 2 | 135489.105 | ops/s |  | 
| minimaljson/stream | thrpt | 2 | 309484.974 | ops/s |  | 
| mjson/stream | thrpt | 2 | 111380.614 | ops/s |  | 
| moshi/stream | thrpt | 2 | 340699.598 | ops/s |  | 
| nanojson/stream | thrpt | 2 | 139411.537 | ops/s |  | 
| orgjson/stream | thrpt | 2 | 110455.834 | ops/s |  | 
| purejson/stream | thrpt | 2 | 79386.207 | ops/s |  | 
| tapestry/stream | thrpt | 2 | 381093.265 | ops/s |  | 

## JMH: Serialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 2 | 909.796 | ops/s |  | 
| avajejsonb_jackson/databind | thrpt | 2 | 725.338 | ops/s |  | 
| dsljson/databind | thrpt | 2 | 1211.758 | ops/s |  | 
| dsljson_reflection/databind | thrpt | 2 | 879.461 | ops/s |  | 
| fastjson/databind | thrpt | 2 | 286.244 | ops/s |  | 
| flexjson/databind | thrpt | 2 | 34.818 | ops/s |  | 
| genson/databind | thrpt | 2 | 465.310 | ops/s |  | 
| gson/databind | thrpt | 2 | 329.002 | ops/s |  | 
| jackson/databind | thrpt | 2 | 677.204 | ops/s |  | 
| jackson_afterburner/databind | thrpt | 2 | 748.052 | ops/s |  | 
| jackson_blackbird/databind | thrpt | 2 | 709.803 | ops/s |  | 
| jodd/databind | thrpt | 2 | 121.420 | ops/s |  | 
| johnzon/databind | thrpt | 2 | 276.222 | ops/s |  | 
| jsonsmart/databind | thrpt | 2 | 342.483 | ops/s |  | 
| logansquare/databind | thrpt | 2 | 930.066 | ops/s |  | 
| moshi/databind | thrpt | 2 | 354.500 | ops/s |  | 
| yasson/databind | thrpt | 2 | 272.193 | ops/s |  | 
| genson/stream | thrpt | 2 | 463.230 | ops/s |  | 
| gson/stream | thrpt | 2 | 162.848 | ops/s |  | 
| jackson/stream | thrpt | 2 | 872.831 | ops/s |  | 
| javaxjson/stream | thrpt | 2 | 797.142 | ops/s |  | 
| jsonio/stream | thrpt | 2 | 136.553 | ops/s |  | 
| jsonsimple/stream | thrpt | 2 | 94.080 | ops/s |  | 
| minimaljson/stream | thrpt | 2 | 431.163 | ops/s |  | 
| mjson/stream | thrpt | 2 | 120.385 | ops/s |  | 
| moshi/stream | thrpt | 2 | 493.473 | ops/s |  | 
| nanojson/stream | thrpt | 2 | 709.363 | ops/s |  | 
| orgjson/stream | thrpt | 2 | 170.667 | ops/s |  | 
| purejson/stream | thrpt | 2 | 6.409 | ops/s |  | 
| tapestry/stream | thrpt | 2 | 92.288 | ops/s |  | 

## JMH: Serialization - 100 KB

| # | Benchmark | mode: | Throughput, | ops/time |  | 
| avajejsonb/databind |  |  |  | 
|  |  |  |  |  |  | 
| # | Run | progress: | 0.00% | complete, | ETA | 
| # | Fork: | 1 | of | 2 |  | 
| OpenJDK | 64-Bit | Server | VM | warning: | -XX:ThreadPriorityPolicy=1 | 
| # | Warmup | Iteration | 1: | Using | SEED=298585768449823 | 
| 10320.877 | ops/s |  |  |  |  | 
| Iteration | 1: | 10780.606 | ops/s |  |  | 
|  |  |  |  |  |  | 
| # | Run | progress: | 1.52% | complete, | ETA | 
| # | Fork: | 2 | of | 2 |  | 
| OpenJDK | 64-Bit | Server | VM | warning: | -XX:ThreadPriorityPolicy=1 | 
| # | Warmup | Iteration | 1: | Using | SEED=298599019564176 | 
| 11059.269 | ops/s |  |  |  |  | 
| Iteration | 1: | 10597.304 | ops/s |  |  | 
|  |  |  |  |  |  | 
|  |  |  |  |  |  | 
| avajejsonb/databind": |  |  |  |  | 
| 10688.955 | ops/s |  |  |  |  | 
|  |  |  |  |  |  | 
|  |  |  |  |  |  | 
| # | JMH | version: | 1.33 |  |  | 
| # | VM | version: | JDK | 17.0.4, | OpenJDK | 
| # | VM | invoker: | /home/mintozzy/.sdkman/candidates/java/22.2.r17-grl/bin/java |  |  | 
| # | VM | options: | -XX:ThreadPriorityPolicy=1 | -XX:+UnlockExperimentalVMOptions | -XX:+EnableJVMCIProduct | 
| # | Blackhole | mode: | full | + | dont-inline | 
| # | Warmup: | 1 | iterations, | 10 | s | 
| # | Measurement: | 1 | iterations, | 2 | s | 
| # | Timeout: | 10 | min | per | iteration | 
| # | Threads: | 16 | threads, | will | synchronize | 
| # | Benchmark | mode: | Throughput, | ops/time |  | 
| avajejsonb_jackson/databind |  |  |  | 
|  |  |  |  |  |  | 
| # | Run | progress: | 3.03% | complete, | ETA | 
| # | Fork: | 1 | of | 2 |  | 
| OpenJDK | 64-Bit | Server | VM | warning: | -XX:ThreadPriorityPolicy=1 | 
| # | Warmup | Iteration | 1: | Using | SEED=298612265677184 | 

## JMH: Serialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 2 | 114531.353 | ops/s |  | 
| avajejsonb_jackson/databind | thrpt | 2 | 89917.118 | ops/s |  | 
| dsljson/databind | thrpt | 2 | 114508.712 | ops/s |  | 
| dsljson_reflection/databind | thrpt | 2 | 89277.436 | ops/s |  | 
| fastjson/databind | thrpt | 2 | 53726.393 | ops/s |  | 
| flexjson/databind | thrpt | 2 | 295.878 | ops/s |  | 
| genson/databind | thrpt | 2 | 44159.073 | ops/s |  | 
| gson/databind | thrpt | 2 | 33678.323 | ops/s |  | 
| jackson/databind | thrpt | 2 | 95337.370 | ops/s |  | 
| jackson_afterburner/databind | thrpt | 2 | 100637.060 | ops/s |  | 
| jackson_blackbird/databind | thrpt | 2 | 90378.728 | ops/s |  | 
| jodd/databind | thrpt | 2 | 14288.889 | ops/s |  | 
| johnzon/databind | thrpt | 2 | 32237.287 | ops/s |  | 
| jsonsmart/databind | thrpt | 2 | 30488.845 | ops/s |  | 
| logansquare/databind | thrpt | 2 | 87328.072 | ops/s |  | 
| moshi/databind | thrpt | 2 | 33484.818 | ops/s |  | 
| yasson/databind | thrpt | 2 | 28699.823 | ops/s |  | 
| genson/stream | thrpt | 2 | 40289.101 | ops/s |  | 
| gson/stream | thrpt | 2 | 14416.889 | ops/s |  | 
| jackson/stream | thrpt | 2 | 93692.784 | ops/s |  | 
| javaxjson/stream | thrpt | 2 | 64441.873 | ops/s |  | 
| jsonio/stream | thrpt | 2 | 10725.616 | ops/s |  | 
| jsonsimple/stream | thrpt | 2 | 7554.123 | ops/s |  | 
| minimaljson/stream | thrpt | 2 | 31133.600 | ops/s |  | 
| mjson/stream | thrpt | 2 | 12092.740 | ops/s |  | 
| moshi/stream | thrpt | 2 | 38112.080 | ops/s |  | 
| nanojson/stream | thrpt | 2 | 62321.300 | ops/s |  | 
| orgjson/stream | thrpt | 2 | 11842.706 | ops/s |  | 
| purejson/stream | thrpt | 2 | 5773.181 | ops/s |  | 
| tapestry/stream | thrpt | 2 | 6429.512 | ops/s |  | 

## JMH: Serialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 2 | 894924.900 | ops/s |  | 
| avajejsonb_jackson/databind | thrpt | 2 | 773176.956 | ops/s |  | 
| dsljson/databind | thrpt | 2 | 1160153.247 | ops/s |  | 
| dsljson_reflection/databind | thrpt | 2 | 910009.496 | ops/s |  | 
| fastjson/databind | thrpt | 2 | 847854.362 | ops/s |  | 
| flexjson/databind | thrpt | 2 | 1442.951 | ops/s |  | 
| genson/databind | thrpt | 2 | 531644.539 | ops/s |  | 
| gson/databind | thrpt | 2 | 351756.931 | ops/s |  | 
| jackson/databind | thrpt | 2 | 819795.872 | ops/s |  | 
| jackson_afterburner/databind | thrpt | 2 | 817250.051 | ops/s |  | 
| jackson_blackbird/databind | thrpt | 2 | 787275.241 | ops/s |  | 
| jodd/databind | thrpt | 2 | 134957.460 | ops/s |  | 
| johnzon/databind | thrpt | 2 | 372523.854 | ops/s |  | 
| jsonsmart/databind | thrpt | 2 | 324399.536 | ops/s |  | 
| logansquare/databind | thrpt | 2 | 881008.053 | ops/s |  | 
| moshi/databind | thrpt | 2 | 321891.464 | ops/s |  | 
| yasson/databind | thrpt | 2 | 297482.821 | ops/s |  | 
| genson/stream | thrpt | 2 | 428789.230 | ops/s |  | 
| gson/stream | thrpt | 2 | 242049.815 | ops/s |  | 
| jackson/stream | thrpt | 2 | 904008.643 | ops/s |  | 
| javaxjson/stream | thrpt | 2 | 687635.775 | ops/s |  | 
| jsonio/stream | thrpt | 2 | 106270.217 | ops/s |  | 
| jsonsimple/stream | thrpt | 2 | 132087.245 | ops/s |  | 
| minimaljson/stream | thrpt | 2 | 450195.906 | ops/s |  | 
| mjson/stream | thrpt | 2 | 147958.702 | ops/s |  | 
| moshi/stream | thrpt | 2 | 390937.392 | ops/s |  | 
| nanojson/stream | thrpt | 2 | 661480.535 | ops/s |  | 
| orgjson/stream | thrpt | 2 | 143553.352 | ops/s |  | 
| purejson/stream | thrpt | 2 | 81867.154 | ops/s |  | 
| tapestry/stream | thrpt | 2 | 99915.994 | ops/s |  | 

