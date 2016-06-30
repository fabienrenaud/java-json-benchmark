package com.github.fabienrenaud.jjb;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.JsonSyntaxException;
import org.openjdk.jmh.annotations.Benchmark;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class DatabindSerialization extends JsonBase {

    private static final Collection<SmallPojo> GSON_OBJS = new ArrayList<>(JsonSource.SIZE);
    private static final Collection<SmallPojo> JACKSON_OBJS = new ArrayList<>(JsonSource.SIZE);
    private static final Collection<SmallPojo> JACKSON_AFTERBURNER_OBJS = new ArrayList<>(JsonSource.SIZE);
    private static final Collection<SmallPojo> GENSON_OBJS = new ArrayList<>(JsonSource.SIZE);
    private static final Collection<SmallPojo> FASTJSON_OBJS = new ArrayList<>(JsonSource.SIZE);
    private static final Collection<SmallPojo> FLEXJSON_OBJS = new ArrayList<>(JsonSource.SIZE);

    static {
        try {
            for (String jsonText : JsonSource.SMALL_JSON_TEXT.values()) {
                SmallPojo node = GSON.fromJson(jsonText, SmallPojo.class);
                GSON_OBJS.add(node);
                node = JACKSON.readValue(jsonText, SmallPojo.class);
                JACKSON_OBJS.add(node);
                node = JACKSON_AFTERBURNER.readValue(jsonText, SmallPojo.class);
                JACKSON_AFTERBURNER_OBJS.add(node);
                node = GENSON.deserialize(jsonText, SmallPojo.class);
                GENSON_OBJS.add(node);
                node = JSON.parseObject(jsonText, SmallPojo.class);
                FASTJSON_OBJS.add(node);
//                node = FLEXJSON_DESER.deserialize(jsonText, SmallPojo.class);
//                FLEXJSON_OBJS.add(node);
            }
        } catch (JsonSyntaxException | IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Benchmark
    @Override
    public void gson() {
        for (SmallPojo o : GSON_OBJS) {
            String v = GSON.toJson(o);
            assertTrue(v != null);
        }
    }

    @Benchmark
    @Override
    public void jackson() throws JsonProcessingException {
        for (SmallPojo o : JACKSON_OBJS) {
            String v = JACKSON.writeValueAsString(o);
            assertTrue(v != null);
        }
    }

    @Benchmark
    @Override
    public void jackson_afterburner() throws JsonProcessingException {
        for (SmallPojo o : JACKSON_AFTERBURNER_OBJS) {
            String v = JACKSON.writeValueAsString(o);
            assertTrue(v != null);
        }
    }

    @Benchmark
    @Override
    public void genson() {
        for (SmallPojo o : GENSON_OBJS) {
            String v = GENSON.serialize(o);
            assertTrue(v != null);
        }
    }

    @Benchmark
    @Override
    public void fastjson() {
        for (SmallPojo o : FASTJSON_OBJS) {
            String v = JSON.toJSONString(o);
            assertTrue(v != null);
        }
    }

    @Override
    public void orgjson() throws Exception {
    }

    @Override
    public void jsonp() throws Exception {
    }

//    @Benchmark
    @Override
    public void flexjson() {
        for (SmallPojo o : FLEXJSON_OBJS) {
            String v = FLEXJSON_SER.serialize(o);
            assertTrue(v != null);
        }
    }

    @Override
    public void jsonio() throws Exception {
    }
}
