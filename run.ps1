$jar = "build\libs\app.jar"
$heapSize = "2g"

if (-not (Test-Path env:JVM_OPTIONS)) {
    $jvmOpts = "-server -XX:+AggressiveOpts -Xms${heapSize} -Xmx${heapSize}"
} else {
    $jvmOpts = "$env:JVM_OPTIONS"
}
if (-not (Test-Path env:SEED)) {
    $env:SEED = Get-Random
}
if (-not (Test-Path env:SHADOW)) {
    Write-Host ".\gradlew clean build shadowJar"
    .\gradlew clean build shadowJar --stacktrace
}

$flattenedArgs = $args | Out-String
$flattenedArgs = $flattenedArgs.replace("`r`n", " ")
Write-Host "java $jvmOpts -jar $jar $flattenedArgs"
Start-Process java -ArgumentList ("-jar", $jar, $flattenedArgs) -Wait -NoNewWindow

