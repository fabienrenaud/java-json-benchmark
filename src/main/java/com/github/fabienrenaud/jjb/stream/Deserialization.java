package com.github.fabienrenaud.jjb.stream;

import com.fasterxml.jackson.core.JsonParser;
import com.github.fabienrenaud.jjb.JsonBench;
import com.owlike.genson.stream.ObjectReader;
import org.json.JSONException;
import org.json.JSONObject;
import org.openjdk.jmh.annotations.Benchmark;

import java.io.IOException;

import static com.github.fabienrenaud.jjb.JsonUtils.*;

/**
 * @author Fabien Renaud
 */
public class Deserialization extends JsonBench {

    @Benchmark
    @Override
    public Object orgjson() throws JSONException {
        JSONObject node = new JSONObject(JSON_SOURCE.nextString());
        return node;
    }

    @Benchmark
    @Override
    public Object jsonp() throws IOException {
        return javax.json.Json.createReader(JSON_SOURCE.nextInputStream()).readObject();
    }

    @Benchmark
    @Override
    public Object jackson() throws IOException {
        try (JsonParser jParser = JACKSON_FACTORY.createParser(JSON_SOURCE.nextByteArray())) {
            return JSON_SOURCE.streamDeserializer().jackson(jParser);
        }
    }

    @Benchmark
    @Override
    public Object gson() throws Exception {
        try (com.google.gson.stream.JsonReader jr = new com.google.gson.stream.JsonReader(JSON_SOURCE.nextReader())) {
            return JSON_SOURCE.streamDeserializer().gson(jr);
        }
    }

    @Benchmark
    @Override
    public Object genson() throws Exception {
        try (ObjectReader reader = GENSON.createReader(JSON_SOURCE.nextByteArray())) {
            return JSON_SOURCE.streamDeserializer().genson(reader);
        }
    }

    @Benchmark
    @Override
    public Object jsonio() throws Exception {
        return com.cedarsoftware.util.io.JsonReader.jsonToJava(JSON_SOURCE.nextInputStream(), JSONIO_STREAM_OPTIONS);
    }

}
