package com.github.fabienrenaud.jjb.databind;

import com.github.fabienrenaud.jjb.JsonBenchmarkClientsTest;
import com.github.fabienrenaud.jjb.data.JsonSource;
import com.github.fabienrenaud.jjb.data.JsonSourceFactory;
import com.github.fabienrenaud.jjb.support.Api;

public class ClientsDeserializationTest extends JsonBenchmarkClientsTest {

    public ClientsDeserializationTest() {
        super(new Deserialization() {
            private final JsonSource source = JsonSourceFactory.create("clients", 1, 10);
            @Override
            public JsonSource JSON_SOURCE() {
                return source;
            }
        }, Api.DATABIND);
    }

    @Override
    public void jsoniter() throws Exception {
        // FIXME: unsupported UUID
    }
}
