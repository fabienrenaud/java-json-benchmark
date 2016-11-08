#!/bin/bash
set -e

N=30

tail -n${N} deser-1-1.txt | grep -A${N} "Benchmark" | grep -v Benchmark | awk '{ print $1 }' | sed -E \
  -e 's/^.*databind\.Deserialization\.([a-zA-Z_]+)/\1\/databind/g' \
  -e 's/^.*stream\.Deserialization\.([a-zA-Z_]+)/\1\/stream/g' > deser-names.tmp
tail -n${N} ser-1-1.txt | grep -A${N} "Benchmark" | grep -v Benchmark | awk '{ print $1 }' | sed -E \
  -e 's/^.*databind\.Serialization\.([a-zA-Z_]+)/\1\/databind/g' \
  -e 's/^.*stream\.Serialization\.([a-zA-Z_]+)/\1\/stream/g' > ser-names.tmp

for f in $(ls *.txt); do
  tail -n${N} "$f" | grep -A${N} "Benchmark" | grep -v Benchmark | awk '{ print $4 }' > ${f/txt/tmp}
done

[[ ! -d csv ]] && mkdir csv
for n in 1; do
  printf "Test\tRaw 1k\tRaw 10k\tRaw 100k\tRaw 1m\n" > csv/deser-${n}.csv
  paste deser-names.tmp deser-$n-1.tmp deser-$n-10.tmp deser-$n-100.tmp deser-$n-1000.tmp >> csv/deser-${n}.csv
  
  printf "Test\tRaw 1k\tRaw 10k\tRaw 100k\tRaw 1m\n" > csv/ser-${n}.csv
  paste ser-names.tmp ser-$n-1.tmp ser-$n-10.tmp ser-$n-100.tmp ser-$n-1000.tmp >> csv/ser-${n}.csv
done

rm *.tmp
