package com.github.fabienrenaud.jjb;

import com.github.fabienrenaud.jjb.model.Users;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.fail;

/**
 * Created by frenaud on 7/23/16.
 */
public abstract class JsonBenchmark<T> {

    public static JsonBench BENCH;

    protected void test(Object o) {
        if (o == null) { // no computation
            return;
        }

        if (o instanceof Users) {
            testPojo((T) o);
        } else if (o instanceof com.cedarsoftware.util.io.JsonObject) {
            String v = com.cedarsoftware.util.io.JsonWriter.objectToJson(o, BENCH.JSON_SOURCE.provider().jsonioStreamOptions());
            testString(v);
        } else {
            testString(o.toString());
        }
    }

    private void testString(String v) {
        try {
            testPojo(BENCH.JSON_SOURCE.provider().jackson().readValue(v, pojoType()));
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    protected abstract void testPojo(T obj);

    protected abstract Class<T> pojoType();

    @Test
    public void gson() throws Exception {
        test(BENCH.gson());
    }

    @Test
    public void jackson() throws Exception {
        test(BENCH.jackson());
    }

    @Test
    public void jackson_afterburner() throws Exception {
        test(BENCH.jackson_afterburner());
    }

    @Test
    public void orgjson() throws Exception {
        test(BENCH.orgjson());
    }

    @Test
    public void genson() throws Exception {
        test(BENCH.genson());
    }

    @Test
    public void jsonp() throws Exception {
        test(BENCH.javaxjson());
    }

    @Test
    @Ignore
    public void flexjson() throws Exception {
        test(BENCH.flexjson());
    }

    @Test
    public void fastjson() throws Exception {
        test(BENCH.fastjson());
    }

    @Test
    public void jsonio() throws Exception {
        test(BENCH.jsonio());
    }

    @Test
    public void boon() throws Exception {
        test(BENCH.boon());
    }

    @Test
    public void johnson() throws Exception {
        test(BENCH.johnson());
    }

    @Test
    public void jsonsmart() throws Exception {
        test(BENCH.jsonsmart());
    }

    @Test
    public void dsljson() throws Exception {
        test(BENCH.dsljson());
    }

    @Test
    public void logansquare() throws Exception {
        test(BENCH.logansquare());
    }
}
