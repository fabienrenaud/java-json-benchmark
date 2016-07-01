package com.github.fabienrenaud.jjb;

import com.alibaba.fastjson.JSON;
import com.google.gson.JsonSyntaxException;
import org.openjdk.jmh.annotations.Benchmark;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Fabien Renaud
 */
public class DatabindDeserialization extends JsonBase {

    @Benchmark
    @Override
    public void gson() throws Exception {
        for (byte[] jsonBytes : JsonSource.SMALL_JSON_BYTES.values()) {
            SmallPojo node = GSON.fromJson(new InputStreamReader(new ByteArrayInputStream(jsonBytes)), SmallPojo.class);
            assertTrue(node != null);
        }
    }

    @Benchmark
    @Override
    public void jackson() throws Exception {
        for (byte[] jsonBytes : JsonSource.SMALL_JSON_BYTES.values()) {
            SmallPojo node = JACKSON.readValue(jsonBytes, SmallPojo.class);
            assertTrue(node != null);
        }
    }

    @Benchmark
    @Override
    public void jackson_afterburner() throws IOException {
        for (byte[] jsonBytes : JsonSource.SMALL_JSON_BYTES.values()) {
            SmallPojo node = JACKSON_AFTERBURNER.readValue(jsonBytes, SmallPojo.class);
            assertTrue(node != null);
        }
    }

    @Benchmark
    @Override
    public void genson() throws JsonSyntaxException {
        for (byte[] jsonBytes : JsonSource.SMALL_JSON_BYTES.values()) {
            SmallPojo node = GENSON.deserialize(jsonBytes, SmallPojo.class);
            assertTrue(node != null);
        }
    }

    @Benchmark
    @Override
    public void fastjson() {
        for (byte[] jsonBytes : JsonSource.SMALL_JSON_BYTES.values()) {
            SmallPojo node = JSON.parseObject(jsonBytes, SmallPojo.class);
            assertTrue(node != null);
        }
    }

//    @Benchmark
    @Override
    public void flexjson() throws JsonSyntaxException {
        for (byte[] jsonBytes : JsonSource.SMALL_JSON_BYTES.values()) {
            SmallPojo node = FLEXJSON_DESER.deserialize(new InputStreamReader(new ByteArrayInputStream(jsonBytes)), SmallPojo.class);
            assertTrue(node != null);
        }
    }

    @Override
    public void orgjson() throws Exception {
    }

    @Override
    public void jsonp() throws Exception {
    }

    @Override
    public void jsonio() throws Exception {
    }
}
