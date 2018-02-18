package com.github.fabienrenaud.jjb.databind;

import com.github.fabienrenaud.jjb.JsonBenchmarkClientsTest;
import com.github.fabienrenaud.jjb.support.Api;

public class ClientsSerializationTest extends JsonBenchmarkClientsTest {

    static {
        BENCH = new Serialization();
        BENCH_API = Api.DATABIND;
    }

    @Override
    public void boon() throws Exception {
        // FIXME: boon turns empty list to null values which makes this test fail.
    }

}
