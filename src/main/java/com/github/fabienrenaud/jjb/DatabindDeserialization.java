package com.github.fabienrenaud.jjb;

import com.alibaba.fastjson.JSON;
import com.github.fabienrenaud.jjb.model.UserCollection;
import com.google.gson.JsonSyntaxException;
import org.openjdk.jmh.annotations.Benchmark;

import java.io.IOException;

/**
 * @author Fabien Renaud
 */
public class DatabindDeserialization extends JsonBase {

    @Benchmark
    @Override
    public Object gson() throws Exception {
        UserCollection node = GSON.fromJson(JsonSource.nextReader(), UserCollection.class);
        return node;
    }

    @Benchmark
    @Override
    public Object jackson() throws Exception {
        UserCollection node = JACKSON.readValue(JsonSource.nextByteArray(), UserCollection.class);
        return node;
    }

    @Benchmark
    @Override
    public Object jackson_afterburner() throws IOException {
        UserCollection node = JACKSON_AFTERBURNER.readValue(JsonSource.nextByteArray(), UserCollection.class);
        return node;
    }

    @Benchmark
    @Override
    public Object genson() throws JsonSyntaxException {
        UserCollection node = GENSON.deserialize(JsonSource.nextByteArray(), UserCollection.class);
        return node;
    }

    @Benchmark
    @Override
    public Object fastjson() {
        UserCollection node = JSON.parseObject(JsonSource.nextByteArray(), UserCollection.class);
        return node;
    }

    //    @Benchmark
    @Override
    public Object flexjson() throws JsonSyntaxException {
        UserCollection node = FLEXJSON_DESER.deserialize(JsonSource.nextReader(), UserCollection.class);
        return node;
    }

    @Override
    public Object orgjson() throws Exception {
        return null;
    }

    @Override
    public Object jsonp() throws Exception {
        return null;
    }

    @Override
    public Object jsonio() throws Exception {
        return null;
    }

    @Benchmark
    @Override
    public Object boon() throws Exception {
        UserCollection node = BOON.readValue(JsonSource.nextByteArray(), UserCollection.class);
        return node;
    }

    @Benchmark
    @Override
    public Object johnson() throws Exception {
        UserCollection node = JOHNSON.readObject(JsonSource.nextInputStream(), UserCollection.class);
        return node;
    }

    @Benchmark
    @Override
    public Object jsonsmart() throws Exception {
        UserCollection node = net.minidev.json.JSONValue.parse(JsonSource.nextByteArray(), UserCollection.class);
        return node;
    }
}
