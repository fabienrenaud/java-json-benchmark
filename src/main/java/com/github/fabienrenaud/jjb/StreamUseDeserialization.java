package com.github.fabienrenaud.jjb;

import com.fasterxml.jackson.core.JsonParser;
import com.owlike.genson.stream.ObjectReader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openjdk.jmh.annotations.Benchmark;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;

/**
 *
 * @author Fabien Renaud
 */
public class StreamUseDeserialization extends JsonBase {

    @Benchmark
    @Override
    public void orgjson() throws JSONException {
        JSONObject jso = new JSONObject(JsonSource.SMALL_JSON_TEXT.get("08.json"));
        assertTrue(jso.getInt("index") == 0);
        assertTrue(jso.getInt("age") == 37);
        assertTrue(jso.getString("balance").equals("$2,046.39"));
        JSONArray jsa = jso.getJSONArray("friends");
        assertTrue(jsa.getJSONObject(0).get("name").equals("Melva Harris"));
        assertTrue(jsa.getJSONObject(1).get("name").equals("Hood Langley"));
        assertTrue(jsa.getJSONObject(2).get("name").equals("Lorena Butler"));
        assertTrue(jsa.getJSONObject(3).get("name").equals("Louella Salazar"));
    }

    @Benchmark
    @Override
    public void jsonp() throws IOException {
        javax.json.JsonReader reader = javax.json.Json.createReader(new ByteArrayInputStream(JsonSource.SMALL_JSON_BYTES.get("08.json")));
        javax.json.JsonObject node = reader.readObject();
        assertTrue(node.getInt("index") == 0);
        assertTrue(node.getInt("age") == 37);
        assertTrue(node.getString("balance").equals("$2,046.39"));
        javax.json.JsonArray jsa = node.getJsonArray("friends");
        assertTrue(jsa.getJsonObject(0).getString("name").equals("Melva Harris"));
        assertTrue(jsa.getJsonObject(1).getString("name").equals("Hood Langley"));
        assertTrue(jsa.getJsonObject(2).getString("name").equals("Lorena Butler"));
        assertTrue(jsa.getJsonObject(3).getString("name").equals("Louella Salazar"));
    }

    @Benchmark
    @Override
    public void jackson() throws IOException {
        SmallPojo node;
        try (JsonParser jParser = JACKSON_FACTORY.createParser(JsonSource.SMALL_JSON_TEXT.get("08.json"))) {
            node = JacksonStreamHelper.deserializeSmallPojo(jParser);
        }
        DatabindUseDeserialization.validate(node);
    }

    @Benchmark
    @Override
    public void gson() throws Exception {
        SmallPojo node;
        try (com.google.gson.stream.JsonReader jr = new com.google.gson.stream.JsonReader(new StringReader(JsonSource.SMALL_JSON_TEXT.get("08.json")))) {
            node = GsonStreamHelper.deserializeSmallPojo(jr);
        }
        DatabindUseDeserialization.validate(node);
    }

    @Override
    public void jackson_afterburner() throws Exception {
    }

    @Benchmark
    @Override
    public void genson() throws Exception {
        SmallPojo node;
        try (ObjectReader reader = GENSON.createReader(JsonSource.SMALL_JSON_BYTES.get("08.json"))) {
            node = GensonStreamHelper.deserializeSmallPojo(reader);
        }
        DatabindUseDeserialization.validate(node);
    }

    @Override
    public void flexjson() throws Exception {
    }

    @Override
    public void fastjson() throws Exception {
    }

    @Override
    public void jsonio() throws Exception {
    }
}
