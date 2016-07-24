package com.github.fabienrenaud.jjb.databind;

import com.github.fabienrenaud.jjb.JsonBenchmarkUsersTest;

/**
 * @author Fabien Renaud
 */
public class SerializationTest extends JsonBenchmarkUsersTest {

    static {
        BENCH = new Serialization();
    }

    @Override
    public void boon() throws Exception {
        // FIXME: boon turns empty list to null values which makes this test fail.
    }

}
