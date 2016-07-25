package com.github.fabienrenaud.jjb.databind;

import com.github.fabienrenaud.jjb.JsonBenchmarkUsersTest;
import com.github.fabienrenaud.jjb.support.Api;

/**
 * @author Fabien Renaud
 */
public class DeserializationTest extends JsonBenchmarkUsersTest {

    static {
        BENCH = new Deserialization();
        BENCH_API = Api.DATABIND;
    }

}
