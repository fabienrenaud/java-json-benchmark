package com.github.fabienrenaud.jjb;

import org.junit.BeforeClass;

/**
 *
 * @author Fabien Renaud
 */
public class DatabindSerializationTest extends JsonBenchTest {

    @BeforeClass
    public static void setUpClass() {
        BENCH = new DatabindSerialization();
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
