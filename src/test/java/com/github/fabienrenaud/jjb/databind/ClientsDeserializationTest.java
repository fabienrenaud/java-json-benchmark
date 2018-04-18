package com.github.fabienrenaud.jjb.databind;

import com.github.fabienrenaud.jjb.JsonBenchmarkClientsTest;
import com.github.fabienrenaud.jjb.data.JsonSource;
import com.github.fabienrenaud.jjb.data.JsonSourceFactory;
import com.github.fabienrenaud.jjb.support.Api;

public class ClientsDeserializationTest extends JsonBenchmarkClientsTest {

    public ClientsDeserializationTest() {
        super(new Deserialization() {
            private final JsonSource source = JsonSourceFactory.create("clients", 1, 2000);
            @Override
            public JsonSource JSON_SOURCE() {
                return source;
            }
        }, Api.DATABIND);
    }

    @Override
    public void yasson() throws Exception {
        // FIXME: yasson fails on UUID
    }

    @Override
    public void boon() throws Exception {
        // FIXME: does not support LocalDate
    }

    @Override
    public void genson() throws Exception {
        // FIXME: does not support BigDecimal correctly
    }

    @Override
    public void jsonsmart() throws Exception {
        // FIXME: null error
    }

    @Override
    public void johnzon() throws Exception {
        // FIXME: does not work
    }
}
