#!/bin/bash
set -e

for f in $(ls *.txt); do
  fnoxt=${f/.txt/}
  name=$(echo $fnoxt | cut -d- -f1)
  n=$(echo $fnoxt | cut -d- -f2)
  s=$(echo $fnoxt | cut -d- -f3)

  title=""
  case $name in
    "deser") title="Deserialization" ;;
    "ser") title="Serialization" ;;
    *) echo "Unknow name: '$name"; exit 1 ;;
  esac

  title="$title - $n payloads - $s KB"
 
  echo "# JMH: $title"
  echo 
  tail -n30 $f | grep -A30 "Benchmark" | sed -E -e 's/± +/±/' | awk 'BEGIN { OFS=" | " } { print "",$1,$2,$3,$4,$5,$6,""; if ($1 == "Benchmark") { print "|-----------|------|-----|-------|-------|-------|"; } }' | sed -E -e 's/DatabindDeserialization\.([a-zA-Z_]+)/\1\/databind/g' -e 's/StreamDeserialization\.([a-zA-Z_]+)/\1\/stream/g' -e 's/DatabindSerialization\.([a-zA-Z_]+)/\1\/databind/g' -e 's/StreamSerialization\.([a-zA-Z_]+)/\1\/stream/g' -e 's/\| ± \|/±/g' -e 's/^ //g'
  echo
done

