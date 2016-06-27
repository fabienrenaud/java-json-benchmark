#!/bin/bash

mvn -q clean package && \
  java -server -XX:+AggressiveOpts -Xms2G -Xmx2G -jar target/benchmarks.jar
