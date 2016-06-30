package com.github.fabienrenaud.jjb;

import org.junit.BeforeClass;

/**
 *
 * @author Fabien Renaud
 */
public class StreamDeserializationTest extends JsonBenchTest {

    @BeforeClass
    public static void setUpClass() {
        BENCH = new StreamDeserialization();
    }

}
