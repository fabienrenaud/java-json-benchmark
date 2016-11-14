#!/bin/bash
set -e

echo $(date +%Y-%m-%d)
echo

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

  title="$title - $s KB"
 
  echo "# JMH: $title"
  echo 
  tail -n30 $f | grep -A30 "Benchmark" | sed -E -e 's/± +/±/' | \
    awk 'BEGIN { OFS=" | " } { print "",$1,$2,$3,$4,$5,$6,""; if ($1 == "Benchmark") { print "|-----------|------|-----|-------|-------|-------|"; } }' | \
    sed -E \
    -e 's/^.*databind\.Deserialization\.([a-zA-Z_]+)/| \1\/databind/g' \
    -e 's/^.*stream\.Deserialization\.([a-zA-Z_]+)/| \1\/stream/g' \
    -e 's/^.*databind\.Serialization\.([a-zA-Z_]+)/| \1\/databind/g' \
    -e 's/^.*stream\.Serialization\.([a-zA-Z_]+)/| \1\/stream/g' \
    -e 's/\| ± \|/±/g' \
    -e 's/^ //g'
  echo
done

