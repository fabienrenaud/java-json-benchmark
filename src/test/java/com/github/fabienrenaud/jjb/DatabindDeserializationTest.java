package com.github.fabienrenaud.jjb;

import com.github.fabienrenaud.jjb.JsonBench;
import com.github.fabienrenaud.jjb.DatabindDeserialization;
import org.junit.Test;
import org.junit.Ignore;

/**
 *
 * @author Fabien Renaud
 */
public class DatabindDeserializationTest implements JsonBench {

    private static final JsonBench BENCH = new DatabindDeserialization();

    @Test
    @Override
    public void gson() throws Exception {
        BENCH.gson();
    }

    @Test
    @Override
    public void jackson() throws Exception {
        BENCH.jackson();
    }

    @Test
    @Override
    public void jackson_afterburner() throws Exception {
        BENCH.jackson_afterburner();
    }

    @Test
    @Override
    public void orgjson() throws Exception {
        BENCH.orgjson();
    }

    @Test
    @Override
    public void genson() throws Exception {
        BENCH.genson();
    }

    @Test
    @Override
    public void jsonp() throws Exception {
        BENCH.jsonp();
    }

    @Test
    @Ignore
    @Override
    public void flexjson() throws Exception {
        BENCH.flexjson();
    }

    @Test
    @Override
    public void fastjson() throws Exception {
        BENCH.fastjson();
    }

}
