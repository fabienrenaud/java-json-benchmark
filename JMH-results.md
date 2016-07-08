# JMH: Deserialization - 1 payloads - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 174796.791 | ±5013.224 | ops/s | 
| genson/databind | thrpt | 10 | 185462.873 | ±3660.880 | ops/s | 
| gson/databind | thrpt | 10 | 128088.849 | ±2886.415 | ops/s | 
| jackson/databind | thrpt | 10 | 220824.713 | ±64249.291 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 292190.446 | ±9809.548 | ops/s | 
| genson/stream | thrpt | 10 | 194810.359 | ±7918.721 | ops/s | 
| gson/stream | thrpt | 10 | 139253.913 | ±3833.859 | ops/s | 
| jackson/stream | thrpt | 10 | 281709.524 | ±13990.454 | ops/s | 
| jsonio/stream | thrpt | 10 | 58202.355 | ±1419.682 | ops/s | 
| jsonp/stream | thrpt | 10 | 34287.065 | ±1768.340 | ops/s | 
| orgjson/stream | thrpt | 10 | 52882.170 | ±4462.963 | ops/s | 

# JMH: Deserialization - 1 payloads - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 23040.588 | ±704.038 | ops/s | 
| genson/databind | thrpt | 10 | 23398.498 | ±436.164 | ops/s | 
| gson/databind | thrpt | 10 | 15952.416 | ±1070.318 | ops/s | 
| jackson/databind | thrpt | 10 | 29041.625 | ±1509.000 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 33104.172 | ±1872.206 | ops/s | 
| genson/stream | thrpt | 10 | 26735.503 | ±573.128 | ops/s | 
| gson/stream | thrpt | 10 | 16251.757 | ±1060.909 | ops/s | 
| jackson/stream | thrpt | 10 | 32496.576 | ±622.301 | ops/s | 
| jsonio/stream | thrpt | 10 | 7532.847 | ±80.510 | ops/s | 
| jsonp/stream | thrpt | 10 | 10083.271 | ±1167.584 | ops/s | 
| orgjson/stream | thrpt | 10 | 6679.814 | ±958.367 | ops/s | 

# JMH: Deserialization - 1 payloads - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 2308.028 | ±115.131 | ops/s | 
| genson/databind | thrpt | 10 | 2462.394 | ±24.966 | ops/s | 
| gson/databind | thrpt | 10 | 1701.668 | ±24.651 | ops/s | 
| jackson/databind | thrpt | 10 | 3110.069 | ±18.500 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 3524.739 | ±31.420 | ops/s | 
| genson/stream | thrpt | 10 | 2656.663 | ±147.707 | ops/s | 
| gson/stream | thrpt | 10 | 1732.191 | ±54.287 | ops/s | 
| jackson/stream | thrpt | 10 | 3337.690 | ±55.448 | ops/s | 
| jsonio/stream | thrpt | 10 | 737.200 | ±10.386 | ops/s | 
| jsonp/stream | thrpt | 10 | 1408.322 | ±31.552 | ops/s | 
| orgjson/stream | thrpt | 10 | 743.539 | ±12.622 | ops/s | 

# JMH: Deserialization - 1 payloads - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 229.477 | ±1.176 | ops/s | 
| genson/databind | thrpt | 10 | 245.447 | ±1.145 | ops/s | 
| gson/databind | thrpt | 10 | 169.420 | ±1.550 | ops/s | 
| jackson/databind | thrpt | 10 | 305.541 | ±6.456 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 351.656 | ±5.035 | ops/s | 
| genson/stream | thrpt | 10 | 280.385 | ±2.549 | ops/s | 
| gson/stream | thrpt | 10 | 173.480 | ±2.663 | ops/s | 
| jackson/stream | thrpt | 10 | 337.147 | ±6.594 | ops/s | 
| jsonio/stream | thrpt | 10 | 72.526 | ±1.369 | ops/s | 
| jsonp/stream | thrpt | 10 | 137.898 | ±2.031 | ops/s | 
| orgjson/stream | thrpt | 10 | 77.323 | ±1.688 | ops/s | 

# JMH: Deserialization - 10 payloads - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 15315.258 | ±735.836 | ops/s | 
| genson/databind | thrpt | 10 | 18513.452 | ±75.401 | ops/s | 
| gson/databind | thrpt | 10 | 13018.427 | ±179.121 | ops/s | 
| jackson/databind | thrpt | 10 | 24038.279 | ±328.246 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 28814.598 | ±620.120 | ops/s | 
| genson/stream | thrpt | 10 | 19505.543 | ±426.236 | ops/s | 
| gson/stream | thrpt | 10 | 13676.191 | ±449.829 | ops/s | 
| jackson/stream | thrpt | 10 | 27100.465 | ±628.589 | ops/s | 
| jsonio/stream | thrpt | 10 | 5620.500 | ±120.817 | ops/s | 
| jsonp/stream | thrpt | 10 | 3376.321 | ±33.134 | ops/s | 
| orgjson/stream | thrpt | 10 | 4866.033 | ±436.660 | ops/s | 

# JMH: Deserialization - 10 payloads - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 2300.858 | ±45.171 | ops/s | 
| genson/databind | thrpt | 10 | 2422.273 | ±44.478 | ops/s | 
| gson/databind | thrpt | 10 | 1626.121 | ±7.843 | ops/s | 
| jackson/databind | thrpt | 10 | 3075.307 | ±63.335 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 3456.788 | ±56.680 | ops/s | 
| genson/stream | thrpt | 10 | 2659.144 | ±54.256 | ops/s | 
| gson/stream | thrpt | 10 | 1612.790 | ±117.414 | ops/s | 
| jackson/stream | thrpt | 10 | 3016.489 | ±109.314 | ops/s | 
| jsonio/stream | thrpt | 10 | 716.215 | ±25.631 | ops/s | 
| jsonp/stream | thrpt | 10 | 983.485 | ±16.998 | ops/s | 
| orgjson/stream | thrpt | 10 | 673.152 | ±17.019 | ops/s | 

# JMH: Deserialization - 10 payloads - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 230.452 | ±2.973 | ops/s | 
| genson/databind | thrpt | 10 | 243.118 | ±1.992 | ops/s | 
| gson/databind | thrpt | 10 | 168.440 | ±1.309 | ops/s | 
| jackson/databind | thrpt | 10 | 305.883 | ±2.669 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 352.399 | ±5.856 | ops/s | 
| genson/stream | thrpt | 10 | 276.884 | ±4.215 | ops/s | 
| gson/stream | thrpt | 10 | 175.910 | ±8.016 | ops/s | 
| jackson/stream | thrpt | 10 | 339.730 | ±5.818 | ops/s | 
| jsonio/stream | thrpt | 10 | 73.332 | ±0.478 | ops/s | 
| jsonp/stream | thrpt | 10 | 138.848 | ±1.576 | ops/s | 
| orgjson/stream | thrpt | 10 | 76.144 | ±1.456 | ops/s | 

# JMH: Deserialization - 10 payloads - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 22.108 | ±0.956 | ops/s | 
| genson/databind | thrpt | 10 | 22.499 | ±0.984 | ops/s | 
| gson/databind | thrpt | 10 | 15.417 | ±0.394 | ops/s | 
| jackson/databind | thrpt | 10 | 27.925 | ±0.990 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 32.296 | ±1.371 | ops/s | 
| genson/stream | thrpt | 10 | 24.895 | ±1.174 | ops/s | 
| gson/stream | thrpt | 10 | 16.295 | ±1.195 | ops/s | 
| jackson/stream | thrpt | 10 | 30.635 | ±1.507 | ops/s | 
| jsonio/stream | thrpt | 10 | 6.720 | ±0.341 | ops/s | 
| jsonp/stream | thrpt | 10 | 12.734 | ±0.484 | ops/s | 
| orgjson/stream | thrpt | 10 | 6.760 | ±0.531 | ops/s | 

# JMH: Deserialization - 100 payloads - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 1582.502 | ±35.347 | ops/s | 
| genson/databind | thrpt | 10 | 1764.875 | ±30.963 | ops/s | 
| gson/databind | thrpt | 10 | 1275.590 | ±39.019 | ops/s | 
| jackson/databind | thrpt | 10 | 2437.092 | ±31.578 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 2770.063 | ±28.823 | ops/s | 
| genson/stream | thrpt | 10 | 1903.509 | ±99.181 | ops/s | 
| gson/stream | thrpt | 10 | 1339.747 | ±5.328 | ops/s | 
| jackson/stream | thrpt | 10 | 2642.005 | ±57.850 | ops/s | 
| jsonio/stream | thrpt | 10 | 558.554 | ±4.336 | ops/s | 
| jsonp/stream | thrpt | 10 | 331.694 | ±5.328 | ops/s | 
| orgjson/stream | thrpt | 10 | 535.819 | ±9.491 | ops/s | 

# JMH: Deserialization - 100 payloads - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 230.315 | ±1.262 | ops/s | 
| genson/databind | thrpt | 10 | 226.888 | ±4.931 | ops/s | 
| gson/databind | thrpt | 10 | 154.775 | ±7.682 | ops/s | 
| jackson/databind | thrpt | 10 | 300.582 | ±3.115 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 332.516 | ±2.205 | ops/s | 
| genson/stream | thrpt | 10 | 253.251 | ±13.354 | ops/s | 
| gson/stream | thrpt | 10 | 168.384 | ±3.967 | ops/s | 
| jackson/stream | thrpt | 10 | 324.836 | ±11.217 | ops/s | 
| jsonio/stream | thrpt | 10 | 72.702 | ±1.166 | ops/s | 
| jsonp/stream | thrpt | 10 | 100.387 | ±0.491 | ops/s | 
| orgjson/stream | thrpt | 10 | 73.314 | ±1.032 | ops/s | 

# JMH: Deserialization - 100 payloads - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 22.756 | ±0.198 | ops/s | 
| genson/databind | thrpt | 10 | 23.050 | ±1.923 | ops/s | 
| gson/databind | thrpt | 10 | 16.820 | ±0.140 | ops/s | 
| jackson/databind | thrpt | 10 | 30.940 | ±0.369 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 35.341 | ±0.350 | ops/s | 
| genson/stream | thrpt | 10 | 27.118 | ±0.253 | ops/s | 
| gson/stream | thrpt | 10 | 17.056 | ±0.146 | ops/s | 
| jackson/stream | thrpt | 10 | 33.644 | ±0.230 | ops/s | 
| jsonio/stream | thrpt | 10 | 7.309 | ±0.213 | ops/s | 
| jsonp/stream | thrpt | 10 | 13.879 | ±0.272 | ops/s | 
| orgjson/stream | thrpt | 10 | 7.688 | ±0.104 | ops/s | 

# JMH: Deserialization - 100 payloads - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 2.242 | ±0.022 | ops/s | 
| genson/databind | thrpt | 10 | 2.377 | ±0.030 | ops/s | 
| gson/databind | thrpt | 10 | 1.633 | ±0.021 | ops/s | 
| jackson/databind | thrpt | 10 | 3.017 | ±0.040 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 3.533 | ±0.077 | ops/s | 
| genson/stream | thrpt | 10 | 2.718 | ±0.054 | ops/s | 
| gson/stream | thrpt | 10 | 1.681 | ±0.015 | ops/s | 
| jackson/stream | thrpt | 10 | 3.355 | ±0.026 | ops/s | 
| jsonio/stream | thrpt | 10 | 0.725 | ±0.008 | ops/s | 
| jsonp/stream | thrpt | 10 | 1.415 | ±0.020 | ops/s | 
| orgjson/stream | thrpt | 10 | 0.753 | ±0.023 | ops/s | 

# JMH: Deserialization - 50 payloads - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 2706.188 | ±165.502 | ops/s | 
| genson/databind | thrpt | 10 | 3130.543 | ±126.756 | ops/s | 
| gson/databind | thrpt | 10 | 2217.147 | ±110.591 | ops/s | 
| jackson/databind | thrpt | 10 | 4281.640 | ±143.411 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 4885.400 | ±126.696 | ops/s | 
| genson/stream | thrpt | 10 | 3693.514 | ±188.326 | ops/s | 
| gson/stream | thrpt | 10 | 2336.521 | ±154.665 | ops/s | 
| jackson/stream | thrpt | 10 | 5035.051 | ±323.789 | ops/s | 
| jsonio/stream | thrpt | 10 | 1037.011 | ±79.722 | ops/s | 
| jsonp/stream | thrpt | 10 | 591.739 | ±29.760 | ops/s | 
| orgjson/stream | thrpt | 10 | 889.815 | ±76.433 | ops/s | 

# JMH: Deserialization - 50 payloads - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 453.237 | ±7.022 | ops/s | 
| genson/databind | thrpt | 10 | 470.701 | ±5.512 | ops/s | 
| gson/databind | thrpt | 10 | 318.802 | ±2.326 | ops/s | 
| jackson/databind | thrpt | 10 | 600.359 | ±10.277 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 676.269 | ±18.388 | ops/s | 
| genson/stream | thrpt | 10 | 524.787 | ±5.607 | ops/s | 
| gson/stream | thrpt | 10 | 332.637 | ±2.557 | ops/s | 
| jackson/stream | thrpt | 10 | 652.031 | ±11.032 | ops/s | 
| jsonio/stream | thrpt | 10 | 146.102 | ±2.171 | ops/s | 
| jsonp/stream | thrpt | 10 | 208.346 | ±3.196 | ops/s | 
| orgjson/stream | thrpt | 10 | 143.680 | ±1.084 | ops/s | 

# JMH: Deserialization - 50 payloads - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 46.427 | ±0.519 | ops/s | 
| genson/databind | thrpt | 10 | 48.997 | ±0.728 | ops/s | 
| gson/databind | thrpt | 10 | 33.835 | ±0.676 | ops/s | 
| jackson/databind | thrpt | 10 | 62.160 | ±0.702 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 69.934 | ±1.981 | ops/s | 
| genson/stream | thrpt | 10 | 51.846 | ±3.091 | ops/s | 
| gson/stream | thrpt | 10 | 34.544 | ±1.103 | ops/s | 
| jackson/stream | thrpt | 10 | 66.880 | ±0.477 | ops/s | 
| jsonio/stream | thrpt | 10 | 14.600 | ±0.154 | ops/s | 
| jsonp/stream | thrpt | 10 | 27.541 | ±0.439 | ops/s | 
| orgjson/stream | thrpt | 10 | 15.332 | ±0.193 | ops/s | 

# JMH: Deserialization - 50 payloads - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 4.389 | ±0.195 | ops/s | 
| genson/databind | thrpt | 10 | 4.850 | ±0.053 | ops/s | 
| gson/databind | thrpt | 10 | 3.404 | ±0.099 | ops/s | 
| jackson/databind | thrpt | 10 | 6.148 | ±0.176 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 7.050 | ±0.174 | ops/s | 
| genson/stream | thrpt | 10 | 5.544 | ±0.049 | ops/s | 
| gson/stream | thrpt | 10 | 3.407 | ±0.039 | ops/s | 
| jackson/stream | thrpt | 10 | 6.566 | ±0.133 | ops/s | 
| jsonio/stream | thrpt | 10 | 1.441 | ±0.033 | ops/s | 
| jsonp/stream | thrpt | 10 | 2.852 | ±0.035 | ops/s | 
| orgjson/stream | thrpt | 10 | 1.490 | ±0.094 | ops/s | 

# JMH: Serialization - 1 payloads - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 418712.703 | ±5060.840 | ops/s | 
| genson/databind | thrpt | 10 | 220775.744 | ±59946.633 | ops/s | 
| gson/databind | thrpt | 10 | 129886.182 | ±4575.634 | ops/s | 
| jackson/databind | thrpt | 10 | 358018.620 | ±7455.725 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 301782.420 | ±79973.833 | ops/s | 
| genson/stream | thrpt | 10 | 194097.459 | ±1843.536 | ops/s | 
| gson/stream | thrpt | 10 | 82635.129 | ±7193.811 | ops/s | 
| jackson/stream | thrpt | 10 | 428240.059 | ±8639.403 | ops/s | 
| jsonio/stream | thrpt | 10 | 65287.879 | ±1868.888 | ops/s | 
| jsonp/stream | thrpt | 10 | 38580.465 | ±401.071 | ops/s | 
| orgjson/stream | thrpt | 10 | 59308.469 | ±1272.512 | ops/s | 

# JMH: Serialization - 1 payloads - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 39679.586 | ±2916.221 | ops/s | 
| genson/databind | thrpt | 10 | 29757.854 | ±141.512 | ops/s | 
| gson/databind | thrpt | 10 | 14823.668 | ±376.476 | ops/s | 
| jackson/databind | thrpt | 10 | 42207.244 | ±638.858 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 42420.352 | ±748.517 | ops/s | 
| genson/stream | thrpt | 10 | 27768.767 | ±374.064 | ops/s | 
| gson/stream | thrpt | 10 | 7847.813 | ±62.811 | ops/s | 
| jackson/stream | thrpt | 10 | 45391.513 | ±423.384 | ops/s | 
| jsonio/stream | thrpt | 10 | 8828.913 | ±228.711 | ops/s | 
| jsonp/stream | thrpt | 10 | 13004.409 | ±185.596 | ops/s | 
| orgjson/stream | thrpt | 10 | 5908.906 | ±54.980 | ops/s | 

# JMH: Serialization - 1 payloads - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 2149.163 | ±22.617 | ops/s | 
| genson/databind | thrpt | 10 | 3005.194 | ±65.960 | ops/s | 
| gson/databind | thrpt | 10 | 1548.673 | ±73.449 | ops/s | 
| jackson/databind | thrpt | 10 | 4133.154 | ±104.012 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 4099.362 | ±95.626 | ops/s | 
| genson/stream | thrpt | 10 | 2771.122 | ±29.587 | ops/s | 
| gson/stream | thrpt | 10 | 855.364 | ±77.373 | ops/s | 
| jackson/stream | thrpt | 10 | 4237.142 | ±71.057 | ops/s | 
| jsonio/stream | thrpt | 10 | 935.768 | ±20.076 | ops/s | 
| jsonp/stream | thrpt | 10 | 1968.977 | ±163.647 | ops/s | 
| orgjson/stream | thrpt | 10 | 577.260 | ±9.762 | ops/s | 

# JMH: Serialization - 1 payloads - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 181.894 | ±2.804 | ops/s | 
| genson/databind | thrpt | 10 | 265.713 | ±4.611 | ops/s | 
| gson/databind | thrpt | 10 | 150.347 | ±2.833 | ops/s | 
| jackson/databind | thrpt | 10 | 303.934 | ±6.111 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 307.356 | ±4.956 | ops/s | 
| genson/stream | thrpt | 10 | 252.277 | ±4.928 | ops/s | 
| gson/stream | thrpt | 10 | 79.764 | ±1.346 | ops/s | 
| jackson/stream | thrpt | 10 | 398.849 | ±4.572 | ops/s | 
| jsonio/stream | thrpt | 10 | 88.706 | ±1.615 | ops/s | 
| jsonp/stream | thrpt | 10 | 185.616 | ±13.388 | ops/s | 
| orgjson/stream | thrpt | 10 | 55.409 | ±0.591 | ops/s | 

# JMH: Serialization - 10 payloads - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 38024.106 | ±3959.418 | ops/s | 
| genson/databind | thrpt | 10 | 24093.922 | ±1412.947 | ops/s | 
| gson/databind | thrpt | 10 | 13151.671 | ±107.329 | ops/s | 
| jackson/databind | thrpt | 10 | 35310.376 | ±240.810 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 33309.992 | ±999.605 | ops/s | 
| genson/stream | thrpt | 10 | 18960.025 | ±258.192 | ops/s | 
| gson/stream | thrpt | 10 | 8292.572 | ±833.050 | ops/s | 
| jackson/stream | thrpt | 10 | 42073.065 | ±1262.298 | ops/s | 
| jsonio/stream | thrpt | 10 | 6629.603 | ±43.096 | ops/s | 
| jsonp/stream | thrpt | 10 | 3781.418 | ±102.150 | ops/s | 
| orgjson/stream | thrpt | 10 | 5902.346 | ±272.626 | ops/s | 

# JMH: Serialization - 10 payloads - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 2353.956 | ±60.495 | ops/s | 
| genson/databind | thrpt | 10 | 2666.227 | ±82.948 | ops/s | 
| gson/databind | thrpt | 10 | 1387.697 | ±61.627 | ops/s | 
| jackson/databind | thrpt | 10 | 3657.040 | ±121.563 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 3948.164 | ±316.028 | ops/s | 
| genson/stream | thrpt | 10 | 2579.813 | ±65.627 | ops/s | 
| gson/stream | thrpt | 10 | 845.931 | ±75.113 | ops/s | 
| jackson/stream | thrpt | 10 | 4179.606 | ±35.641 | ops/s | 
| jsonio/stream | thrpt | 10 | 924.563 | ±8.762 | ops/s | 
| jsonp/stream | thrpt | 10 | 1304.504 | ±9.183 | ops/s | 
| orgjson/stream | thrpt | 10 | 595.417 | ±5.568 | ops/s | 

# JMH: Serialization - 10 payloads - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 193.759 | ±3.395 | ops/s | 
| genson/databind | thrpt | 10 | 256.003 | ±10.231 | ops/s | 
| gson/databind | thrpt | 10 | 144.764 | ±3.423 | ops/s | 
| jackson/databind | thrpt | 10 | 367.369 | ±3.845 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 369.257 | ±6.416 | ops/s | 
| genson/stream | thrpt | 10 | 248.343 | ±9.474 | ops/s | 
| gson/stream | thrpt | 10 | 82.079 | ±6.794 | ops/s | 
| jackson/stream | thrpt | 10 | 392.366 | ±5.998 | ops/s | 
| jsonio/stream | thrpt | 10 | 90.874 | ±0.944 | ops/s | 
| jsonp/stream | thrpt | 10 | 166.229 | ±14.379 | ops/s | 
| orgjson/stream | thrpt | 10 | 51.767 | ±3.547 | ops/s | 

# JMH: Serialization - 10 payloads - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 14.892 | ±0.701 | ops/s | 
| genson/databind | thrpt | 10 | 21.295 | ±0.724 | ops/s | 
| gson/databind | thrpt | 10 | 12.596 | ±0.705 | ops/s | 
| jackson/databind | thrpt | 10 | 24.553 | ±1.279 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 26.052 | ±1.792 | ops/s | 
| genson/stream | thrpt | 10 | 21.679 | ±1.258 | ops/s | 
| gson/stream | thrpt | 10 | 7.206 | ±0.417 | ops/s | 
| jackson/stream | thrpt | 10 | 31.638 | ±1.465 | ops/s | 
| jsonio/stream | thrpt | 10 | 7.822 | ±0.325 | ops/s | 
| jsonp/stream | thrpt | 10 | 14.271 | ±1.155 | ops/s | 
| orgjson/stream | thrpt | 10 | 5.140 | ±0.474 | ops/s | 

# JMH: Serialization - 100 payloads - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 2566.020 | ±30.955 | ops/s | 
| genson/databind | thrpt | 10 | 2377.879 | ±16.817 | ops/s | 
| gson/databind | thrpt | 10 | 1293.897 | ±55.682 | ops/s | 
| jackson/databind | thrpt | 10 | 3357.894 | ±70.548 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 3380.782 | ±56.622 | ops/s | 
| genson/stream | thrpt | 10 | 1858.092 | ±25.481 | ops/s | 
| gson/stream | thrpt | 10 | 855.919 | ±14.238 | ops/s | 
| jackson/stream | thrpt | 10 | 3968.895 | ±65.734 | ops/s | 
| jsonio/stream | thrpt | 10 | 644.945 | ±8.732 | ops/s | 
| jsonp/stream | thrpt | 10 | 381.423 | ±3.507 | ops/s | 
| orgjson/stream | thrpt | 10 | 585.947 | ±11.097 | ops/s | 

# JMH: Serialization - 100 payloads - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 236.603 | ±3.463 | ops/s | 
| genson/databind | thrpt | 10 | 246.789 | ±3.084 | ops/s | 
| gson/databind | thrpt | 10 | 131.726 | ±0.873 | ops/s | 
| jackson/databind | thrpt | 10 | 355.580 | ±4.903 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 362.138 | ±5.274 | ops/s | 
| genson/stream | thrpt | 10 | 243.707 | ±15.155 | ops/s | 
| gson/stream | thrpt | 10 | 74.595 | ±3.888 | ops/s | 
| jackson/stream | thrpt | 10 | 425.092 | ±7.642 | ops/s | 
| jsonio/stream | thrpt | 10 | 82.171 | ±1.326 | ops/s | 
| jsonp/stream | thrpt | 10 | 116.064 | ±3.803 | ops/s | 
| orgjson/stream | thrpt | 10 | 55.876 | ±0.701 | ops/s | 

# JMH: Serialization - 100 payloads - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 18.270 | ±0.257 | ops/s | 
| genson/databind | thrpt | 10 | 22.477 | ±0.793 | ops/s | 
| gson/databind | thrpt | 10 | 13.725 | ±0.125 | ops/s | 
| jackson/databind | thrpt | 10 | 30.720 | ±0.574 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 31.114 | ±0.663 | ops/s | 
| genson/stream | thrpt | 10 | 23.495 | ±0.666 | ops/s | 
| gson/stream | thrpt | 10 | 7.680 | ±0.056 | ops/s | 
| jackson/stream | thrpt | 10 | 34.796 | ±0.435 | ops/s | 
| jsonio/stream | thrpt | 10 | 9.073 | ±0.114 | ops/s | 
| jsonp/stream | thrpt | 10 | 15.101 | ±0.342 | ops/s | 
| orgjson/stream | thrpt | 10 | 5.460 | ±0.046 | ops/s | 

# JMH: Serialization - 100 payloads - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 1.678 | ±0.037 | ops/s | 
| genson/databind | thrpt | 10 | 2.360 | ±0.071 | ops/s | 
| gson/databind | thrpt | 10 | 1.404 | ±0.054 | ops/s | 
| jackson/databind | thrpt | 10 | 2.737 | ±0.062 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 2.621 | ±0.040 | ops/s | 
| genson/stream | thrpt | 10 | 2.357 | ±0.034 | ops/s | 
| gson/stream | thrpt | 10 | 0.798 | ±0.055 | ops/s | 
| jackson/stream | thrpt | 10 | 3.606 | ±0.272 | ops/s | 
| jsonio/stream | thrpt | 10 | 0.861 | ±0.011 | ops/s | 
| jsonp/stream | thrpt | 10 | 0.506 | ±0.033 | ops/s | 
| orgjson/stream | thrpt | 10 | 0.064 | ±0.001 | ops/s | 

# JMH: Serialization - 50 payloads - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 4732.860 | ±236.062 | ops/s | 
| genson/databind | thrpt | 10 | 4276.270 | ±140.342 | ops/s | 
| gson/databind | thrpt | 10 | 2358.972 | ±135.801 | ops/s | 
| jackson/databind | thrpt | 10 | 5972.696 | ±159.371 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 6070.417 | ±89.086 | ops/s | 
| genson/stream | thrpt | 10 | 3688.421 | ±140.487 | ops/s | 
| gson/stream | thrpt | 10 | 1641.960 | ±130.910 | ops/s | 
| jackson/stream | thrpt | 10 | 7974.223 | ±153.590 | ops/s | 
| jsonio/stream | thrpt | 10 | 1287.562 | ±54.017 | ops/s | 
| jsonp/stream | thrpt | 10 | 768.993 | ±4.285 | ops/s | 
| orgjson/stream | thrpt | 10 | 1176.175 | ±15.336 | ops/s | 

# JMH: Serialization - 50 payloads - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 499.919 | ±7.584 | ops/s | 
| genson/databind | thrpt | 10 | 531.510 | ±2.750 | ops/s | 
| gson/databind | thrpt | 10 | 287.275 | ±4.935 | ops/s | 
| jackson/databind | thrpt | 10 | 767.416 | ±40.634 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 781.967 | ±11.622 | ops/s | 
| genson/stream | thrpt | 10 | 498.609 | ±3.737 | ops/s | 
| gson/stream | thrpt | 10 | 171.312 | ±1.236 | ops/s | 
| jackson/stream | thrpt | 10 | 815.915 | ±14.687 | ops/s | 
| jsonio/stream | thrpt | 10 | 175.425 | ±2.806 | ops/s | 
| jsonp/stream | thrpt | 10 | 233.594 | ±15.283 | ops/s | 
| orgjson/stream | thrpt | 10 | 113.977 | ±0.984 | ops/s | 

# JMH: Serialization - 50 payloads - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 36.783 | ±0.732 | ops/s | 
| genson/databind | thrpt | 10 | 47.351 | ±0.785 | ops/s | 
| gson/databind | thrpt | 10 | 26.815 | ±1.126 | ops/s | 
| jackson/databind | thrpt | 10 | 63.217 | ±0.501 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 63.176 | ±0.734 | ops/s | 
| genson/stream | thrpt | 10 | 46.226 | ±1.674 | ops/s | 
| gson/stream | thrpt | 10 | 16.605 | ±0.103 | ops/s | 
| jackson/stream | thrpt | 10 | 70.022 | ±1.045 | ops/s | 
| jsonio/stream | thrpt | 10 | 18.405 | ±0.214 | ops/s | 
| jsonp/stream | thrpt | 10 | 28.089 | ±0.518 | ops/s | 
| orgjson/stream | thrpt | 10 | 10.941 | ±0.138 | ops/s | 

# JMH: Serialization - 50 payloads - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| fastjson/databind | thrpt | 10 | 3.356 | ±0.063 | ops/s | 
| genson/databind | thrpt | 10 | 4.722 | ±0.085 | ops/s | 
| gson/databind | thrpt | 10 | 2.790 | ±0.188 | ops/s | 
| jackson/databind | thrpt | 10 | 5.288 | ±0.067 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 5.408 | ±0.061 | ops/s | 
| genson/stream | thrpt | 10 | 4.651 | ±0.073 | ops/s | 
| gson/stream | thrpt | 10 | 1.636 | ±0.129 | ops/s | 
| jackson/stream | thrpt | 10 | 6.939 | ±0.153 | ops/s | 
| jsonio/stream | thrpt | 10 | 1.724 | ±0.036 | ops/s | 
| jsonp/stream | thrpt | 10 | 3.171 | ±0.176 | ops/s | 
| orgjson/stream | thrpt | 10 | 1.087 | ±0.022 | ops/s | 

