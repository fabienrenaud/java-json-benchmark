package com.github.fabienrenaud.jjb.databind;

import com.github.fabienrenaud.jjb.JsonBenchTest;

/**
 * @author Fabien Renaud
 */
public class DeserializationTest extends JsonBenchTest {

    static {
        BENCH = new Deserialization();
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
