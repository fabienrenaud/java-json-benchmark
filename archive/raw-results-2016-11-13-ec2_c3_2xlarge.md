2016-11-13

This is a special run, computed on an Amazon EC2 c3.2xlarge instance.

# Graphs

![json deserialization performance](https://docs.google.com/spreadsheets/d/14sKgX2ZXNxcNPyyjno7ky77WB0hqek0thjYE1yeg37g/pubchart?oid=746064058&format=image)

![json serialization performance](https://docs.google.com/spreadsheets/d/14sKgX2ZXNxcNPyyjno7ky77WB0hqek0thjYE1yeg37g/pubchart?oid=1130150523&format=image)

# JMH: Deserialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 10 | 243978.431 | ±91684.232 | ops/s | 
| dsljson/databind | thrpt | 10 | 1312151.392 | ±678286.352 | ops/s | 
| fastjson/databind | thrpt | 10 | 487146.405 | ±67158.025 | ops/s | 
| flexjson/databind | thrpt | 10 | 132504.150 | ±68107.700 | ops/s | 
| genson/databind | thrpt | 10 | 494582.314 | ±9856.459 | ops/s | 
| gson/databind | thrpt | 10 | 358060.768 | ±15921.628 | ops/s | 
| jackson/databind | thrpt | 10 | 751715.928 | ±12262.600 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 847362.818 | ±84470.284 | ops/s | 
| jodd/databind | thrpt | 10 | 687715.688 | ±28588.541 | ops/s | 
| johnzon/databind | thrpt | 10 | 178285.286 | ±11771.769 | ops/s | 
| jsonsmart/databind | thrpt | 10 | 538659.666 | ±9015.046 | ops/s | 
| logansquare/databind | thrpt | 10 | 432846.763 | ±16864.741 | ops/s | 
| genson/stream | thrpt | 10 | 573241.372 | ±31605.163 | ops/s | 
| gson/stream | thrpt | 10 | 414590.717 | ±10610.422 | ops/s | 
| jackson/stream | thrpt | 10 | 733057.342 | ±12916.728 | ops/s | 
| javaxjson/stream | thrpt | 10 | 27718.453 | ±6820.943 | ops/s | 
| jsonio/stream | thrpt | 10 | 191406.430 | ±71574.840 | ops/s | 
| jsonsimple/stream | thrpt | 10 | 164914.928 | ±9856.212 | ops/s | 
| nanojson/stream | thrpt | 10 | 158856.184 | ±4519.060 | ops/s | 
| orgjson/stream | thrpt | 10 | 128782.166 | ±63480.500 | ops/s | 

# JMH: Deserialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 10 | 49878.200 | ±2603.681 | ops/s | 
| dsljson/databind | thrpt | 10 | 170772.312 | ±11101.628 | ops/s | 
| fastjson/databind | thrpt | 10 | 72081.176 | ±1126.944 | ops/s | 
| flexjson/databind | thrpt | 10 | 14912.096 | ±7843.007 | ops/s | 
| genson/databind | thrpt | 10 | 67956.156 | ±875.458 | ops/s | 
| gson/databind | thrpt | 10 | 46825.521 | ±1782.257 | ops/s | 
| jackson/databind | thrpt | 10 | 91807.955 | ±2123.342 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 96055.126 | ±1991.825 | ops/s | 
| jodd/databind | thrpt | 10 | 70236.824 | ±1857.131 | ops/s | 
| johnzon/databind | thrpt | 10 | 21492.472 | ±1026.871 | ops/s | 
| jsonsmart/databind | thrpt | 10 | 62573.148 | ±1256.605 | ops/s | 
| logansquare/databind | thrpt | 10 | 89929.929 | ±495.565 | ops/s | 
| genson/stream | thrpt | 10 | 73650.043 | ±1412.978 | ops/s | 
| gson/stream | thrpt | 10 | 48753.362 | ±1076.049 | ops/s | 
| jackson/stream | thrpt | 10 | 104223.331 | ±2644.422 | ops/s | 
| javaxjson/stream | thrpt | 10 | 21979.201 | ±467.587 | ops/s | 
| jsonio/stream | thrpt | 10 | 29024.199 | ±486.241 | ops/s | 
| jsonsimple/stream | thrpt | 10 | 23194.858 | ±2134.671 | ops/s | 
| nanojson/stream | thrpt | 10 | 41820.912 | ±1324.692 | ops/s | 
| orgjson/stream | thrpt | 10 | 22136.055 | ±4067.953 | ops/s | 

# JMH: Deserialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 10 | 5844.744 | ±67.023 | ops/s | 
| dsljson/databind | thrpt | 10 | 17058.095 | ±229.344 | ops/s | 
| fastjson/databind | thrpt | 10 | 6866.559 | ±145.297 | ops/s | 
| flexjson/databind | thrpt | 10 | 1588.662 | ±180.038 | ops/s | 
| genson/databind | thrpt | 10 | 6920.429 | ±99.106 | ops/s | 
| gson/databind | thrpt | 10 | 4847.519 | ±84.476 | ops/s | 
| jackson/databind | thrpt | 10 | 9155.991 | ±249.017 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 9778.254 | ±368.648 | ops/s | 
| jodd/databind | thrpt | 10 | 6940.443 | ±141.095 | ops/s | 
| johnzon/databind | thrpt | 10 | 2008.561 | ±127.911 | ops/s | 
| jsonsmart/databind | thrpt | 10 | 6245.864 | ±115.520 | ops/s | 
| logansquare/databind | thrpt | 10 | 9295.204 | ±119.743 | ops/s | 
| genson/stream | thrpt | 10 | 7521.814 | ±62.140 | ops/s | 
| gson/stream | thrpt | 10 | 4823.638 | ±91.476 | ops/s | 
| jackson/stream | thrpt | 10 | 9972.815 | ±357.630 | ops/s | 
| javaxjson/stream | thrpt | 10 | 3906.310 | ±260.633 | ops/s | 
| jsonio/stream | thrpt | 10 | 2874.474 | ±141.111 | ops/s | 
| jsonsimple/stream | thrpt | 10 | 2357.285 | ±23.122 | ops/s | 
| nanojson/stream | thrpt | 10 | 4688.080 | ±105.262 | ops/s | 
| orgjson/stream | thrpt | 10 | 2217.442 | ±159.703 | ops/s | 

# JMH: Deserialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 10 | 227.924 | ±198.243 | ops/s | 
| dsljson/databind | thrpt | 10 | 1328.392 | ±143.080 | ops/s | 
| fastjson/databind | thrpt | 10 | 494.069 | ±237.579 | ops/s | 
| flexjson/databind | thrpt | 10 | 111.707 | ±44.918 | ops/s | 
| genson/databind | thrpt | 10 | 612.072 | ±14.971 | ops/s | 
| gson/databind | thrpt | 10 | 402.318 | ±8.367 | ops/s | 
| jackson/databind | thrpt | 10 | 778.488 | ±21.546 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 859.704 | ±12.822 | ops/s | 
| jodd/databind | thrpt | 10 | 546.769 | ±10.769 | ops/s | 
| johnzon/databind | thrpt | 10 | 134.956 | ±20.175 | ops/s | 
| jsonsmart/databind | thrpt | 10 | 538.088 | ±16.836 | ops/s | 
| logansquare/databind | thrpt | 10 | 789.345 | ±10.620 | ops/s | 
| genson/stream | thrpt | 10 | 658.755 | ±31.809 | ops/s | 
| gson/stream | thrpt | 10 | 413.278 | ±8.276 | ops/s | 
| jackson/stream | thrpt | 10 | 864.216 | ±30.154 | ops/s | 
| javaxjson/stream | thrpt | 10 | 217.705 | ±51.674 | ops/s | 
| jsonio/stream | thrpt | 10 | 178.196 | ±40.295 | ops/s | 
| jsonsimple/stream | thrpt | 10 | 159.044 | ±24.937 | ops/s | 
| nanojson/stream | thrpt | 10 | 309.823 | ±62.517 | ops/s | 
| orgjson/stream | thrpt | 10 | 155.403 | ±27.911 | ops/s | 

# JMH: Serialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 10 | 321801.189 | ±19792.029 | ops/s | 
| dsljson/databind | thrpt | 10 | 1443606.113 | ±289036.239 | ops/s | 
| fastjson/databind | thrpt | 10 | 1184100.375 | ±33587.832 | ops/s | 
| flexjson/databind | thrpt | 10 | 1697.710 | ±523.699 | ops/s | 
| genson/databind | thrpt | 10 | 587392.922 | ±20155.446 | ops/s | 
| gson/databind | thrpt | 10 | 399658.806 | ±10351.056 | ops/s | 
| jackson/databind | thrpt | 10 | 1224504.528 | ±25330.291 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 1334228.394 | ±50136.103 | ops/s | 
| jodd/databind | thrpt | 10 | 356989.358 | ±29183.513 | ops/s | 
| johnzon/databind | thrpt | 10 | 452701.226 | ±12654.854 | ops/s | 
| jsonsmart/databind | thrpt | 10 | 559193.559 | ±20738.135 | ops/s | 
| logansquare/databind | thrpt | 10 | 1113999.484 | ±385218.583 | ops/s | 
| genson/stream | thrpt | 10 | 570951.689 | ±15635.903 | ops/s | 
| gson/stream | thrpt | 10 | 265585.444 | ±5542.378 | ops/s | 
| jackson/stream | thrpt | 10 | 1253303.517 | ±21842.152 | ops/s | 
| javaxjson/stream | thrpt | 10 | 4990.003 | ±1420.702 | ops/s | 
| jsonio/stream | thrpt | 10 | 165085.732 | ±32458.067 | ops/s | 
| jsonsimple/stream | thrpt | 10 | 169043.493 | ±40368.030 | ops/s | 
| nanojson/stream | thrpt | 10 | 567563.820 | ±26655.201 | ops/s | 
| orgjson/stream | thrpt | 10 | 188197.781 | ±3759.342 | ops/s | 

# JMH: Serialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 10 | 44671.098 | ±1390.564 | ops/s | 
| dsljson/databind | thrpt | 10 | 209844.359 | ±24886.041 | ops/s | 
| fastjson/databind | thrpt | 10 | 103284.481 | ±2472.620 | ops/s | 
| flexjson/databind | thrpt | 10 | 575.524 | ±214.524 | ops/s | 
| genson/databind | thrpt | 10 | 94934.784 | ±4110.283 | ops/s | 
| gson/databind | thrpt | 10 | 46478.758 | ±1327.766 | ops/s | 
| jackson/databind | thrpt | 10 | 143710.208 | ±6541.505 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 152076.404 | ±1764.655 | ops/s | 
| jodd/databind | thrpt | 10 | 41628.478 | ±548.133 | ops/s | 
| johnzon/databind | thrpt | 10 | 52985.188 | ±1103.967 | ops/s | 
| jsonsmart/databind | thrpt | 10 | 64922.470 | ±2903.760 | ops/s | 
| logansquare/databind | thrpt | 10 | 151626.243 | ±1593.529 | ops/s | 
| genson/stream | thrpt | 10 | 74758.921 | ±3969.200 | ops/s | 
| gson/stream | thrpt | 10 | 27397.939 | ±989.187 | ops/s | 
| jackson/stream | thrpt | 10 | 153933.057 | ±1251.627 | ops/s | 
| javaxjson/stream | thrpt | 10 | 291.792 | ±28.497 | ops/s | 
| jsonio/stream | thrpt | 10 | 28818.354 | ±5085.365 | ops/s | 
| jsonsimple/stream | thrpt | 10 | 17634.469 | ±996.206 | ops/s | 
| nanojson/stream | thrpt | 10 | 70760.371 | ±786.845 | ops/s | 
| orgjson/stream | thrpt | 10 | 18509.150 | ±1453.549 | ops/s | 

# JMH: Serialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 10 | 4610.647 | ±52.331 | ops/s | 
| dsljson/databind | thrpt | 10 | 21273.087 | ±602.781 | ops/s | 
| fastjson/databind | thrpt | 10 | 6362.456 | ±411.790 | ops/s | 
| flexjson/databind | thrpt | 10 | 179.353 | ±65.912 | ops/s | 
| genson/databind | thrpt | 10 | 10115.730 | ±233.287 | ops/s | 
| gson/databind | thrpt | 10 | 4453.182 | ±178.679 | ops/s | 
| jackson/databind | thrpt | 10 | 14824.252 | ±287.191 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 15310.619 | ±143.594 | ops/s | 
| jodd/databind | thrpt | 10 | 4084.718 | ±54.109 | ops/s | 
| johnzon/databind | thrpt | 10 | 5986.025 | ±123.570 | ops/s | 
| jsonsmart/databind | thrpt | 10 | 6577.282 | ±163.549 | ops/s | 
| logansquare/databind | thrpt | 10 | 16255.874 | ±1137.186 | ops/s | 
| genson/stream | thrpt | 10 | 8217.844 | ±159.745 | ops/s | 
| gson/stream | thrpt | 10 | 2608.911 | ±90.633 | ops/s | 
| jackson/stream | thrpt | 10 | 15125.415 | ±618.279 | ops/s | 
| javaxjson/stream | thrpt | 10 | 32.290 | ±1.701 | ops/s | 
| jsonio/stream | thrpt | 10 | 3196.824 | ±373.451 | ops/s | 
| jsonsimple/stream | thrpt | 10 | 1835.161 | ±102.632 | ops/s | 
| nanojson/stream | thrpt | 10 | 7406.120 | ±40.229 | ops/s | 
| orgjson/stream | thrpt | 10 | 1795.013 | ±52.189 | ops/s | 

# JMH: Serialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units | 
|-----------|------|-----|-------|-------|-------|
| boon/databind | thrpt | 10 | 372.242 | ±7.398 | ops/s | 
| dsljson/databind | thrpt | 10 | 2096.238 | ±31.693 | ops/s | 
| fastjson/databind | thrpt | 10 | 571.761 | ±9.325 | ops/s | 
| flexjson/databind | thrpt | 10 | 50.866 | ±17.720 | ops/s | 
| genson/databind | thrpt | 10 | 969.532 | ±65.440 | ops/s | 
| gson/databind | thrpt | 10 | 442.880 | ±18.704 | ops/s | 
| jackson/databind | thrpt | 10 | 1479.421 | ±43.514 | ops/s | 
| jackson_afterburner/databind | thrpt | 10 | 1412.699 | ±54.722 | ops/s | 
| jodd/databind | thrpt | 10 | 375.937 | ±51.992 | ops/s | 
| johnzon/databind | thrpt | 10 | 578.439 | ±25.960 | ops/s | 
| jsonsmart/databind | thrpt | 10 | 591.533 | ±45.926 | ops/s | 
| logansquare/databind | thrpt | 10 | 1420.594 | ±20.670 | ops/s | 
| genson/stream | thrpt | 10 | 799.973 | ±5.046 | ops/s | 
| gson/stream | thrpt | 10 | 269.559 | ±2.538 | ops/s | 
| jackson/stream | thrpt | 10 | 1500.171 | ±20.036 | ops/s | 
| javaxjson/stream | thrpt | 10 | 3.182 | ±0.171 | ops/s | 
| jsonio/stream | thrpt | 10 | 310.390 | ±16.143 | ops/s | 
| jsonsimple/stream | thrpt | 10 | 140.905 | ±7.713 | ops/s | 
| nanojson/stream | thrpt | 10 | 737.302 | ±23.759 | ops/s | 
| orgjson/stream | thrpt | 10 | 126.012 | ±8.165 | ops/s | 

# Environment

## JMH configuration

    # JMH 1.15 (released 44 days ago)
    # VM version: JDK 1.8.0_111, VM 25.111-b15
    # VM invoker: /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.111-0.b15.el6_8.x86_64/jre/bin/java
    # VM options: -XX:+AggressiveOpts -Xms2G -Xmx2G
    # Warmup: 3 iterations, 1 s each
    # Measurement: 5 iterations, 2 s each
    # Timeout: 10 min per iteration
    # Threads: 16 threads, will synchronize iterations
    # Benchmark mode: Throughput, ops/time

## Hardware

Amazon EC2 instance: c3.2xlarge
    
    H/W path    Device  Class      Description
    ==========================================
                        system     HVM domU
    /0                  bus        Motherboard
    /0/0                memory     96KiB BIOS
    /0/1                processor  Intel(R) Xeon(R) CPU E5-2680 v2 @ 2.80GHz
    /0/2                processor  CPU
    /0/3                processor  CPU
    /0/4                processor  CPU
    /0/5                processor  CPU
    /0/6                processor  CPU
    /0/7                processor  CPU
    /0/8                processor  CPU
    /0/9                memory     System Memory
    /0/9/0              memory     15GiB DIMM RAM
    /0/9/1              memory     15GiB DIMM RAM
    /0/a                memory     96KiB BIOS
    /0/b                processor  CPU
    /0/c                processor  CPU
    /0/d                processor  CPU
    /0/e                processor  CPU
    /0/f                processor  CPU
    /0/10               processor  CPU
    /0/11               processor  CPU
    /0/12               processor  CPU
    /0/13               memory     System Memory
    /0/14               memory
    /0/15               memory
    /0/100              bridge     440FX - 82441FX PMC [Natoma]
    /0/100/1            bridge     82371SB PIIX3 ISA [Natoma/Triton II]
    /0/100/1.1          storage    82371SB PIIX3 IDE [Natoma/Triton II]
    /0/100/1.3          bridge     82371AB/EB/MB PIIX4 ACPI
    /0/100/2            display    GD 5446
    /0/100/3    eth0    network    82599 Ethernet Controller Virtual Function
    /0/100/1f           generic    Xen Platform Device