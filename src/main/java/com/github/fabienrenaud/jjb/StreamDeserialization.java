package com.github.fabienrenaud.jjb;

import com.fasterxml.jackson.core.JsonParser;
import com.owlike.genson.stream.ObjectReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import org.json.JSONException;
import org.json.JSONObject;
import org.openjdk.jmh.annotations.Benchmark;

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
            JsonReader reader = Json.createReader(new ByteArrayInputStream(jsonBytes));
            JsonObject node = reader.readObject();
            assertTrue(node != null);
        }
    }

    @Benchmark
    @Override
    public void jackson() throws IOException {
        for (String jsonText : JsonSource.SMALL_JSON_TEXT.values()) {
            SmallPojo node;
            try (JsonParser jParser = JACKSON_FACTORY.createParser(jsonText)) {
                node = JacksonStreamHelper.deserializeSmallPojo(jParser);
            }
            assertTrue(node != null);
        }
    }

    @Benchmark
    @Override
    public void gson() throws Exception {
        for (String jsonText : JsonSource.SMALL_JSON_TEXT.values()) {
            SmallPojo node;
            try (com.google.gson.stream.JsonReader jr = new com.google.gson.stream.JsonReader(new StringReader(jsonText))) {
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
}
