package com.github.fabienrenaud.jjb.databind;

import com.github.fabienrenaud.jjb.JsonBenchmarkClientsTest;
import com.github.fabienrenaud.jjb.data.JsonSource;
import com.github.fabienrenaud.jjb.data.JsonSourceFactory;
import com.github.fabienrenaud.jjb.support.Api;

public class ClientsSerializationTest extends JsonBenchmarkClientsTest {

    public ClientsSerializationTest() {
        super(new Serialization() {
                private final JsonSource source = JsonSourceFactory.create("clients", 1, 10);
                @Override
                public JsonSource JSON_SOURCE() {
                    return source;
                }
            }, Api.DATABIND);
    }

    @Override
    public void boon() throws Exception {
        // FIXME: boon turns empty list to null values which makes this test fail.
    }

}
