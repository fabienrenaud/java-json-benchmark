package com.github.fabienrenaud.jjb.stream;

import com.github.fabienrenaud.jjb.JsonBenchmarkUsersTest;
import com.github.fabienrenaud.jjb.support.Api;

/**
 * @author Fabien Renaud
 */
public class SerializationTest extends JsonBenchmarkUsersTest {

    static {
        BENCH = new Serialization();
        BENCH_API = Api.STREAM;
    }
}
