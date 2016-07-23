package com.github.fabienrenaud.jjb;

import com.github.fabienrenaud.jjb.model.Users;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.fail;

/**
 * Created by frenaud on 6/30/16.
 */
public abstract class JsonBenchTest {

    public static JsonBench BENCH;
    private static File configFile;

    @BeforeClass
    public static void setUpClass() {
        Cli.AbstractCommand ser = new Cli.SerializationCommand();
        ser.dataType = "Users";
        ser.numberOfPayloads = 1;
        ser.sizeOfEachPayloadInKb = 2;
        configFile = Config.save(ser);
    }

    @AfterClass
    public static void tearDownClass() {
        configFile.delete();
    }

    private static void test(Object o) {
        if (o instanceof Users) {
            testUserCollection((Users) o);
        } else if (o instanceof com.cedarsoftware.util.io.JsonObject) {
            String v = com.cedarsoftware.util.io.JsonWriter.objectToJson(o, JsonUtils.JSONIO_STREAM_OPTIONS);
            testString(v);
        } else {
            testString(o.toString());
        }
    }

    private static void testString(String v) {
        try {
            Users uc = JsonUtils.JACKSON_AFTERBURNER.readValue(v, Users.class);
            testUserCollection(uc);
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
    }

    private static void testUserCollection(Users o) {
        Object original = JsonUtils.JSON_SOURCE.nextPojo();
        if (!o.equals(original)) {
            System.out.println("Difference in Users!");
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
