package com.github.fabienrenaud.jjb.stream;

import com.fasterxml.jackson.core.JsonParser;
import com.github.fabienrenaud.jjb.JsonBench;
import com.github.fabienrenaud.jjb.data.JsonSource;
import com.owlike.genson.stream.ObjectReader;
import org.json.JSONException;
import org.json.JSONObject;
import org.openjdk.jmh.annotations.Benchmark;

import java.io.IOException;

/**
 * @author Fabien Renaud
 */
public class Deserialization extends JsonBench {

    public JsonSource JSON_SOURCE() {
        return CLI_JSON_SOURCE;
    }

    @Benchmark
    @Override
    public Object orgjson() throws JSONException {
        JSONObject node = new JSONObject(JSON_SOURCE().nextString());
        return node;
    }

    @Benchmark
    @Override
    public Object javaxjson() throws IOException {
        return javax.json.Json.createReader(JSON_SOURCE().nextInputStream()).readObject();
    }

    @Benchmark
    @Override
    public Object jackson() throws IOException {
        try (JsonParser jParser = JSON_SOURCE().provider().jacksonFactory().createParser(JSON_SOURCE().nextByteArray())) {
            return JSON_SOURCE().streamDeserializer().jackson(jParser);
        }
    }

    @Benchmark
    @Override
    public Object gson() throws Exception {
        try (com.google.gson.stream.JsonReader jr = new com.google.gson.stream.JsonReader(JSON_SOURCE().nextReader())) {
            return JSON_SOURCE().streamDeserializer().gson(jr);
        }
    }

    @Benchmark
    @Override
    public Object genson() throws Exception {
        try (ObjectReader reader = JSON_SOURCE().provider().genson().createReader(JSON_SOURCE().nextByteArray())) {
            return JSON_SOURCE().streamDeserializer().genson(reader);
        }
    }

    @Benchmark
    @Override
    public Object jsonio() throws Exception {
        return com.cedarsoftware.util.io.JsonReader.jsonToJava(JSON_SOURCE().nextInputStream(), JSON_SOURCE().provider().jsonioStreamOptions());
    }

    @Benchmark
    @Override
    public Object jsonsimple() throws Exception {
        return org.json.simple.JSONValue.parse(JSON_SOURCE().nextReader());
    }

    @Benchmark
    @Override
    public Object nanojson() throws Exception {
        return com.grack.nanojson.JsonParser.object().from(JSON_SOURCE().nextInputStream());
    }

    @Benchmark
    @Override
    public Object tapestry() throws Exception {
        org.apache.tapestry5.json.JSONObject node = new org.apache.tapestry5.json.JSONObject(JSON_SOURCE().nextString());
        return node;
    }

    @Benchmark
    @Override
    public Object minimaljson() throws Exception {
        return JSON_SOURCE().streamDeserializer().minimaljson(JSON_SOURCE().nextReader());
    }

    @Benchmark
    @Override
    public Object moshi() throws Exception {
        try (com.squareup.moshi.JsonReader jr = com.squareup.moshi.JsonReader.of(JSON_SOURCE().nextOkioBufferedSource())) {
            return JSON_SOURCE().streamDeserializer().moshi(jr);
        }
    }

    @Benchmark
    @Override
    public Object mjson() throws Exception {
        return mjson.Json.read(JSON_SOURCE().nextString());
    }

    @Benchmark
    @Override
    public Object underscore_java() throws Exception {
        return JSON_SOURCE().streamDeserializer().underscore_java(JSON_SOURCE().nextString());
    }
}
