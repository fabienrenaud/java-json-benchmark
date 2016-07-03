package com.github.fabienrenaud.jjb;

import com.alibaba.fastjson.JSON;
import com.github.fabienrenaud.jjb.model.UserCollection;
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
        byte[][] arr = JsonSource.jsonAsBytes;
        for (int i = 0; i < arr.length; i++) {
            UserCollection node = GSON.fromJson(new InputStreamReader(new ByteArrayInputStream(arr[i])), UserCollection.class);
            if (consumer != null) {
                consumer.accept(i, node);
            }
        }
    }

    @Benchmark
    @Override
    public void jackson() throws Exception {
        byte[][] arr = JsonSource.jsonAsBytes;
        for (int i = 0; i < arr.length; i++) {
            UserCollection node = JACKSON.readValue(arr[i], UserCollection.class);
            if (consumer != null) {
                consumer.accept(i, node);
            }
        }
    }

    @Benchmark
    @Override
    public void jackson_afterburner() throws IOException {
        byte[][] arr = JsonSource.jsonAsBytes;
        for (int i = 0; i < arr.length; i++) {
            UserCollection node = JACKSON_AFTERBURNER.readValue(arr[i], UserCollection.class);
            if (consumer != null) {
                consumer.accept(i, node);
            }
        }
    }

    @Benchmark
    @Override
    public void genson() throws JsonSyntaxException {
        byte[][] arr = JsonSource.jsonAsBytes;
        for (int i = 0; i < arr.length; i++) {
            UserCollection node = GENSON.deserialize(arr[i], UserCollection.class);
            if (consumer != null) {
                consumer.accept(i, node);
            }
        }
    }

    @Benchmark
    @Override
    public void fastjson() {
        byte[][] arr = JsonSource.jsonAsBytes;
        for (int i = 0; i < arr.length; i++) {
            UserCollection node = JSON.parseObject(arr[i], UserCollection.class);
            if (consumer != null) {
                consumer.accept(i, node);
            }
        }
    }

//    @Benchmark
    @Override
    public void flexjson() throws JsonSyntaxException {
        byte[][] arr = JsonSource.jsonAsBytes;
        for (int i = 0; i < arr.length; i++) {
            UserCollection node = FLEXJSON_DESER.deserialize(new InputStreamReader(new ByteArrayInputStream(arr[i])), UserCollection.class);
            if (consumer != null) {
                consumer.accept(i, node);
            }
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
