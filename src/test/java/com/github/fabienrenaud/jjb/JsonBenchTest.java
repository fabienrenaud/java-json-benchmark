package com.github.fabienrenaud.jjb;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by frenaud on 6/30/16.
 */
public abstract class JsonBenchTest implements JsonBench {

    static JsonBench BENCH;

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

    @Test
    @Override
    public void jsonio() throws Exception {
        BENCH.fastjson();
    }
}
