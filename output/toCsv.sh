#!/usr/bin/env bash
set -e

declare -A categories
categories=(
  [DatabindDeserialization]=deserialization-databind
  [DatabindDeserializationAndUse]=deserialization-databind-use
  [DatabindSerialization]=serialization-databind
  [StreamDeserialization]=deserialization-stream
  [StreamDeserializationAndUse]=deserialization-steam-use
  [StreamSerialization]=serialization-stream
)

cat results.txt | awk '{print $1,$4}' | tr ' ' ',' > tmp.txt

for k in ${!categories[@]}; do
  filename=${categories[$k]}".csv"
  head -n1 tmp.txt > $filename
  cat tmp.txt | grep "${k}\." | sed "s/${k}.//" >> $filename
done

head -n1 tmp.txt > deserialization.csv
cat tmp.txt \
  | grep "Deserialization" \
  | sed 's/DatabindDeserializationAndUse./databind+use\//' \
  | sed 's/DatabindDeserialization./databind\//' \
  | sed 's/StreamDeserializationAndUse./stream+use\//' \
  | sed 's/StreamDeserialization./stream\//' \
  >> deserialization.csv

cat tmp.txt | grep -v "Deserialization" \
  | sed 's/DatabindSerialization./databind\//' \
  | sed 's/StreamSerialization./stream\//' \
  > serialization.csv

rm tmp.txt
