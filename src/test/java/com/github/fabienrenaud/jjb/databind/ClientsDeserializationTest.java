package com.github.fabienrenaud.jjb.databind;

import com.github.fabienrenaud.jjb.JsonBenchmarkClientsTest;
import com.github.fabienrenaud.jjb.support.Api;

public class ClientsDeserializationTest extends JsonBenchmarkClientsTest {

    static {
        BENCH = new Deserialization();
        BENCH_API = Api.DATABIND;
    }

}
