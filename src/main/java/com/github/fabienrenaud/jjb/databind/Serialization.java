package com.github.fabienrenaud.jjb.databind;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.bluelinelabs.logansquare.LoganSquare;
import com.github.fabienrenaud.jjb.JsonBench;
import com.github.fabienrenaud.jjb.JsonUtils;
import com.github.fabienrenaud.jjb.data.JsonSource;
import okio.BufferedSink;
import okio.Okio;
import org.openjdk.jmh.annotations.Benchmark;

import java.io.ByteArrayOutputStream;

public class Serialization extends JsonBench {

    public JsonSource JSON_SOURCE() {
        return CLI_JSON_SOURCE;
    }

    @Benchmark
    @Override
    public Object gson() {
        StringBuilder b = JsonUtils.stringBuilder();
        JSON_SOURCE().provider().gson().toJson(JSON_SOURCE().nextPojo(), b);
        return b;
    }

    @Benchmark
    @Override
    public Object jackson() throws Exception {
        ByteArrayOutputStream baos = JsonUtils.byteArrayOutputStream();
        JSON_SOURCE().provider().jackson().writeValue(baos, JSON_SOURCE().nextPojo());
        return baos;
    }

    @Benchmark
    @Override
    public Object jackson_afterburner() throws Exception {
        ByteArrayOutputStream baos = JsonUtils.byteArrayOutputStream();
        JSON_SOURCE().provider().jacksonAfterburner().writeValue(baos, JSON_SOURCE().nextPojo());
        return baos;
    }

    @Benchmark
    @Override
    public Object genson() {
        ByteArrayOutputStream baos = JsonUtils.byteArrayOutputStream();
        JSON_SOURCE().provider().genson().serialize(JSON_SOURCE().nextPojo(), baos);
        return baos;
    }

    @Benchmark
    @Override
    public Object yasson() {
        ByteArrayOutputStream baos = JsonUtils.byteArrayOutputStream();
        JSON_SOURCE().provider().yasson().toJson(JSON_SOURCE().nextPojo(), baos);
        return baos;
    }

    @Benchmark
    @Override
    public Object fastjson() throws Exception {
        ByteArrayOutputStream baos = JsonUtils.byteArrayOutputStream();
        JSON.writeJSONString(baos, JSON_SOURCE().nextPojo(), SerializerFeature.EMPTY);
        return baos;
    }

    @Benchmark
    @Override
    public Object flexjson() {
        StringBuilder b = JsonUtils.stringBuilder();
        JSON_SOURCE().provider().flexjsonSer().exclude("*.class").deepSerialize(JSON_SOURCE().nextPojo(), b);
        return b;
    }

    @Benchmark
    @Override
    public Object boon() {
        ByteArrayOutputStream baos = JsonUtils.byteArrayOutputStream();
        JSON_SOURCE().provider().boon().writeValue(baos, JSON_SOURCE().nextPojo());
        return baos;
    }

    @Benchmark
    @Override
    public Object johnzon() {
        ByteArrayOutputStream baos = JsonUtils.byteArrayOutputStream();
        JSON_SOURCE().provider().johnzon().writeObject(JSON_SOURCE().nextPojo(), baos);
        return baos;
    }

    @Benchmark
    @Override
    public Object jsonsmart() throws Exception {
        StringBuilder b = JsonUtils.stringBuilder();
        net.minidev.json.JSONValue.writeJSONString(JSON_SOURCE().nextPojo(), b);
        return b;
    }

    @Benchmark
    @Override
    public Object dsljson() throws Exception {
        ByteArrayOutputStream baos = JsonUtils.byteArrayOutputStream();
        JSON_SOURCE().provider().dsljson().serialize(JSON_SOURCE().nextPojo(), baos);
        return baos;
    }

    @Benchmark
    @Override
    public Object dsljson_reflection() throws Exception {
        ByteArrayOutputStream baos = JsonUtils.byteArrayOutputStream();
        JSON_SOURCE().provider().dsljson_reflection().serialize(JSON_SOURCE().nextPojo(), baos);
        return baos;
    }

    @Benchmark
    @Override
    public Object logansquare() throws Exception {
        ByteArrayOutputStream baos = JsonUtils.byteArrayOutputStream();
        LoganSquare.serialize(JSON_SOURCE().nextPojo(), baos);
        return baos;
    }

    @Benchmark
    @Override
    public Object jodd() throws Exception {
        return JSON_SOURCE().provider().joddSer().serialize(JSON_SOURCE().nextPojo());
    }

    @Benchmark
    @Override
    public Object moshi() throws Exception {
        ByteArrayOutputStream baos = JsonUtils.byteArrayOutputStream();
        BufferedSink sink = Okio.buffer(Okio.sink(baos));
        JSON_SOURCE().provider().moshi().toJson(sink, JSON_SOURCE().nextPojo());
        sink.flush();
        return baos;
    }

    @Benchmark
    @Override
    public Object jsoniter() throws Exception {
        ByteArrayOutputStream baos = JsonUtils.byteArrayOutputStream();
        com.jsoniter.output.JsonStream.serialize(JSON_SOURCE().nextPojo(), baos);
        return baos;
    }

}
