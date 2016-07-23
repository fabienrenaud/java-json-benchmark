package com.github.fabienrenaud.jjb.databind;

import com.github.fabienrenaud.jjb.JsonBenchTest;

/**
 * @author Fabien Renaud
 */
public class SerializationTest extends JsonBenchTest {

    static {
        BENCH = new Serialization();
    }

    @Override
    public void boon() throws Exception {
        // FIXME: boon turns empty list to null values which makes this test fail.
    }

    @Override
    public void orgjson() throws Exception {
    }

    @Override
    public void jsonp() throws Exception {
    }

    @Override
    public void jsonio() throws Exception {
    }
}
