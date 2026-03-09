2026-02-28

# *clients* data type

## JMH: Serialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.avajejsonb | thrpt | 20 | 1424778.082 | ±10563.384 | ops/s |
| Serialization.avajejsonb_jackson | thrpt | 20 | 1419652.070 | ±30269.153 | ops/s |
| Serialization.djomo | thrpt | 20 | 1632420.744 | ±16126.602 | ops/s |
| Serialization.dsljson | thrpt | 20 | 1346432.695 | ±22453.622 | ops/s |
| Serialization.dsljson_reflection | thrpt | 20 | 1488888.333 | ±52447.497 | ops/s |
| Serialization.fastjson | thrpt | 20 | 3574294.182 | ±81121.103 | ops/s |
| Serialization.fastjson_features | thrpt | 20 | 3210913.677 | ±130006.622 | ops/s |
| Serialization.flexjson | thrpt | 20 | 364.544 | ±21.670 | ops/s |
| Serialization.genson | thrpt | 20 | 883713.630 | ±8276.525 | ops/s |
| Serialization.gson | thrpt | 20 | 832802.053 | ±23724.063 | ops/s |
| Serialization.jackson | thrpt | 20 | 1313666.670 | ±4767.738 | ops/s |
| Serialization.jackson_afterburner | thrpt | 20 | 1400526.355 | ±15358.249 | ops/s |
| Serialization.jackson_blackbird | thrpt | 20 | 1379918.423 | ±15102.199 | ops/s |
| Serialization.jodd | thrpt | 20 | 138985.614 | ±432.590 | ops/s |
| Serialization.logansquare | thrpt | 20 | 1380220.515 | ±38589.282 | ops/s |
| Serialization.moshi | thrpt | 20 | 637198.037 | ±926.277 | ops/s |
| Serialization.wast | thrpt | 20 | 3733765.370 | ±97015.218 | ops/s |

## JMH: Serialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.avajejsonb | thrpt | 20 | 129327.206 | ±9888.541 | ops/s |
| Serialization.avajejsonb_jackson | thrpt | 20 | 133087.259 | ±1462.089 | ops/s |
| Serialization.djomo | thrpt | 20 | 180581.403 | ±932.002 | ops/s |
| Serialization.dsljson | thrpt | 20 | 283825.172 | ±145.885 | ops/s |
| Serialization.dsljson_reflection | thrpt | 20 | 153693.752 | ±17156.858 | ops/s |
| Serialization.fastjson | thrpt | 20 | 500614.091 | ±2917.835 | ops/s |
| Serialization.fastjson_features | thrpt | 20 | 499331.334 | ±3622.465 | ops/s |
| Serialization.flexjson | thrpt | 20 | 91.363 | ±8.643 | ops/s |
| Serialization.genson | thrpt | 20 | 93755.483 | ±41.423 | ops/s |
| Serialization.gson | thrpt | 20 | 75801.341 | ±155.728 | ops/s |
| Serialization.jackson | thrpt | 20 | 105779.837 | ±248.600 | ops/s |
| Serialization.jackson_afterburner | thrpt | 20 | 110374.748 | ±654.857 | ops/s |
| Serialization.jackson_blackbird | thrpt | 20 | 108933.964 | ±994.813 | ops/s |
| Serialization.jodd | thrpt | 20 | 14732.667 | ±20.822 | ops/s |
| Serialization.logansquare | thrpt | 20 | 124813.835 | ±10387.658 | ops/s |
| Serialization.moshi | thrpt | 20 | 63311.715 | ±137.152 | ops/s |
| Serialization.wast | thrpt | 20 | 595950.065 | ±5772.779 | ops/s |

## JMH: Serialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.avajejsonb | thrpt | 20 | 13939.044 | ±187.900 | ops/s |
| Serialization.avajejsonb_jackson | thrpt | 20 | 13153.901 | ±94.892 | ops/s |
| Serialization.djomo | thrpt | 20 | 17728.073 | ±167.922 | ops/s |
| Serialization.dsljson | thrpt | 20 | 18262.800 | ±518.880 | ops/s |
| Serialization.dsljson_reflection | thrpt | 20 | 17863.914 | ±1172.892 | ops/s |
| Serialization.fastjson | thrpt | 20 | 48380.345 | ±158.631 | ops/s |
| Serialization.fastjson_features | thrpt | 20 | 50250.767 | ±258.599 | ops/s |
| Serialization.flexjson | thrpt | 20 | 36.175 | ±2.312 | ops/s |
| Serialization.genson | thrpt | 20 | 9832.588 | ±8.739 | ops/s |
| Serialization.gson | thrpt | 20 | 7425.943 | ±6.431 | ops/s |
| Serialization.jackson | thrpt | 20 | 10373.048 | ±17.699 | ops/s |
| Serialization.jackson_afterburner | thrpt | 20 | 10699.050 | ±17.667 | ops/s |
| Serialization.jackson_blackbird | thrpt | 20 | 10579.566 | ±23.047 | ops/s |
| Serialization.jodd | thrpt | 20 | 1478.789 | ±0.576 | ops/s |
| Serialization.logansquare | thrpt | 20 | 13563.984 | ±231.644 | ops/s |
| Serialization.moshi | thrpt | 20 | 6000.870 | ±54.777 | ops/s |
| Serialization.wast | thrpt | 20 | 49735.996 | ±156.232 | ops/s |

## JMH: Serialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.avajejsonb | thrpt | 20 | 1319.680 | ±5.274 | ops/s |
| Serialization.avajejsonb_jackson | thrpt | 20 | 1215.290 | ±9.930 | ops/s |
| Serialization.djomo | thrpt | 20 | 1509.459 | ±110.600 | ops/s |
| Serialization.dsljson | thrpt | 20 | 2155.994 | ±457.233 | ops/s |
| Serialization.dsljson_reflection | thrpt | 20 | 1537.866 | ±82.498 | ops/s |
| Serialization.fastjson | thrpt | 20 | 4475.937 | ±8.524 | ops/s |
| Serialization.fastjson_features | thrpt | 20 | 4685.556 | ±6.444 | ops/s |
| Serialization.flexjson | thrpt | 20 | 11.317 | ±0.739 | ops/s |
| Serialization.genson | thrpt | 20 | 885.770 | ±8.383 | ops/s |
| Serialization.gson | thrpt | 20 | 707.745 | ±5.756 | ops/s |
| Serialization.jackson | thrpt | 20 | 947.675 | ±3.169 | ops/s |
| Serialization.jackson_afterburner | thrpt | 20 | 993.872 | ±14.686 | ops/s |
| Serialization.jackson_blackbird | thrpt | 20 | 1004.312 | ±5.109 | ops/s |
| Serialization.jodd | thrpt | 20 | 143.815 | ±0.343 | ops/s |
| Serialization.logansquare | thrpt | 20 | 1149.277 | ±90.512 | ops/s |
| Serialization.moshi | thrpt | 20 | 606.201 | ±6.100 | ops/s |
| Serialization.wast | thrpt | 20 | 5298.821 | ±53.888 | ops/s |

## JMH: Deserialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.avajejsonb | thrpt | 20 | 674724.364 | ±10007.805 | ops/s |
| Deserialization.avajejsonb_jackson | thrpt | 20 | 582835.126 | ±871.814 | ops/s |
| Deserialization.djomo | thrpt | 20 | 1343674.507 | ±423.313 | ops/s |
| Deserialization.dsljson | thrpt | 20 | 1531760.142 | ±107509.441 | ops/s |
| Deserialization.dsljson_reflection | thrpt | 20 | 1164916.184 | ±156764.200 | ops/s |
| Deserialization.fastjson | thrpt | 20 | 2454134.908 | ±15313.583 | ops/s |
| Deserialization.fastjson_features | thrpt | 20 | 2704569.731 | ±129295.286 | ops/s |
| Deserialization.flexjson | thrpt | 20 | 101186.796 | ±286.576 | ops/s |
| Deserialization.genson | thrpt | 20 | 464645.494 | ±1611.555 | ops/s |
| Deserialization.gson | thrpt | 20 | 443383.875 | ±2896.090 | ops/s |
| Deserialization.jackson | thrpt | 20 | 521848.765 | ±2054.458 | ops/s |
| Deserialization.jackson_afterburner | thrpt | 20 | 561557.209 | ±4309.142 | ops/s |
| Deserialization.jackson_blackbird | thrpt | 20 | 560067.768 | ±1905.997 | ops/s |
| Deserialization.jodd | thrpt | 20 | 357523.368 | ±656.620 | ops/s |
| Deserialization.logansquare | thrpt | 20 | 424591.488 | ±1803.062 | ops/s |
| Deserialization.moshi | thrpt | 20 | 438784.685 | ±28940.631 | ops/s |
| Deserialization.wast | thrpt | 20 | 2585405.714 | ±31201.734 | ops/s |

## JMH: Deserialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.avajejsonb | thrpt | 20 | 43601.755 | ±135.736 | ops/s |
| Deserialization.avajejsonb_jackson | thrpt | 20 | 41316.729 | ±263.367 | ops/s |
| Deserialization.djomo | thrpt | 20 | 147122.263 | ±1774.406 | ops/s |
| Deserialization.dsljson | thrpt | 20 | 185211.509 | ±487.835 | ops/s |
| Deserialization.dsljson_reflection | thrpt | 20 | 127892.741 | ±7077.940 | ops/s |
| Deserialization.fastjson | thrpt | 20 | 290389.179 | ±10310.767 | ops/s |
| Deserialization.fastjson_features | thrpt | 20 | 275013.576 | ±604.535 | ops/s |
| Deserialization.flexjson | thrpt | 20 | 9948.845 | ±42.675 | ops/s |
| Deserialization.genson | thrpt | 20 | 38356.639 | ±658.621 | ops/s |
| Deserialization.gson | thrpt | 20 | 36355.243 | ±202.179 | ops/s |
| Deserialization.jackson | thrpt | 20 | 37303.526 | ±218.942 | ops/s |
| Deserialization.jackson_afterburner | thrpt | 20 | 39143.916 | ±676.944 | ops/s |
| Deserialization.jackson_blackbird | thrpt | 20 | 38729.367 | ±517.277 | ops/s |
| Deserialization.jodd | thrpt | 20 | 28528.819 | ±181.508 | ops/s |
| Deserialization.logansquare | thrpt | 20 | 38241.466 | ±236.645 | ops/s |
| Deserialization.moshi | thrpt | 20 | 34399.863 | ±389.074 | ops/s |
| Deserialization.wast | thrpt | 20 | 326110.629 | ±656.984 | ops/s |

## JMH: Deserialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.avajejsonb | thrpt | 20 | 4398.052 | ±47.303 | ops/s |
| Deserialization.avajejsonb_jackson | thrpt | 20 | 4186.729 | ±36.201 | ops/s |
| Deserialization.djomo | thrpt | 20 | 14232.382 | ±53.472 | ops/s |
| Deserialization.dsljson | thrpt | 20 | 16408.011 | ±869.626 | ops/s |
| Deserialization.dsljson_reflection | thrpt | 20 | 12221.733 | ±1720.830 | ops/s |
| Deserialization.fastjson | thrpt | 20 | 26909.169 | ±701.582 | ops/s |
| Deserialization.fastjson_features | thrpt | 20 | 27455.641 | ±239.261 | ops/s |
| Deserialization.flexjson | thrpt | 20 | 977.453 | ±6.743 | ops/s |
| Deserialization.genson | thrpt | 20 | 3929.242 | ±65.596 | ops/s |
| Deserialization.gson | thrpt | 20 | 3633.758 | ±29.461 | ops/s |
| Deserialization.jackson | thrpt | 20 | 3765.560 | ±8.184 | ops/s |
| Deserialization.jackson_afterburner | thrpt | 20 | 3910.449 | ±79.357 | ops/s |
| Deserialization.jackson_blackbird | thrpt | 20 | 3938.476 | ±21.074 | ops/s |
| Deserialization.jodd | thrpt | 20 | 2785.973 | ±23.486 | ops/s |
| Deserialization.logansquare | thrpt | 20 | 4016.064 | ±22.909 | ops/s |
| Deserialization.moshi | thrpt | 20 | 3395.868 | ±31.005 | ops/s |
| Deserialization.wast | thrpt | 20 | 33210.309 | ±56.194 | ops/s |

## JMH: Deserialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.avajejsonb | thrpt | 20 | 441.974 | ±4.304 | ops/s |
| Deserialization.avajejsonb_jackson | thrpt | 20 | 409.242 | ±2.045 | ops/s |
| Deserialization.djomo | thrpt | 20 | 1369.462 | ±14.763 | ops/s |
| Deserialization.dsljson | thrpt | 20 | 1724.249 | ±62.491 | ops/s |
| Deserialization.dsljson_reflection | thrpt | 20 | 1171.138 | ±82.917 | ops/s |
| Deserialization.fastjson | thrpt | 20 | 2632.807 | ±77.075 | ops/s |
| Deserialization.fastjson_features | thrpt | 20 | 2649.264 | ±15.509 | ops/s |
| Deserialization.flexjson | thrpt | 20 | 96.129 | ±0.749 | ops/s |
| Deserialization.genson | thrpt | 20 | 378.049 | ±4.067 | ops/s |
| Deserialization.gson | thrpt | 20 | 363.321 | ±0.708 | ops/s |
| Deserialization.jackson | thrpt | 20 | 379.355 | ±1.559 | ops/s |
| Deserialization.jackson_afterburner | thrpt | 20 | 392.921 | ±1.186 | ops/s |
| Deserialization.jackson_blackbird | thrpt | 20 | 390.999 | ±0.771 | ops/s |
| Deserialization.jodd | thrpt | 20 | 278.855 | ±1.918 | ops/s |
| Deserialization.logansquare | thrpt | 20 | 376.506 | ±4.477 | ops/s |
| Deserialization.moshi | thrpt | 20 | 334.068 | ±3.787 | ops/s |
| Deserialization.wast | thrpt | 20 | 3143.053 | ±15.467 | ops/s |

# *users* data type

## JMH: Serialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 1753805.391 | ±49158.395 | ops/s |
| avajejsonb_jackson/databind | thrpt | 20 | 1700078.430 | ±4400.389 | ops/s |
| djomo/databind | thrpt | 20 | 1932186.186 | ±38500.844 | ops/s |
| dsljson/databind | thrpt | 20 | 1779747.387 | ±1690.164 | ops/s |
| dsljson_reflection/databind | thrpt | 20 | 1249459.293 | ±65235.808 | ops/s |
| fastjson/databind | thrpt | 20 | 3678764.372 | ±16142.168 | ops/s |
| fastjson_features/databind | thrpt | 20 | 3357078.858 | ±135667.822 | ops/s |
| flexjson/databind | thrpt | 20 | 329.026 | ±25.827 | ops/s |
| genson/databind | thrpt | 20 | 1082590.578 | ±14510.806 | ops/s |
| gson/databind | thrpt | 20 | 902342.572 | ±3282.826 | ops/s |
| jackson/databind | thrpt | 20 | 1561314.897 | ±39390.871 | ops/s |
| jackson_afterburner/databind | thrpt | 20 | 1728988.824 | ±2650.373 | ops/s |
| jackson_blackbird/databind | thrpt | 20 | 1642015.998 | ±25340.210 | ops/s |
| jodd/databind | thrpt | 20 | 130354.219 | ±398.096 | ops/s |
| johnzon/databind | thrpt | 20 | 652205.176 | ±3694.554 | ops/s |
| jsonsmart/databind | thrpt | 20 | 907709.476 | ±57359.562 | ops/s |
| logansquare/databind | thrpt | 20 | 1634888.963 | ±28290.996 | ops/s |
| moshi/databind | thrpt | 20 | 715650.223 | ±10193.248 | ops/s |
| qson/databind | thrpt | 20 | 1144945.577 | ±1277.506 | ops/s |
| quickbuf_json/databind | thrpt | 20 | 3266580.015 | ±129738.745 | ops/s |
| wast/databind | thrpt | 20 | 4025955.028 | ±118554.853 | ops/s |
| yasson/databind | thrpt | 20 | 579501.548 | ±4846.874 | ops/s |
| antons/stream | thrpt | 20 | 245094.024 | ±1629.636 | ops/s |
| genson/stream | thrpt | 20 | 982622.565 | ±3695.438 | ops/s |
| gson/stream | thrpt | 20 | 276995.821 | ±502.483 | ops/s |
| jackson/stream | thrpt | 20 | 1508593.734 | ±1253.285 | ops/s |
| jakartajson/stream | thrpt | 20 | 777819.925 | ±7806.966 | ops/s |
| jsonio/stream | thrpt | 20 | 12301.680 | ±391.571 | ops/s |
| jsonsimple/stream | thrpt | 20 | 90489.166 | ±190.993 | ops/s |
| minimaljson/stream | thrpt | 20 | 823624.120 | ±61290.988 | ops/s |
| mjson/stream | thrpt | 20 | 265662.662 | ±1029.958 | ops/s |
| moshi/stream | thrpt | 20 | 741971.961 | ±3630.772 | ops/s |
| nanojson/stream | thrpt | 20 | 977889.445 | ±8193.248 | ops/s |
| orgjson/stream | thrpt | 20 | 119174.658 | ±2815.217 | ops/s |
| purejson/stream | thrpt | 20 | 241623.413 | ±2480.469 | ops/s |
| tapestry/stream | thrpt | 20 | 153325.795 | ±8740.651 | ops/s |
| underscore_java/stream | thrpt | 20 | 248698.387 | ±2005.747 | ops/s |

## JMH: Serialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 195972.854 | ±1813.553 | ops/s |
| avajejsonb_jackson/databind | thrpt | 20 | 184368.900 | ±214.760 | ops/s |
| djomo/databind | thrpt | 20 | 194954.161 | ±11923.196 | ops/s |
| dsljson/databind | thrpt | 20 | 235262.167 | ±588.873 | ops/s |
| dsljson_reflection/databind | thrpt | 20 | 168895.569 | ±1224.367 | ops/s |
| fastjson/databind | thrpt | 20 | 473139.666 | ±2501.790 | ops/s |
| fastjson_features/databind | thrpt | 20 | 480617.803 | ±4030.006 | ops/s |
| flexjson/databind | thrpt | 20 | 91.112 | ±10.467 | ops/s |
| genson/databind | thrpt | 20 | 137725.584 | ±546.983 | ops/s |
| gson/databind | thrpt | 20 | 96897.073 | ±6837.501 | ops/s |
| jackson/databind | thrpt | 20 | 181759.705 | ±396.016 | ops/s |
| jackson_afterburner/databind | thrpt | 20 | 197900.864 | ±148.654 | ops/s |
| jackson_blackbird/databind | thrpt | 20 | 194381.831 | ±350.738 | ops/s |
| jodd/databind | thrpt | 20 | 13760.594 | ±156.152 | ops/s |
| johnzon/databind | thrpt | 20 | 82022.806 | ±248.379 | ops/s |
| jsonsmart/databind | thrpt | 20 | 95559.077 | ±6004.771 | ops/s |
| logansquare/databind | thrpt | 20 | 191495.463 | ±113.245 | ops/s |
| moshi/databind | thrpt | 20 | 76056.648 | ±459.717 | ops/s |
| qson/databind | thrpt | 20 | 130679.298 | ±475.008 | ops/s |
| quickbuf_json/databind | thrpt | 20 | 335760.552 | ±7592.571 | ops/s |
| wast/databind | thrpt | 20 | 586644.763 | ±12133.585 | ops/s |
| yasson/databind | thrpt | 20 | 73332.667 | ±415.372 | ops/s |
| antons/stream | thrpt | 20 | 24935.135 | ±46.221 | ops/s |
| genson/stream | thrpt | 20 | 127533.475 | ±548.244 | ops/s |
| gson/stream | thrpt | 20 | 28416.605 | ±62.044 | ops/s |
| jackson/stream | thrpt | 20 | 160983.213 | ±525.066 | ops/s |
| jakartajson/stream | thrpt | 20 | 113290.120 | ±376.186 | ops/s |
| jsonio/stream | thrpt | 20 | 7071.681 | ±179.019 | ops/s |
| jsonsimple/stream | thrpt | 20 | 9619.343 | ±411.044 | ops/s |
| minimaljson/stream | thrpt | 20 | 88395.923 | ±218.107 | ops/s |
| mjson/stream | thrpt | 20 | 29125.319 | ±173.150 | ops/s |
| moshi/stream | thrpt | 20 | 80371.619 | ±171.240 | ops/s |
| nanojson/stream | thrpt | 20 | 122153.697 | ±575.405 | ops/s |
| orgjson/stream | thrpt | 20 | 12861.162 | ±17.024 | ops/s |
| purejson/stream | thrpt | 20 | 22246.898 | ±223.441 | ops/s |
| tapestry/stream | thrpt | 20 | 13395.083 | ±1105.998 | ops/s |
| underscore_java/stream | thrpt | 20 | 27187.890 | ±905.323 | ops/s |

## JMH: Serialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 19152.831 | ±299.137 | ops/s |
| avajejsonb_jackson/databind | thrpt | 20 | 18694.002 | ±48.958 | ops/s |
| djomo/databind | thrpt | 20 | 20468.103 | ±85.273 | ops/s |
| dsljson/databind | thrpt | 20 | 24026.180 | ±8.246 | ops/s |
| dsljson_reflection/databind | thrpt | 20 | 16978.736 | ±947.837 | ops/s |
| fastjson/databind | thrpt | 20 | 46271.574 | ±63.290 | ops/s |
| fastjson_features/databind | thrpt | 20 | 47504.007 | ±344.052 | ops/s |
| flexjson/databind | thrpt | 20 | 32.513 | ±1.968 | ops/s |
| genson/databind | thrpt | 20 | 14772.239 | ±73.923 | ops/s |
| gson/databind | thrpt | 20 | 11269.859 | ±39.070 | ops/s |
| jackson/databind | thrpt | 20 | 17621.249 | ±292.150 | ops/s |
| jackson_afterburner/databind | thrpt | 20 | 20156.749 | ±15.958 | ops/s |
| jackson_blackbird/databind | thrpt | 20 | 19206.232 | ±55.492 | ops/s |
| jodd/databind | thrpt | 20 | 1374.664 | ±5.399 | ops/s |
| johnzon/databind | thrpt | 20 | 8167.696 | ±14.503 | ops/s |
| jsonsmart/databind | thrpt | 20 | 5993.795 | ±168.456 | ops/s |
| logansquare/databind | thrpt | 20 | 19821.830 | ±12.524 | ops/s |
| moshi/databind | thrpt | 20 | 7688.441 | ±18.917 | ops/s |
| qson/databind | thrpt | 20 | 13195.195 | ±160.578 | ops/s |
| quickbuf_json/databind | thrpt | 20 | 32683.980 | ±859.187 | ops/s |
| wast/databind | thrpt | 20 | 59272.432 | ±358.938 | ops/s |
| yasson/databind | thrpt | 20 | 7582.061 | ±37.724 | ops/s |
| antons/stream | thrpt | 20 | 2665.912 | ±12.936 | ops/s |
| genson/stream | thrpt | 20 | 13015.805 | ±164.949 | ops/s |
| gson/stream | thrpt | 20 | 2843.729 | ±6.005 | ops/s |
| jackson/stream | thrpt | 20 | 16618.255 | ±14.385 | ops/s |
| jakartajson/stream | thrpt | 20 | 11405.437 | ±153.742 | ops/s |
| jsonio/stream | thrpt | 20 | 2082.208 | ±41.063 | ops/s |
| jsonsimple/stream | thrpt | 20 | 923.276 | ±6.143 | ops/s |
| minimaljson/stream | thrpt | 20 | 5826.265 | ±33.312 | ops/s |
| mjson/stream | thrpt | 20 | 2896.663 | ±68.810 | ops/s |
| moshi/stream | thrpt | 20 | 8068.629 | ±70.376 | ops/s |
| nanojson/stream | thrpt | 20 | 6814.050 | ±19.655 | ops/s |
| orgjson/stream | thrpt | 20 | 1295.426 | ±1.599 | ops/s |
| purejson/stream | thrpt | 20 | 2101.100 | ±22.070 | ops/s |
| tapestry/stream | thrpt | 20 | 1361.712 | ±105.442 | ops/s |
| underscore_java/stream | thrpt | 20 | 2454.529 | ±216.929 | ops/s |

## JMH: Serialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 1975.193 | ±6.997 | ops/s |
| avajejsonb_jackson/databind | thrpt | 20 | 1797.204 | ±15.869 | ops/s |
| djomo/databind | thrpt | 20 | 1982.176 | ±5.903 | ops/s |
| dsljson/databind | thrpt | 20 | 2433.056 | ±1.810 | ops/s |
| dsljson_reflection/databind | thrpt | 20 | 1318.497 | ±328.932 | ops/s |
| fastjson/databind | thrpt | 20 | 4414.788 | ±4.756 | ops/s |
| fastjson_features/databind | thrpt | 20 | 4457.390 | ±9.895 | ops/s |
| flexjson/databind | thrpt | 20 | 10.177 | ±0.671 | ops/s |
| genson/databind | thrpt | 20 | 1459.788 | ±14.328 | ops/s |
| gson/databind | thrpt | 20 | 1009.856 | ±60.806 | ops/s |
| jackson/databind | thrpt | 20 | 1589.295 | ±55.714 | ops/s |
| jackson_afterburner/databind | thrpt | 20 | 1817.554 | ±10.107 | ops/s |
| jackson_blackbird/databind | thrpt | 20 | 1769.241 | ±32.774 | ops/s |
| jodd/databind | thrpt | 20 | 138.525 | ±0.156 | ops/s |
| johnzon/databind | thrpt | 20 | 810.156 | ±1.050 | ops/s |
| jsonsmart/databind | thrpt | 20 | 540.070 | ±36.199 | ops/s |
| logansquare/databind | thrpt | 20 | 1909.819 | ±1.949 | ops/s |
| moshi/databind | thrpt | 20 | 760.886 | ±5.201 | ops/s |
| qson/databind | thrpt | 20 | 1321.857 | ±2.504 | ops/s |
| quickbuf_json/databind | thrpt | 20 | 2922.025 | ±1.540 | ops/s |
| wast/databind | thrpt | 20 | 5485.890 | ±13.557 | ops/s |
| yasson/databind | thrpt | 20 | 712.127 | ±16.635 | ops/s |
| antons/stream | thrpt | 20 | 257.818 | ±10.859 | ops/s |
| genson/stream | thrpt | 20 | 1323.838 | ±41.465 | ops/s |
| gson/stream | thrpt | 20 | 285.324 | ±0.312 | ops/s |
| jackson/stream | thrpt | 20 | 1553.790 | ±3.065 | ops/s |
| jakartajson/stream | thrpt | 20 | 1122.231 | ±5.218 | ops/s |
| jsonio/stream | thrpt | 20 | 252.753 | ±1.256 | ops/s |
| jsonsimple/stream | thrpt | 20 | 92.535 | ±1.243 | ops/s |
| minimaljson/stream | thrpt | 20 | 533.094 | ±4.982 | ops/s |
| mjson/stream | thrpt | 20 | 229.463 | ±21.637 | ops/s |
| moshi/stream | thrpt | 20 | 815.633 | ±1.458 | ops/s |
| nanojson/stream | thrpt | 20 | 632.244 | ±0.722 | ops/s |
| orgjson/stream | thrpt | 20 | 128.768 | ±0.514 | ops/s |
| purejson/stream | thrpt | 20 | 91.870 | ±1.641 | ops/s |
| tapestry/stream | thrpt | 20 | 137.729 | ±4.346 | ops/s |
| underscore_java/stream | thrpt | 20 | 212.406 | ±5.459 | ops/s |

## JMH: Deserialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 1144171.912 | ±1748.505 | ops/s |
| avajejsonb_jackson/databind | thrpt | 20 | 1026828.404 | ±1503.712 | ops/s |
| djomo/databind | thrpt | 20 | 1593493.286 | ±42746.104 | ops/s |
| dsljson/databind | thrpt | 20 | 1963825.275 | ±38563.130 | ops/s |
| dsljson_reflection/databind | thrpt | 20 | 1134631.825 | ±51929.420 | ops/s |
| fastjson/databind | thrpt | 20 | 3059112.779 | ±15157.757 | ops/s |
| fastjson_features/databind | thrpt | 20 | 3561149.768 | ±14012.355 | ops/s |
| flexjson/databind | thrpt | 20 | 108956.378 | ±656.543 | ops/s |
| genson/databind | thrpt | 20 | 740981.917 | ±20357.357 | ops/s |
| gson/databind | thrpt | 20 | 669696.733 | ±6113.393 | ops/s |
| jackson/databind | thrpt | 20 | 910771.781 | ±12084.199 | ops/s |
| jackson_afterburner/databind | thrpt | 20 | 1063921.943 | ±8077.019 | ops/s |
| jackson_blackbird/databind | thrpt | 20 | 958257.479 | ±76249.218 | ops/s |
| jodd/databind | thrpt | 20 | 562452.077 | ±2744.505 | ops/s |
| johnzon/databind | thrpt | 20 | 277619.407 | ±2231.243 | ops/s |
| jsonsmart/databind | thrpt | 20 | 1153191.064 | ±7504.114 | ops/s |
| logansquare/databind | thrpt | 20 | 620898.663 | ±623.783 | ops/s |
| moshi/databind | thrpt | 20 | 722930.403 | ±12929.938 | ops/s |
| qson/databind | thrpt | 20 | 949396.108 | ±1676.807 | ops/s |
| quickbuf_json/databind | thrpt | 20 | 758431.309 | ±11513.351 | ops/s |
| wast/databind | thrpt | 20 | 3328764.470 | ±55064.903 | ops/s |
| yasson/databind | thrpt | 20 | 407054.343 | ±2526.332 | ops/s |
| antons/stream | thrpt | 20 | 372691.024 | ±4417.137 | ops/s |
| genson/stream | thrpt | 20 | 784689.082 | ±22629.008 | ops/s |
| gson/stream | thrpt | 20 | 671021.507 | ±4698.174 | ops/s |
| jackson/stream | thrpt | 20 | 1091952.003 | ±9375.045 | ops/s |
| jakartajson/stream | thrpt | 20 | 57436.168 | ±514.764 | ops/s |
| jsonio/stream | thrpt | 20 | 15611.090 | ±438.092 | ops/s |
| jsonsimple/stream | thrpt | 20 | 181844.560 | ±904.293 | ops/s |
| minimaljson/stream | thrpt | 20 | 553471.302 | ±8675.524 | ops/s |
| mjson/stream | thrpt | 20 | 122305.110 | ±312.780 | ops/s |
| moshi/stream | thrpt | 20 | 528059.760 | ±63179.982 | ops/s |
| nanojson/stream | thrpt | 20 | 388962.076 | ±2281.119 | ops/s |
| orgjson/stream | thrpt | 20 | 121310.245 | ±2366.471 | ops/s |
| purejson/stream | thrpt | 20 | 302544.856 | ±2780.969 | ops/s |
| tapestry/stream | thrpt | 20 | 830775.066 | ±7037.657 | ops/s |
| underscore_java/stream | thrpt | 20 | 813741.400 | ±1059.697 | ops/s |

## JMH: Deserialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 119964.421 | ±8684.117 | ops/s |
| avajejsonb_jackson/databind | thrpt | 20 | 115976.644 | ±309.792 | ops/s |
| djomo/databind | thrpt | 20 | 156353.430 | ±2935.777 | ops/s |
| dsljson/databind | thrpt | 20 | 205270.517 | ±1936.257 | ops/s |
| dsljson_reflection/databind | thrpt | 20 | 113333.803 | ±8142.291 | ops/s |
| fastjson/databind | thrpt | 20 | 301880.363 | ±7085.771 | ops/s |
| fastjson_features/databind | thrpt | 20 | 338353.156 | ±1155.656 | ops/s |
| flexjson/databind | thrpt | 20 | 12252.568 | ±14.113 | ops/s |
| genson/databind | thrpt | 20 | 95113.460 | ±459.234 | ops/s |
| gson/databind | thrpt | 20 | 89326.945 | ±468.518 | ops/s |
| jackson/databind | thrpt | 20 | 109397.320 | ±202.127 | ops/s |
| jackson_afterburner/databind | thrpt | 20 | 131462.279 | ±1619.691 | ops/s |
| jackson_blackbird/databind | thrpt | 20 | 128043.258 | ±155.328 | ops/s |
| jodd/databind | thrpt | 20 | 61784.516 | ±26.875 | ops/s |
| johnzon/databind | thrpt | 20 | 32157.161 | ±1302.108 | ops/s |
| jsonsmart/databind | thrpt | 20 | 131020.387 | ±777.475 | ops/s |
| logansquare/databind | thrpt | 20 | 114674.719 | ±309.747 | ops/s |
| moshi/databind | thrpt | 20 | 78527.894 | ±1459.432 | ops/s |
| qson/databind | thrpt | 20 | 106754.794 | ±1106.545 | ops/s |
| quickbuf_json/databind | thrpt | 20 | 88005.002 | ±478.945 | ops/s |
| wast/databind | thrpt | 20 | 327106.014 | ±1056.889 | ops/s |
| yasson/databind | thrpt | 20 | 47817.136 | ±1163.258 | ops/s |
| antons/stream | thrpt | 20 | 36972.909 | ±157.540 | ops/s |
| genson/stream | thrpt | 20 | 107316.818 | ±377.963 | ops/s |
| gson/stream | thrpt | 20 | 83723.116 | ±12231.788 | ops/s |
| jackson/stream | thrpt | 20 | 128762.864 | ±796.666 | ops/s |
| jakartajson/stream | thrpt | 20 | 25523.935 | ±157.913 | ops/s |
| jsonio/stream | thrpt | 20 | 12784.085 | ±83.183 | ops/s |
| jsonsimple/stream | thrpt | 20 | 20696.641 | ±159.470 | ops/s |
| minimaljson/stream | thrpt | 20 | 68833.934 | ±162.483 | ops/s |
| mjson/stream | thrpt | 20 | 12908.325 | ±19.190 | ops/s |
| moshi/stream | thrpt | 20 | 70741.342 | ±95.602 | ops/s |
| nanojson/stream | thrpt | 20 | 73455.388 | ±299.605 | ops/s |
| orgjson/stream | thrpt | 20 | 12927.864 | ±167.104 | ops/s |
| purejson/stream | thrpt | 20 | 32964.279 | ±309.030 | ops/s |
| tapestry/stream | thrpt | 20 | 87575.523 | ±1495.114 | ops/s |
| underscore_java/stream | thrpt | 20 | 81178.780 | ±338.692 | ops/s |

## JMH: Deserialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 12890.561 | ±16.794 | ops/s |
| avajejsonb_jackson/databind | thrpt | 20 | 11814.952 | ±32.437 | ops/s |
| djomo/databind | thrpt | 20 | 16596.811 | ±381.553 | ops/s |
| dsljson/databind | thrpt | 20 | 21474.192 | ±146.848 | ops/s |
| dsljson_reflection/databind | thrpt | 20 | 12041.176 | ±1320.788 | ops/s |
| fastjson/databind | thrpt | 20 | 31961.176 | ±558.735 | ops/s |
| fastjson_features/databind | thrpt | 20 | 34462.825 | ±168.090 | ops/s |
| flexjson/databind | thrpt | 20 | 1232.563 | ±3.560 | ops/s |
| genson/databind | thrpt | 20 | 8739.966 | ±837.329 | ops/s |
| gson/databind | thrpt | 20 | 9300.090 | ±14.755 | ops/s |
| jackson/databind | thrpt | 20 | 11664.556 | ±129.037 | ops/s |
| jackson_afterburner/databind | thrpt | 20 | 13652.691 | ±24.109 | ops/s |
| jackson_blackbird/databind | thrpt | 20 | 13372.509 | ±95.311 | ops/s |
| jodd/databind | thrpt | 20 | 6244.123 | ±18.731 | ops/s |
| johnzon/databind | thrpt | 20 | 3274.356 | ±133.711 | ops/s |
| jsonsmart/databind | thrpt | 20 | 13538.085 | ±90.988 | ops/s |
| logansquare/databind | thrpt | 20 | 13017.918 | ±37.696 | ops/s |
| moshi/databind | thrpt | 20 | 7888.423 | ±88.555 | ops/s |
| qson/databind | thrpt | 20 | 10996.319 | ±12.879 | ops/s |
| quickbuf_json/databind | thrpt | 20 | 9249.296 | ±223.453 | ops/s |
| wast/databind | thrpt | 20 | 34238.711 | ±201.344 | ops/s |
| yasson/databind | thrpt | 20 | 4836.281 | ±68.124 | ops/s |
| antons/stream | thrpt | 20 | 3809.679 | ±70.219 | ops/s |
| genson/stream | thrpt | 20 | 11312.028 | ±31.998 | ops/s |
| gson/stream | thrpt | 20 | 8844.476 | ±1245.770 | ops/s |
| jackson/stream | thrpt | 20 | 13354.667 | ±221.925 | ops/s |
| jakartajson/stream | thrpt | 20 | 3781.634 | ±12.258 | ops/s |
| jsonio/stream | thrpt | 20 | 3681.221 | ±12.451 | ops/s |
| jsonsimple/stream | thrpt | 20 | 2161.031 | ±4.191 | ops/s |
| minimaljson/stream | thrpt | 20 | 7006.329 | ±63.683 | ops/s |
| mjson/stream | thrpt | 20 | 1298.695 | ±3.792 | ops/s |
| moshi/stream | thrpt | 20 | 7229.616 | ±16.431 | ops/s |
| nanojson/stream | thrpt | 20 | 7627.724 | ±5.898 | ops/s |
| orgjson/stream | thrpt | 20 | 1298.110 | ±26.798 | ops/s |
| purejson/stream | thrpt | 20 | 3400.604 | ±20.420 | ops/s |
| tapestry/stream | thrpt | 20 | 8900.946 | ±146.987 | ops/s |
| underscore_java/stream | thrpt | 20 | 8400.197 | ±283.604 | ops/s |

## JMH: Deserialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 1316.902 | ±14.990 | ops/s |
| avajejsonb_jackson/databind | thrpt | 20 | 1176.474 | ±13.344 | ops/s |
| djomo/databind | thrpt | 20 | 1597.191 | ±12.058 | ops/s |
| dsljson/databind | thrpt | 20 | 1858.255 | ±234.436 | ops/s |
| dsljson_reflection/databind | thrpt | 20 | 1017.170 | ±73.423 | ops/s |
| fastjson/databind | thrpt | 20 | 2954.253 | ±46.828 | ops/s |
| fastjson_features/databind | thrpt | 20 | 3436.054 | ±5.448 | ops/s |
| flexjson/databind | thrpt | 20 | 121.583 | ±0.541 | ops/s |
| genson/databind | thrpt | 20 | 978.258 | ±1.481 | ops/s |
| gson/databind | thrpt | 20 | 921.389 | ±14.413 | ops/s |
| jackson/databind | thrpt | 20 | 1119.550 | ±9.873 | ops/s |
| jackson_afterburner/databind | thrpt | 20 | 1358.106 | ±6.703 | ops/s |
| jackson_blackbird/databind | thrpt | 20 | 1113.571 | ±15.297 | ops/s |
| jodd/databind | thrpt | 20 | 610.253 | ±3.873 | ops/s |
| johnzon/databind | thrpt | 20 | 333.456 | ±2.840 | ops/s |
| jsonsmart/databind | thrpt | 20 | 1302.708 | ±2.806 | ops/s |
| logansquare/databind | thrpt | 20 | 1274.276 | ±6.331 | ops/s |
| moshi/databind | thrpt | 20 | 803.468 | ±3.481 | ops/s |
| qson/databind | thrpt | 20 | 1085.382 | ±16.399 | ops/s |
| quickbuf_json/databind | thrpt | 20 | 916.267 | ±13.608 | ops/s |
| wast/databind | thrpt | 20 | 3364.929 | ±3.755 | ops/s |
| yasson/databind | thrpt | 20 | 485.509 | ±4.869 | ops/s |
| antons/stream | thrpt | 20 | 365.565 | ±0.747 | ops/s |
| genson/stream | thrpt | 20 | 1097.534 | ±3.620 | ops/s |
| gson/stream | thrpt | 20 | 719.353 | ±1.465 | ops/s |
| jackson/stream | thrpt | 20 | 1339.634 | ±21.985 | ops/s |
| jakartajson/stream | thrpt | 20 | 396.929 | ±10.637 | ops/s |
| jsonio/stream | thrpt | 20 | 414.895 | ±1.274 | ops/s |
| jsonsimple/stream | thrpt | 20 | 208.780 | ±0.254 | ops/s |
| minimaljson/stream | thrpt | 20 | 642.607 | ±22.140 | ops/s |
| mjson/stream | thrpt | 20 | 129.878 | ±0.475 | ops/s |
| moshi/stream | thrpt | 20 | 656.402 | ±67.130 | ops/s |
| nanojson/stream | thrpt | 20 | 742.887 | ±4.793 | ops/s |
| orgjson/stream | thrpt | 20 | 131.774 | ±3.285 | ops/s |
| purejson/stream | thrpt | 20 | 312.673 | ±7.220 | ops/s |
| tapestry/stream | thrpt | 20 | 876.710 | ±2.691 | ops/s |
| underscore_java/stream | thrpt | 20 | 765.703 | ±27.767 | ops/s |
