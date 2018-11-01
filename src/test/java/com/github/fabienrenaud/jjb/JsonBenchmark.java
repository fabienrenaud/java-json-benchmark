package com.github.fabienrenaud.jjb;

import com.github.fabienrenaud.jjb.model.Clients;
import com.github.fabienrenaud.jjb.model.Users;
import com.github.fabienrenaud.jjb.support.Api;
import com.github.fabienrenaud.jjb.support.BenchSupport;
import com.github.fabienrenaud.jjb.support.Library;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

/**
 * Created by frenaud on 7/23/16.
 */
public abstract class JsonBenchmark<T> {

    public final JsonBench BENCH;
    public final BenchSupport BENCH_SUPPORT;
    public final Api BENCH_API;

    public JsonBenchmark(JsonBench BENCH, BenchSupport BENCH_SUPPORT, Api BENCH_API) {
        this.BENCH = BENCH;
        this.BENCH_SUPPORT = BENCH_SUPPORT;
        this.BENCH_API = BENCH_API;
    }

    private static final int ITERATIONS = 3;

    protected void test(final Library lib, final Object o) {
        if (o == null) { // means it shouldn't be supported.
            assertFalse("Library '" + lib + "' for api '" + BENCH_API + " returned null", supports(lib));
            return;
        }

        if (o instanceof Users || o instanceof Clients) {
            testPojo((T) o);
        } else if (o instanceof com.cedarsoftware.util.io.JsonObject) {
            String v = com.cedarsoftware.util.io.JsonWriter.objectToJson(o, BENCH.JSON_SOURCE().provider().jsonioStreamOptions());
            testString(v);
        } else if (o instanceof com.grack.nanojson.JsonObject) {
            String v = com.grack.nanojson.JsonWriter.string(o);
            testString(v);
        } else {
            testString(o.toString());
        }
    }

    private void testString(String v) {
        try {
            testPojo(BENCH.JSON_SOURCE().provider().jackson().readValue(v, pojoType()));
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    private boolean supports(final Library lib) {
        return BENCH_SUPPORT.libapis().stream()
            .anyMatch((l) -> l.lib() == lib && l.active() && l.api().contains(BENCH_API));
    }

    protected abstract void testPojo(T obj);

    protected abstract Class<T> pojoType();

    @Test
    public void gson() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.GSON, BENCH.gson());
        }
    }

    @Test
    public void jackson() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.JACKSON, BENCH.jackson());
        }
    }

    @Test
    public void jackson_afterburner() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.JACKSON_AFTERBURNER, BENCH.jackson_afterburner());
        }
    }

    @Test
    public void orgjson() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.ORGJSON, BENCH.orgjson());
        }
    }

    @Test
    public void genson() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.GENSON, BENCH.genson());
        }
    }

    @Test
    public void yasson() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.YASSON, BENCH.yasson());
        }
    }

    @Test
    public void javaxjson() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.JAVAXJSON, BENCH.javaxjson());
        }
    }

    @Test
    public void flexjson() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.FLEXJSON, BENCH.flexjson());
        }
    }

    @Test
    public void fastjson() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.FASTJSON, BENCH.fastjson());
        }
    }

    @Test
    public void jsonio() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.JSONIO, BENCH.jsonio());
        }
    }

    @Test
    public void boon() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.BOON, BENCH.boon());
        }
    }

    @Test
    public void johnzon() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.JOHNZON, BENCH.johnzon());
        }
    }

    @Test
    public void jsonsmart() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.JSONSMART, BENCH.jsonsmart());
        }
    }

    @Test
    public void dsljson() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.DSLJSON, BENCH.dsljson());
        }
    }

    @Test
    public void dsljson_reflection() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.DSLJSON_REFLECTION, BENCH.dsljson_reflection());
        }
    }

    @Test
    public void logansquare() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.LOGANSQUARE, BENCH.logansquare());
        }
    }

    @Test
    public void jsonsimple() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.JSONSIMPLE, BENCH.jsonsimple());
        }
    }

    @Test
    public void nanojson() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.NANOJSON, BENCH.nanojson());
        }
    }

    @Test
    public void jodd() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.JODD, BENCH.jodd());
        }
    }

    @Test
    public void moshi() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.MOSHI, BENCH.moshi());
        }
    }

    @Test
    public void tapestry() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.TAPESTRY, BENCH.tapestry());
        }
    }

    @Test
    public void jsoniter() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.JSONITER, BENCH.jsoniter());
        }
    }

    @Test
    public void minimaljson() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.MINIMALJSON, BENCH.minimaljson());
        }
    }

    @Test
    public void mjson() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.MJSON, BENCH.mjson());
        }
    }

    @Test
    public void underscore_java() throws Exception {
        for (int i = 0; i < ITERATIONS; i++) {
            test(Library.UNDERSCORE_JAVA, BENCH.underscore_java());
        }
    }
}
