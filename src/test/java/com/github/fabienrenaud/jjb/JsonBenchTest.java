package com.github.fabienrenaud.jjb;

import com.github.fabienrenaud.jjb.model.UserCollection;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.fail;

/**
 * Created by frenaud on 6/30/16.
 */
public abstract class JsonBenchTest {

    static JsonBench BENCH;

    static {
        JsonSource.init(new JsonSource.InitParams(2, 1));
    }

    private static void test(Object o) {
        if (o instanceof UserCollection) {
            testUserCollection((UserCollection) o);
        } else if (o instanceof com.cedarsoftware.util.io.JsonObject) {
            String v = com.cedarsoftware.util.io.JsonWriter.objectToJson(o, JsonBase.JSONIO_STREAM_OPTIONS);
            testString(v);
        } else {
            testString(o.toString());
        }
    }

    private static void testString(String v) {
        try {
            UserCollection uc = JsonBase.JACKSON_AFTERBURNER.readValue(v, UserCollection.class);
            testUserCollection(uc);
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    private static void testUserCollection(UserCollection o) {
        UserCollection original = JsonSource.nextPojo();
        if (!o.equals(original)) {
            System.out.println("Difference in UserCollection!");
            System.out.println("   Original   : " + original);
            System.out.println("   Transformed: " + o);
            System.out.println();
            fail();
        }
    }

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
        test(BENCH.jsonp());
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
}
