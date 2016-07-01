package com.github.fabienrenaud.jjb;

import com.fasterxml.jackson.core.JsonParser;
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
        for (String jsonText : JsonSource.SMALL_JSON_TEXT.values()) {
            JSONObject jso = new JSONObject(jsonText);
            assertTrue(jso != null);
        }
    }

    @Benchmark
    @Override
    public void jsonp() throws IOException {
        for (byte[] jsonBytes : JsonSource.SMALL_JSON_BYTES.values()) {
            javax.json.JsonReader reader = javax.json.Json.createReader(new ByteArrayInputStream(jsonBytes));
            javax.json.JsonObject node = reader.readObject();
            assertTrue(node != null);
        }
    }

    @Benchmark
    @Override
    public void jackson() throws IOException {
        for (byte[] jsonBytes : JsonSource.SMALL_JSON_BYTES.values()) {
            SmallPojo node;
            try (JsonParser jParser = JACKSON_FACTORY.createParser(jsonBytes)) {
                node = JacksonStreamHelper.deserializeSmallPojo(jParser);
            }
            assertTrue(node != null);
        }
    }

    @Benchmark
    @Override
    public void gson() throws Exception {
        for (byte[] jsonBytes : JsonSource.SMALL_JSON_BYTES.values()) {
            SmallPojo node;
            try (com.google.gson.stream.JsonReader jr = new com.google.gson.stream.JsonReader(new InputStreamReader(new ByteArrayInputStream(jsonBytes)))) {
                node = GsonStreamHelper.deserializeSmallPojo(jr);
            }
            assertTrue(node != null);
        }
    }

    @Override
    public void jackson_afterburner() throws Exception {
    }

    @Benchmark
    @Override
    public void genson() throws Exception {
        for (byte[] jsonBytes : JsonSource.SMALL_JSON_BYTES.values()) {
            SmallPojo node;
            try (ObjectReader reader = GENSON.createReader(jsonBytes)) {
                node = GensonStreamHelper.deserializeSmallPojo(reader);
            }
            assertTrue(node != null);
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
        for (byte[] jsonBytes : JsonSource.SMALL_JSON_BYTES.values()) {
            Map<String, Object> node = (Map) com.cedarsoftware.util.io.JsonReader.jsonToJava(new ByteArrayInputStream(jsonBytes), JSONIO_STREAM_OPTIONS);
            assertTrue(node != null);
        }
    }
}
