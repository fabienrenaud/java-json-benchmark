2018-04-21

# *clients* data type

## JMH: Deserialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.dsljson | thrpt | 20 | 613582.763 | ±2179.026 | ops/s | 
| Deserialization.dsljson_reflection | thrpt | 20 | 500866.902 | ±1413.128 | ops/s | 
| Deserialization.fastjson | thrpt | 20 | 161957.072 | ±422.918 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 50142.191 | ±592.101 | ops/s | 
| Deserialization.genson | thrpt | 20 | 184759.556 | ±1243.667 | ops/s | 
| Deserialization.gson | thrpt | 20 | 169064.773 | ±654.235 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 308539.405 | ±1869.237 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 334524.218 | ±1337.028 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 201412.190 | ±664.827 | ops/s | 
| Deserialization.jsoniter | thrpt | 20 | 341191.288 | ±3511.436 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 205707.371 | ±1062.470 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 160445.645 | ±2465.686 | ops/s | 

## JMH: Deserialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.dsljson | thrpt | 20 | 86290.783 | ±625.863 | ops/s | 
| Deserialization.dsljson_reflection | thrpt | 20 | 70338.154 | ±467.137 | ops/s | 
| Deserialization.fastjson | thrpt | 20 | 19113.690 | ±370.548 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 6898.229 | ±38.268 | ops/s | 
| Deserialization.genson | thrpt | 20 | 19368.354 | ±144.932 | ops/s | 
| Deserialization.gson | thrpt | 20 | 17526.884 | ±108.210 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 21004.696 | ±153.492 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 20461.762 | ±580.677 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 17514.758 | ±170.539 | ops/s | 
| Deserialization.jsoniter | thrpt | 20 | 24102.900 | ±613.421 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 20823.887 | ±78.721 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 16208.103 | ±69.425 | ops/s | 

## JMH: Deserialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.dsljson | thrpt | 20 | 8543.028 | ±40.431 | ops/s | 
| Deserialization.dsljson_reflection | thrpt | 20 | 6834.772 | ±141.939 | ops/s | 
| Deserialization.fastjson | thrpt | 20 | 1675.743 | ±14.673 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 642.521 | ±4.494 | ops/s | 
| Deserialization.genson | thrpt | 20 | 1714.414 | ±28.832 | ops/s | 
| Deserialization.gson | thrpt | 20 | 1549.520 | ±6.128 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 1766.292 | ±48.486 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 1723.092 | ±7.449 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 1536.030 | ±28.641 | ops/s | 
| Deserialization.jsoniter | thrpt | 20 | 923.014 | ±4.272 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 1811.947 | ±17.657 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 1455.356 | ±5.309 | ops/s | 

## JMH: Deserialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Deserialization.dsljson | thrpt | 20 | 832.887 | ±5.088 | ops/s | 
| Deserialization.dsljson_reflection | thrpt | 20 | 653.257 | ±6.350 | ops/s | 
| Deserialization.fastjson | thrpt | 20 | 155.913 | ±0.781 | ops/s | 
| Deserialization.flexjson | thrpt | 20 | 48.264 | ±0.963 | ops/s | 
| Deserialization.genson | thrpt | 20 | 165.909 | ±2.366 | ops/s | 
| Deserialization.gson | thrpt | 20 | 150.928 | ±0.791 | ops/s | 
| Deserialization.jackson | thrpt | 20 | 169.577 | ±1.009 | ops/s | 
| Deserialization.jackson_afterburner | thrpt | 20 | 166.542 | ±2.187 | ops/s | 
| Deserialization.jodd | thrpt | 20 | 145.747 | ±2.425 | ops/s | 
| Deserialization.jsoniter | thrpt | 20 | 15.609 | ±0.173 | ops/s | 
| Deserialization.logansquare | thrpt | 20 | 176.958 | ±4.297 | ops/s | 
| Deserialization.moshi | thrpt | 20 | 140.318 | ±1.513 | ops/s | 

## JMH: Serialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.dsljson | thrpt | 20 | 1012741.789 | ±2505.113 | ops/s | 
| Serialization.dsljson_reflection | thrpt | 20 | 714429.079 | ±9394.224 | ops/s | 
| Serialization.fastjson | thrpt | 20 | 464063.065 | ±7600.529 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 915.306 | ±336.352 | ops/s | 
| Serialization.genson | thrpt | 20 | 255443.851 | ±1061.517 | ops/s | 
| Serialization.gson | thrpt | 20 | 147237.462 | ±635.436 | ops/s | 
| Serialization.jackson | thrpt | 20 | 509946.087 | ±1571.811 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 553234.514 | ±6998.771 | ops/s | 
| Serialization.jodd | thrpt | 20 | 157114.081 | ±2970.553 | ops/s | 
| Serialization.jsoniter | thrpt | 20 | 588597.821 | ±3473.727 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 462127.904 | ±1516.982 | ops/s | 
| Serialization.moshi | thrpt | 20 | 222931.141 | ±1893.095 | ops/s | 

## JMH: Serialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.dsljson | thrpt | 20 | 165460.344 | ±407.762 | ops/s | 
| Serialization.dsljson_reflection | thrpt | 20 | 118841.363 | ±2502.099 | ops/s | 
| Serialization.fastjson | thrpt | 20 | 44886.778 | ±1559.747 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 397.858 | ±105.031 | ops/s | 
| Serialization.genson | thrpt | 20 | 39130.165 | ±213.802 | ops/s | 
| Serialization.gson | thrpt | 20 | 21666.963 | ±165.523 | ops/s | 
| Serialization.jackson | thrpt | 20 | 42262.589 | ±479.284 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 43063.874 | ±323.239 | ops/s | 
| Serialization.jodd | thrpt | 20 | 20710.599 | ±180.229 | ops/s | 
| Serialization.jsoniter | thrpt | 20 | 60376.303 | ±1460.322 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 52952.804 | ±1640.315 | ops/s | 
| Serialization.moshi | thrpt | 20 | 29468.529 | ±133.713 | ops/s | 

## JMH: Serialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.dsljson | thrpt | 20 | 18062.485 | ±66.800 | ops/s | 
| Serialization.dsljson_reflection | thrpt | 20 | 12127.942 | ±318.883 | ops/s | 
| Serialization.fastjson | thrpt | 20 | 3562.437 | ±29.421 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 116.106 | ±30.896 | ops/s | 
| Serialization.genson | thrpt | 20 | 3769.187 | ±45.159 | ops/s | 
| Serialization.gson | thrpt | 20 | 2145.850 | ±5.609 | ops/s | 
| Serialization.jackson | thrpt | 20 | 3679.910 | ±8.603 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 3754.478 | ±10.455 | ops/s | 
| Serialization.jodd | thrpt | 20 | 2023.412 | ±27.277 | ops/s | 
| Serialization.jsoniter | thrpt | 20 | 5753.681 | ±28.520 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 5203.926 | ±32.004 | ops/s | 
| Serialization.moshi | thrpt | 20 | 2876.403 | ±52.195 | ops/s | 

## JMH: Serialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| Serialization.dsljson | thrpt | 20 | 1626.782 | ±3.052 | ops/s | 
| Serialization.dsljson_reflection | thrpt | 20 | 1193.441 | ±6.614 | ops/s | 
| Serialization.fastjson | thrpt | 20 | 282.697 | ±5.428 | ops/s | 
| Serialization.flexjson | thrpt | 20 | 30.710 | ±6.892 | ops/s | 
| Serialization.genson | thrpt | 20 | 368.989 | ±5.410 | ops/s | 
| Serialization.gson | thrpt | 20 | 209.134 | ±2.588 | ops/s | 
| Serialization.jackson | thrpt | 20 | 347.419 | ±5.111 | ops/s | 
| Serialization.jackson_afterburner | thrpt | 20 | 356.894 | ±2.060 | ops/s | 
| Serialization.jodd | thrpt | 20 | 194.567 | ±2.175 | ops/s | 
| Serialization.jsoniter | thrpt | 20 | 563.318 | ±2.572 | ops/s | 
| Serialization.logansquare | thrpt | 20 | 480.341 | ±6.340 | ops/s | 
| Serialization.moshi | thrpt | 20 | 281.452 | ±1.857 | ops/s | 

# *users* data type

## JMH: Deserialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 250062.737 | ±1115.202 | ops/s | 
| dsljson/databind | thrpt | 20 | 834543.816 | ±7041.980 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 675165.699 | ±33062.258 | ops/s | 
| fastjson/databind | thrpt | 20 | 306110.045 | ±1319.758 | ops/s | 
| flexjson/databind | thrpt | 20 | 72007.153 | ±1225.644 | ops/s | 
| genson/databind | thrpt | 20 | 312597.826 | ±3962.900 | ops/s | 
| gson/databind | thrpt | 20 | 290425.387 | ±2831.536 | ops/s | 
| jackson/databind | thrpt | 20 | 519592.510 | ±5564.908 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 578599.737 | ±8192.122 | ops/s | 
| jodd/databind | thrpt | 20 | 444162.302 | ±3956.182 | ops/s | 
| johnzon/databind | thrpt | 20 | 111104.220 | ±702.197 | ops/s | 
| jsoniter/databind | thrpt | 20 | 328673.038 | ±2784.497 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 350869.462 | ±2585.570 | ops/s | 
| logansquare/databind | thrpt | 20 | 301598.509 | ±8846.818 | ops/s | 
| moshi/databind | thrpt | 20 | 271731.475 | ±2578.283 | ops/s | 
| yasson/databind | thrpt | 20 | 91282.841 | ±729.873 | ops/s | 
| genson/stream | thrpt | 20 | 376234.587 | ±13586.446 | ops/s | 
| gson/stream | thrpt | 20 | 319740.688 | ±3501.769 | ops/s | 
| jackson/stream | thrpt | 20 | 529395.229 | ±2895.336 | ops/s | 
| javaxjson/stream | thrpt | 20 | 60538.607 | ±407.953 | ops/s | 
| jsonio/stream | thrpt | 20 | 85381.599 | ±1264.484 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 106348.417 | ±2709.397 | ops/s | 
| minimaljson/stream | thrpt | 20 | 277057.639 | ±4865.745 | ops/s | 
| moshi/stream | thrpt | 20 | 272219.465 | ±1994.939 | ops/s | 
| nanojson/stream | thrpt | 20 | 100369.271 | ±645.523 | ops/s | 
| orgjson/stream | thrpt | 20 | 56723.766 | ±836.722 | ops/s | 
| tapestry/stream | thrpt | 20 | 429020.784 | ±47241.492 | ops/s | 

## JMH: Deserialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 39856.758 | ±475.587 | ops/s | 
| dsljson/databind | thrpt | 20 | 99835.652 | ±484.567 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 81348.261 | ±585.452 | ops/s | 
| fastjson/databind | thrpt | 20 | 44647.859 | ±280.393 | ops/s | 
| flexjson/databind | thrpt | 20 | 8265.073 | ±58.516 | ops/s | 
| genson/databind | thrpt | 20 | 45401.002 | ±118.829 | ops/s | 
| gson/databind | thrpt | 20 | 41764.458 | ±545.811 | ops/s | 
| jackson/databind | thrpt | 20 | 62415.243 | ±254.922 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 68973.550 | ±317.740 | ops/s | 
| jodd/databind | thrpt | 20 | 46420.730 | ±398.650 | ops/s | 
| johnzon/databind | thrpt | 20 | 12707.383 | ±54.605 | ops/s | 
| jsoniter/databind | thrpt | 20 | 38319.333 | ±622.362 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 40400.932 | ±670.165 | ops/s | 
| logansquare/databind | thrpt | 20 | 61293.982 | ±205.177 | ops/s | 
| moshi/databind | thrpt | 20 | 31854.318 | ±149.983 | ops/s | 
| yasson/databind | thrpt | 20 | 9425.041 | ±80.846 | ops/s | 
| genson/stream | thrpt | 20 | 50267.839 | ±513.827 | ops/s | 
| gson/stream | thrpt | 20 | 41631.816 | ±282.390 | ops/s | 
| jackson/stream | thrpt | 20 | 67220.220 | ±151.192 | ops/s | 
| javaxjson/stream | thrpt | 20 | 28060.220 | ±298.276 | ops/s | 
| jsonio/stream | thrpt | 20 | 11837.317 | ±50.694 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 16458.463 | ±180.522 | ops/s | 
| minimaljson/stream | thrpt | 20 | 31421.426 | ±1631.716 | ops/s | 
| moshi/stream | thrpt | 20 | 29736.952 | ±1026.469 | ops/s | 
| nanojson/stream | thrpt | 20 | 27876.390 | ±236.529 | ops/s | 
| orgjson/stream | thrpt | 20 | 6902.188 | ±28.631 | ops/s | 
| tapestry/stream | thrpt | 20 | 49151.970 | ±221.852 | ops/s | 

## JMH: Deserialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 3956.828 | ±29.845 | ops/s | 
| dsljson/databind | thrpt | 20 | 10176.221 | ±43.884 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 7741.761 | ±199.032 | ops/s | 
| fastjson/databind | thrpt | 20 | 4405.367 | ±39.560 | ops/s | 
| flexjson/databind | thrpt | 20 | 816.137 | ±11.070 | ops/s | 
| genson/databind | thrpt | 20 | 4734.392 | ±51.319 | ops/s | 
| gson/databind | thrpt | 20 | 4199.389 | ±21.699 | ops/s | 
| jackson/databind | thrpt | 20 | 6196.747 | ±140.137 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 6885.941 | ±118.682 | ops/s | 
| jodd/databind | thrpt | 20 | 4597.526 | ±49.851 | ops/s | 
| johnzon/databind | thrpt | 20 | 1172.993 | ±6.698 | ops/s | 
| jsoniter/databind | thrpt | 20 | 2607.981 | ±12.269 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 4175.884 | ±50.344 | ops/s | 
| logansquare/databind | thrpt | 20 | 6348.273 | ±68.088 | ops/s | 
| moshi/databind | thrpt | 20 | 3316.267 | ±28.346 | ops/s | 
| yasson/databind | thrpt | 20 | 947.793 | ±4.665 | ops/s | 
| genson/stream | thrpt | 20 | 5139.098 | ±189.520 | ops/s | 
| gson/stream | thrpt | 20 | 4276.076 | ±37.606 | ops/s | 
| jackson/stream | thrpt | 20 | 6872.652 | ±22.393 | ops/s | 
| javaxjson/stream | thrpt | 20 | 3649.425 | ±33.893 | ops/s | 
| jsonio/stream | thrpt | 20 | 1175.569 | ±22.380 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 1624.296 | ±5.963 | ops/s | 
| minimaljson/stream | thrpt | 20 | 3117.913 | ±251.395 | ops/s | 
| moshi/stream | thrpt | 20 | 3028.308 | ±52.674 | ops/s | 
| nanojson/stream | thrpt | 20 | 3459.686 | ±23.721 | ops/s | 
| orgjson/stream | thrpt | 20 | 706.475 | ±3.844 | ops/s | 
| tapestry/stream | thrpt | 20 | 4787.126 | ±21.993 | ops/s | 

## JMH: Deserialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 241.762 | ±4.767 | ops/s | 
| dsljson/databind | thrpt | 20 | 935.582 | ±8.423 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 786.597 | ±4.295 | ops/s | 
| fastjson/databind | thrpt | 20 | 411.576 | ±3.642 | ops/s | 
| flexjson/databind | thrpt | 20 | 70.088 | ±0.971 | ops/s | 
| genson/databind | thrpt | 20 | 437.222 | ±3.038 | ops/s | 
| gson/databind | thrpt | 20 | 395.999 | ±5.302 | ops/s | 
| jackson/databind | thrpt | 20 | 581.676 | ±7.983 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 659.075 | ±3.188 | ops/s | 
| jodd/databind | thrpt | 20 | 446.220 | ±9.149 | ops/s | 
| johnzon/databind | thrpt | 20 | 85.893 | ±2.126 | ops/s | 
| jsoniter/databind | thrpt | 20 | 18.432 | ±0.265 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 389.222 | ±7.746 | ops/s | 
| logansquare/databind | thrpt | 20 | 581.635 | ±5.043 | ops/s | 
| moshi/databind | thrpt | 20 | 323.996 | ±1.627 | ops/s | 
| yasson/databind | thrpt | 20 | 91.721 | ±0.416 | ops/s | 
| genson/stream | thrpt | 20 | 484.547 | ±20.107 | ops/s | 
| gson/stream | thrpt | 20 | 399.064 | ±4.484 | ops/s | 
| jackson/stream | thrpt | 20 | 660.713 | ±2.489 | ops/s | 
| javaxjson/stream | thrpt | 20 | 293.518 | ±6.838 | ops/s | 
| jsonio/stream | thrpt | 20 | 110.752 | ±0.546 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 139.212 | ±3.184 | ops/s | 
| minimaljson/stream | thrpt | 20 | 237.615 | ±2.269 | ops/s | 
| moshi/stream | thrpt | 20 | 280.520 | ±3.054 | ops/s | 
| nanojson/stream | thrpt | 20 | 304.248 | ±4.173 | ops/s | 
| orgjson/stream | thrpt | 20 | 66.091 | ±0.540 | ops/s | 
| tapestry/stream | thrpt | 20 | 374.513 | ±4.413 | ops/s | 

## JMH: Serialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 208839.194 | ±2057.921 | ops/s | 
| dsljson/databind | thrpt | 20 | 1356517.491 | ±2941.898 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 1044812.417 | ±17127.754 | ops/s | 
| fastjson/databind | thrpt | 20 | 853436.677 | ±3043.782 | ops/s | 
| flexjson/databind | thrpt | 20 | 1126.784 | ±380.794 | ops/s | 
| genson/databind | thrpt | 20 | 384000.395 | ±5937.263 | ops/s | 
| gson/databind | thrpt | 20 | 228930.474 | ±5129.799 | ops/s | 
| jackson/databind | thrpt | 20 | 827086.610 | ±20781.756 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 889638.742 | ±10874.307 | ops/s | 
| jodd/databind | thrpt | 20 | 235285.527 | ±1225.888 | ops/s | 
| johnzon/databind | thrpt | 20 | 302889.267 | ±1240.790 | ops/s | 
| jsoniter/databind | thrpt | 20 | 1064527.253 | ±7115.619 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 403511.193 | ±13258.862 | ops/s | 
| logansquare/databind | thrpt | 20 | 874628.050 | ±41424.863 | ops/s | 
| moshi/databind | thrpt | 20 | 416529.998 | ±5347.986 | ops/s | 
| yasson/databind | thrpt | 20 | 301646.605 | ±6034.784 | ops/s | 
| genson/stream | thrpt | 20 | 403392.415 | ±3676.828 | ops/s | 
| gson/stream | thrpt | 20 | 151351.629 | ±7453.615 | ops/s | 
| jackson/stream | thrpt | 20 | 853503.626 | ±3844.590 | ops/s | 
| javaxjson/stream | thrpt | 20 | 11731.039 | ±126.412 | ops/s | 
| jsonio/stream | thrpt | 20 | 83589.840 | ±920.066 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 83503.240 | ±499.894 | ops/s | 
| minimaljson/stream | thrpt | 20 | 354432.144 | ±3848.408 | ops/s | 
| moshi/stream | thrpt | 20 | 438461.191 | ±17749.760 | ops/s | 
| nanojson/stream | thrpt | 20 | 429737.887 | ±3238.869 | ops/s | 
| orgjson/stream | thrpt | 20 | 87872.506 | ±356.175 | ops/s | 
| tapestry/stream | thrpt | 20 | 92275.256 | ±441.264 | ops/s | 

## JMH: Serialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 30187.512 | ±291.738 | ops/s | 
| dsljson/databind | thrpt | 20 | 151177.019 | ±3155.898 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 123564.692 | ±1974.135 | ops/s | 
| fastjson/databind | thrpt | 20 | 59424.744 | ±607.798 | ops/s | 
| flexjson/databind | thrpt | 20 | 350.519 | ±90.812 | ops/s | 
| genson/databind | thrpt | 20 | 64916.667 | ±447.639 | ops/s | 
| gson/databind | thrpt | 20 | 26257.965 | ±271.396 | ops/s | 
| jackson/databind | thrpt | 20 | 99438.079 | ±2462.367 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 104950.116 | ±360.463 | ops/s | 
| jodd/databind | thrpt | 20 | 26692.374 | ±1224.854 | ops/s | 
| johnzon/databind | thrpt | 20 | 39674.500 | ±653.957 | ops/s | 
| jsoniter/databind | thrpt | 20 | 134751.713 | ±3640.000 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 51426.149 | ±1663.522 | ops/s | 
| logansquare/databind | thrpt | 20 | 103675.420 | ±7062.168 | ops/s | 
| moshi/databind | thrpt | 20 | 44264.410 | ±1487.727 | ops/s | 
| yasson/databind | thrpt | 20 | 51435.043 | ±801.676 | ops/s | 
| genson/stream | thrpt | 20 | 54800.774 | ±333.590 | ops/s | 
| gson/stream | thrpt | 20 | 15802.117 | ±562.524 | ops/s | 
| jackson/stream | thrpt | 20 | 101063.274 | ±3205.668 | ops/s | 
| javaxjson/stream | thrpt | 20 | 633.720 | ±8.635 | ops/s | 
| jsonio/stream | thrpt | 20 | 11298.759 | ±69.076 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 8840.746 | ±303.449 | ops/s | 
| minimaljson/stream | thrpt | 20 | 38478.405 | ±833.009 | ops/s | 
| moshi/stream | thrpt | 20 | 45352.006 | ±1135.987 | ops/s | 
| nanojson/stream | thrpt | 20 | 57195.113 | ±2666.746 | ops/s | 
| orgjson/stream | thrpt | 20 | 9282.594 | ±33.483 | ops/s | 
| tapestry/stream | thrpt | 20 | 9543.646 | ±33.737 | ops/s | 

## JMH: Serialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 3138.025 | ±17.238 | ops/s | 
| dsljson/databind | thrpt | 20 | 15664.828 | ±63.094 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 12251.045 | ±89.734 | ops/s | 
| fastjson/databind | thrpt | 20 | 5250.921 | ±33.659 | ops/s | 
| flexjson/databind | thrpt | 20 | 104.362 | ±29.872 | ops/s | 
| genson/databind | thrpt | 20 | 6846.400 | ±15.883 | ops/s | 
| gson/databind | thrpt | 20 | 2685.089 | ±40.394 | ops/s | 
| jackson/databind | thrpt | 20 | 10154.693 | ±264.010 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 10310.489 | ±222.220 | ops/s | 
| jodd/databind | thrpt | 20 | 2664.931 | ±34.439 | ops/s | 
| johnzon/databind | thrpt | 20 | 3745.263 | ±144.350 | ops/s | 
| jsoniter/databind | thrpt | 20 | 14013.034 | ±207.603 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 5159.065 | ±169.814 | ops/s | 
| logansquare/databind | thrpt | 20 | 9842.990 | ±306.506 | ops/s | 
| moshi/databind | thrpt | 20 | 4435.865 | ±126.209 | ops/s | 
| yasson/databind | thrpt | 20 | 5146.470 | ±28.128 | ops/s | 
| genson/stream | thrpt | 20 | 5707.556 | ±25.325 | ops/s | 
| gson/stream | thrpt | 20 | 1605.978 | ±58.391 | ops/s | 
| jackson/stream | thrpt | 20 | 10344.145 | ±46.016 | ops/s | 
| javaxjson/stream | thrpt | 20 | 60.958 | ±1.015 | ops/s | 
| jsonio/stream | thrpt | 20 | 1172.096 | ±14.361 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 869.295 | ±25.337 | ops/s | 
| minimaljson/stream | thrpt | 20 | 3466.933 | ±37.084 | ops/s | 
| moshi/stream | thrpt | 20 | 4467.348 | ±19.410 | ops/s | 
| nanojson/stream | thrpt | 20 | 6278.278 | ±19.717 | ops/s | 
| orgjson/stream | thrpt | 20 | 914.324 | ±2.557 | ops/s | 
| tapestry/stream | thrpt | 20 | 919.417 | ±8.388 | ops/s | 

## JMH: Serialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 20 | 251.920 | ±2.730 | ops/s | 
| dsljson/databind | thrpt | 20 | 1529.327 | ±31.715 | ops/s | 
| dsljson_reflection/databind | thrpt | 20 | 1231.473 | ±24.216 | ops/s | 
| fastjson/databind | thrpt | 20 | 345.505 | ±2.551 | ops/s | 
| flexjson/databind | thrpt | 20 | 28.651 | ±6.526 | ops/s | 
| genson/databind | thrpt | 20 | 630.077 | ±9.248 | ops/s | 
| gson/databind | thrpt | 20 | 251.176 | ±1.686 | ops/s | 
| jackson/databind | thrpt | 20 | 895.022 | ±10.823 | ops/s | 
| jackson_afterburner/databind | thrpt | 20 | 971.020 | ±36.786 | ops/s | 
| jodd/databind | thrpt | 20 | 227.406 | ±1.324 | ops/s | 
| johnzon/databind | thrpt | 20 | 369.978 | ±1.486 | ops/s | 
| jsoniter/databind | thrpt | 20 | 1390.728 | ±44.810 | ops/s | 
| jsonsmart/databind | thrpt | 20 | 496.339 | ±13.957 | ops/s | 
| logansquare/databind | thrpt | 20 | 947.422 | ±8.233 | ops/s | 
| moshi/databind | thrpt | 20 | 426.702 | ±9.643 | ops/s | 
| yasson/databind | thrpt | 20 | 504.464 | ±2.787 | ops/s | 
| genson/stream | thrpt | 20 | 553.860 | ±22.649 | ops/s | 
| gson/stream | thrpt | 20 | 163.744 | ±1.072 | ops/s | 
| jackson/stream | thrpt | 20 | 940.000 | ±21.333 | ops/s | 
| javaxjson/stream | thrpt | 20 | 5.944 | ±0.116 | ops/s | 
| jsonio/stream | thrpt | 20 | 110.138 | ±0.570 | ops/s | 
| jsonsimple/stream | thrpt | 20 | 80.163 | ±1.912 | ops/s | 
| minimaljson/stream | thrpt | 20 | 308.291 | ±3.369 | ops/s | 
| moshi/stream | thrpt | 20 | 474.052 | ±2.524 | ops/s | 
| nanojson/stream | thrpt | 20 | 578.352 | ±11.105 | ops/s | 
| orgjson/stream | thrpt | 20 | 65.663 | ±1.383 | ops/s | 
| tapestry/stream | thrpt | 20 | 72.457 | ±1.604 | ops/s | 

