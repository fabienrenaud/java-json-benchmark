package com.github.fabienrenaud.jjb;

import com.github.fabienrenaud.jjb.model.UserCollection;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.fail;

/**
 * Created by frenaud on 6/30/16.
 */
public abstract class JsonBenchTest implements JsonBench {

    static JsonBench BENCH;

    static {
        JsonSource.init(2, 10);
        JsonBase.consumer = JsonBenchTest::test;
    }

    private static void test(int i, Object o) {
        if (o instanceof UserCollection) {
            testUserCollection(i, (UserCollection) o);
        } else if (o instanceof com.cedarsoftware.util.io.JsonObject) {
            String v = com.cedarsoftware.util.io.JsonWriter.objectToJson(o, JsonBase.JSONIO_STREAM_OPTIONS);
            testString(i, v);
        } else {
            testString(i, o.toString());
        }
    }

    private static void testString(int i, String v) {
        try {
            UserCollection uc = JsonBase.JACKSON_AFTERBURNER.readValue(v, UserCollection.class);
            testUserCollection(i, uc);
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    private static void testUserCollection(int i, UserCollection o) {
        if (!o.equals(JsonSource.jsonAsObject[i])) {
            System.out.println("Difference in UserCollection!");
            System.out.println("   Original   : " + JsonSource.jsonAsObject[i]);
            System.out.println("   Transformed: " + o);
            System.out.println();
            fail();
        }
    }

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
        BENCH.jsonio();
    }
}
