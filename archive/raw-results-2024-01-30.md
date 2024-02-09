2024-01-31

# *clients* data type

## JMH: Serialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.avajejsonb | thrpt | 20 | 463604.434 | ±997.468 | ops/s | 
| Serialization.avajejsonb_jackson | thrpt | 20 | 374853.655 | ±894.886 | ops/s | 
| Serialization.dsljson | thrpt | 20 | 888761.552 | ±4964.402 | ops/s | 
| Serialization.dsljson_reflection | thrpt | 20 | 603542.593 | ±5842.257 | ops/s | 
| Serialization.fastjson | thrpt | 20 | 1298981.280 | ±3495.897 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 396.476 | ±38.001 | ops/s | 
| Serialization.genson | thrpt | 20 | 263486.780 | ±8362.945 | ops/s | 
| Serialization.gson | thrpt | 20 | 260497.603 | ±2103.519 | ops/s | 
| Serialization.jackson | thrpt | 20 | 467070.701 | ±2329.767 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 474871.238 | ±3405.511 | ops/s | 
| Serialization.jackson_blackbird | thrpt | 20 | 464460.593 | ±2642.642 | ops/s | 
| Serialization.jodd | thrpt | 20 | 91809.593 | ±788.491 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 421101.452 | ±7875.922 | ops/s | 
| Serialization.moshi | thrpt | 20 | 201066.973 | ±1742.511 | ops/s | 

## JMH: Serialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.avajejsonb | thrpt | 20 | 54793.944 | ±147.733 | ops/s | 
| Serialization.avajejsonb_jackson | thrpt | 20 | 41382.129 | ±53.330 | ops/s | 
| Serialization.dsljson | thrpt | 20 | 146404.266 | ±7220.919 | ops/s | 
| Serialization.dsljson_reflection | thrpt | 20 | 102907.598 | ±1150.426 | ops/s | 
| Serialization.fastjson | thrpt | 20 | 181860.985 | ±1047.944 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 164.603 | ±15.965 | ops/s | 
| Serialization.genson | thrpt | 20 | 34320.761 | ±466.887 | ops/s | 
| Serialization.gson | thrpt | 20 | 36164.111 | ±177.567 | ops/s | 
| Serialization.jackson | thrpt | 20 | 34385.223 | ±154.363 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 34707.782 | ±175.672 | ops/s | 
| Serialization.jackson_blackbird | thrpt | 20 | 34584.984 | ±36.820 | ops/s | 
| Serialization.jodd | thrpt | 20 | 10708.808 | ±111.017 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 43959.391 | ±961.860 | ops/s | 
| Serialization.moshi | thrpt | 20 | 24197.159 | ±131.260 | ops/s | 

## JMH: Serialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.avajejsonb | thrpt | 20 | 5199.095 | ±42.258 | ops/s | 
| Serialization.avajejsonb_jackson | thrpt | 20 | 3953.423 | ±5.062 | ops/s | 
| Serialization.dsljson | thrpt | 20 | 14752.680 | ±232.399 | ops/s | 
| Serialization.dsljson_reflection | thrpt | 20 | 9932.520 | ±107.906 | ops/s | 
| Serialization.fastjson | thrpt | 20 | 18228.277 | ±113.650 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 46.223 | ±3.120 | ops/s | 
| Serialization.genson | thrpt | 20 | 3326.803 | ±14.144 | ops/s | 
| Serialization.gson | thrpt | 20 | 3447.661 | ±4.423 | ops/s | 
| Serialization.jackson | thrpt | 20 | 3148.753 | ±35.144 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 3159.158 | ±28.165 | ops/s | 
| Serialization.jackson_blackbird | thrpt | 20 | 3146.703 | ±8.159 | ops/s | 
| Serialization.jodd | thrpt | 20 | 1044.139 | ±14.458 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 3960.801 | ±96.322 | ops/s | 
| Serialization.moshi | thrpt | 20 | 2429.108 | ±23.524 | ops/s | 

## JMH: Serialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.avajejsonb | thrpt | 20 | 524.226 | ±9.565 | ops/s | 
| Serialization.avajejsonb_jackson | thrpt | 20 | 377.812 | ±1.365 | ops/s | 
| Serialization.dsljson | thrpt | 20 | 1437.515 | ±27.803 | ops/s | 
| Serialization.dsljson_reflection | thrpt | 20 | 978.683 | ±4.205 | ops/s | 
| Serialization.fastjson | thrpt | 20 | 1146.678 | ±7.202 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 13.725 | ±1.080 | ops/s | 
| Serialization.genson | thrpt | 20 | 328.525 | ±6.100 | ops/s | 
| Serialization.gson | thrpt | 20 | 346.672 | ±2.698 | ops/s | 
| Serialization.jackson | thrpt | 20 | 299.202 | ±3.594 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 294.184 | ±3.738 | ops/s | 
| Serialization.jackson_blackbird | thrpt | 20 | 296.065 | ±1.297 | ops/s | 
| Serialization.jodd | thrpt | 20 | 106.405 | ±6.116 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 403.960 | ±6.814 | ops/s | 
| Serialization.moshi | thrpt | 20 | 238.120 | ±1.621 | ops/s | 

## JMH: Deserialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.avajejsonb | thrpt | 20 | 320861.658 | ±10017.025 | ops/s | 
| Deserialization.avajejsonb_jackson | thrpt | 20 | 222271.631 | ±6622.871 | ops/s | 
| Deserialization.dsljson | thrpt | 20 | 492384.699 | ±1386.961 | ops/s | 
| Deserialization.dsljson_reflection | thrpt | 20 | 409367.404 | ±1971.733 | ops/s | 
| Deserialization.fastjson | thrpt | 20 | 658533.164 | ±6491.318 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 46499.471 | ±3053.020 | ops/s | 
| Deserialization.genson | thrpt | 20 | 175791.500 | ±4304.924 | ops/s | 
| Deserialization.gson | thrpt | 20 | 167287.857 | ±2782.325 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 241889.670 | ±2374.192 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 257359.448 | ±7609.247 | ops/s | 
| Deserialization.jackson_blackbird | thrpt | 20 | 258841.319 | ±743.314 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 169310.123 | ±1352.223 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 179886.277 | ±1700.630 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 154789.968 | ±3152.216 | ops/s | 

## JMH: Deserialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.avajejsonb | thrpt | 20 | 19296.424 | ±1431.571 | ops/s | 
| Deserialization.avajejsonb_jackson | thrpt | 20 | 18252.143 | ±115.274 | ops/s | 
| Deserialization.dsljson | thrpt | 20 | 76735.625 | ±678.253 | ops/s | 
| Deserialization.dsljson_reflection | thrpt | 20 | 61909.731 | ±432.986 | ops/s | 
| Deserialization.fastjson | thrpt | 20 | 99950.907 | ±116.950 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 5574.245 | ±95.453 | ops/s | 
| Deserialization.genson | thrpt | 20 | 14621.753 | ±113.148 | ops/s | 
| Deserialization.gson | thrpt | 20 | 13730.613 | ±245.352 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 15452.790 | ±794.256 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 16319.245 | ±456.907 | ops/s | 
| Deserialization.jackson_blackbird | thrpt | 20 | 16853.723 | ±304.789 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 14948.482 | ±210.100 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 14768.563 | ±950.955 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 12025.097 | ±902.562 | ops/s | 

## JMH: Deserialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.avajejsonb | thrpt | 20 | 1797.312 | ±96.464 | ops/s | 
| Deserialization.avajejsonb_jackson | thrpt | 20 | 1709.707 | ±10.672 | ops/s | 
| Deserialization.dsljson | thrpt | 20 | 7597.578 | ±21.364 | ops/s | 
| Deserialization.dsljson_reflection | thrpt | 20 | 6176.696 | ±58.973 | ops/s | 
| Deserialization.fastjson | thrpt | 20 | 9779.441 | ±45.652 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 555.509 | ±11.806 | ops/s | 
| Deserialization.genson | thrpt | 20 | 1387.666 | ±7.389 | ops/s | 
| Deserialization.gson | thrpt | 20 | 1232.407 | ±57.767 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 1491.092 | ±50.507 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 1507.892 | ±100.767 | ops/s | 
| Deserialization.jackson_blackbird | thrpt | 20 | 1555.552 | ±37.488 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 1412.269 | ±64.188 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 1433.403 | ±70.827 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 1199.900 | ±26.586 | ops/s | 

## JMH: Deserialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.avajejsonb | thrpt | 20 | 176.675 | ±15.102 | ops/s | 
| Deserialization.avajejsonb_jackson | thrpt | 20 | 165.645 | ±4.338 | ops/s | 
| Deserialization.dsljson | thrpt | 20 | 757.182 | ±1.965 | ops/s | 
| Deserialization.dsljson_reflection | thrpt | 20 | 597.736 | ±6.909 | ops/s | 
| Deserialization.fastjson | thrpt | 20 | 940.689 | ±1.569 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 53.773 | ±0.468 | ops/s | 
| Deserialization.genson | thrpt | 20 | 131.566 | ±7.384 | ops/s | 
| Deserialization.gson | thrpt | 20 | 122.262 | ±5.928 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 145.986 | ±2.565 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 153.093 | ±2.209 | ops/s | 
| Deserialization.jackson_blackbird | thrpt | 20 | 146.169 | ±9.888 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 141.821 | ±2.090 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 141.965 | ±4.968 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 119.287 | ±1.705 | ops/s | 

# *users* data type

## JMH: Serialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 984830.986 | ±9452.464 | ops/s | 
| avajejsonb_jackson/databind | thrpt | 20 | 728575.503 | ±1379.159 | ops/s | 
| dsljson/databind | thrpt | 20 | 1109612.051 | ±17248.711 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 801809.514 | ±6651.390 | ops/s | 
| fastjson/databind | thrpt | 20 | 1794523.071 | ±16029.354 | ops/s | 
| flexjson/databind | thrpt | 20 | 432.802 | ±35.927 | ops/s | 
| genson/databind | thrpt | 20 | 478876.185 | ±2378.437 | ops/s | 
| gson/databind | thrpt | 20 | 494619.357 | ±5098.901 | ops/s | 
| jackson/databind | thrpt | 20 | 668196.151 | ±1980.009 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 707082.889 | ±2444.427 | ops/s | 
| jackson_blackbird/databind | thrpt | 20 | 677454.163 | ±4473.922 | ops/s | 
| jodd/databind | thrpt | 20 | 123114.713 | ±625.460 | ops/s | 
| johnzon/databind | thrpt | 20 | 291441.361 | ±1813.638 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 425870.799 | ±6213.765 | ops/s | 
| logansquare/databind | thrpt | 20 | 656537.782 | ±1939.012 | ops/s | 
| moshi/databind | thrpt | 20 | 350723.399 | ±3464.291 | ops/s | 
| qson/databind | thrpt | 20 | 532057.200 | ±19286.337 | ops/s | 
| yasson/databind | thrpt | 20 | 285394.666 | ±6216.598 | ops/s | 
| antons/stream | thrpt | 20 | 143302.271 | ±7955.536 | ops/s | 
| genson/stream | thrpt | 20 | 403997.835 | ±20066.254 | ops/s | 
| gson/stream | thrpt | 20 | 169556.734 | ±1604.987 | ops/s | 
| jackson/stream | thrpt | 20 | 624968.930 | ±4665.631 | ops/s | 
| jakartajson/stream | thrpt | 20 | 478018.178 | ±1362.757 | ops/s | 
| jsonio/stream | thrpt | 20 | 100936.373 | ±1253.181 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 94896.546 | ±403.612 | ops/s | 
| minimaljson/stream | thrpt | 20 | 424138.452 | ±2765.959 | ops/s | 
| mjson/stream | thrpt | 20 | 174454.573 | ±273.773 | ops/s | 
| moshi/stream | thrpt | 20 | 371798.136 | ±1528.628 | ops/s | 
| nanojson/stream | thrpt | 20 | 568469.041 | ±4175.790 | ops/s | 
| orgjson/stream | thrpt | 20 | 110472.173 | ±1327.628 | ops/s | 

## JMH: Serialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 105017.533 | ±455.468 | ops/s | 
| avajejsonb_jackson/databind | thrpt | 20 | 69420.955 | ±3428.442 | ops/s | 
| dsljson/databind | thrpt | 20 | 122285.579 | ±3167.062 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 88863.920 | ±1454.377 | ops/s | 
| fastjson/databind | thrpt | 20 | 183279.609 | ±658.635 | ops/s | 
| flexjson/databind | thrpt | 20 | 135.539 | ±9.071 | ops/s | 
| genson/databind | thrpt | 20 | 47839.367 | ±1355.898 | ops/s | 
| gson/databind | thrpt | 20 | 56214.565 | ±1647.435 | ops/s | 
| jackson/databind | thrpt | 20 | 70679.302 | ±298.112 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 75110.583 | ±2776.042 | ops/s | 
| jackson_blackbird/databind | thrpt | 20 | 76864.084 | ±325.699 | ops/s | 
| jodd/databind | thrpt | 20 | 10994.494 | ±216.086 | ops/s | 
| johnzon/databind | thrpt | 20 | 30052.381 | ±150.700 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 34362.149 | ±535.991 | ops/s | 
| logansquare/databind | thrpt | 20 | 69011.080 | ±151.584 | ops/s | 
| moshi/databind | thrpt | 20 | 31979.763 | ±450.888 | ops/s | 
| qson/databind | thrpt | 20 | 60839.991 | ±872.600 | ops/s | 
| yasson/databind | thrpt | 20 | 30260.073 | ±85.954 | ops/s | 
| antons/stream | thrpt | 20 | 13897.558 | ±128.163 | ops/s | 
| genson/stream | thrpt | 20 | 48688.474 | ±881.815 | ops/s | 
| gson/stream | thrpt | 20 | 15327.744 | ±94.583 | ops/s | 
| jackson/stream | thrpt | 20 | 62613.380 | ±436.576 | ops/s | 
| jakartajson/stream | thrpt | 20 | 54742.549 | ±868.378 | ops/s | 
| jsonio/stream | thrpt | 20 | 10659.097 | ±42.411 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 7870.181 | ±77.182 | ops/s | 
| minimaljson/stream | thrpt | 20 | 37379.317 | ±641.193 | ops/s | 
| mjson/stream | thrpt | 20 | 12757.180 | ±31.215 | ops/s | 
| moshi/stream | thrpt | 20 | 34595.817 | ±852.230 | ops/s | 
| nanojson/stream | thrpt | 20 | 35835.100 | ±357.998 | ops/s | 
| orgjson/stream | thrpt | 20 | 9829.249 | ±270.074 | ops/s | 

## JMH: Serialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 10364.024 | ±44.789 | ops/s | 
| avajejsonb_jackson/databind | thrpt | 20 | 6927.507 | ±359.637 | ops/s | 
| dsljson/databind | thrpt | 20 | 12650.202 | ±109.914 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 8696.987 | ±47.947 | ops/s | 
| fastjson/databind | thrpt | 20 | 17839.158 | ±489.690 | ops/s | 
| flexjson/databind | thrpt | 20 | 41.991 | ±2.951 | ops/s | 
| genson/databind | thrpt | 20 | 5086.490 | ±347.304 | ops/s | 
| gson/databind | thrpt | 20 | 5922.465 | ±116.653 | ops/s | 
| jackson/databind | thrpt | 20 | 7266.995 | ±103.754 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 7431.515 | ±183.696 | ops/s | 
| jackson_blackbird/databind | thrpt | 20 | 7072.587 | ±64.698 | ops/s | 
| jodd/databind | thrpt | 20 | 1061.893 | ±2.102 | ops/s | 
| johnzon/databind | thrpt | 20 | 2926.764 | ±23.025 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 3354.412 | ±13.301 | ops/s | 
| logansquare/databind | thrpt | 20 | 7544.129 | ±314.702 | ops/s | 
| moshi/databind | thrpt | 20 | 3192.018 | ±184.798 | ops/s | 
| qson/databind | thrpt | 20 | 6265.721 | ±19.544 | ops/s | 
| yasson/databind | thrpt | 20 | 3022.374 | ±4.825 | ops/s | 
| antons/stream | thrpt | 20 | 1342.861 | ±64.383 | ops/s | 
| genson/stream | thrpt | 20 | 4827.430 | ±245.172 | ops/s | 
| gson/stream | thrpt | 20 | 1600.749 | ±14.674 | ops/s | 
| jackson/stream | thrpt | 20 | 6693.417 | ±47.115 | ops/s | 
| jakartajson/stream | thrpt | 20 | 5333.957 | ±90.979 | ops/s | 
| jsonio/stream | thrpt | 20 | 1091.194 | ±4.362 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 818.171 | ±9.656 | ops/s | 
| minimaljson/stream | thrpt | 20 | 3240.705 | ±58.606 | ops/s | 
| mjson/stream | thrpt | 20 | 1197.314 | ±25.285 | ops/s | 
| moshi/stream | thrpt | 20 | 3445.785 | ±66.279 | ops/s | 
| nanojson/stream | thrpt | 20 | 3545.499 | ±24.715 | ops/s | 
| orgjson/stream | thrpt | 20 | 911.180 | ±32.443 | ops/s | 

## JMH: Serialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 1053.866 | ±23.640 | ops/s | 
| avajejsonb_jackson/databind | thrpt | 20 | 652.287 | ±4.511 | ops/s | 
| dsljson/databind | thrpt | 20 | 1120.533 | ±58.934 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 889.003 | ±37.321 | ops/s | 
| fastjson/databind | thrpt | 20 | 1291.390 | ±13.733 | ops/s | 
| flexjson/databind | thrpt | 20 | 12.342 | ±1.063 | ops/s | 
| genson/databind | thrpt | 20 | 457.398 | ±6.056 | ops/s | 
| gson/databind | thrpt | 20 | 594.492 | ±1.813 | ops/s | 
| jackson/databind | thrpt | 20 | 633.582 | ±40.776 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 671.972 | ±3.552 | ops/s | 
| jackson_blackbird/databind | thrpt | 20 | 644.085 | ±1.638 | ops/s | 
| jodd/databind | thrpt | 20 | 122.802 | ±1.664 | ops/s | 
| johnzon/databind | thrpt | 20 | 282.620 | ±1.616 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 331.142 | ±2.068 | ops/s | 
| logansquare/databind | thrpt | 20 | 662.819 | ±7.257 | ops/s | 
| moshi/databind | thrpt | 20 | 309.771 | ±15.162 | ops/s | 
| qson/databind | thrpt | 20 | 614.965 | ±14.706 | ops/s | 
| yasson/databind | thrpt | 20 | 298.748 | ±1.026 | ops/s | 
| antons/stream | thrpt | 20 | 107.602 | ±1.437 | ops/s | 
| genson/stream | thrpt | 20 | 486.682 | ±10.133 | ops/s | 
| gson/stream | thrpt | 20 | 149.244 | ±2.925 | ops/s | 
| jackson/stream | thrpt | 20 | 639.038 | ±7.648 | ops/s | 
| jakartajson/stream | thrpt | 20 | 517.301 | ±4.710 | ops/s | 
| jsonio/stream | thrpt | 20 | 104.399 | ±0.938 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 72.749 | ±2.380 | ops/s | 
| minimaljson/stream | thrpt | 20 | 303.835 | ±4.845 | ops/s | 
| mjson/stream | thrpt | 20 | 112.289 | ±0.449 | ops/s | 
| moshi/stream | thrpt | 20 | 354.922 | ±0.966 | ops/s | 
| nanojson/stream | thrpt | 20 | 327.223 | ±0.610 | ops/s | 
| orgjson/stream | thrpt | 20 | 101.461 | ±1.138 | ops/s | 

## JMH: Deserialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 659603.717 | ±2837.676 | ops/s | 
| avajejsonb_jackson/databind | thrpt | 20 | 469972.072 | ±3371.376 | ops/s | 
| dsljson/databind | thrpt | 20 | 789474.985 | ±847.579 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 583750.155 | ±24658.117 | ops/s | 
| fastjson/databind | thrpt | 20 | 1156314.212 | ±2872.058 | ops/s | 
| flexjson/databind | thrpt | 20 | 76035.412 | ±476.972 | ops/s | 
| genson/databind | thrpt | 20 | 330308.084 | ±3188.938 | ops/s | 
| gson/databind | thrpt | 20 | 313821.308 | ±830.016 | ops/s | 
| jackson/databind | thrpt | 20 | 427896.686 | ±6480.691 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 510647.011 | ±2197.956 | ops/s | 
| jackson_blackbird/databind | thrpt | 20 | 483067.362 | ±714.403 | ops/s | 
| jodd/databind | thrpt | 20 | 374008.941 | ±1482.013 | ops/s | 
| johnzon/databind | thrpt | 20 | 133597.881 | ±725.365 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 440240.693 | ±5023.185 | ops/s | 
| logansquare/databind | thrpt | 20 | 294845.144 | ±5798.966 | ops/s | 
| moshi/databind | thrpt | 20 | 310302.445 | ±3362.500 | ops/s | 
| qson/databind | thrpt | 20 | 401659.687 | ±2736.760 | ops/s | 
| yasson/databind | thrpt | 20 | 220192.160 | ±1672.236 | ops/s | 
| antons/stream | thrpt | 20 | 241623.861 | ±39875.978 | ops/s | 
| genson/stream | thrpt | 20 | 359355.313 | ±645.150 | ops/s | 
| gson/stream | thrpt | 20 | 280684.022 | ±2640.840 | ops/s | 
| jackson/stream | thrpt | 20 | 494665.728 | ±3202.770 | ops/s | 
| jakartajson/stream | thrpt | 20 | 13781.119 | ±93.250 | ops/s | 
| jsonio/stream | thrpt | 20 | 97774.610 | ±1414.742 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 128111.189 | ±2019.481 | ops/s | 
| minimaljson/stream | thrpt | 20 | 245706.893 | ±18710.731 | ops/s | 
| mjson/stream | thrpt | 20 | 116587.770 | ±901.152 | ops/s | 
| moshi/stream | thrpt | 20 | 308798.509 | ±13512.154 | ops/s | 
| nanojson/stream | thrpt | 20 | 121107.047 | ±212.925 | ops/s | 
| orgjson/stream | thrpt | 20 | 116098.222 | ±169.798 | ops/s | 

## JMH: Deserialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 67718.292 | ±562.475 | ops/s | 
| avajejsonb_jackson/databind | thrpt | 20 | 49407.754 | ±46.324 | ops/s | 
| dsljson/databind | thrpt | 20 | 82368.445 | ±352.018 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 63397.588 | ±446.223 | ops/s | 
| fastjson/databind | thrpt | 20 | 119220.563 | ±537.169 | ops/s | 
| flexjson/databind | thrpt | 20 | 7358.807 | ±94.756 | ops/s | 
| genson/databind | thrpt | 20 | 34289.365 | ±886.925 | ops/s | 
| gson/databind | thrpt | 20 | 31767.267 | ±428.040 | ops/s | 
| jackson/databind | thrpt | 20 | 46580.693 | ±553.431 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 55252.680 | ±359.298 | ops/s | 
| jackson_blackbird/databind | thrpt | 20 | 53030.704 | ±331.789 | ops/s | 
| jodd/databind | thrpt | 20 | 42861.399 | ±241.485 | ops/s | 
| johnzon/databind | thrpt | 20 | 12356.835 | ±148.228 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 49682.044 | ±734.996 | ops/s | 
| logansquare/databind | thrpt | 20 | 42747.083 | ±1045.020 | ops/s | 
| moshi/databind | thrpt | 20 | 29334.938 | ±311.209 | ops/s | 
| qson/databind | thrpt | 20 | 45389.413 | ±516.779 | ops/s | 
| yasson/databind | thrpt | 20 | 21436.215 | ±295.565 | ops/s | 
| antons/stream | thrpt | 20 | 31284.537 | ±166.612 | ops/s | 
| genson/stream | thrpt | 20 | 39756.525 | ±342.839 | ops/s | 
| gson/stream | thrpt | 20 | 31285.508 | ±2492.600 | ops/s | 
| jackson/stream | thrpt | 20 | 50974.947 | ±197.421 | ops/s | 
| jakartajson/stream | thrpt | 20 | 11117.539 | ±113.763 | ops/s | 
| jsonio/stream | thrpt | 20 | 10051.205 | ±68.057 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 14400.047 | ±85.804 | ops/s | 
| minimaljson/stream | thrpt | 20 | 26576.067 | ±129.527 | ops/s | 
| mjson/stream | thrpt | 20 | 11818.429 | ±362.441 | ops/s | 
| moshi/stream | thrpt | 20 | 26376.556 | ±116.585 | ops/s | 
| nanojson/stream | thrpt | 20 | 23137.062 | ±391.764 | ops/s | 
| orgjson/stream | thrpt | 20 | 12094.184 | ±475.968 | ops/s | 

## JMH: Deserialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 6703.307 | ±73.154 | ops/s | 
| avajejsonb_jackson/databind | thrpt | 20 | 4876.379 | ±24.604 | ops/s | 
| dsljson/databind | thrpt | 20 | 8323.181 | ±22.210 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 6321.131 | ±73.641 | ops/s | 
| fastjson/databind | thrpt | 20 | 12424.609 | ±30.737 | ops/s | 
| flexjson/databind | thrpt | 20 | 747.936 | ±9.365 | ops/s | 
| genson/databind | thrpt | 20 | 3375.147 | ±54.101 | ops/s | 
| gson/databind | thrpt | 20 | 3353.523 | ±23.494 | ops/s | 
| jackson/databind | thrpt | 20 | 4774.324 | ±11.830 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 5468.187 | ±81.008 | ops/s | 
| jackson_blackbird/databind | thrpt | 20 | 5323.564 | ±16.863 | ops/s | 
| jodd/databind | thrpt | 20 | 4339.742 | ±15.242 | ops/s | 
| johnzon/databind | thrpt | 20 | 1198.991 | ±7.016 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 5069.311 | ±61.900 | ops/s | 
| logansquare/databind | thrpt | 20 | 4469.166 | ±52.863 | ops/s | 
| moshi/databind | thrpt | 20 | 2636.246 | ±9.831 | ops/s | 
| qson/databind | thrpt | 20 | 4655.587 | ±26.438 | ops/s | 
| yasson/databind | thrpt | 20 | 2131.562 | ±10.253 | ops/s | 
| antons/stream | thrpt | 20 | 3087.586 | ±77.316 | ops/s | 
| genson/stream | thrpt | 20 | 3725.940 | ±72.859 | ops/s | 
| gson/stream | thrpt | 20 | 3395.512 | ±19.822 | ops/s | 
| jackson/stream | thrpt | 20 | 5582.508 | ±20.259 | ops/s | 
| jakartajson/stream | thrpt | 20 | 2403.410 | ±3.419 | ops/s | 
| jsonio/stream | thrpt | 20 | 1013.481 | ±13.315 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 1386.481 | ±10.911 | ops/s | 
| minimaljson/stream | thrpt | 20 | 2358.682 | ±270.602 | ops/s | 
| mjson/stream | thrpt | 20 | 1160.931 | ±71.399 | ops/s | 
| moshi/stream | thrpt | 20 | 2808.409 | ±62.167 | ops/s | 
| nanojson/stream | thrpt | 20 | 2602.109 | ±4.436 | ops/s | 
| orgjson/stream | thrpt | 20 | 1270.440 | ±7.758 | ops/s | 

## JMH: Deserialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 20 | 675.848 | ±3.083 | ops/s | 
| avajejsonb_jackson/databind | thrpt | 20 | 487.281 | ±2.504 | ops/s | 
| dsljson/databind | thrpt | 20 | 812.598 | ±1.553 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 631.292 | ±11.186 | ops/s | 
| fastjson/databind | thrpt | 20 | 1147.655 | ±3.592 | ops/s | 
| flexjson/databind | thrpt | 20 | 71.632 | ±2.000 | ops/s | 
| genson/databind | thrpt | 20 | 338.896 | ±4.337 | ops/s | 
| gson/databind | thrpt | 20 | 331.576 | ±9.281 | ops/s | 
| jackson/databind | thrpt | 20 | 469.906 | ±2.762 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 539.185 | ±3.536 | ops/s | 
| jackson_blackbird/databind | thrpt | 20 | 519.619 | ±4.791 | ops/s | 
| jodd/databind | thrpt | 20 | 451.569 | ±5.703 | ops/s | 
| johnzon/databind | thrpt | 20 | 103.578 | ±7.971 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 484.719 | ±2.669 | ops/s | 
| logansquare/databind | thrpt | 20 | 421.535 | ±2.619 | ops/s | 
| moshi/databind | thrpt | 20 | 264.157 | ±8.673 | ops/s | 
| qson/databind | thrpt | 20 | 462.074 | ±1.312 | ops/s | 
| yasson/databind | thrpt | 20 | 204.887 | ±4.317 | ops/s | 
| antons/stream | thrpt | 20 | 306.452 | ±2.124 | ops/s | 
| genson/stream | thrpt | 20 | 406.712 | ±18.538 | ops/s | 
| gson/stream | thrpt | 20 | 344.722 | ±5.064 | ops/s | 
| jackson/stream | thrpt | 20 | 515.648 | ±3.667 | ops/s | 
| jakartajson/stream | thrpt | 20 | 236.614 | ±4.069 | ops/s | 
| jsonio/stream | thrpt | 20 | 89.514 | ±0.848 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 138.578 | ±2.305 | ops/s | 
| minimaljson/stream | thrpt | 20 | 200.996 | ±4.070 | ops/s | 
| mjson/stream | thrpt | 20 | 118.898 | ±0.638 | ops/s | 
| moshi/stream | thrpt | 20 | 268.233 | ±10.752 | ops/s | 
| nanojson/stream | thrpt | 20 | 239.147 | ±1.397 | ops/s | 
| orgjson/stream | thrpt | 20 | 117.729 | ±3.277 | ops/s | 

