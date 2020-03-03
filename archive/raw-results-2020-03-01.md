2020-03-01

# *clients* data type

## JMH: Deserialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| Deserialization.dsljson | thrpt | 20 | 832395.216 | ±26952.982 | ops/s |
| Deserialization.dsljson_reflection | thrpt | 20 | 696910.597 | ±2683.680 | ops/s |
| Deserialization.fastjson | thrpt | 20 | 237919.773 | ±2528.521 | ops/s |
| Deserialization.flexjson | thrpt | 20 | 86702.093 | ±1041.634 | ops/s |
| Deserialization.genson | thrpt | 20 | 241196.046 | ±3126.493 | ops/s |
| Deserialization.gson | thrpt | 20 | 228967.894 | ±1231.677 | ops/s |
| Deserialization.jackson | thrpt | 20 | 453967.483 | ±2927.897 | ops/s |
| Deserialization.jackson_afterburner | thrpt | 20 | 492083.114 | ±1769.500 | ops/s |
| Deserialization.jodd | thrpt | 20 | 318503.190 | ±4997.916 | ops/s |
| Deserialization.jsoniter | thrpt | 20 | 498613.387 | ±8861.339 | ops/s |
| Deserialization.logansquare | thrpt | 20 | 271568.712 | ±3322.805 | ops/s |
| Deserialization.moshi | thrpt | 20 | 231788.431 | ±629.119 | ops/s |

## JMH: Deserialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| Deserialization.dsljson | thrpt | 20 | 78025.311 | ±637.445 | ops/s |
| Deserialization.dsljson_reflection | thrpt | 20 | 63937.331 | ±577.394 | ops/s |
| Deserialization.fastjson | thrpt | 20 | 16866.316 | ±81.062 | ops/s |
| Deserialization.flexjson | thrpt | 20 | 7386.088 | ±65.666 | ops/s |
| Deserialization.genson | thrpt | 20 | 17080.485 | ±143.835 | ops/s |
| Deserialization.gson | thrpt | 20 | 15405.375 | ±393.932 | ops/s |
| Deserialization.jackson | thrpt | 20 | 17947.556 | ±70.743 | ops/s |
| Deserialization.jackson_afterburner | thrpt | 20 | 17825.872 | ±65.896 | ops/s |
| Deserialization.jodd | thrpt | 20 | 15373.778 | ±319.421 | ops/s |
| Deserialization.jsoniter | thrpt | 20 | 21226.962 | ±683.804 | ops/s |
| Deserialization.logansquare | thrpt | 20 | 17855.464 | ±251.680 | ops/s |
| Deserialization.moshi | thrpt | 20 | 14157.717 | ±365.027 | ops/s |

## JMH: Deserialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| Deserialization.dsljson | thrpt | 20 | 7774.847 | ±47.711 | ops/s |
| Deserialization.dsljson_reflection | thrpt | 20 | 6352.957 | ±30.320 | ops/s |
| Deserialization.fastjson | thrpt | 20 | 1576.337 | ±10.946 | ops/s |
| Deserialization.flexjson | thrpt | 20 | 699.679 | ±6.360 | ops/s |
| Deserialization.genson | thrpt | 20 | 1623.200 | ±7.345 | ops/s |
| Deserialization.gson | thrpt | 20 | 1480.531 | ±26.774 | ops/s |
| Deserialization.jackson | thrpt | 20 | 1730.875 | ±8.342 | ops/s |
| Deserialization.jackson_afterburner | thrpt | 20 | 1710.387 | ±18.604 | ops/s |
| Deserialization.jodd | thrpt | 20 | 1515.655 | ±16.114 | ops/s |
| Deserialization.jsoniter | thrpt | 20 | 2043.286 | ±58.568 | ops/s |
| Deserialization.logansquare | thrpt | 20 | 1747.260 | ±8.874 | ops/s |
| Deserialization.moshi | thrpt | 20 | 1389.535 | ±7.761 | ops/s |

## JMH: Deserialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| Deserialization.dsljson | thrpt | 20 | 761.387 | ±5.261 | ops/s |
| Deserialization.dsljson_reflection | thrpt | 20 | 621.868 | ±2.199 | ops/s |
| Deserialization.fastjson | thrpt | 20 | 144.953 | ±2.638 | ops/s |
| Deserialization.flexjson | thrpt | 20 | 53.249 | ±1.830 | ops/s |
| Deserialization.genson | thrpt | 20 | 158.958 | ±1.109 | ops/s |
| Deserialization.gson | thrpt | 20 | 140.236 | ±1.418 | ops/s |
| Deserialization.jackson | thrpt | 20 | 163.552 | ±3.979 | ops/s |
| Deserialization.jackson_afterburner | thrpt | 20 | 158.282 | ±0.885 | ops/s |
| Deserialization.jodd | thrpt | 20 | 138.819 | ±0.586 | ops/s |
| Deserialization.jsoniter | thrpt | 20 | 189.729 | ±0.915 | ops/s |
| Deserialization.logansquare | thrpt | 20 | 161.285 | ±4.211 | ops/s |
| Deserialization.moshi | thrpt | 20 | 133.960 | ±1.380 | ops/s |

## JMH: Serialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| Serialization.dsljson | thrpt | 20 | 1258964.047 | ±8620.687 | ops/s |
| Serialization.dsljson_reflection | thrpt | 20 | 955298.851 | ±9971.206 | ops/s |
| Serialization.fastjson | thrpt | 20 | 465305.545 | ±8515.523 | ops/s |
| Serialization.flexjson | thrpt | 20 | 583.879 | ±83.558 | ops/s |
| Serialization.genson | thrpt | 20 | 315729.078 | ±3017.809 | ops/s |
| Serialization.gson | thrpt | 20 | 303936.962 | ±1021.122 | ops/s |
| Serialization.jackson | thrpt | 20 | 726143.041 | ±1481.551 | ops/s |
| Serialization.jackson_afterburner | thrpt | 20 | 768071.869 | ±2184.502 | ops/s |
| Serialization.jodd | thrpt | 20 | 216857.719 | ±5302.710 | ops/s |
| Serialization.jsoniter | thrpt | 20 | 889002.303 | ±9042.706 | ops/s |
| Serialization.logansquare | thrpt | 20 | 657641.275 | ±1799.602 | ops/s |
| Serialization.moshi | thrpt | 20 | 332851.042 | ±2751.171 | ops/s |

## JMH: Serialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| Serialization.dsljson | thrpt | 20 | 139269.659 | ±2787.463 | ops/s |
| Serialization.dsljson_reflection | thrpt | 20 | 104766.190 | ±984.467 | ops/s |
| Serialization.fastjson | thrpt | 20 | 26688.701 | ±173.177 | ops/s |
| Serialization.flexjson | thrpt | 20 | 149.110 | ±9.703 | ops/s |
| Serialization.genson | thrpt | 20 | 34256.316 | ±97.077 | ops/s |
| Serialization.gson | thrpt | 20 | 26062.782 | ±61.501 | ops/s |
| Serialization.jackson | thrpt | 20 | 36831.464 | ±119.335 | ops/s |
| Serialization.jackson_afterburner | thrpt | 20 | 37655.409 | ±527.008 | ops/s |
| Serialization.jodd | thrpt | 20 | 19209.135 | ±75.565 | ops/s |
| Serialization.jsoniter | thrpt | 20 | 60052.389 | ±660.765 | ops/s |
| Serialization.logansquare | thrpt | 20 | 48662.425 | ±1011.105 | ops/s |
| Serialization.moshi | thrpt | 20 | 27932.962 | ±165.948 | ops/s |

## JMH: Serialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| Serialization.dsljson | thrpt | 20 | 13907.270 | ±39.768 | ops/s |
| Serialization.dsljson_reflection | thrpt | 20 | 10474.969 | ±124.898 | ops/s |
| Serialization.fastjson | thrpt | 20 | 2498.910 | ±18.905 | ops/s |
| Serialization.flexjson | thrpt | 20 | 45.089 | ±3.119 | ops/s |
| Serialization.genson | thrpt | 20 | 3458.943 | ±48.011 | ops/s |
| Serialization.gson | thrpt | 20 | 2563.265 | ±6.268 | ops/s |
| Serialization.jackson | thrpt | 20 | 3521.656 | ±10.804 | ops/s |
| Serialization.jackson_afterburner | thrpt | 20 | 3596.376 | ±11.691 | ops/s |
| Serialization.jodd | thrpt | 20 | 1937.172 | ±16.012 | ops/s |
| Serialization.jsoniter | thrpt | 20 | 5483.137 | ±31.622 | ops/s |
| Serialization.logansquare | thrpt | 20 | 4663.378 | ±62.107 | ops/s |
| Serialization.moshi | thrpt | 20 | 2757.622 | ±16.997 | ops/s |

## JMH: Serialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| Serialization.dsljson | thrpt | 20 | 1388.259 | ±2.408 | ops/s |
| Serialization.dsljson_reflection | thrpt | 20 | 1033.566 | ±19.325 | ops/s |
| Serialization.fastjson | thrpt | 20 | 201.915 | ±0.900 | ops/s |
| Serialization.flexjson | thrpt | 20 | 13.263 | ±1.060 | ops/s |
| Serialization.genson | thrpt | 20 | 333.670 | ±1.276 | ops/s |
| Serialization.gson | thrpt | 20 | 257.562 | ±1.008 | ops/s |
| Serialization.jackson | thrpt | 20 | 326.324 | ±5.117 | ops/s |
| Serialization.jackson_afterburner | thrpt | 20 | 330.839 | ±6.126 | ops/s |
| Serialization.jodd | thrpt | 20 | 179.434 | ±5.365 | ops/s |
| Serialization.jsoniter | thrpt | 20 | 529.286 | ±20.369 | ops/s |
| Serialization.logansquare | thrpt | 20 | 477.539 | ±2.937 | ops/s |
| Serialization.moshi | thrpt | 20 | 256.698 | ±4.967 | ops/s |

# *users* data type

## JMH: Deserialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 213238.252 | ±1923.685 | ops/s |
| dsljson/databind | thrpt | 20 | 767684.162 | ±3507.773 | ops/s |
| dsljson_reflection/databind | thrpt | 20 | 620088.004 | ±2561.403 | ops/s |
| fastjson/databind | thrpt | 20 | 285394.370 | ±3530.224 | ops/s |
| flexjson/databind | thrpt | 20 | 86447.165 | ±1417.533 | ops/s |
| genson/databind | thrpt | 20 | 285979.515 | ±1222.888 | ops/s |
| gson/databind | thrpt | 20 | 271354.526 | ±1639.634 | ops/s |
| jackson/databind | thrpt | 20 | 485157.868 | ±2574.602 | ops/s |
| jackson_afterburner/databind | thrpt | 20 | 537090.547 | ±1833.332 | ops/s |
| jodd/databind | thrpt | 20 | 398410.090 | ±4469.901 | ops/s |
| johnzon/databind | thrpt | 20 | 112189.423 | ±1821.877 | ops/s |
| jsoniter/databind | thrpt | 20 | 616140.329 | ±7347.556 | ops/s |
| jsonsmart/databind | thrpt | 20 | 339418.158 | ±2678.420 | ops/s |
| logansquare/databind | thrpt | 20 | 285040.864 | ±1960.383 | ops/s |
| moshi/databind | thrpt | 20 | 251732.164 | ±1595.639 | ops/s |
| yasson/databind | thrpt | 20 | 100180.777 | ±652.870 | ops/s |
| genson/stream | thrpt | 20 | 335113.090 | ±4023.824 | ops/s |
| gson/stream | thrpt | 20 | 283698.168 | ±1995.717 | ops/s |
| jackson/stream | thrpt | 20 | 515082.575 | ±4110.109 | ops/s |
| javaxjson/stream | thrpt | 20 | 51019.511 | ±460.383 | ops/s |
| jsonio/stream | thrpt | 20 | 127287.663 | ±1692.839 | ops/s |
| jsonsimple/stream | thrpt | 20 | 96931.283 | ±690.633 | ops/s |
| minimaljson/stream | thrpt | 20 | 242503.417 | ±1932.610 | ops/s |
| mjson/stream | thrpt | 20 | 180692.242 | ±3093.210 | ops/s |
| moshi/stream | thrpt | 20 | 252170.816 | ±1093.564 | ops/s |
| nanojson/stream | thrpt | 20 | 92730.986 | ±842.620 | ops/s |
| orgjson/stream | thrpt | 20 | 107110.249 | ±742.620 | ops/s |
| purejson/stream | thrpt | 20 | 84097.753 | ±337.051 | ops/s |
| tapestry/stream | thrpt | 20 | 399999.117 | ±10131.780 | ops/s |
| underscore_java/stream | thrpt | 20 | 297509.436 | ±19630.059 | ops/s |

## JMH: Deserialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 34061.972 | ±313.195 | ops/s |
| dsljson/databind | thrpt | 20 | 85076.338 | ±401.175 | ops/s |
| dsljson_reflection/databind | thrpt | 20 | 69320.625 | ±423.565 | ops/s |
| fastjson/databind | thrpt | 20 | 35355.690 | ±257.042 | ops/s |
| flexjson/databind | thrpt | 20 | 10436.258 | ±138.157 | ops/s |
| genson/databind | thrpt | 20 | 40571.520 | ±377.002 | ops/s |
| gson/databind | thrpt | 20 | 35431.795 | ±173.345 | ops/s |
| jackson/databind | thrpt | 20 | 57287.818 | ±155.258 | ops/s |
| jackson_afterburner/databind | thrpt | 20 | 66210.099 | ±456.863 | ops/s |
| jodd/databind | thrpt | 20 | 45038.417 | ±325.952 | ops/s |
| johnzon/databind | thrpt | 20 | 12984.912 | ±91.643 | ops/s |
| jsoniter/databind | thrpt | 20 | 74931.811 | ±2621.158 | ops/s |
| jsonsmart/databind | thrpt | 20 | 38690.933 | ±802.472 | ops/s |
| logansquare/databind | thrpt | 20 | 53853.466 | ±167.253 | ops/s |
| moshi/databind | thrpt | 20 | 29919.459 | ±232.921 | ops/s |
| yasson/databind | thrpt | 20 | 12232.750 | ±164.072 | ops/s |
| genson/stream | thrpt | 20 | 46327.902 | ±226.445 | ops/s |
| gson/stream | thrpt | 20 | 38304.386 | ±145.277 | ops/s |
| jackson/stream | thrpt | 20 | 61431.325 | ±1213.827 | ops/s |
| javaxjson/stream | thrpt | 20 | 25601.705 | ±164.853 | ops/s |
| jsonio/stream | thrpt | 20 | 16057.050 | ±236.169 | ops/s |
| jsonsimple/stream | thrpt | 20 | 15932.321 | ±90.634 | ops/s |
| minimaljson/stream | thrpt | 20 | 29548.358 | ±311.702 | ops/s |
| mjson/stream | thrpt | 20 | 19026.902 | ±342.549 | ops/s |
| moshi/stream | thrpt | 20 | 28271.816 | ±602.640 | ops/s |
| nanojson/stream | thrpt | 20 | 28893.563 | ±277.467 | ops/s |
| orgjson/stream | thrpt | 20 | 12324.347 | ±671.310 | ops/s |
| purejson/stream | thrpt | 20 | 9174.114 | ±132.498 | ops/s |
| tapestry/stream | thrpt | 20 | 44612.393 | ±478.897 | ops/s |
| underscore_java/stream | thrpt | 20 | 32257.071 | ±69.036 | ops/s |

## JMH: Deserialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 3565.067 | ±14.411 | ops/s |
| dsljson/databind | thrpt | 20 | 8279.957 | ±132.029 | ops/s |
| dsljson_reflection/databind | thrpt | 20 | 6822.038 | ±124.025 | ops/s |
| fastjson/databind | thrpt | 20 | 3738.720 | ±13.503 | ops/s |
| flexjson/databind | thrpt | 20 | 994.758 | ±13.625 | ops/s |
| genson/databind | thrpt | 20 | 4336.787 | ±100.585 | ops/s |
| gson/databind | thrpt | 20 | 3715.575 | ±43.848 | ops/s |
| jackson/databind | thrpt | 20 | 5967.882 | ±29.482 | ops/s |
| jackson_afterburner/databind | thrpt | 20 | 6568.031 | ±40.742 | ops/s |
| jodd/databind | thrpt | 20 | 4622.517 | ±57.581 | ops/s |
| johnzon/databind | thrpt | 20 | 1207.003 | ±4.067 | ops/s |
| jsoniter/databind | thrpt | 20 | 8095.450 | ±241.483 | ops/s |
| jsonsmart/databind | thrpt | 20 | 3939.948 | ±101.890 | ops/s |
| logansquare/databind | thrpt | 20 | 6202.761 | ±272.203 | ops/s |
| moshi/databind | thrpt | 20 | 3113.782 | ±39.687 | ops/s |
| yasson/databind | thrpt | 20 | 1219.800 | ±3.672 | ops/s |
| genson/stream | thrpt | 20 | 4729.352 | ±73.359 | ops/s |
| gson/stream | thrpt | 20 | 3856.684 | ±83.783 | ops/s |
| jackson/stream | thrpt | 20 | 6473.149 | ±54.138 | ops/s |
| javaxjson/stream | thrpt | 20 | 3165.624 | ±68.591 | ops/s |
| jsonio/stream | thrpt | 20 | 1637.283 | ±36.860 | ops/s |
| jsonsimple/stream | thrpt | 20 | 1528.931 | ±44.666 | ops/s |
| minimaljson/stream | thrpt | 20 | 2909.585 | ±10.283 | ops/s |
| mjson/stream | thrpt | 20 | 1834.982 | ±63.168 | ops/s |
| moshi/stream | thrpt | 20 | 2744.036 | ±42.721 | ops/s |
| nanojson/stream | thrpt | 20 | 3486.406 | ±27.750 | ops/s |
| orgjson/stream | thrpt | 20 | 1381.388 | ±48.570 | ops/s |
| purejson/stream | thrpt | 20 | 840.352 | ±4.605 | ops/s |
| tapestry/stream | thrpt | 20 | 4374.902 | ±192.321 | ops/s |
| underscore_java/stream | thrpt | 20 | 3348.865 | ±159.222 | ops/s |

## JMH: Deserialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 233.665 | ±4.067 | ops/s |
| dsljson/databind | thrpt | 20 | 813.920 | ±4.608 | ops/s |
| dsljson_reflection/databind | thrpt | 20 | 672.422 | ±22.386 | ops/s |
| fastjson/databind | thrpt | 20 | 358.296 | ±3.552 | ops/s |
| flexjson/databind | thrpt | 20 | 81.080 | ±1.365 | ops/s |
| genson/databind | thrpt | 20 | 405.688 | ±6.331 | ops/s |
| gson/databind | thrpt | 20 | 364.058 | ±8.817 | ops/s |
| jackson/databind | thrpt | 20 | 573.713 | ±7.218 | ops/s |
| jackson_afterburner/databind | thrpt | 20 | 637.295 | ±14.030 | ops/s |
| jodd/databind | thrpt | 20 | 452.184 | ±2.281 | ops/s |
| johnzon/databind | thrpt | 20 | 95.635 | ±1.134 | ops/s |
| jsoniter/databind | thrpt | 20 | 748.869 | ±5.250 | ops/s |
| jsonsmart/databind | thrpt | 20 | 384.936 | ±9.030 | ops/s |
| logansquare/databind | thrpt | 20 | 561.016 | ±17.161 | ops/s |
| moshi/databind | thrpt | 20 | 303.342 | ±1.528 | ops/s |
| yasson/databind | thrpt | 20 | 116.251 | ±0.401 | ops/s |
| genson/stream | thrpt | 20 | 452.032 | ±7.732 | ops/s |
| gson/stream | thrpt | 20 | 374.828 | ±3.011 | ops/s |
| jackson/stream | thrpt | 20 | 611.513 | ±11.909 | ops/s |
| javaxjson/stream | thrpt | 20 | 266.257 | ±2.659 | ops/s |
| jsonio/stream | thrpt | 20 | 146.311 | ±9.472 | ops/s |
| jsonsimple/stream | thrpt | 20 | 123.867 | ±0.890 | ops/s |
| minimaljson/stream | thrpt | 20 | 231.913 | ±2.861 | ops/s |
| mjson/stream | thrpt | 20 | 161.744 | ±3.525 | ops/s |
| moshi/stream | thrpt | 20 | 273.089 | ±9.265 | ops/s |
| nanojson/stream | thrpt | 20 | 304.974 | ±2.069 | ops/s |
| orgjson/stream | thrpt | 20 | 126.150 | ±3.861 | ops/s |
| purejson/stream | thrpt | 20 | 42.025 | ±1.758 | ops/s |
| tapestry/stream | thrpt | 20 | 363.467 | ±3.418 | ops/s |
| underscore_java/stream | thrpt | 20 | 280.828 | ±1.506 | ops/s |

## JMH: Serialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 215582.424 | ±741.768 | ops/s |
| dsljson/databind | thrpt | 20 | 1146251.547 | ±14756.419 | ops/s |
| dsljson_reflection/databind | thrpt | 20 | 833634.687 | ±4708.698 | ops/s |
| fastjson/databind | thrpt | 20 | 444503.468 | ±668.324 | ops/s |
| flexjson/databind | thrpt | 20 | 354.864 | ±28.587 | ops/s |
| genson/databind | thrpt | 20 | 355132.403 | ±1663.572 | ops/s |
| gson/databind | thrpt | 20 | 313939.314 | ±1048.547 | ops/s |
| jackson/databind | thrpt | 20 | 678909.103 | ±6730.342 | ops/s |
| jackson_afterburner/databind | thrpt | 20 | 760589.913 | ±5490.759 | ops/s |
| jodd/databind | thrpt | 20 | 206231.948 | ±3740.073 | ops/s |
| johnzon/databind | thrpt | 20 | 248218.439 | ±1187.059 | ops/s |
| jsoniter/databind | thrpt | 20 | 949860.128 | ±7531.927 | ops/s |
| jsonsmart/databind | thrpt | 20 | 315269.008 | ±8550.242 | ops/s |
| logansquare/databind | thrpt | 20 | 753476.833 | ±5071.618 | ops/s |
| moshi/databind | thrpt | 20 | 348081.413 | ±2315.197 | ops/s |
| yasson/databind | thrpt | 20 | 224575.762 | ±791.112 | ops/s |
| genson/stream | thrpt | 20 | 347591.200 | ±3969.317 | ops/s |
| gson/stream | thrpt | 20 | 158324.427 | ±3710.201 | ops/s |
| jackson/stream | thrpt | 20 | 719414.360 | ±1883.082 | ops/s |
| javaxjson/stream | thrpt | 20 | 6504.855 | ±51.697 | ops/s |
| jsonio/stream | thrpt | 20 | 118807.895 | ±902.747 | ops/s |
| jsonsimple/stream | thrpt | 20 | 92582.843 | ±2568.714 | ops/s |
| minimaljson/stream | thrpt | 20 | 291303.080 | ±3565.228 | ops/s |
| mjson/stream | thrpt | 20 | 120492.187 | ±1602.880 | ops/s |
| moshi/stream | thrpt | 20 | 370082.043 | ±1249.753 | ops/s |
| nanojson/stream | thrpt | 20 | 353211.189 | ±2951.225 | ops/s |
| orgjson/stream | thrpt | 20 | 113956.374 | ±811.519 | ops/s |
| purejson/stream | thrpt | 20 | 108840.507 | ±3240.149 | ops/s |
| tapestry/stream | thrpt | 20 | 100203.569 | ±2072.161 | ops/s |
| underscore_java/stream | thrpt | 20 | 155398.390 | ±2581.389 | ops/s |

## JMH: Serialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 28773.723 | ±97.542 | ops/s |
| dsljson/databind | thrpt | 20 | 119456.230 | ±2051.606 | ops/s |
| dsljson_reflection/databind | thrpt | 20 | 92304.398 | ±1047.337 | ops/s |
| fastjson/databind | thrpt | 20 | 32237.186 | ±229.075 | ops/s |
| flexjson/databind | thrpt | 20 | 133.965 | ±9.047 | ops/s |
| genson/databind | thrpt | 20 | 52038.513 | ±139.926 | ops/s |
| gson/databind | thrpt | 20 | 36103.193 | ±370.555 | ops/s |
| jackson/databind | thrpt | 20 | 75901.531 | ±2117.126 | ops/s |
| jackson_afterburner/databind | thrpt | 20 | 82132.461 | ±1252.256 | ops/s |
| jodd/databind | thrpt | 20 | 25067.163 | ±544.315 | ops/s |
| johnzon/databind | thrpt | 20 | 33935.904 | ±194.272 | ops/s |
| jsoniter/databind | thrpt | 20 | 106419.692 | ±2877.029 | ops/s |
| jsonsmart/databind | thrpt | 20 | 37766.525 | ±1922.150 | ops/s |
| logansquare/databind | thrpt | 20 | 84193.380 | ±2192.041 | ops/s |
| moshi/databind | thrpt | 20 | 38114.965 | ±236.906 | ops/s |
| yasson/databind | thrpt | 20 | 33769.701 | ±92.518 | ops/s |
| genson/stream | thrpt | 20 | 48128.701 | ±297.337 | ops/s |
| gson/stream | thrpt | 20 | 16601.704 | ±123.893 | ops/s |
| jackson/stream | thrpt | 20 | 80564.142 | ±1502.019 | ops/s |
| javaxjson/stream | thrpt | 20 | 704.329 | ±3.808 | ops/s |
| jsonio/stream | thrpt | 20 | 18048.778 | ±513.979 | ops/s |
| jsonsimple/stream | thrpt | 20 | 10924.803 | ±405.405 | ops/s |
| minimaljson/stream | thrpt | 20 | 34571.090 | ±1063.849 | ops/s |
| mjson/stream | thrpt | 20 | 12173.546 | ±83.663 | ops/s |
| moshi/stream | thrpt | 20 | 40757.000 | ±528.918 | ops/s |
| nanojson/stream | thrpt | 20 | 41701.582 | ±135.375 | ops/s |
| orgjson/stream | thrpt | 20 | 11691.129 | ±74.439 | ops/s |
| purejson/stream | thrpt | 20 | 10350.733 | ±30.264 | ops/s |
| tapestry/stream | thrpt | 20 | 10889.352 | ±83.192 | ops/s |
| underscore_java/stream | thrpt | 20 | 13907.061 | ±322.673 | ops/s |

## JMH: Serialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 2795.924 | ±25.497 | ops/s |
| dsljson/databind | thrpt | 20 | 12122.336 | ±38.987 | ops/s |
| dsljson_reflection/databind | thrpt | 20 | 9872.025 | ±48.654 | ops/s |
| fastjson/databind | thrpt | 20 | 3035.318 | ±12.877 | ops/s |
| flexjson/databind | thrpt | 20 | 40.431 | ±2.824 | ops/s |
| genson/databind | thrpt | 20 | 5754.461 | ±56.051 | ops/s |
| gson/databind | thrpt | 20 | 3769.209 | ±15.902 | ops/s |
| jackson/databind | thrpt | 20 | 8399.534 | ±313.494 | ops/s |
| jackson_afterburner/databind | thrpt | 20 | 8571.225 | ±149.239 | ops/s |
| jodd/databind | thrpt | 20 | 2564.255 | ±16.123 | ops/s |
| johnzon/databind | thrpt | 20 | 2993.176 | ±10.555 | ops/s |
| jsoniter/databind | thrpt | 20 | 12403.261 | ±189.024 | ops/s |
| jsonsmart/databind | thrpt | 20 | 3779.449 | ±129.445 | ops/s |
| logansquare/databind | thrpt | 20 | 8102.525 | ±30.189 | ops/s |
| moshi/databind | thrpt | 20 | 4012.211 | ±13.057 | ops/s |
| yasson/databind | thrpt | 20 | 3661.111 | ±28.909 | ops/s |
| genson/stream | thrpt | 20 | 4988.026 | ±28.681 | ops/s |
| gson/stream | thrpt | 20 | 1755.043 | ±7.126 | ops/s |
| jackson/stream | thrpt | 20 | 8265.897 | ±79.541 | ops/s |
| javaxjson/stream | thrpt | 20 | 54.459 | ±0.370 | ops/s |
| jsonio/stream | thrpt | 20 | 1907.942 | ±11.181 | ops/s |
| jsonsimple/stream | thrpt | 20 | 1125.572 | ±13.889 | ops/s |
| minimaljson/stream | thrpt | 20 | 3160.214 | ±12.489 | ops/s |
| mjson/stream | thrpt | 20 | 1042.156 | ±88.212 | ops/s |
| moshi/stream | thrpt | 20 | 4122.977 | ±22.150 | ops/s |
| nanojson/stream | thrpt | 20 | 4298.752 | ±8.326 | ops/s |
| orgjson/stream | thrpt | 20 | 1089.743 | ±4.723 | ops/s |
| purejson/stream | thrpt | 20 | 666.867 | ±4.399 | ops/s |
| tapestry/stream | thrpt | 20 | 1062.601 | ±64.225 | ops/s |
| underscore_java/stream | thrpt | 20 | 1361.478 | ±6.736 | ops/s |

## JMH: Serialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 239.254 | ±1.067 | ops/s |
| dsljson/databind | thrpt | 20 | 1208.543 | ±26.720 | ops/s |
| dsljson_reflection/databind | thrpt | 20 | 988.326 | ±12.636 | ops/s |
| fastjson/databind | thrpt | 20 | 227.328 | ±1.374 | ops/s |
| flexjson/databind | thrpt | 20 | 11.780 | ±1.014 | ops/s |
| genson/databind | thrpt | 20 | 546.803 | ±7.152 | ops/s |
| gson/databind | thrpt | 20 | 363.357 | ±9.180 | ops/s |
| jackson/databind | thrpt | 20 | 787.175 | ±41.174 | ops/s |
| jackson_afterburner/databind | thrpt | 20 | 779.545 | ±9.400 | ops/s |
| jodd/databind | thrpt | 20 | 246.457 | ±7.473 | ops/s |
| johnzon/databind | thrpt | 20 | 304.511 | ±9.869 | ops/s |
| jsoniter/databind | thrpt | 20 | 1186.253 | ±34.421 | ops/s |
| jsonsmart/databind | thrpt | 20 | 385.091 | ±6.522 | ops/s |
| logansquare/databind | thrpt | 20 | 855.075 | ±7.507 | ops/s |
| moshi/databind | thrpt | 20 | 388.655 | ±1.365 | ops/s |
| yasson/databind | thrpt | 20 | 361.686 | ±2.467 | ops/s |
| genson/stream | thrpt | 20 | 499.496 | ±7.783 | ops/s |
| gson/stream | thrpt | 20 | 176.917 | ±5.520 | ops/s |
| jackson/stream | thrpt | 20 | 755.994 | ±16.137 | ops/s |
| javaxjson/stream | thrpt | 20 | 5.240 | ±0.073 | ops/s |
| jsonio/stream | thrpt | 20 | 179.440 | ±2.483 | ops/s |
| jsonsimple/stream | thrpt | 20 | 94.332 | ±1.724 | ops/s |
| minimaljson/stream | thrpt | 20 | 290.269 | ±8.069 | ops/s |
| mjson/stream | thrpt | 20 | 59.739 | ±4.848 | ops/s |
| moshi/stream | thrpt | 20 | 399.727 | ±6.553 | ops/s |
| nanojson/stream | thrpt | 20 | 406.922 | ±0.695 | ops/s |
| orgjson/stream | thrpt | 20 | 77.965 | ±1.514 | ops/s |
| purejson/stream | thrpt | 20 | 12.302 | ±0.488 | ops/s |
| tapestry/stream | thrpt | 20 | 85.311 | ±2.851 | ops/s |
| underscore_java/stream | thrpt | 20 | 109.166 | ±2.249 | ops/s |