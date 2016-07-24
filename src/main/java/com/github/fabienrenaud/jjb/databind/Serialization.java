package com.github.fabienrenaud.jjb.databind;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.fabienrenaud.jjb.JsonBench;
import org.openjdk.jmh.annotations.Benchmark;

public class Serialization extends JsonBench {

    @Benchmark
    @Override
    public Object gson() {
        return JSON_SOURCE.provider().gson().toJson(JSON_SOURCE.nextPojo());
    }

    @Benchmark
    @Override
    public Object jackson() throws JsonProcessingException {
        return JSON_SOURCE.provider().jackson().writeValueAsString(JSON_SOURCE.nextPojo());
    }

    @Benchmark
    @Override
    public Object jackson_afterburner() throws JsonProcessingException {
        return JSON_SOURCE.provider().jacksonAfterburner().writeValueAsString(JSON_SOURCE.nextPojo());
    }

    @Benchmark
    @Override
    public Object genson() {
        return JSON_SOURCE.provider().genson().serialize(JSON_SOURCE.nextPojo());
    }

    @Benchmark
    @Override
    public Object fastjson() {
        return JSON.toJSONString(JSON_SOURCE.nextPojo());
    }

    @Benchmark
    @Override
    public Object flexjson() {
        return JSON_SOURCE.provider().flexjsonSer().serialize(JSON_SOURCE.nextPojo());
    }

    @Benchmark
    @Override
    public Object boon() {
        return JSON_SOURCE.provider().boon().writeValueAsString(JSON_SOURCE.nextPojo());
    }

    @Benchmark
    @Override
    public Object johnson() {
        return JSON_SOURCE.provider().johnson().writeObjectAsString(JSON_SOURCE.nextPojo());
    }

    @Benchmark
    @Override
    public Object jsonsmart() throws Exception {
        StringBuilder b = new StringBuilder();
        net.minidev.json.JSONValue.writeJSONString(JSON_SOURCE.nextPojo(), b);
        return b.toString();
    }
}
