package com.github.fabienrenaud.jjb;

import com.alibaba.fastjson.JSON;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import org.openjdk.jmh.annotations.Benchmark;

/**
 *
 * @author Fabien Renaud
 */
public class DatabindDeserialization extends JsonBase {

    @Benchmark
    @Override
    public void gson() throws Exception {
        for (String jsonText : JsonSource.SMALL_JSON_TEXT.values()) {
            SmallPojo node = GSON.fromJson(jsonText, SmallPojo.class);
            assertTrue(node != null);
        }
    }

    @Benchmark
    @Override
    public void jackson() throws Exception {
        for (String jsonText : JsonSource.SMALL_JSON_TEXT.values()) {
            SmallPojo node = JACKSON.readValue(jsonText, SmallPojo.class);
            assertTrue(node != null);
        }
    }

    @Benchmark
    @Override
    public void jackson_afterburner() throws IOException {
        for (String jsonText : JsonSource.SMALL_JSON_TEXT.values()) {
            SmallPojo node = JACKSON_AFTERBURNER.readValue(jsonText, SmallPojo.class);
            assertTrue(node != null);
        }
    }

    @Benchmark
    @Override
    public void genson() throws JsonSyntaxException {
        for (String jsonText : JsonSource.SMALL_JSON_TEXT.values()) {
            SmallPojo node = GENSON.deserialize(jsonText, SmallPojo.class);
            assertTrue(node != null);
        }
    }

    @Benchmark
    @Override
    public void fastjson() {
        for (String jsonText : JsonSource.SMALL_JSON_TEXT.values()) {
            SmallPojo node = JSON.parseObject(jsonText, SmallPojo.class);
            assertTrue(node != null);
        }
    }

//    @Benchmark
    @Override
    public void flexjson() throws JsonSyntaxException {
        for (String jsonText : JsonSource.SMALL_JSON_TEXT.values()) {
            SmallPojo node = FLEXJSON_DESER.deserialize(jsonText, SmallPojo.class);
            assertTrue(node != null);
        }
    }

    @Override
    public void orgjson() throws Exception {
    }

    @Override
    public void jsonp() throws Exception {
    }
}
