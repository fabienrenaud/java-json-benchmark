2021-11-27

# *clients* data type

## JMH: Deserialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.dsljson | thrpt | 20 | 770368.334 | ±15560.508 | ops/s | 
| Deserialization.dsljson_reflection | thrpt | 20 | 662550.662 | ±3338.550 | ops/s | 
| Deserialization.fastjson | thrpt | 20 | 216740.402 | ±5690.322 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 81547.179 | ±1593.411 | ops/s | 
| Deserialization.genson | thrpt | 20 | 243055.909 | ±1346.541 | ops/s | 
| Deserialization.gson | thrpt | 20 | 219436.626 | ±673.908 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 423066.926 | ±2744.368 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 457324.904 | ±4793.919 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 254549.501 | ±7671.581 | ops/s | 
| Deserialization.jsoniter | thrpt | 20 | 511286.204 | ±7749.537 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 264370.390 | ±2100.374 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 221167.365 | ±2567.723 | ops/s | 

## JMH: Deserialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.dsljson | thrpt | 20 | 76819.852 | ±1628.027 | ops/s | 
| Deserialization.dsljson_reflection | thrpt | 20 | 63355.330 | ±278.508 | ops/s | 
| Deserialization.fastjson | thrpt | 20 | 16821.685 | ±247.004 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 7405.000 | ±20.068 | ops/s | 
| Deserialization.genson | thrpt | 20 | 18744.905 | ±147.425 | ops/s | 
| Deserialization.gson | thrpt | 20 | 16368.423 | ±167.612 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 17248.730 | ±117.290 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 16698.440 | ±275.492 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 15785.637 | ±77.728 | ops/s | 
| Deserialization.jsoniter | thrpt | 20 | 22883.071 | ±300.803 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 19285.125 | ±92.833 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 15287.116 | ±139.510 | ops/s | 

## JMH: Deserialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.dsljson | thrpt | 20 | 7734.784 | ±113.699 | ops/s | 
| Deserialization.dsljson_reflection | thrpt | 20 | 6350.129 | ±12.581 | ops/s | 
| Deserialization.fastjson | thrpt | 20 | 1534.119 | ±10.569 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 704.156 | ±6.225 | ops/s | 
| Deserialization.genson | thrpt | 20 | 1592.410 | ±6.965 | ops/s | 
| Deserialization.gson | thrpt | 20 | 1458.287 | ±11.660 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 1457.929 | ±6.810 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 1393.240 | ±43.762 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 1380.204 | ±21.619 | ops/s | 
| Deserialization.jsoniter | thrpt | 20 | 1975.521 | ±19.363 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 1696.796 | ±29.836 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 1391.652 | ±4.247 | ops/s | 

## JMH: Deserialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.dsljson | thrpt | 20 | 759.568 | ±2.878 | ops/s | 
| Deserialization.dsljson_reflection | thrpt | 20 | 627.759 | ±7.122 | ops/s | 
| Deserialization.fastjson | thrpt | 20 | 139.759 | ±2.050 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 51.710 | ±1.262 | ops/s | 
| Deserialization.genson | thrpt | 20 | 155.293 | ±0.615 | ops/s | 
| Deserialization.gson | thrpt | 20 | 141.968 | ±1.164 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 139.051 | ±2.353 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 131.991 | ±1.577 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 130.680 | ±2.120 | ops/s | 
| Deserialization.jsoniter | thrpt | 20 | 187.392 | ±3.072 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 160.977 | ±0.736 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 127.651 | ±0.406 | ops/s | 

## JMH: Serialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.dsljson | thrpt | 20 | 1122521.516 | ±33720.768 | ops/s | 
| Serialization.dsljson_reflection | thrpt | 20 | 815752.356 | ±6185.983 | ops/s | 
| Serialization.fastjson | thrpt | 20 | 462007.082 | ±1010.426 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 588.359 | ±63.487 | ops/s | 
| Serialization.genson | thrpt | 20 | 297471.893 | ±1428.778 | ops/s | 
| Serialization.gson | thrpt | 20 | 257091.071 | ±554.228 | ops/s | 
| Serialization.jackson | thrpt | 20 | 696135.542 | ±23904.193 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 688663.137 | ±6541.902 | ops/s | 
| Serialization.jodd | thrpt | 20 | 177412.336 | ±997.836 | ops/s | 
| Serialization.jsoniter | thrpt | 20 | 758241.674 | ±8390.053 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 582877.953 | ±4562.639 | ops/s | 
| Serialization.moshi | thrpt | 20 | 279912.616 | ±903.399 | ops/s | 

## JMH: Serialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.dsljson | thrpt | 20 | 122332.272 | ±1343.093 | ops/s | 
| Serialization.dsljson_reflection | thrpt | 20 | 92553.866 | ±393.891 | ops/s | 
| Serialization.fastjson | thrpt | 20 | 34429.728 | ±242.076 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 151.275 | ±9.685 | ops/s | 
| Serialization.genson | thrpt | 20 | 35000.034 | ±464.514 | ops/s | 
| Serialization.gson | thrpt | 20 | 26314.360 | ±485.998 | ops/s | 
| Serialization.jackson | thrpt | 20 | 38910.823 | ±467.731 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 38591.922 | ±771.460 | ops/s | 
| Serialization.jodd | thrpt | 20 | 16182.885 | ±223.135 | ops/s | 
| Serialization.jsoniter | thrpt | 20 | 55700.694 | ±857.617 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 48374.012 | ±1903.416 | ops/s | 
| Serialization.moshi | thrpt | 20 | 25366.482 | ±263.419 | ops/s | 

## JMH: Serialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.dsljson | thrpt | 20 | 12736.795 | ±163.744 | ops/s | 
| Serialization.dsljson_reflection | thrpt | 20 | 9586.644 | ±49.398 | ops/s | 
| Serialization.fastjson | thrpt | 20 | 2860.779 | ±25.777 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 45.134 | ±3.103 | ops/s | 
| Serialization.genson | thrpt | 20 | 3664.480 | ±42.840 | ops/s | 
| Serialization.gson | thrpt | 20 | 2480.957 | ±7.535 | ops/s | 
| Serialization.jackson | thrpt | 20 | 3246.107 | ±31.691 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 3291.889 | ±14.479 | ops/s | 
| Serialization.jodd | thrpt | 20 | 1562.516 | ±5.945 | ops/s | 
| Serialization.jsoniter | thrpt | 20 | 5083.789 | ±101.436 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 4419.209 | ±58.124 | ops/s | 
| Serialization.moshi | thrpt | 20 | 2418.714 | ±22.130 | ops/s | 

## JMH: Serialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.dsljson | thrpt | 20 | 1318.877 | ±3.067 | ops/s | 
| Serialization.dsljson_reflection | thrpt | 20 | 965.045 | ±21.533 | ops/s | 
| Serialization.fastjson | thrpt | 20 | 233.669 | ±1.270 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 13.079 | ±1.066 | ops/s | 
| Serialization.genson | thrpt | 20 | 357.276 | ±5.173 | ops/s | 
| Serialization.gson | thrpt | 20 | 245.777 | ±0.511 | ops/s | 
| Serialization.jackson | thrpt | 20 | 303.375 | ±1.300 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 311.803 | ±1.785 | ops/s | 
| Serialization.jodd | thrpt | 20 | 148.958 | ±0.639 | ops/s | 
| Serialization.jsoniter | thrpt | 20 | 498.718 | ±2.017 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 416.927 | ±5.919 | ops/s | 
| Serialization.moshi | thrpt | 20 | 251.161 | ±0.745 | ops/s | 

# *users* data type

## JMH: Deserialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 218443.229 | ±828.174 | ops/s | 
| dsljson/databind | thrpt | 20 | 765340.697 | ±22180.100 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 617843.298 | ±3506.118 | ops/s | 
| fastjson/databind | thrpt | 20 | 272826.534 | ±7411.479 | ops/s | 
| flexjson/databind | thrpt | 20 | 88875.621 | ±2488.047 | ops/s | 
| genson/databind | thrpt | 20 | 297901.930 | ±3206.794 | ops/s | 
| gson/databind | thrpt | 20 | 281053.140 | ±985.020 | ops/s | 
| jackson/databind | thrpt | 20 | 472333.196 | ±2116.782 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 526975.063 | ±2532.046 | ops/s | 
| jodd/databind | thrpt | 20 | 331607.371 | ±3060.462 | ops/s | 
| johnzon/databind | thrpt | 20 | 118804.051 | ±1826.817 | ops/s | 
| jsoniter/databind | thrpt | 20 | 626826.068 | ±19879.999 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 347113.972 | ±15441.312 | ops/s | 
| logansquare/databind | thrpt | 20 | 286724.812 | ±4183.173 | ops/s | 
| moshi/databind | thrpt | 20 | 271377.602 | ±2285.768 | ops/s | 
| yasson/databind | thrpt | 20 | 90499.287 | ±414.755 | ops/s | 
| genson/stream | thrpt | 20 | 314816.326 | ±6301.950 | ops/s | 
| gson/stream | thrpt | 20 | 288559.333 | ±1931.230 | ops/s | 
| jackson/stream | thrpt | 20 | 500686.484 | ±13309.981 | ops/s | 
| javaxjson/stream | thrpt | 20 | 53719.328 | ±690.767 | ops/s | 
| jsonio/stream | thrpt | 20 | 129176.702 | ±584.410 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 105865.649 | ±607.841 | ops/s | 
| minimaljson/stream | thrpt | 20 | 234887.261 | ±944.770 | ops/s | 
| mjson/stream | thrpt | 20 | 161437.518 | ±9511.345 | ops/s | 
| moshi/stream | thrpt | 20 | 258225.961 | ±5852.533 | ops/s | 
| nanojson/stream | thrpt | 20 | 101257.089 | ±376.799 | ops/s | 
| orgjson/stream | thrpt | 20 | 160157.559 | ±2582.363 | ops/s | 
| purejson/stream | thrpt | 20 | 99365.748 | ±1691.706 | ops/s | 
| tapestry/stream | thrpt | 20 | 375791.545 | ±1467.514 | ops/s | 
| underscore_java/stream | thrpt | 20 | 294504.159 | ±6647.440 | ops/s | 

## JMH: Deserialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 35243.393 | ±204.764 | ops/s | 
| dsljson/databind | thrpt | 20 | 83815.122 | ±2209.657 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 70330.013 | ±388.568 | ops/s | 
| fastjson/databind | thrpt | 20 | 40923.946 | ±177.966 | ops/s | 
| flexjson/databind | thrpt | 20 | 9555.988 | ±497.374 | ops/s | 
| genson/databind | thrpt | 20 | 39949.988 | ±477.084 | ops/s | 
| gson/databind | thrpt | 20 | 36780.998 | ±115.402 | ops/s | 
| jackson/databind | thrpt | 20 | 59018.557 | ±419.451 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 63392.029 | ±209.800 | ops/s | 
| jodd/databind | thrpt | 20 | 38038.888 | ±578.612 | ops/s | 
| johnzon/databind | thrpt | 20 | 12917.073 | ±129.309 | ops/s | 
| jsoniter/databind | thrpt | 20 | 81529.431 | ±1848.876 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 40438.157 | ±1763.301 | ops/s | 
| logansquare/databind | thrpt | 20 | 58659.786 | ±306.581 | ops/s | 
| moshi/databind | thrpt | 20 | 30087.184 | ±991.592 | ops/s | 
| yasson/databind | thrpt | 20 | 10409.547 | ±31.901 | ops/s | 
| genson/stream | thrpt | 20 | 44946.767 | ±528.263 | ops/s | 
| gson/stream | thrpt | 20 | 38760.687 | ±151.655 | ops/s | 
| jackson/stream | thrpt | 20 | 63114.784 | ±605.781 | ops/s | 
| javaxjson/stream | thrpt | 20 | 24641.584 | ±335.203 | ops/s | 
| jsonio/stream | thrpt | 20 | 16886.660 | ±296.317 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 15134.437 | ±275.897 | ops/s | 
| minimaljson/stream | thrpt | 20 | 29694.563 | ±591.253 | ops/s | 
| mjson/stream | thrpt | 20 | 18549.333 | ±180.876 | ops/s | 
| moshi/stream | thrpt | 20 | 28186.362 | ±249.395 | ops/s | 
| nanojson/stream | thrpt | 20 | 28924.881 | ±181.601 | ops/s | 
| orgjson/stream | thrpt | 20 | 17393.228 | ±295.746 | ops/s | 
| purejson/stream | thrpt | 20 | 11612.129 | ±56.302 | ops/s | 
| tapestry/stream | thrpt | 20 | 44356.641 | ±197.354 | ops/s | 
| underscore_java/stream | thrpt | 20 | 33403.897 | ±718.560 | ops/s | 

## JMH: Deserialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 3573.083 | ±22.892 | ops/s | 
| dsljson/databind | thrpt | 20 | 8549.587 | ±98.819 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 6695.044 | ±235.563 | ops/s | 
| fastjson/databind | thrpt | 20 | 3757.564 | ±17.458 | ops/s | 
| flexjson/databind | thrpt | 20 | 981.800 | ±15.549 | ops/s | 
| genson/databind | thrpt | 20 | 4171.099 | ±46.703 | ops/s | 
| gson/databind | thrpt | 20 | 3756.913 | ±48.849 | ops/s | 
| jackson/databind | thrpt | 20 | 5869.216 | ±18.491 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 6467.896 | ±79.676 | ops/s | 
| jodd/databind | thrpt | 20 | 3812.722 | ±14.730 | ops/s | 
| johnzon/databind | thrpt | 20 | 1255.983 | ±4.983 | ops/s | 
| jsoniter/databind | thrpt | 20 | 7983.380 | ±67.135 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 3927.667 | ±114.367 | ops/s | 
| logansquare/databind | thrpt | 20 | 5810.904 | ±153.356 | ops/s | 
| moshi/databind | thrpt | 20 | 3000.091 | ±15.410 | ops/s | 
| yasson/databind | thrpt | 20 | 1062.564 | ±19.251 | ops/s | 
| genson/stream | thrpt | 20 | 4595.531 | ±37.668 | ops/s | 
| gson/stream | thrpt | 20 | 3865.965 | ±13.250 | ops/s | 
| jackson/stream | thrpt | 20 | 6221.018 | ±105.734 | ops/s | 
| javaxjson/stream | thrpt | 20 | 3149.742 | ±15.115 | ops/s | 
| jsonio/stream | thrpt | 20 | 1575.477 | ±92.290 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 1437.389 | ±6.266 | ops/s | 
| minimaljson/stream | thrpt | 20 | 2862.141 | ±65.633 | ops/s | 
| mjson/stream | thrpt | 20 | 1829.242 | ±19.518 | ops/s | 
| moshi/stream | thrpt | 20 | 2865.639 | ±10.386 | ops/s | 
| nanojson/stream | thrpt | 20 | 3404.072 | ±18.898 | ops/s | 
| orgjson/stream | thrpt | 20 | 1776.006 | ±5.051 | ops/s | 
| purejson/stream | thrpt | 20 | 988.583 | ±36.851 | ops/s | 
| tapestry/stream | thrpt | 20 | 4262.121 | ±83.162 | ops/s | 
| underscore_java/stream | thrpt | 20 | 3232.228 | ±35.443 | ops/s | 

## JMH: Deserialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 241.647 | ±5.341 | ops/s | 
| dsljson/databind | thrpt | 20 | 795.944 | ±20.220 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 661.054 | ±5.006 | ops/s | 
| fastjson/databind | thrpt | 20 | 340.964 | ±1.880 | ops/s | 
| flexjson/databind | thrpt | 20 | 76.348 | ±2.665 | ops/s | 
| genson/databind | thrpt | 20 | 400.052 | ±14.152 | ops/s | 
| gson/databind | thrpt | 20 | 363.798 | ±3.547 | ops/s | 
| jackson/databind | thrpt | 20 | 572.837 | ±2.420 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 604.229 | ±3.659 | ops/s | 
| jodd/databind | thrpt | 20 | 385.639 | ±7.815 | ops/s | 
| johnzon/databind | thrpt | 20 | 103.717 | ±3.225 | ops/s | 
| jsoniter/databind | thrpt | 20 | 772.788 | ±9.932 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 366.558 | ±17.910 | ops/s | 
| logansquare/databind | thrpt | 20 | 570.130 | ±9.270 | ops/s | 
| moshi/databind | thrpt | 20 | 297.325 | ±1.840 | ops/s | 
| yasson/databind | thrpt | 20 | 100.353 | ±1.327 | ops/s | 
| genson/stream | thrpt | 20 | 450.576 | ±14.776 | ops/s | 
| gson/stream | thrpt | 20 | 375.417 | ±5.518 | ops/s | 
| jackson/stream | thrpt | 20 | 581.918 | ±8.054 | ops/s | 
| javaxjson/stream | thrpt | 20 | 272.536 | ±2.535 | ops/s | 
| jsonio/stream | thrpt | 20 | 150.764 | ±3.770 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 130.390 | ±0.781 | ops/s | 
| minimaljson/stream | thrpt | 20 | 237.232 | ±2.154 | ops/s | 
| mjson/stream | thrpt | 20 | 161.147 | ±1.609 | ops/s | 
| moshi/stream | thrpt | 20 | 261.430 | ±6.281 | ops/s | 
| nanojson/stream | thrpt | 20 | 300.255 | ±5.083 | ops/s | 
| orgjson/stream | thrpt | 20 | 151.464 | ±1.679 | ops/s | 
| purejson/stream | thrpt | 20 | 59.679 | ±2.663 | ops/s | 
| tapestry/stream | thrpt | 20 | 344.840 | ±3.219 | ops/s | 
| underscore_java/stream | thrpt | 20 | 270.146 | ±2.350 | ops/s | 

## JMH: Serialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 214752.821 | ±4067.759 | ops/s | 
| dsljson/databind | thrpt | 20 | 963761.989 | ±7198.977 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 662962.864 | ±6031.753 | ops/s | 
| fastjson/databind | thrpt | 20 | 762421.013 | ±4252.467 | ops/s | 
| flexjson/databind | thrpt | 20 | 360.304 | ±29.825 | ops/s | 
| genson/databind | thrpt | 20 | 351881.895 | ±1516.118 | ops/s | 
| gson/databind | thrpt | 20 | 289098.453 | ±1537.187 | ops/s | 
| jackson/databind | thrpt | 20 | 576336.991 | ±3350.810 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 673710.341 | ±12061.795 | ops/s | 
| jodd/databind | thrpt | 20 | 157926.585 | ±2348.230 | ops/s | 
| johnzon/databind | thrpt | 20 | 248520.262 | ±1093.092 | ops/s | 
| jsoniter/databind | thrpt | 20 | 833309.743 | ±3387.041 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 348300.844 | ±5143.124 | ops/s | 
| logansquare/databind | thrpt | 20 | 608304.575 | ±8682.471 | ops/s | 
| moshi/databind | thrpt | 20 | 312076.675 | ±7849.642 | ops/s | 
| yasson/databind | thrpt | 20 | 208957.463 | ±1812.357 | ops/s | 
| genson/stream | thrpt | 20 | 350950.218 | ±5218.518 | ops/s | 
| gson/stream | thrpt | 20 | 159231.339 | ±1101.355 | ops/s | 
| jackson/stream | thrpt | 20 | 572359.964 | ±1034.723 | ops/s | 
| javaxjson/stream | thrpt | 20 | 54896.129 | ±786.537 | ops/s | 
| jsonio/stream | thrpt | 20 | 121893.700 | ±708.208 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 97083.275 | ±5729.363 | ops/s | 
| minimaljson/stream | thrpt | 20 | 303774.580 | ±4242.640 | ops/s | 
| mjson/stream | thrpt | 20 | 113879.977 | ±1183.695 | ops/s | 
| moshi/stream | thrpt | 20 | 334080.106 | ±13594.197 | ops/s | 
| nanojson/stream | thrpt | 20 | 349578.051 | ±2515.036 | ops/s | 
| orgjson/stream | thrpt | 20 | 130126.246 | ±1219.286 | ops/s | 
| purejson/stream | thrpt | 20 | 110521.085 | ±2381.589 | ops/s | 
| tapestry/stream | thrpt | 20 | 102886.973 | ±3682.264 | ops/s | 
| underscore_java/stream | thrpt | 20 | 153867.815 | ±493.313 | ops/s | 

## JMH: Serialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 27843.019 | ±158.325 | ops/s | 
| dsljson/databind | thrpt | 20 | 114717.691 | ±2940.839 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 90746.408 | ±770.052 | ops/s | 
| fastjson/databind | thrpt | 20 | 63292.843 | ±364.379 | ops/s | 
| flexjson/databind | thrpt | 20 | 126.343 | ±8.212 | ops/s | 
| genson/databind | thrpt | 20 | 56036.802 | ±336.536 | ops/s | 
| gson/databind | thrpt | 20 | 34520.901 | ±154.233 | ops/s | 
| jackson/databind | thrpt | 20 | 82234.398 | ±1435.417 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 79588.752 | ±2163.692 | ops/s | 
| jodd/databind | thrpt | 20 | 17632.218 | ±51.537 | ops/s | 
| johnzon/databind | thrpt | 20 | 31153.311 | ±211.337 | ops/s | 
| jsoniter/databind | thrpt | 20 | 100421.958 | ±1805.931 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 38534.150 | ±1551.488 | ops/s | 
| logansquare/databind | thrpt | 20 | 78374.637 | ±3436.326 | ops/s | 
| moshi/databind | thrpt | 20 | 33673.524 | ±49.621 | ops/s | 
| yasson/databind | thrpt | 20 | 33015.518 | ±63.688 | ops/s | 
| genson/stream | thrpt | 20 | 47628.174 | ±851.844 | ops/s | 
| gson/stream | thrpt | 20 | 17007.083 | ±40.571 | ops/s | 
| jackson/stream | thrpt | 20 | 75726.422 | ±4401.504 | ops/s | 
| javaxjson/stream | thrpt | 20 | 35333.535 | ±790.330 | ops/s | 
| jsonio/stream | thrpt | 20 | 17934.605 | ±73.576 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 9863.955 | ±55.175 | ops/s | 
| minimaljson/stream | thrpt | 20 | 29168.448 | ±441.036 | ops/s | 
| mjson/stream | thrpt | 20 | 11353.383 | ±35.673 | ops/s | 
| moshi/stream | thrpt | 20 | 35244.787 | ±352.056 | ops/s | 
| nanojson/stream | thrpt | 20 | 42719.944 | ±278.539 | ops/s | 
| orgjson/stream | thrpt | 20 | 14409.644 | ±66.526 | ops/s | 
| purejson/stream | thrpt | 20 | 9706.152 | ±46.587 | ops/s | 
| tapestry/stream | thrpt | 20 | 10088.897 | ±87.704 | ops/s | 
| underscore_java/stream | thrpt | 20 | 13574.121 | ±332.751 | ops/s | 

## JMH: Serialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 2638.553 | ±21.103 | ops/s | 
| dsljson/databind | thrpt | 20 | 10761.274 | ±222.865 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 9119.830 | ±93.113 | ops/s | 
| fastjson/databind | thrpt | 20 | 4863.127 | ±15.898 | ops/s | 
| flexjson/databind | thrpt | 20 | 39.075 | ±2.762 | ops/s | 
| genson/databind | thrpt | 20 | 5764.610 | ±164.570 | ops/s | 
| gson/databind | thrpt | 20 | 3460.042 | ±38.375 | ops/s | 
| jackson/databind | thrpt | 20 | 7441.245 | ±106.409 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 7801.048 | ±215.684 | ops/s | 
| jodd/databind | thrpt | 20 | 1811.646 | ±34.130 | ops/s | 
| johnzon/databind | thrpt | 20 | 2906.007 | ±35.213 | ops/s | 
| jsoniter/databind | thrpt | 20 | 9268.047 | ±207.807 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 3971.384 | ±195.901 | ops/s | 
| logansquare/databind | thrpt | 20 | 6973.042 | ±215.027 | ops/s | 
| moshi/databind | thrpt | 20 | 3477.658 | ±17.483 | ops/s | 
| yasson/databind | thrpt | 20 | 3418.733 | ±74.034 | ops/s | 
| genson/stream | thrpt | 20 | 5187.035 | ±221.628 | ops/s | 
| gson/stream | thrpt | 20 | 1743.862 | ±24.374 | ops/s | 
| jackson/stream | thrpt | 20 | 6987.429 | ±175.982 | ops/s | 
| javaxjson/stream | thrpt | 20 | 6235.534 | ±101.129 | ops/s | 
| jsonio/stream | thrpt | 20 | 1911.117 | ±14.344 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 1064.472 | ±38.982 | ops/s | 
| minimaljson/stream | thrpt | 20 | 3047.360 | ±71.362 | ops/s | 
| mjson/stream | thrpt | 20 | 1051.782 | ±66.259 | ops/s | 
| moshi/stream | thrpt | 20 | 3576.931 | ±13.303 | ops/s | 
| nanojson/stream | thrpt | 20 | 4285.493 | ±5.273 | ops/s | 
| orgjson/stream | thrpt | 20 | 1413.354 | ±42.103 | ops/s | 
| purejson/stream | thrpt | 20 | 698.579 | ±5.484 | ops/s | 
| tapestry/stream | thrpt | 20 | 1003.148 | ±6.582 | ops/s | 
| underscore_java/stream | thrpt | 20 | 1363.043 | ±7.227 | ops/s | 

## JMH: Serialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 259.087 | ±1.543 | ops/s | 
| dsljson/databind | thrpt | 20 | 1050.098 | ±39.882 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 821.694 | ±7.498 | ops/s | 
| fastjson/databind | thrpt | 20 | 333.959 | ±1.972 | ops/s | 
| flexjson/databind | thrpt | 20 | 11.743 | ±1.015 | ops/s | 
| genson/databind | thrpt | 20 | 541.770 | ±4.725 | ops/s | 
| gson/databind | thrpt | 20 | 348.402 | ±2.622 | ops/s | 
| jackson/databind | thrpt | 20 | 740.338 | ±73.981 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 743.512 | ±10.892 | ops/s | 
| jodd/databind | thrpt | 20 | 177.873 | ±1.342 | ops/s | 
| johnzon/databind | thrpt | 20 | 287.170 | ±1.881 | ops/s | 
| jsoniter/databind | thrpt | 20 | 949.165 | ±27.364 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 394.096 | ±5.270 | ops/s | 
| logansquare/databind | thrpt | 20 | 729.317 | ±45.867 | ops/s | 
| moshi/databind | thrpt | 20 | 335.211 | ±7.012 | ops/s | 
| yasson/databind | thrpt | 20 | 344.711 | ±1.079 | ops/s | 
| genson/stream | thrpt | 20 | 495.811 | ±5.556 | ops/s | 
| gson/stream | thrpt | 20 | 168.475 | ±1.797 | ops/s | 
| jackson/stream | thrpt | 20 | 706.139 | ±3.270 | ops/s | 
| javaxjson/stream | thrpt | 20 | 622.408 | ±45.389 | ops/s | 
| jsonio/stream | thrpt | 20 | 187.776 | ±3.293 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 92.511 | ±2.160 | ops/s | 
| minimaljson/stream | thrpt | 20 | 284.572 | ±5.655 | ops/s | 
| mjson/stream | thrpt | 20 | 65.577 | ±3.223 | ops/s | 
| moshi/stream | thrpt | 20 | 363.742 | ±8.379 | ops/s | 
| nanojson/stream | thrpt | 20 | 412.896 | ±2.966 | ops/s | 
| orgjson/stream | thrpt | 20 | 137.634 | ±0.935 | ops/s | 
| purejson/stream | thrpt | 20 | 13.068 | ±0.579 | ops/s | 
| tapestry/stream | thrpt | 20 | 80.694 | ±1.804 | ops/s | 
| underscore_java/stream | thrpt | 20 | 107.185 | ±4.042 | ops/s | 

