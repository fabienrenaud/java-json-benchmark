package com.github.fabienrenaud.jjb;

import com.fasterxml.jackson.core.JsonGenerator;
import com.owlike.genson.stream.ObjectWriter;
import org.openjdk.jmh.annotations.Benchmark;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * @author Fabien Renaud
 */
public class StreamSerialization extends JsonBase {

    @Benchmark
    @Override
    public Object orgjson() {
        String v = JsonSource.nextJsonAsOrgJsonObject().toString();
        return v;
    }

    @Benchmark
    @Override
    public Object jsonp() throws Exception {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        javax.json.JsonWriter jw = javax.json.Json.createWriter(os);
        jw.writeObject(JsonSource.nextJsonAsJavaxJsonObject());
        jw.close();
        os.close();
        return os;
    }

    @Benchmark
    @Override
    public Object jackson() throws Exception {
        OutputStream os = new ByteArrayOutputStream();
        try (JsonGenerator jGenerator = JACKSON_FACTORY.createGenerator(os)) {
            JacksonStreamHelper.serialize(jGenerator, JsonSource.nextPojo());
        }
        os.close();
        return os;
    }

    @Benchmark
    @Override
    public Object gson() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Writer w = new OutputStreamWriter(bos);
        try (com.google.gson.stream.JsonWriter jw = new com.google.gson.stream.JsonWriter(w)) {
            GsonStreamHelper.serialize(jw, JsonSource.nextPojo());
        }
        w.close();
        return bos;
    }

    @Override
    public Object jackson_afterburner() throws Exception {
        return null;
    }

    @Benchmark
    @Override
    public Object genson() throws Exception {
        OutputStream os = new ByteArrayOutputStream();
        ObjectWriter ow = GENSON.createWriter(os);
        GensonStreamHelper.serialize(ow, JsonSource.nextPojo());
        ow.close();
        os.close();
        return os;
    }

    @Override
    public Object flexjson() throws Exception {
        return null;
    }

    @Override
    public Object fastjson() throws Exception {
        return null;
    }

    @Benchmark
    @Override
    public Object jsonio() throws Exception {
        String v = com.cedarsoftware.util.io.JsonWriter.objectToJson(JsonSource.nextPojo(), JSONIO_STREAM_OPTIONS);
        return v;
    }

    @Override
    public Object boon() throws Exception {
        return null;
    }

    @Override
    public Object johnson() throws Exception {
        return null;
    }

    @Override
    public Object jsonsmart() throws Exception {
        return null;
    }
}
