package com.github.fabienrenaud.jjb;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.openjdk.jmh.annotations.Benchmark;

public class DatabindSerialization extends JsonBase {

    @Benchmark
    @Override
    public Object gson() {
        String v = GSON.toJson(JsonSource.nextPojo());
        return v;
    }

    @Benchmark
    @Override
    public Object jackson() throws JsonProcessingException {
        String v = JACKSON.writeValueAsString(JsonSource.nextPojo());
        return v;
    }

    @Benchmark
    @Override
    public Object jackson_afterburner() throws JsonProcessingException {
        String v = JACKSON.writeValueAsString(JsonSource.nextPojo());
        return v;
    }

    @Benchmark
    @Override
    public Object genson() {
        String v = GENSON.serialize(JsonSource.nextPojo());
        return v;
    }

    @Benchmark
    @Override
    public Object fastjson() {
        String v = JSON.toJSONString(JsonSource.nextPojo());
        return v;
    }

    @Override
    public Object orgjson() throws Exception {
        return null;
    }

    @Override
    public Object jsonp() throws Exception {
        return null;
    }

    //    @Benchmark
    @Override
    public Object flexjson() {
        String v = FLEXJSON_SER.serialize(JsonSource.nextPojo());
        return v;
    }

    @Override
    public Object jsonio() throws Exception {
        return null;
    }

    @Benchmark
    @Override
    public Object boon() {
        String v = BOON.writeValueAsString(JsonSource.nextPojo());
        return v;
    }

    @Benchmark
    @Override
    public Object johnson() {
        String v = JOHNSON.writeObjectAsString(JsonSource.nextPojo());
        return v;
    }

    @Benchmark
    @Override
    public Object jsonsmart() throws Exception {
        StringBuilder b = new StringBuilder();
        net.minidev.json.JSONValue.writeJSONString(JsonSource.nextPojo(), b);
        String v = b.toString();
        return v;
    }
}
