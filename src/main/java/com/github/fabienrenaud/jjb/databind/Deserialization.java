package com.github.fabienrenaud.jjb.databind;

import com.alibaba.fastjson.JSON;
import com.github.fabienrenaud.jjb.JsonBench;
import com.google.gson.JsonSyntaxException;
import org.openjdk.jmh.annotations.Benchmark;

import java.io.IOException;

import static com.github.fabienrenaud.jjb.JsonUtils.*;


/**
 * @author Fabien Renaud
 */
public class Deserialization extends JsonBench {

    @Benchmark
    @Override
    public Object gson() throws Exception {
        return GSON.fromJson(JSON_SOURCE.nextReader(), JSON_SOURCE.pojoType());
    }

    @Benchmark
    @Override
    public Object jackson() throws Exception {
        return JACKSON.readValue(JSON_SOURCE.nextByteArray(), JSON_SOURCE.pojoType());
    }

    @Benchmark
    @Override
    public Object jackson_afterburner() throws IOException {
        return JACKSON_AFTERBURNER.readValue(JSON_SOURCE.nextByteArray(), JSON_SOURCE.pojoType());
    }

    @Benchmark
    @Override
    public Object genson() throws JsonSyntaxException {
        return GENSON.deserialize(JSON_SOURCE.nextByteArray(), JSON_SOURCE.pojoType());
    }

    @Benchmark
    @Override
    public Object fastjson() {
        return JSON.parseObject(JSON_SOURCE.nextByteArray(), JSON_SOURCE.pojoType());
    }

    //    @Benchmark
    @Override
    public Object flexjson() throws JsonSyntaxException {
        return FLEXJSON_DESER.deserialize(JSON_SOURCE.nextReader(), JSON_SOURCE.pojoType());
    }

    @Benchmark
    @Override
    public Object boon() throws Exception {
        return BOON.readValue(JSON_SOURCE.nextByteArray(), JSON_SOURCE.pojoType());
    }

    @Benchmark
    @Override
    public Object johnson() throws Exception {
        return JOHNSON.readObject(JSON_SOURCE.nextInputStream(), JSON_SOURCE.pojoType());
    }

    @Benchmark
    @Override
    public Object jsonsmart() throws Exception {
        return net.minidev.json.JSONValue.parse(JSON_SOURCE.nextByteArray(), JSON_SOURCE.pojoType());
    }
}
