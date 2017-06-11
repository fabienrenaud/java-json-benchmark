package com.github.fabienrenaud.jjb.stream;

import com.fasterxml.jackson.core.JsonGenerator;
import com.github.fabienrenaud.jjb.JsonBench;
import com.github.fabienrenaud.jjb.JsonUtils;
import com.grack.nanojson.JsonAppendableWriter;
import com.owlike.genson.stream.ObjectWriter;
import org.openjdk.jmh.annotations.Benchmark;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * @author Fabien Renaud
 */
public class Serialization extends JsonBench {

    @Benchmark
    @Override
    public Object orgjson() throws Exception {
        return JSON_SOURCE.streamSerializer().orgjson(JSON_SOURCE.nextPojo()).toString();
    }

    @Benchmark
    @Override
    public Object javaxjson() throws Exception {
        javax.json.JsonObject jso = JSON_SOURCE.streamSerializer().javaxjson(JSON_SOURCE.nextPojo());

        ByteArrayOutputStream baos = JsonUtils.byteArrayOutputStream();
        javax.json.JsonWriter jw = javax.json.Json.createWriter(baos);
        jw.writeObject(jso);
        jw.close();
        return baos;
    }

    @Benchmark
    @Override
    public Object jackson() throws Exception {
        ByteArrayOutputStream baos = JsonUtils.byteArrayOutputStream();
        try (JsonGenerator jGenerator = JSON_SOURCE.provider().jacksonFactory().createGenerator(baos)) {
            JSON_SOURCE.streamSerializer().jackson(jGenerator, JSON_SOURCE.nextPojo());
        }
        return baos;
    }

    @Benchmark
    @Override
    public Object gson() throws Exception {
        ByteArrayOutputStream baos = JsonUtils.byteArrayOutputStream();
        Writer w = new OutputStreamWriter(baos);
        try (com.google.gson.stream.JsonWriter jw = new com.google.gson.stream.JsonWriter(w)) {
            JSON_SOURCE.streamSerializer().gson(jw, JSON_SOURCE.nextPojo());
        }
        w.close();
        return baos;
    }

    @Benchmark
    @Override
    public Object genson() throws Exception {
        ByteArrayOutputStream os = JsonUtils.byteArrayOutputStream();
        ObjectWriter ow = JSON_SOURCE.provider().genson().createWriter(os);
        JSON_SOURCE.streamSerializer().genson(ow, JSON_SOURCE.nextPojo());
        ow.close();
        return os;
    }

    @Benchmark
    @Override
    public Object jsonio() throws Exception {
        return com.cedarsoftware.util.io.JsonWriter.objectToJson(JSON_SOURCE.nextPojo(), JSON_SOURCE.provider().jsonioStreamOptions());
    }

    @Benchmark
    @Override
    public Object jsonsimple() throws Exception {
        org.json.simple.JSONObject jso = JSON_SOURCE.streamSerializer().jsonsimple(JSON_SOURCE.nextPojo());

        ByteArrayOutputStream baos = JsonUtils.byteArrayOutputStream();
        Writer w = new OutputStreamWriter(baos);
        org.json.simple.JSONValue.writeJSONString(jso, w);
        w.close();
        return baos;
    }

    @Benchmark
    @Override
    public Object nanojson() throws Exception {
        ByteArrayOutputStream baos = JsonUtils.byteArrayOutputStream();
        JsonAppendableWriter writer = com.grack.nanojson.JsonWriter.on(baos);
        JSON_SOURCE.streamSerializer().nanojson(writer, JSON_SOURCE.nextPojo());
        writer.done();
        return baos;
    }

    @Benchmark
    @Override
    public Object tapestry() throws Exception {
        return JSON_SOURCE.streamSerializer().tapestry(JSON_SOURCE.nextPojo()).toString();
    }

    @Benchmark
    @Override
    public Object minimaljson() throws Exception {
        ByteArrayOutputStream baos = JsonUtils.byteArrayOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(baos);
        JSON_SOURCE.streamSerializer().minimaljson(JSON_SOURCE.nextPojo()).writeTo(writer);
        writer.close();
        return baos;
    }
}
