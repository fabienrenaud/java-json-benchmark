package com.github.fabienrenaud.jjb.databind;

import com.github.fabienrenaud.jjb.JsonBenchmarkUsersTest;

/**
 * @author Fabien Renaud
 */
public class DeserializationTest extends JsonBenchmarkUsersTest {

    static {
        BENCH = new Deserialization();
    }

}
