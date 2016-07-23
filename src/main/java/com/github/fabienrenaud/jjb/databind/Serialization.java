package com.github.fabienrenaud.jjb.databind;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.fabienrenaud.jjb.JsonBench;
import org.openjdk.jmh.annotations.Benchmark;

import static com.github.fabienrenaud.jjb.JsonUtils.*;

public class Serialization extends JsonBench {

    @Benchmark
    @Override
    public Object gson() {
        return GSON.toJson(JSON_SOURCE.nextPojo());
    }

    @Benchmark
    @Override
    public Object jackson() throws JsonProcessingException {
        return JACKSON.writeValueAsString(JSON_SOURCE.nextPojo());
    }

    @Benchmark
    @Override
    public Object jackson_afterburner() throws JsonProcessingException {
        return JACKSON.writeValueAsString(JSON_SOURCE.nextPojo());
    }

    @Benchmark
    @Override
    public Object genson() {
        return GENSON.serialize(JSON_SOURCE.nextPojo());
    }

    @Benchmark
    @Override
    public Object fastjson() {
        return JSON.toJSONString(JSON_SOURCE.nextPojo());
    }

    //    @Benchmark
    @Override
    public Object flexjson() {
        return FLEXJSON_SER.serialize(JSON_SOURCE.nextPojo());
    }

    @Benchmark
    @Override
    public Object boon() {
        return BOON.writeValueAsString(JSON_SOURCE.nextPojo());
    }

    @Benchmark
    @Override
    public Object johnson() {
        return JOHNSON.writeObjectAsString(JSON_SOURCE.nextPojo());
    }

    @Benchmark
    @Override
    public Object jsonsmart() throws Exception {
        StringBuilder b = new StringBuilder();
        net.minidev.json.JSONValue.writeJSONString(JSON_SOURCE.nextPojo(), b);
        return b.toString();
    }
}
