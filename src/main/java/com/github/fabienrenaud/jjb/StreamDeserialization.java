package com.github.fabienrenaud.jjb;

import com.fasterxml.jackson.core.JsonParser;
import com.github.fabienrenaud.jjb.model.UserCollection;
import com.owlike.genson.stream.ObjectReader;
import org.json.JSONException;
import org.json.JSONObject;
import org.openjdk.jmh.annotations.Benchmark;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 *
 * @author Fabien Renaud
 */
public class StreamDeserialization extends JsonBase {

    @Benchmark
    @Override
    public void orgjson() throws JSONException {
        String[] arr = JsonSource.jsonAsString;
        for (int i = 0; i < arr.length; i++) {
            JSONObject node = new JSONObject(arr[i]);
            if (consumer != null) {
                consumer.accept(i, node);
            }
        }
    }

    @Benchmark
    @Override
    public void jsonp() throws IOException {
        byte[][] arr = JsonSource.jsonAsBytes;
        for (int i = 0; i < arr.length; i++) {
            javax.json.JsonReader reader = javax.json.Json.createReader(new ByteArrayInputStream(arr[i]));
            javax.json.JsonObject node = reader.readObject();
            if (consumer != null) {
                consumer.accept(i, node);
            }
        }
    }

    @Benchmark
    @Override
    public void jackson() throws IOException {
        byte[][] arr = JsonSource.jsonAsBytes;
        for (int i = 0; i < arr.length; i++) {
            UserCollection node;
            try (JsonParser jParser = JACKSON_FACTORY.createParser(arr[i])) {
                node = JacksonStreamHelper.deserializeUserCollection(jParser);
            }
            if (consumer != null) {
                consumer.accept(i, node);
            }
        }
    }

    @Benchmark
    @Override
    public void gson() throws Exception {
        byte[][] arr = JsonSource.jsonAsBytes;
        for (int i = 0; i < arr.length; i++) {
            UserCollection node;
            try (com.google.gson.stream.JsonReader jr = new com.google.gson.stream.JsonReader(new InputStreamReader(new ByteArrayInputStream(arr[i])))) {
                node = GsonStreamHelper.deserializeUserCollection(jr);
            }
            if (consumer != null) {
                consumer.accept(i, node);
            }
        }
    }

    @Override
    public void jackson_afterburner() throws Exception {
    }

    @Benchmark
    @Override
    public void genson() throws Exception {
        byte[][] arr = JsonSource.jsonAsBytes;
        for (int i = 0; i < arr.length; i++) {
            UserCollection node;
            try (ObjectReader reader = GENSON.createReader(arr[i])) {
                node = GensonStreamHelper.deserializeUserCollection(reader);
            }
            if (consumer != null) {
                consumer.accept(i, node);
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
        byte[][] arr = JsonSource.jsonAsBytes;
        for (int i = 0; i < arr.length; i++) {
            Map<String, Object> node = (Map) com.cedarsoftware.util.io.JsonReader.jsonToJava(new ByteArrayInputStream(arr[i]), JSONIO_STREAM_OPTIONS);
            if (consumer != null) {
                consumer.accept(i, node);
            }
        }
    }

    @Override
    public void boon() throws Exception {
    }

    @Override
    public void johnson() throws Exception {
    }
}
