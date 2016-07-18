package com.github.fabienrenaud.jjb;

import com.fasterxml.jackson.core.JsonGenerator;
import com.github.fabienrenaud.jjb.model.UserCollection;
import com.owlike.genson.stream.ObjectWriter;
import org.json.JSONObject;
import org.openjdk.jmh.annotations.Benchmark;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author Fabien Renaud
 */
public class StreamSerialization extends JsonBase {

    @Benchmark
    @Override
    public void orgjson() {
        JSONObject[] arr = JsonSource.jsonAsOrgJsonObject();
        for (int i = 0; i < arr.length; i++) {
            String v = arr[i].toString();
            if (consumer != null) {
                consumer.accept(i, v);
            }
        }
    }

    @Benchmark
    @Override
    public void jsonp() throws Exception {
        javax.json.JsonObject[] arr = JsonSource.jsonAsJavaxJsonObject();
        for (int i = 0; i < arr.length; i++) {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            javax.json.JsonWriter jw = javax.json.Json.createWriter(os);
            jw.writeObject(arr[i]);
            jw.close();
            os.close();
            if (consumer != null) {
                consumer.accept(i, new String(os.toByteArray()));
            }
        }
    }

    @Benchmark
    @Override
    public void jackson() throws Exception {
        UserCollection[] arr = JsonSource.jsonAsObject;
        for (int i = 0; i < arr.length; i++) {
            OutputStream os = new ByteArrayOutputStream();
            try (JsonGenerator jGenerator = JACKSON_FACTORY.createGenerator(os)) {
                JacksonStreamHelper.serialize(jGenerator, arr[i]);
            }
            os.close();
            if (consumer != null) {
                consumer.accept(i, os);
            }
        }
    }

    @Benchmark
    @Override
    public void gson() throws Exception {
        UserCollection[] arr = JsonSource.jsonAsObject;
        for (int i = 0; i < arr.length; i++) {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            Writer w = new OutputStreamWriter(bos);
            try (com.google.gson.stream.JsonWriter jw = new com.google.gson.stream.JsonWriter(w)) {
                GsonStreamHelper.serialize(jw, arr[i]);
            }
            w.close();
            if (consumer != null) {
                consumer.accept(i, new String(bos.toByteArray()));
            }
        }
    }

    @Override
    public void jackson_afterburner() throws Exception {
    }

    @Benchmark
    @Override
    public void genson() throws Exception {
        UserCollection[] arr = JsonSource.jsonAsObject;
        for (int i = 0; i < arr.length; i++) {
            OutputStream os = new ByteArrayOutputStream();
            ObjectWriter ow = GENSON.createWriter(os);
            GensonStreamHelper.serialize(ow, arr[i]);
            ow.close();
            os.close();
            if (consumer != null) {
                consumer.accept(i, os);
            }
        }
    }

    @Override
    public void flexjson() throws Exception {
    }

    @Override
    public void fastjson() throws Exception {
    }

    @Benchmark
    @Override
    public void jsonio() throws Exception {
        UserCollection[] arr = JsonSource.jsonAsObject;
        for (int i = 0; i < arr.length; i++) {
            String v = com.cedarsoftware.util.io.JsonWriter.objectToJson(arr[i], JSONIO_STREAM_OPTIONS);
            if (consumer != null) {
                consumer.accept(i, v);
            }
        }
    }

    @Override
    public void boon() throws Exception {
    }

    @Override
    public void johnson() throws Exception {
    }

    @Override
    public void jsonsmart() throws Exception {
    }
}
