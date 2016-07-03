#!/bin/bash
set -e

tail -n30 deser-1-1.txt | grep -A30 "Benchmark" | grep -v Benchmark | awk '{ print $1 }' | sed -E -e 's/DatabindDeserialization\.([a-zA-Z_]+)/\1\/databind/g' -e 's/StreamDeserialization\.([a-zA-Z_]+)/\1\/stream/g' > deser-names.tmp
tail -n30 ser-1-1.txt | grep -A30 "Benchmark" | grep -v Benchmark | awk '{ print $1 }' | sed -E -e 's/DatabindSerialization\.([a-zA-Z_]+)/\1\/databind/g' -e 's/StreamSerialization\.([a-zA-Z_]+)/\1\/stream/g' > ser-names.tmp

for f in $(ls *.txt); do
  tail -n30 "$f" | grep -A30 "Benchmark" | grep -v Benchmark | awk '{ print $4 }' > ${f/txt/tmp}
done

[[ ! -d csv ]] && mkdir csv
for n in 1 10 50 100; do
  printf "Test\tRaw 1k\tRaw 10k\tRaw 100k\tRaw 1m\n" > csv/deser-${n}.csv
  paste deser-names.tmp deser-$n-1.tmp deser-$n-10.tmp deser-$n-100.tmp deser-$n-1000.tmp >> csv/deser-${n}.csv
  
  printf "Test\tRaw 1k\tRaw 10k\tRaw 100k\tRaw 1m\n" > csv/ser-${n}.csv
  paste ser-names.tmp ser-$n-1.tmp ser-$n-10.tmp ser-$n-100.tmp ser-$n-1000.tmp >> csv/ser-${n}.csv
done

rm *.tmp
