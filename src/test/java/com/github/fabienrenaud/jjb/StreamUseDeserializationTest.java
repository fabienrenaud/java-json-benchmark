package com.github.fabienrenaud.jjb;

import org.junit.BeforeClass;

/**
 *
 * @author Fabien Renaud
 */
public class StreamUseDeserializationTest extends JsonBenchTest {

    @BeforeClass
    public static void setUpClass() {
        BENCH = new StreamUseDeserialization();
    }

}
