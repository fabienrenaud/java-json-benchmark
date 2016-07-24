package com.github.fabienrenaud.jjb.stream;

import com.github.fabienrenaud.jjb.JsonBenchmarkUsersTest;

/**
 * @author Fabien Renaud
 */
public class SerializationTest extends JsonBenchmarkUsersTest {

    static {
        BENCH = new Serialization();
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
