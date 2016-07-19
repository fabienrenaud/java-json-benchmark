package com.github.fabienrenaud.jjb;

import com.fasterxml.jackson.core.JsonParser;
import com.github.fabienrenaud.jjb.model.UserCollection;
import com.owlike.genson.stream.ObjectReader;
import org.json.JSONException;
import org.json.JSONObject;
import org.openjdk.jmh.annotations.Benchmark;

import java.io.IOException;
import java.util.Map;

/**
 * @author Fabien Renaud
 */
public class StreamDeserialization extends JsonBase {

    @Benchmark
    @Override
    public Object orgjson() throws JSONException {
        JSONObject node = new JSONObject(JsonSource.nextString());
        return node;
    }

    @Benchmark
    @Override
    public Object jsonp() throws IOException {
        javax.json.JsonReader reader = javax.json.Json.createReader(JsonSource.nextInputStream());
        javax.json.JsonObject node = reader.readObject();
        return node;
    }

    @Benchmark
    @Override
    public Object jackson() throws IOException {
        UserCollection node;
        try (JsonParser jParser = JACKSON_FACTORY.createParser(JsonSource.nextByteArray())) {
            node = JacksonStreamHelper.deserializeUserCollection(jParser);
        }
        return node;
    }

    @Benchmark
    @Override
    public Object gson() throws Exception {
        UserCollection node;
        try (com.google.gson.stream.JsonReader jr = new com.google.gson.stream.JsonReader(JsonSource.nextReader())) {
            node = GsonStreamHelper.deserializeUserCollection(jr);
        }
        return node;
    }

    @Override
    public Object jackson_afterburner() throws Exception {
        return null;
    }

    @Benchmark
    @Override
    public Object genson() throws Exception {
        UserCollection node;
        try (ObjectReader reader = GENSON.createReader(JsonSource.nextByteArray())) {
            node = GensonStreamHelper.deserializeUserCollection(reader);
        }
        return node;
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
        Map<String, Object> node = (Map) com.cedarsoftware.util.io.JsonReader.jsonToJava(JsonSource.nextInputStream(), JSONIO_STREAM_OPTIONS);
        return node;
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
