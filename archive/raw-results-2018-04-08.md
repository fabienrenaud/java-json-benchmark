2018-04-08

# *clients* data type

## JMH: Deserialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.fastjson | thrpt | 20 | 376760.593 | ±4376.406 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 131846.674 | ±1887.491 | ops/s | 
| Deserialization.genson | thrpt | 20 | 421940.856 | ±5734.446 | ops/s | 
| Deserialization.gson | thrpt | 20 | 387278.010 | ±5518.944 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 706368.134 | ±11459.227 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 756933.232 | ±8500.955 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 495989.786 | ±6269.405 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 438336.291 | ±7888.160 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 365952.083 | ±3199.372 | ops/s | 

## JMH: Deserialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.fastjson | thrpt | 20 | 27464.704 | ±390.138 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 12028.351 | ±275.111 | ops/s | 
| Deserialization.genson | thrpt | 20 | 29725.261 | ±622.817 | ops/s | 
| Deserialization.gson | thrpt | 20 | 26503.257 | ±364.409 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 31933.183 | ±500.453 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 32065.731 | ±355.619 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 26933.650 | ±208.949 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 31456.784 | ±592.769 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 24739.433 | ±301.109 | ops/s | 

## JMH: Deserialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.fastjson | thrpt | 20 | 2533.927 | ±48.856 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 1161.012 | ±21.022 | ops/s | 
| Deserialization.genson | thrpt | 20 | 2672.785 | ±27.494 | ops/s | 
| Deserialization.gson | thrpt | 20 | 2375.939 | ±24.780 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 2700.786 | ±28.971 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 2610.879 | ±50.006 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 2399.771 | ±29.758 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 2716.063 | ±28.138 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 2269.038 | ±20.803 | ops/s | 

## JMH: Deserialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.fastjson | thrpt | 20 | 230.175 | ±2.539 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 88.036 | ±2.950 | ops/s | 
| Deserialization.genson | thrpt | 20 | 263.848 | ±2.616 | ops/s | 
| Deserialization.gson | thrpt | 20 | 230.247 | ±2.157 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 266.009 | ±2.017 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 249.110 | ±2.238 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 232.174 | ±2.998 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 268.068 | ±3.574 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 215.492 | ±2.404 | ops/s | 

## JMH: Serialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.fastjson | thrpt | 20 | 1203422.159 | ±8623.948 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 1666.425 | ±566.983 | ops/s | 
| Serialization.genson | thrpt | 20 | 549613.667 | ±7398.386 | ops/s | 
| Serialization.gson | thrpt | 20 | 393720.715 | ±3094.969 | ops/s | 
| Serialization.jackson | thrpt | 20 | 1427157.612 | ±23481.871 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 1481662.248 | ±20083.428 | ops/s | 
| Serialization.jodd | thrpt | 20 | 382109.734 | ±4272.286 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 1162216.741 | ±199571.153 | ops/s | 
| Serialization.moshi | thrpt | 20 | 525840.938 | ±5339.642 | ops/s | 

## JMH: Serialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.fastjson | thrpt | 20 | 76296.867 | ±1671.735 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 471.485 | ±122.627 | ops/s | 
| Serialization.genson | thrpt | 20 | 60785.564 | ±1032.971 | ops/s | 
| Serialization.gson | thrpt | 20 | 36222.559 | ±638.298 | ops/s | 
| Serialization.jackson | thrpt | 20 | 73017.245 | ±1223.099 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 74796.783 | ±1058.331 | ops/s | 
| Serialization.jodd | thrpt | 20 | 32553.196 | ±992.301 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 93280.781 | ±2248.219 | ops/s | 
| Serialization.moshi | thrpt | 20 | 43373.998 | ±1051.014 | ops/s | 

## JMH: Serialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.fastjson | thrpt | 20 | 6269.013 | ±86.183 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 145.369 | ±39.029 | ops/s | 
| Serialization.genson | thrpt | 20 | 5960.861 | ±90.961 | ops/s | 
| Serialization.gson | thrpt | 20 | 3649.715 | ±47.446 | ops/s | 
| Serialization.jackson | thrpt | 20 | 5909.646 | ±69.158 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 5991.838 | ±72.320 | ops/s | 
| Serialization.jodd | thrpt | 20 | 3193.624 | ±98.081 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 8299.699 | ±215.159 | ops/s | 
| Serialization.moshi | thrpt | 20 | 4312.504 | ±112.161 | ops/s | 

## JMH: Serialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.fastjson | thrpt | 20 | 423.543 | ±9.993 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 40.952 | ±9.889 | ops/s | 
| Serialization.genson | thrpt | 20 | 598.449 | ±9.391 | ops/s | 
| Serialization.gson | thrpt | 20 | 363.965 | ±5.226 | ops/s | 
| Serialization.jackson | thrpt | 20 | 570.705 | ±7.617 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 564.998 | ±10.701 | ops/s | 
| Serialization.jodd | thrpt | 20 | 308.206 | ±3.488 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 806.642 | ±15.486 | ops/s | 
| Serialization.moshi | thrpt | 20 | 413.339 | ±7.651 | ops/s | 

# *users* data type

## JMH: Deserialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 311923.391 | ±4083.586 | ops/s | 
| dsljson/databind | thrpt | 20 | 1602993.683 | ±36849.980 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 1086368.380 | ±14789.642 | ops/s | 
| fastjson/databind | thrpt | 20 | 508558.269 | ±10475.115 | ops/s | 
| flexjson/databind | thrpt | 20 | 135273.579 | ±4080.986 | ops/s | 
| genson/databind | thrpt | 20 | 524297.627 | ±5942.136 | ops/s | 
| gson/databind | thrpt | 20 | 473437.219 | ±5856.094 | ops/s | 
| jackson/databind | thrpt | 20 | 743445.971 | ±7444.325 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 863135.246 | ±11502.575 | ops/s | 
| jodd/databind | thrpt | 20 | 625257.837 | ±4557.051 | ops/s | 
| johnzon/databind | thrpt | 20 | 223837.443 | ±2458.039 | ops/s | 
| jsoniter/databind | thrpt | 20 | 856873.658 | ±14661.819 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 554982.970 | ±4405.568 | ops/s | 
| logansquare/databind | thrpt | 20 | 486707.200 | ±7339.032 | ops/s | 
| moshi/databind | thrpt | 20 | 441966.380 | ±6929.137 | ops/s | 
| yasson/databind | thrpt | 20 | 154291.312 | ±2615.398 | ops/s | 
| genson/stream | thrpt | 20 | 634558.060 | ±16648.936 | ops/s | 
| gson/stream | thrpt | 20 | 531112.542 | ±8042.390 | ops/s | 
| jackson/stream | thrpt | 20 | 861212.043 | ±10345.138 | ops/s | 
| javaxjson/stream | thrpt | 20 | 50408.434 | ±496.149 | ops/s | 
| jsonio/stream | thrpt | 20 | 223440.744 | ±1837.181 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 183063.243 | ±2249.914 | ops/s | 
| minimaljson/stream | thrpt | 20 | 426472.968 | ±11332.934 | ops/s | 
| moshi/stream | thrpt | 20 | 413301.392 | ±8644.937 | ops/s | 
| nanojson/stream | thrpt | 20 | 143193.052 | ±439.727 | ops/s | 
| orgjson/stream | thrpt | 20 | 169505.594 | ±2884.471 | ops/s | 
| tapestry/stream | thrpt | 20 | 623964.867 | ±9988.181 | ops/s | 

## JMH: Deserialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 54312.530 | ±1013.131 | ops/s | 
| dsljson/databind | thrpt | 20 | 155812.648 | ±1181.153 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 111263.642 | ±3205.528 | ops/s | 
| fastjson/databind | thrpt | 20 | 64082.453 | ±827.788 | ops/s | 
| flexjson/databind | thrpt | 20 | 15958.323 | ±397.113 | ops/s | 
| genson/databind | thrpt | 20 | 67872.623 | ±445.568 | ops/s | 
| gson/databind | thrpt | 20 | 62565.102 | ±770.044 | ops/s | 
| jackson/databind | thrpt | 20 | 87899.313 | ±406.623 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 95531.104 | ±986.366 | ops/s | 
| jodd/databind | thrpt | 20 | 70018.499 | ±1101.954 | ops/s | 
| johnzon/databind | thrpt | 20 | 24824.673 | ±148.416 | ops/s | 
| jsoniter/databind | thrpt | 20 | 95723.273 | ±998.118 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 60809.552 | ±1130.733 | ops/s | 
| logansquare/databind | thrpt | 20 | 83955.825 | ±870.566 | ops/s | 
| moshi/databind | thrpt | 20 | 49289.784 | ±597.644 | ops/s | 
| yasson/databind | thrpt | 20 | 17304.267 | ±318.784 | ops/s | 
| genson/stream | thrpt | 20 | 78614.818 | ±1348.408 | ops/s | 
| gson/stream | thrpt | 20 | 67299.441 | ±1516.277 | ops/s | 
| jackson/stream | thrpt | 20 | 102014.670 | ±2127.332 | ops/s | 
| javaxjson/stream | thrpt | 20 | 32155.218 | ±322.170 | ops/s | 
| jsonio/stream | thrpt | 20 | 30359.277 | ±574.129 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 25353.959 | ±456.531 | ops/s | 
| minimaljson/stream | thrpt | 20 | 51080.518 | ±661.132 | ops/s | 
| moshi/stream | thrpt | 20 | 44625.954 | ±580.761 | ops/s | 
| nanojson/stream | thrpt | 20 | 43315.747 | ±1820.940 | ops/s | 
| orgjson/stream | thrpt | 20 | 21460.218 | ±280.505 | ops/s | 
| tapestry/stream | thrpt | 20 | 69859.667 | ±2727.106 | ops/s | 

## JMH: Deserialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 6044.547 | ±73.467 | ops/s | 
| dsljson/databind | thrpt | 20 | 15002.133 | ±184.245 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 11530.781 | ±167.893 | ops/s | 
| fastjson/databind | thrpt | 20 | 6609.961 | ±69.667 | ops/s | 
| flexjson/databind | thrpt | 20 | 1589.435 | ±30.862 | ops/s | 
| genson/databind | thrpt | 20 | 7256.021 | ±274.037 | ops/s | 
| gson/databind | thrpt | 20 | 6194.781 | ±173.413 | ops/s | 
| jackson/databind | thrpt | 20 | 9255.473 | ±115.261 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 9869.621 | ±143.190 | ops/s | 
| jodd/databind | thrpt | 20 | 7244.681 | ±86.755 | ops/s | 
| johnzon/databind | thrpt | 20 | 2286.197 | ±95.934 | ops/s | 
| jsoniter/databind | thrpt | 20 | 2813.123 | ±18.187 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 6215.966 | ±140.516 | ops/s | 
| logansquare/databind | thrpt | 20 | 9091.472 | ±161.822 | ops/s | 
| moshi/databind | thrpt | 20 | 4735.162 | ±60.825 | ops/s | 
| yasson/databind | thrpt | 20 | 1667.906 | ±25.288 | ops/s | 
| genson/stream | thrpt | 20 | 8112.412 | ±121.116 | ops/s | 
| gson/stream | thrpt | 20 | 6584.742 | ±87.861 | ops/s | 
| jackson/stream | thrpt | 20 | 10076.483 | ±186.520 | ops/s | 
| javaxjson/stream | thrpt | 20 | 5357.153 | ±81.420 | ops/s | 
| jsonio/stream | thrpt | 20 | 2923.716 | ±54.669 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 2383.041 | ±43.548 | ops/s | 
| minimaljson/stream | thrpt | 20 | 4834.694 | ±55.907 | ops/s | 
| moshi/stream | thrpt | 20 | 4520.196 | ±82.801 | ops/s | 
| nanojson/stream | thrpt | 20 | 5096.507 | ±109.699 | ops/s | 
| orgjson/stream | thrpt | 20 | 2294.847 | ±29.757 | ops/s | 
| tapestry/stream | thrpt | 20 | 6743.090 | ±131.590 | ops/s | 

## JMH: Deserialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 332.527 | ±12.426 | ops/s | 
| dsljson/databind | thrpt | 20 | 1392.658 | ±18.732 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 1080.258 | ±31.662 | ops/s | 
| fastjson/databind | thrpt | 20 | 581.438 | ±13.649 | ops/s | 
| flexjson/databind | thrpt | 20 | 127.903 | ±3.425 | ops/s | 
| genson/databind | thrpt | 20 | 644.674 | ±9.175 | ops/s | 
| gson/databind | thrpt | 20 | 586.496 | ±18.205 | ops/s | 
| jackson/databind | thrpt | 20 | 869.838 | ±11.260 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 918.823 | ±16.198 | ops/s | 
| jodd/databind | thrpt | 20 | 655.056 | ±6.294 | ops/s | 
| johnzon/databind | thrpt | 20 | 149.407 | ±17.934 | ops/s | 
| jsoniter/databind | thrpt | 20 | 19.069 | ±0.307 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 585.760 | ±3.289 | ops/s | 
| logansquare/databind | thrpt | 20 | 838.196 | ±27.632 | ops/s | 
| moshi/databind | thrpt | 20 | 438.224 | ±7.719 | ops/s | 
| yasson/databind | thrpt | 20 | 154.984 | ±1.247 | ops/s | 
| genson/stream | thrpt | 20 | 774.565 | ±11.199 | ops/s | 
| gson/stream | thrpt | 20 | 608.607 | ±7.576 | ops/s | 
| jackson/stream | thrpt | 20 | 930.075 | ±17.774 | ops/s | 
| javaxjson/stream | thrpt | 20 | 417.711 | ±11.837 | ops/s | 
| jsonio/stream | thrpt | 20 | 256.829 | ±6.026 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 198.049 | ±4.184 | ops/s | 
| minimaljson/stream | thrpt | 20 | 365.680 | ±12.591 | ops/s | 
| moshi/stream | thrpt | 20 | 416.508 | ±9.836 | ops/s | 
| nanojson/stream | thrpt | 20 | 459.591 | ±9.072 | ops/s | 
| orgjson/stream | thrpt | 20 | 201.949 | ±3.541 | ops/s | 
| tapestry/stream | thrpt | 20 | 495.249 | ±28.764 | ops/s | 

## JMH: Serialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 368913.235 | ±12189.398 | ops/s | 
| dsljson/databind | thrpt | 20 | 2133205.935 | ±238237.897 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 1554995.327 | ±115839.526 | ops/s | 
| fastjson/databind | thrpt | 20 | 1516594.291 | ±18420.892 | ops/s | 
| flexjson/databind | thrpt | 20 | 1045.791 | ±294.325 | ops/s | 
| genson/databind | thrpt | 20 | 690475.161 | ±8369.968 | ops/s | 
| gson/databind | thrpt | 20 | 436332.300 | ±14247.566 | ops/s | 
| jackson/databind | thrpt | 20 | 1353047.654 | ±11711.872 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 1530495.147 | ±33403.531 | ops/s | 
| jodd/databind | thrpt | 20 | 373094.080 | ±7906.996 | ops/s | 
| johnzon/databind | thrpt | 20 | 481632.638 | ±3559.903 | ops/s | 
| jsoniter/databind | thrpt | 20 | 1057065.685 | ±29535.050 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 671465.605 | ±23302.752 | ops/s | 
| logansquare/databind | thrpt | 20 | 1675964.967 | ±16551.649 | ops/s | 
| moshi/databind | thrpt | 20 | 648013.360 | ±13016.804 | ops/s | 
| yasson/databind | thrpt | 20 | 520527.687 | ±14479.925 | ops/s | 
| genson/stream | thrpt | 20 | 623394.320 | ±9215.504 | ops/s | 
| gson/stream | thrpt | 20 | 266600.330 | ±8701.111 | ops/s | 
| jackson/stream | thrpt | 20 | 1542299.092 | ±17502.235 | ops/s | 
| javaxjson/stream | thrpt | 20 | 4520.044 | ±42.013 | ops/s | 
| jsonio/stream | thrpt | 20 | 236748.951 | ±2607.913 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 177585.788 | ±2921.916 | ops/s | 
| minimaljson/stream | thrpt | 20 | 577527.393 | ±7569.699 | ops/s | 
| moshi/stream | thrpt | 20 | 719240.905 | ±10884.559 | ops/s | 
| nanojson/stream | thrpt | 20 | 740930.479 | ±8975.398 | ops/s | 
| orgjson/stream | thrpt | 20 | 191915.092 | ±1876.166 | ops/s | 
| tapestry/stream | thrpt | 20 | 172136.334 | ±1896.975 | ops/s | 

## JMH: Serialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 49221.545 | ±582.627 | ops/s | 
| dsljson/databind | thrpt | 20 | 261951.990 | ±17107.424 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 187489.557 | ±5100.375 | ops/s | 
| fastjson/databind | thrpt | 20 | 108145.133 | ±1076.586 | ops/s | 
| flexjson/databind | thrpt | 20 | 425.939 | ±110.956 | ops/s | 
| genson/databind | thrpt | 20 | 100547.411 | ±3972.757 | ops/s | 
| gson/databind | thrpt | 20 | 48925.196 | ±557.913 | ops/s | 
| jackson/databind | thrpt | 20 | 140996.255 | ±2107.965 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 171641.110 | ±4318.970 | ops/s | 
| jodd/databind | thrpt | 20 | 41864.189 | ±1491.484 | ops/s | 
| johnzon/databind | thrpt | 20 | 60933.997 | ±923.489 | ops/s | 
| jsoniter/databind | thrpt | 20 | 103352.616 | ±1779.314 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 73671.916 | ±3017.515 | ops/s | 
| logansquare/databind | thrpt | 20 | 167663.239 | ±7791.075 | ops/s | 
| moshi/databind | thrpt | 20 | 65019.689 | ±4207.235 | ops/s | 
| yasson/databind | thrpt | 20 | 79603.768 | ±753.335 | ops/s | 
| genson/stream | thrpt | 20 | 80445.560 | ±1811.007 | ops/s | 
| gson/stream | thrpt | 20 | 26431.430 | ±1008.321 | ops/s | 
| jackson/stream | thrpt | 20 | 161821.290 | ±2084.122 | ops/s | 
| javaxjson/stream | thrpt | 20 | 498.472 | ±3.881 | ops/s | 
| jsonio/stream | thrpt | 20 | 33161.322 | ±2447.394 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 18031.516 | ±1203.046 | ops/s | 
| minimaljson/stream | thrpt | 20 | 62191.601 | ±1779.984 | ops/s | 
| moshi/stream | thrpt | 20 | 70758.651 | ±816.143 | ops/s | 
| nanojson/stream | thrpt | 20 | 95106.591 | ±1102.422 | ops/s | 
| orgjson/stream | thrpt | 20 | 17319.821 | ±118.519 | ops/s | 
| tapestry/stream | thrpt | 20 | 17299.571 | ±72.800 | ops/s | 

## JMH: Serialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 4713.532 | ±37.057 | ops/s | 
| dsljson/databind | thrpt | 20 | 25310.625 | ±1553.326 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 20284.665 | ±798.761 | ops/s | 
| fastjson/databind | thrpt | 20 | 9218.583 | ±98.172 | ops/s | 
| flexjson/databind | thrpt | 20 | 130.341 | ±33.668 | ops/s | 
| genson/databind | thrpt | 20 | 9625.754 | ±204.542 | ops/s | 
| gson/databind | thrpt | 20 | 4935.887 | ±47.324 | ops/s | 
| jackson/databind | thrpt | 20 | 16339.140 | ±197.707 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 15953.729 | ±327.963 | ops/s | 
| jodd/databind | thrpt | 20 | 4161.367 | ±90.271 | ops/s | 
| johnzon/databind | thrpt | 20 | 5808.520 | ±167.870 | ops/s | 
| jsoniter/databind | thrpt | 20 | 10755.137 | ±248.940 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 7382.239 | ±298.674 | ops/s | 
| logansquare/databind | thrpt | 20 | 14865.303 | ±415.033 | ops/s | 
| moshi/databind | thrpt | 20 | 6741.825 | ±225.118 | ops/s | 
| yasson/databind | thrpt | 20 | 8677.414 | ±121.358 | ops/s | 
| genson/stream | thrpt | 20 | 8498.942 | ±400.491 | ops/s | 
| gson/stream | thrpt | 20 | 2558.247 | ±48.074 | ops/s | 
| jackson/stream | thrpt | 20 | 15762.237 | ±260.669 | ops/s | 
| javaxjson/stream | thrpt | 20 | 47.229 | ±0.616 | ops/s | 
| jsonio/stream | thrpt | 20 | 3459.914 | ±117.447 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 1645.369 | ±18.763 | ops/s | 
| minimaljson/stream | thrpt | 20 | 5668.200 | ±78.459 | ops/s | 
| moshi/stream | thrpt | 20 | 6969.944 | ±76.084 | ops/s | 
| nanojson/stream | thrpt | 20 | 9249.785 | ±183.098 | ops/s | 
| orgjson/stream | thrpt | 20 | 1698.721 | ±14.251 | ops/s | 
| tapestry/stream | thrpt | 20 | 1806.385 | ±39.074 | ops/s | 

## JMH: Serialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 366.571 | ±3.630 | ops/s | 
| dsljson/databind | thrpt | 20 | 2524.586 | ±40.658 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 1864.849 | ±66.186 | ops/s | 
| fastjson/databind | thrpt | 20 | 532.994 | ±2.542 | ops/s | 
| flexjson/databind | thrpt | 20 | 37.083 | ±9.030 | ops/s | 
| genson/databind | thrpt | 20 | 976.156 | ±27.291 | ops/s | 
| gson/databind | thrpt | 20 | 474.623 | ±4.978 | ops/s | 
| jackson/databind | thrpt | 20 | 1586.131 | ±51.347 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 1481.676 | ±92.336 | ops/s | 
| jodd/databind | thrpt | 20 | 428.550 | ±9.187 | ops/s | 
| johnzon/databind | thrpt | 20 | 552.078 | ±17.913 | ops/s | 
| jsoniter/databind | thrpt | 20 | 982.736 | ±23.210 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 707.850 | ±30.747 | ops/s | 
| logansquare/databind | thrpt | 20 | 1570.583 | ±58.147 | ops/s | 
| moshi/databind | thrpt | 20 | 642.288 | ±9.084 | ops/s | 
| yasson/databind | thrpt | 20 | 848.145 | ±10.667 | ops/s | 
| genson/stream | thrpt | 20 | 828.976 | ±8.360 | ops/s | 
| gson/stream | thrpt | 20 | 257.342 | ±8.809 | ops/s | 
| jackson/stream | thrpt | 20 | 1652.659 | ±23.323 | ops/s | 
| javaxjson/stream | thrpt | 20 | 4.485 | ±0.064 | ops/s | 
| jsonio/stream | thrpt | 20 | 330.570 | ±6.058 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 143.980 | ±4.331 | ops/s | 
| minimaljson/stream | thrpt | 20 | 479.381 | ±8.702 | ops/s | 
| moshi/stream | thrpt | 20 | 642.594 | ±8.370 | ops/s | 
| nanojson/stream | thrpt | 20 | 836.919 | ±23.790 | ops/s | 
| orgjson/stream | thrpt | 20 | 115.738 | ±2.647 | ops/s | 
| tapestry/stream | thrpt | 20 | 131.896 | ±6.025 | ops/s | 

