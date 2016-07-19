package com.github.fabienrenaud.jjb;

import org.junit.BeforeClass;

/**
 * @author Fabien Renaud
 */
public class StreamDeserializationTest extends JsonBenchTest {

    @BeforeClass
    public static void setUpClass() {
        BENCH = new StreamDeserialization();
    }

    @Override
    public void jackson_afterburner() throws Exception {
    }

    @Override
    public void flexjson() throws Exception {
    }

    @Override
    public void fastjson() throws Exception {
    }

    @Override
    public void boon() throws Exception {
    }

    @Override
    public void johnson() throws Exception {
    }

    @Override
    public void jsonsmart() throws Exception {
    }
}
