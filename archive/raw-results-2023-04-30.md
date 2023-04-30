2023-04-30

# *clients* data type

## JMH: Serialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.avajejsonb | thrpt | 20 | 706446.232 | ±7190.414 | ops/s | 
| Serialization.avajejsonb_jackson | thrpt | 20 | 553605.431 | ±2648.230 | ops/s | 
| Serialization.dsljson | thrpt | 20 | 1154401.211 | ±5638.723 | ops/s | 
| Serialization.dsljson_reflection | thrpt | 20 | 846557.838 | ±13070.773 | ops/s | 
| Serialization.fastjson | thrpt | 20 | 807141.151 | ±18890.804 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 514.157 | ±37.346 | ops/s | 
| Serialization.genson | thrpt | 20 | 376191.298 | ±21216.256 | ops/s | 
| Serialization.gson | thrpt | 20 | 380532.987 | ±29028.533 | ops/s | 
| Serialization.jackson | thrpt | 20 | 556406.457 | ±2382.699 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 578094.092 | ±11415.079 | ops/s | 
| Serialization.jackson_blackbird | thrpt | 20 | 531903.372 | ±24494.100 | ops/s | 
| Serialization.jodd | thrpt | 20 | 113676.378 | ±2282.076 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 541111.047 | ±3339.943 | ops/s | 
| Serialization.moshi | thrpt | 20 | 317991.348 | ±1442.014 | ops/s | 

## JMH: Serialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.avajejsonb | thrpt | 20 | 53329.840 | ±665.159 | ops/s | 
| Serialization.avajejsonb_jackson | thrpt | 20 | 38880.159 | ±261.191 | ops/s | 
| Serialization.dsljson | thrpt | 20 | 152183.994 | ±1266.208 | ops/s | 
| Serialization.dsljson_reflection | thrpt | 20 | 104527.233 | ±520.115 | ops/s | 
| Serialization.fastjson | thrpt | 20 | 76605.632 | ±1527.763 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 155.450 | ±10.061 | ops/s | 
| Serialization.genson | thrpt | 20 | 33733.709 | ±346.000 | ops/s | 
| Serialization.gson | thrpt | 20 | 33702.103 | ±211.080 | ops/s | 
| Serialization.jackson | thrpt | 20 | 32267.890 | ±355.974 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 32505.154 | ±539.754 | ops/s | 
| Serialization.jackson_blackbird | thrpt | 20 | 32199.803 | ±534.228 | ops/s | 
| Serialization.jodd | thrpt | 20 | 10661.351 | ±250.457 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 42077.633 | ±372.638 | ops/s | 
| Serialization.moshi | thrpt | 20 | 23705.346 | ±584.319 | ops/s | 

## JMH: Serialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.avajejsonb | thrpt | 20 | 4830.786 | ±250.717 | ops/s | 
| Serialization.avajejsonb_jackson | thrpt | 20 | 4043.922 | ±4.200 | ops/s | 
| Serialization.dsljson | thrpt | 20 | 14297.848 | ±459.268 | ops/s | 
| Serialization.dsljson_reflection | thrpt | 20 | 9958.023 | ±18.964 | ops/s | 
| Serialization.fastjson | thrpt | 20 | 6844.921 | ±65.298 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 47.353 | ±3.446 | ops/s | 
| Serialization.genson | thrpt | 20 | 3338.248 | ±81.273 | ops/s | 
| Serialization.gson | thrpt | 20 | 3541.730 | ±50.084 | ops/s | 
| Serialization.jackson | thrpt | 20 | 3183.554 | ±7.130 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 3099.295 | ±21.967 | ops/s | 
| Serialization.jackson_blackbird | thrpt | 20 | 3172.810 | ±16.235 | ops/s | 
| Serialization.jodd | thrpt | 20 | 1091.346 | ±7.655 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 3979.200 | ±38.707 | ops/s | 
| Serialization.moshi | thrpt | 20 | 2405.032 | ±9.249 | ops/s | 

## JMH: Serialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.avajejsonb | thrpt | 20 | 523.273 | ±11.436 | ops/s | 
| Serialization.avajejsonb_jackson | thrpt | 20 | 387.874 | ±5.776 | ops/s | 
| Serialization.dsljson | thrpt | 20 | 1460.675 | ±8.784 | ops/s | 
| Serialization.dsljson_reflection | thrpt | 20 | 954.781 | ±8.038 | ops/s | 
| Serialization.fastjson | thrpt | 20 | 575.620 | ±3.146 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 13.350 | ±1.057 | ops/s | 
| Serialization.genson | thrpt | 20 | 326.492 | ±1.719 | ops/s | 
| Serialization.gson | thrpt | 20 | 338.238 | ±2.255 | ops/s | 
| Serialization.jackson | thrpt | 20 | 297.135 | ±5.369 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 301.092 | ±2.416 | ops/s | 
| Serialization.jackson_blackbird | thrpt | 20 | 298.407 | ±2.385 | ops/s | 
| Serialization.jodd | thrpt | 20 | 112.518 | ±0.863 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 388.373 | ±21.686 | ops/s | 
| Serialization.moshi | thrpt | 20 | 233.937 | ±1.664 | ops/s | 

## JMH: Deserialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.avajejsonb | thrpt | 20 | 365099.939 | ±8917.353 | ops/s | 
| Deserialization.avajejsonb_jackson | thrpt | 20 | 277268.735 | ±511.980 | ops/s | 
| Deserialization.dsljson | thrpt | 20 | 691890.720 | ±8798.891 | ops/s | 
| Deserialization.dsljson_reflection | thrpt | 20 | 599095.618 | ±9246.987 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 66703.568 | ±2049.676 | ops/s | 
| Deserialization.genson | thrpt | 20 | 215621.847 | ±10159.091 | ops/s | 
| Deserialization.gson | thrpt | 20 | 213234.692 | ±10784.037 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 249597.677 | ±9157.863 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 247257.287 | ±5467.864 | ops/s | 
| Deserialization.jackson_blackbird | thrpt | 20 | 260324.349 | ±14650.776 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 229560.237 | ±6428.531 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 204938.159 | ±6537.065 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 218532.845 | ±2868.759 | ops/s | 

## JMH: Deserialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.avajejsonb | thrpt | 20 | 15580.953 | ±391.777 | ops/s | 
| Deserialization.avajejsonb_jackson | thrpt | 20 | 14733.563 | ±80.664 | ops/s | 
| Deserialization.dsljson | thrpt | 20 | 78484.417 | ±139.737 | ops/s | 
| Deserialization.dsljson_reflection | thrpt | 20 | 62667.946 | ±185.884 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 5373.775 | ±27.461 | ops/s | 
| Deserialization.genson | thrpt | 20 | 11613.766 | ±475.116 | ops/s | 
| Deserialization.gson | thrpt | 20 | 11380.494 | ±86.468 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 11906.869 | ±380.154 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 11546.109 | ±314.996 | ops/s | 
| Deserialization.jackson_blackbird | thrpt | 20 | 12841.363 | ±52.891 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 12908.061 | ±22.473 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 12547.234 | ±125.663 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 10043.361 | ±102.921 | ops/s | 

## JMH: Deserialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.avajejsonb | thrpt | 20 | 1370.017 | ±39.653 | ops/s | 
| Deserialization.avajejsonb_jackson | thrpt | 20 | 1409.065 | ±50.644 | ops/s | 
| Deserialization.dsljson | thrpt | 20 | 7741.294 | ±22.007 | ops/s | 
| Deserialization.dsljson_reflection | thrpt | 20 | 5838.054 | ±135.444 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 525.892 | ±11.130 | ops/s | 
| Deserialization.genson | thrpt | 20 | 1217.826 | ±9.794 | ops/s | 
| Deserialization.gson | thrpt | 20 | 1050.310 | ±31.544 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 1149.989 | ±18.158 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 1234.463 | ±7.020 | ops/s | 
| Deserialization.jackson_blackbird | thrpt | 20 | 1175.255 | ±49.366 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 1238.650 | ±56.307 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 1089.516 | ±63.443 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 983.528 | ±8.228 | ops/s | 

## JMH: Deserialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.avajejsonb | thrpt | 20 | 145.749 | ±6.002 | ops/s | 
| Deserialization.avajejsonb_jackson | thrpt | 20 | 145.937 | ±0.845 | ops/s | 
| Deserialization.dsljson | thrpt | 20 | 746.792 | ±8.413 | ops/s | 
| Deserialization.dsljson_reflection | thrpt | 20 | 594.175 | ±7.075 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 50.594 | ±0.966 | ops/s | 
| Deserialization.genson | thrpt | 20 | 119.350 | ±0.800 | ops/s | 
| Deserialization.gson | thrpt | 20 | 114.156 | ±1.237 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 115.458 | ±1.409 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 119.684 | ±2.108 | ops/s | 
| Deserialization.jackson_blackbird | thrpt | 20 | 112.209 | ±2.913 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 124.759 | ±2.319 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 117.872 | ±6.684 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 105.399 | ±0.788 | ops/s | 

# *users* data type

## JMH: Serialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 1024513.566 | ±13656.222 | ops/s | 
| avajejsonb_jackson/databind | thrpt | 20 | 740894.328 | ±7794.426 | ops/s | 
| dsljson/databind | thrpt | 20 | 1171066.628 | ±2479.278 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 833841.873 | ±17609.508 | ops/s | 
| fastjson/databind | thrpt | 20 | 980925.829 | ±20468.421 | ops/s | 
| flexjson/databind | thrpt | 20 | 385.136 | ±23.494 | ops/s | 
| genson/databind | thrpt | 20 | 462012.351 | ±13110.242 | ops/s | 
| gson/databind | thrpt | 20 | 492284.165 | ±17872.477 | ops/s | 
| jackson/databind | thrpt | 20 | 689486.439 | ±2805.678 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 734049.755 | ±3591.921 | ops/s | 
| jackson_blackbird/databind | thrpt | 20 | 693784.824 | ±4306.722 | ops/s | 
| jodd/databind | thrpt | 20 | 124714.897 | ±910.976 | ops/s | 
| johnzon/databind | thrpt | 20 | 276682.394 | ±1654.289 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 440788.475 | ±13808.392 | ops/s | 
| logansquare/databind | thrpt | 20 | 666959.444 | ±3789.438 | ops/s | 
| moshi/databind | thrpt | 20 | 365497.156 | ±6015.052 | ops/s | 
| qson/databind | thrpt | 20 | 560851.547 | ±1627.411 | ops/s | 
| yasson/databind | thrpt | 20 | 302514.150 | ±7127.576 | ops/s | 
| genson/stream | thrpt | 20 | 418616.788 | ±20204.404 | ops/s | 
| gson/stream | thrpt | 20 | 201464.371 | ±12975.262 | ops/s | 
| jackson/stream | thrpt | 20 | 646388.023 | ±1339.315 | ops/s | 
| jakartajson/stream | thrpt | 20 | 493944.867 | ±6471.368 | ops/s | 
| jsonio/stream | thrpt | 20 | 100496.093 | ±1037.957 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 88669.143 | ±1666.603 | ops/s | 
| minimaljson/stream | thrpt | 20 | 449275.652 | ±11117.903 | ops/s | 
| mjson/stream | thrpt | 20 | 161925.087 | ±3359.984 | ops/s | 
| moshi/stream | thrpt | 20 | 391018.856 | ±9565.249 | ops/s | 
| nanojson/stream | thrpt | 20 | 583473.082 | ±3737.708 | ops/s | 
| orgjson/stream | thrpt | 20 | 147376.290 | ±2403.868 | ops/s | 
| purejson/stream | thrpt | 20 | 138026.010 | ±9816.611 | ops/s | 

## JMH: Serialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 103449.299 | ±203.160 | ops/s | 
| avajejsonb_jackson/databind | thrpt | 20 | 69242.174 | ±1142.847 | ops/s | 
| dsljson/databind | thrpt | 20 | 123410.484 | ±1985.097 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 90199.964 | ±875.903 | ops/s | 
| fastjson/databind | thrpt | 20 | 81620.630 | ±2901.260 | ops/s | 
| flexjson/databind | thrpt | 20 | 135.925 | ±9.517 | ops/s | 
| genson/databind | thrpt | 20 | 52358.746 | ±2029.215 | ops/s | 
| gson/databind | thrpt | 20 | 55919.384 | ±1720.500 | ops/s | 
| jackson/databind | thrpt | 20 | 70036.813 | ±2079.697 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 75746.109 | ±458.568 | ops/s | 
| jackson_blackbird/databind | thrpt | 20 | 77063.147 | ±5933.436 | ops/s | 
| jodd/databind | thrpt | 20 | 11634.622 | ±82.817 | ops/s | 
| johnzon/databind | thrpt | 20 | 29490.365 | ±58.390 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 34030.782 | ±351.028 | ops/s | 
| logansquare/databind | thrpt | 20 | 71904.498 | ±1199.783 | ops/s | 
| moshi/databind | thrpt | 20 | 33066.553 | ±137.221 | ops/s | 
| qson/databind | thrpt | 20 | 60987.218 | ±649.436 | ops/s | 
| yasson/databind | thrpt | 20 | 31860.126 | ±111.641 | ops/s | 
| genson/stream | thrpt | 20 | 48531.369 | ±1452.504 | ops/s | 
| gson/stream | thrpt | 20 | 15406.104 | ±286.459 | ops/s | 
| jackson/stream | thrpt | 20 | 62501.546 | ±523.963 | ops/s | 
| jakartajson/stream | thrpt | 20 | 54078.199 | ±103.702 | ops/s | 
| jsonio/stream | thrpt | 20 | 10616.920 | ±124.290 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 8436.093 | ±835.909 | ops/s | 
| minimaljson/stream | thrpt | 20 | 37945.654 | ±1614.734 | ops/s | 
| mjson/stream | thrpt | 20 | 12122.859 | ±61.012 | ops/s | 
| moshi/stream | thrpt | 20 | 34459.724 | ±484.621 | ops/s | 
| nanojson/stream | thrpt | 20 | 35689.879 | ±289.430 | ops/s | 
| orgjson/stream | thrpt | 20 | 11295.501 | ±59.018 | ops/s | 
| purejson/stream | thrpt | 20 | 11885.276 | ±64.920 | ops/s | 

## JMH: Serialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 10299.623 | ±415.197 | ops/s | 
| avajejsonb_jackson/databind | thrpt | 20 | 7007.039 | ±105.980 | ops/s | 
| dsljson/databind | thrpt | 20 | 12543.601 | ±36.590 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 9223.408 | ±385.899 | ops/s | 
| fastjson/databind | thrpt | 20 | 8030.564 | ±22.570 | ops/s | 
| flexjson/databind | thrpt | 20 | 42.335 | ±3.371 | ops/s | 
| genson/databind | thrpt | 20 | 5160.582 | ±204.252 | ops/s | 
| gson/databind | thrpt | 20 | 5618.968 | ±27.660 | ops/s | 
| jackson/databind | thrpt | 20 | 7026.084 | ±117.506 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 6848.765 | ±73.725 | ops/s | 
| jackson_blackbird/databind | thrpt | 20 | 6918.754 | ±73.834 | ops/s | 
| jodd/databind | thrpt | 20 | 1076.536 | ±11.195 | ops/s | 
| johnzon/databind | thrpt | 20 | 2720.565 | ±23.717 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 3351.138 | ±19.995 | ops/s | 
| logansquare/databind | thrpt | 20 | 7198.245 | ±299.777 | ops/s | 
| moshi/databind | thrpt | 20 | 3264.220 | ±53.096 | ops/s | 
| qson/databind | thrpt | 20 | 5836.788 | ±129.655 | ops/s | 
| yasson/databind | thrpt | 20 | 3460.567 | ±33.220 | ops/s | 
| genson/stream | thrpt | 20 | 5390.841 | ±151.971 | ops/s | 
| gson/stream | thrpt | 20 | 1576.298 | ±7.989 | ops/s | 
| jackson/stream | thrpt | 20 | 7136.182 | ±83.871 | ops/s | 
| jakartajson/stream | thrpt | 20 | 5213.232 | ±18.978 | ops/s | 
| jsonio/stream | thrpt | 20 | 1079.280 | ±3.054 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 755.268 | ±11.329 | ops/s | 
| minimaljson/stream | thrpt | 20 | 3240.052 | ±3.252 | ops/s | 
| mjson/stream | thrpt | 20 | 1191.927 | ±5.475 | ops/s | 
| moshi/stream | thrpt | 20 | 3154.565 | ±213.131 | ops/s | 
| nanojson/stream | thrpt | 20 | 3410.213 | ±145.047 | ops/s | 
| orgjson/stream | thrpt | 20 | 1117.073 | ±26.288 | ops/s | 
| purejson/stream | thrpt | 20 | 971.376 | ±7.086 | ops/s | 

## JMH: Serialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 941.615 | ±68.404 | ops/s | 
| avajejsonb_jackson/databind | thrpt | 20 | 677.169 | ±4.332 | ops/s | 
| dsljson/databind | thrpt | 20 | 1180.883 | ±4.825 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 905.456 | ±35.766 | ops/s | 
| fastjson/databind | thrpt | 20 | 648.784 | ±6.714 | ops/s | 
| flexjson/databind | thrpt | 20 | 12.640 | ±1.108 | ops/s | 
| genson/databind | thrpt | 20 | 577.108 | ±5.994 | ops/s | 
| gson/databind | thrpt | 20 | 557.165 | ±15.387 | ops/s | 
| jackson/databind | thrpt | 20 | 653.901 | ±2.177 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 734.758 | ±9.280 | ops/s | 
| jackson_blackbird/databind | thrpt | 20 | 687.959 | ±52.456 | ops/s | 
| jodd/databind | thrpt | 20 | 115.617 | ±5.492 | ops/s | 
| johnzon/databind | thrpt | 20 | 257.885 | ±7.668 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 323.592 | ±10.070 | ops/s | 
| logansquare/databind | thrpt | 20 | 665.986 | ±1.665 | ops/s | 
| moshi/databind | thrpt | 20 | 307.712 | ±24.356 | ops/s | 
| qson/databind | thrpt | 20 | 583.314 | ±15.706 | ops/s | 
| yasson/databind | thrpt | 20 | 310.658 | ±4.063 | ops/s | 
| genson/stream | thrpt | 20 | 480.374 | ±11.426 | ops/s | 
| gson/stream | thrpt | 20 | 153.988 | ±8.139 | ops/s | 
| jackson/stream | thrpt | 20 | 627.107 | ±1.836 | ops/s | 
| jakartajson/stream | thrpt | 20 | 523.239 | ±4.418 | ops/s | 
| jsonio/stream | thrpt | 20 | 102.196 | ±0.811 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 69.618 | ±0.862 | ops/s | 
| minimaljson/stream | thrpt | 20 | 308.270 | ±10.985 | ops/s | 
| mjson/stream | thrpt | 20 | 108.517 | ±0.972 | ops/s | 
| moshi/stream | thrpt | 20 | 351.607 | ±6.571 | ops/s | 
| nanojson/stream | thrpt | 20 | 317.060 | ±7.716 | ops/s | 
| orgjson/stream | thrpt | 20 | 119.342 | ±1.305 | ops/s | 
| purejson/stream | thrpt | 20 | 21.920 | ±0.897 | ops/s | 

## JMH: Deserialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 696066.103 | ±11214.416 | ops/s | 
| avajejsonb_jackson/databind | thrpt | 20 | 477355.180 | ±4856.070 | ops/s | 
| dsljson/databind | thrpt | 20 | 767408.940 | ±34237.000 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 599002.607 | ±12935.468 | ops/s | 
| fastjson/databind | thrpt | 20 | 817570.012 | ±5372.388 | ops/s | 
| flexjson/databind | thrpt | 20 | 77385.096 | ±369.865 | ops/s | 
| genson/databind | thrpt | 20 | 332735.769 | ±3688.714 | ops/s | 
| gson/databind | thrpt | 20 | 302631.688 | ±656.900 | ops/s | 
| jackson/databind | thrpt | 20 | 435014.762 | ±5891.866 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 516988.255 | ±3768.067 | ops/s | 
| jackson_blackbird/databind | thrpt | 20 | 497377.225 | ±3047.300 | ops/s | 
| jodd/databind | thrpt | 20 | 389199.803 | ±11629.069 | ops/s | 
| johnzon/databind | thrpt | 20 | 132868.153 | ±1933.961 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 444934.217 | ±2147.070 | ops/s | 
| logansquare/databind | thrpt | 20 | 279649.078 | ±14939.453 | ops/s | 
| moshi/databind | thrpt | 20 | 304107.941 | ±6527.742 | ops/s | 
| qson/databind | thrpt | 20 | 407176.609 | ±1782.718 | ops/s | 
| yasson/databind | thrpt | 20 | 216872.044 | ±1534.816 | ops/s | 
| genson/stream | thrpt | 20 | 407160.616 | ±9376.414 | ops/s | 
| gson/stream | thrpt | 20 | 278984.951 | ±798.453 | ops/s | 
| jackson/stream | thrpt | 20 | 503969.714 | ±962.526 | ops/s | 
| jakartajson/stream | thrpt | 20 | 13675.334 | ±129.013 | ops/s | 
| jsonio/stream | thrpt | 20 | 95303.838 | ±2864.164 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 137475.770 | ±2897.896 | ops/s | 
| minimaljson/stream | thrpt | 20 | 250703.461 | ±15201.633 | ops/s | 
| mjson/stream | thrpt | 20 | 112875.767 | ±3035.743 | ops/s | 
| moshi/stream | thrpt | 20 | 313444.570 | ±850.198 | ops/s | 
| nanojson/stream | thrpt | 20 | 123151.329 | ±288.815 | ops/s | 
| orgjson/stream | thrpt | 20 | 118178.840 | ±2342.030 | ops/s | 
| purejson/stream | thrpt | 20 | 114309.957 | ±1007.592 | ops/s | 

## JMH: Deserialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 69711.295 | ±147.808 | ops/s | 
| avajejsonb_jackson/databind | thrpt | 20 | 49213.398 | ±168.578 | ops/s | 
| dsljson/databind | thrpt | 20 | 82243.305 | ±173.498 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 58761.489 | ±1832.571 | ops/s | 
| fastjson/databind | thrpt | 20 | 93246.190 | ±84.003 | ops/s | 
| flexjson/databind | thrpt | 20 | 6894.984 | ±361.855 | ops/s | 
| genson/databind | thrpt | 20 | 33788.693 | ±448.513 | ops/s | 
| gson/databind | thrpt | 20 | 32914.780 | ±382.089 | ops/s | 
| jackson/databind | thrpt | 20 | 49571.435 | ±156.571 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 55226.806 | ±488.586 | ops/s | 
| jackson_blackbird/databind | thrpt | 20 | 53746.848 | ±618.895 | ops/s | 
| jodd/databind | thrpt | 20 | 42710.948 | ±257.639 | ops/s | 
| johnzon/databind | thrpt | 20 | 12661.817 | ±1058.984 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 48094.691 | ±186.503 | ops/s | 
| logansquare/databind | thrpt | 20 | 46569.298 | ±114.770 | ops/s | 
| moshi/databind | thrpt | 20 | 31252.327 | ±92.250 | ops/s | 
| qson/databind | thrpt | 20 | 45703.890 | ±307.592 | ops/s | 
| yasson/databind | thrpt | 20 | 23383.975 | ±190.737 | ops/s | 
| genson/stream | thrpt | 20 | 42458.869 | ±254.922 | ops/s | 
| gson/stream | thrpt | 20 | 34538.550 | ±1420.768 | ops/s | 
| jackson/stream | thrpt | 20 | 55176.584 | ±421.684 | ops/s | 
| jakartajson/stream | thrpt | 20 | 11341.234 | ±126.677 | ops/s | 
| jsonio/stream | thrpt | 20 | 10205.418 | ±132.446 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 13964.014 | ±172.250 | ops/s | 
| minimaljson/stream | thrpt | 20 | 22844.497 | ±4549.574 | ops/s | 
| mjson/stream | thrpt | 20 | 11749.983 | ±55.976 | ops/s | 
| moshi/stream | thrpt | 20 | 26370.841 | ±667.279 | ops/s | 
| nanojson/stream | thrpt | 20 | 23213.574 | ±219.588 | ops/s | 
| orgjson/stream | thrpt | 20 | 12368.207 | ±222.129 | ops/s | 
| purejson/stream | thrpt | 20 | 10559.385 | ±90.171 | ops/s | 

## JMH: Deserialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 7069.435 | ±105.766 | ops/s | 
| avajejsonb_jackson/databind | thrpt | 20 | 4967.624 | ±11.764 | ops/s | 
| dsljson/databind | thrpt | 20 | 8295.018 | ±15.181 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 6406.446 | ±36.235 | ops/s | 
| fastjson/databind | thrpt | 20 | 9184.234 | ±63.250 | ops/s | 
| flexjson/databind | thrpt | 20 | 744.758 | ±5.288 | ops/s | 
| genson/databind | thrpt | 20 | 3480.590 | ±57.771 | ops/s | 
| gson/databind | thrpt | 20 | 3178.724 | ±10.535 | ops/s | 
| jackson/databind | thrpt | 20 | 4831.754 | ±16.037 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 5392.711 | ±205.760 | ops/s | 
| jackson_blackbird/databind | thrpt | 20 | 5402.069 | ±18.382 | ops/s | 
| jodd/databind | thrpt | 20 | 4394.478 | ±26.763 | ops/s | 
| johnzon/databind | thrpt | 20 | 1176.975 | ±10.192 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 4983.860 | ±8.409 | ops/s | 
| logansquare/databind | thrpt | 20 | 4394.926 | ±105.464 | ops/s | 
| moshi/databind | thrpt | 20 | 2881.769 | ±200.053 | ops/s | 
| qson/databind | thrpt | 20 | 4618.852 | ±67.267 | ops/s | 
| yasson/databind | thrpt | 20 | 2236.355 | ±55.912 | ops/s | 
| genson/stream | thrpt | 20 | 4545.622 | ±13.851 | ops/s | 
| gson/stream | thrpt | 20 | 3765.446 | ±15.013 | ops/s | 
| jackson/stream | thrpt | 20 | 5675.032 | ±31.251 | ops/s | 
| jakartajson/stream | thrpt | 20 | 2412.834 | ±10.112 | ops/s | 
| jsonio/stream | thrpt | 20 | 1029.288 | ±11.239 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 1394.262 | ±45.514 | ops/s | 
| minimaljson/stream | thrpt | 20 | 2897.410 | ±118.767 | ops/s | 
| mjson/stream | thrpt | 20 | 1142.643 | ±35.838 | ops/s | 
| moshi/stream | thrpt | 20 | 2905.220 | ±51.129 | ops/s | 
| nanojson/stream | thrpt | 20 | 2740.863 | ±14.966 | ops/s | 
| orgjson/stream | thrpt | 20 | 1246.887 | ±8.509 | ops/s | 
| purejson/stream | thrpt | 20 | 985.715 | ±5.002 | ops/s | 

## JMH: Deserialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 679.381 | ±15.367 | ops/s | 
| avajejsonb_jackson/databind | thrpt | 20 | 490.105 | ±2.112 | ops/s | 
| dsljson/databind | thrpt | 20 | 809.439 | ±4.653 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 637.882 | ±4.828 | ops/s | 
| fastjson/databind | thrpt | 20 | 924.836 | ±3.053 | ops/s | 
| flexjson/databind | thrpt | 20 | 68.102 | ±3.120 | ops/s | 
| genson/databind | thrpt | 20 | 339.709 | ±4.445 | ops/s | 
| gson/databind | thrpt | 20 | 328.218 | ±5.791 | ops/s | 
| jackson/databind | thrpt | 20 | 484.916 | ±7.486 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 543.164 | ±3.235 | ops/s | 
| jackson_blackbird/databind | thrpt | 20 | 519.684 | ±2.793 | ops/s | 
| jodd/databind | thrpt | 20 | 432.168 | ±2.849 | ops/s | 
| johnzon/databind | thrpt | 20 | 103.274 | ±2.319 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 472.299 | ±5.193 | ops/s | 
| logansquare/databind | thrpt | 20 | 422.692 | ±17.985 | ops/s | 
| moshi/databind | thrpt | 20 | 268.127 | ±3.602 | ops/s | 
| qson/databind | thrpt | 20 | 455.906 | ±1.462 | ops/s | 
| yasson/databind | thrpt | 20 | 205.233 | ±2.778 | ops/s | 
| genson/stream | thrpt | 20 | 410.543 | ±3.814 | ops/s | 
| gson/stream | thrpt | 20 | 299.915 | ±25.835 | ops/s | 
| jackson/stream | thrpt | 20 | 557.155 | ±4.750 | ops/s | 
| jakartajson/stream | thrpt | 20 | 232.951 | ±5.381 | ops/s | 
| jsonio/stream | thrpt | 20 | 101.835 | ±1.006 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 138.078 | ±2.295 | ops/s | 
| minimaljson/stream | thrpt | 20 | 236.666 | ±20.769 | ops/s | 
| mjson/stream | thrpt | 20 | 114.969 | ±0.678 | ops/s | 
| moshi/stream | thrpt | 20 | 249.593 | ±8.614 | ops/s | 
| nanojson/stream | thrpt | 20 | 238.394 | ±1.561 | ops/s | 
| orgjson/stream | thrpt | 20 | 119.397 | ±1.465 | ops/s | 
| purejson/stream | thrpt | 20 | 86.861 | ±1.255 | ops/s | 

