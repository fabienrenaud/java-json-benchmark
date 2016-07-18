package com.github.fabienrenaud.jjb;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.fabienrenaud.jjb.model.UserCollection;
import org.openjdk.jmh.annotations.Benchmark;

public class DatabindSerialization extends JsonBase {

    @Benchmark
    @Override
    public void gson() {
        UserCollection[] arr = JsonSource.jsonAsObject;
        for (int i = 0; i < arr.length; i++) {
            String v = GSON.toJson(arr[i]);
            if (consumer != null) {
                consumer.accept(i, v);
            }
        }
    }

    @Benchmark
    @Override
    public void jackson() throws JsonProcessingException {
        UserCollection[] arr = JsonSource.jsonAsObject;
        for (int i = 0; i < arr.length; i++) {
            String v = JACKSON.writeValueAsString(arr[i]);
            if (consumer != null) {
                consumer.accept(i, v);
            }
        }
    }

    @Benchmark
    @Override
    public void jackson_afterburner() throws JsonProcessingException {
        UserCollection[] arr = JsonSource.jsonAsObject;
        for (int i = 0; i < arr.length; i++) {
            String v = JACKSON.writeValueAsString(arr[i]);
            if (consumer != null) {
                consumer.accept(i, v);
            }
        }
    }

    @Benchmark
    @Override
    public void genson() {
        UserCollection[] arr = JsonSource.jsonAsObject;
        for (int i = 0; i < arr.length; i++) {
            String v = GENSON.serialize(arr[i]);
            if (consumer != null) {
                consumer.accept(i, v);
            }
        }
    }

    @Benchmark
    @Override
    public void fastjson() {
        UserCollection[] arr = JsonSource.jsonAsObject;
        for (int i = 0; i < arr.length; i++) {
            String v = JSON.toJSONString(arr[i]);
            if (consumer != null) {
                consumer.accept(i, v);
            }
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
        UserCollection[] arr = JsonSource.jsonAsObject;
        for (int i = 0; i < arr.length; i++) {
            String v = FLEXJSON_SER.serialize(arr[i]);
            if (consumer != null) {
                consumer.accept(i, v);
            }
        }
    }

    @Override
    public void jsonio() throws Exception {
    }

    @Benchmark
    @Override
    public void boon() {
        UserCollection[] arr = JsonSource.jsonAsObject;
        for (int i = 0; i < arr.length; i++) {
            String v = BOON.writeValueAsString(arr[i]);
            if (consumer != null) {
                consumer.accept(i, v);
            }
        }
    }

    @Benchmark
    @Override
    public void johnson() {
        UserCollection[] arr = JsonSource.jsonAsObject;
        for (int i = 0; i < arr.length; i++) {
            String v = JOHNSON.writeObjectAsString(arr[i]);
            if (consumer != null) {
                consumer.accept(i, v);
            }
        }
    }
}
