package com.github.fabienrenaud.jjb;

import com.alibaba.fastjson.JSON;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import org.openjdk.jmh.annotations.Benchmark;

/**
 *
 * @author Fabien Renaud
 */
public class DatabindUseDeserialization extends JsonBase {

    @Benchmark
    @Override
    public void gson() throws JsonSyntaxException {
        SmallPojo node = GSON.fromJson(JsonSource.SMALL_JSON_TEXT.get("08.json"), SmallPojo.class);
        validate(node);
    }

    @Benchmark
    @Override
    public void jackson() throws IOException {
        SmallPojo node = JACKSON.readValue(JsonSource.SMALL_JSON_TEXT.get("08.json"), SmallPojo.class);
        validate(node);
    }

    @Benchmark
    @Override
    public void jackson_afterburner() throws IOException {
        SmallPojo node = JACKSON_AFTERBURNER.readValue(JsonSource.SMALL_JSON_TEXT.get("08.json"), SmallPojo.class);
        validate(node);
    }

    @Benchmark
    @Override
    public void genson() throws JsonSyntaxException {
        SmallPojo node = GENSON.deserialize(JsonSource.SMALL_JSON_TEXT.get("08.json"), SmallPojo.class);
        validate(node);
    }

    @Benchmark
    @Override
    public void fastjson() {
        SmallPojo node = JSON.parseObject(JsonSource.SMALL_JSON_TEXT.get("08.json"), SmallPojo.class);
        validate(node);
    }

//    @Benchmark
    @Override
    public void flexjson() throws JsonSyntaxException {
        SmallPojo node = FLEXJSON_DESER.deserialize(JsonSource.SMALL_JSON_TEXT.get("08.json"), SmallPojo.class);
        validate(node);
    }

    public static void validate(SmallPojo node) {
        assertTrue(node.index == 0);
        assertTrue(node.age == 37);
        assertTrue(node.balance.equals("$2,046.39"));
        assertTrue(node.friends.get(0).name.equals("Melva Harris"));
        assertTrue(node.friends.get(1).name.equals("Hood Langley"));
        assertTrue(node.friends.get(2).name.equals("Lorena Butler"));
        assertTrue(node.friends.get(3).name.equals("Louella Salazar"));
        assertTrue(node.tags.get(0).equals("culpa"));
        assertTrue(node.tags.get(1).equals("id"));
        assertTrue(node.tags.get(2).equals("occaecat"));
        assertTrue(node.tags.get(3).equals("cillum"));
        assertTrue(node.tags.get(4).equals("deserunt"));
        assertTrue(node.tags.get(5).equals("cupidatat"));
        assertTrue(node.tags.get(6).equals("ea"));
    }

    @Override
    public void orgjson() throws Exception {
    }

    @Override
    public void jsonp() throws Exception {
    }
}
