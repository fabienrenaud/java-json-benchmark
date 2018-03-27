package com.github.fabienrenaud.jjb;

import com.github.fabienrenaud.jjb.model.Clients;
import com.github.fabienrenaud.jjb.support.Api;
import com.github.fabienrenaud.jjb.support.BenchSupport;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.File;

import static org.junit.Assert.fail;

public abstract class JsonBenchmarkClientsTest extends JsonBenchmark<Clients> {

    private static File configFile;

    public JsonBenchmarkClientsTest(JsonBench BENCH, Api BENCH_API) {
        super(BENCH, BenchSupport.CLIENTS, BENCH_API);
    }

    @BeforeClass
    public static void setUpClass() {
        Cli.AbstractCommand ser = new Cli.SerializationCommand();
        ser.dataType = "clients";
        ser.numberOfPayloads = 1;
        ser.sizeOfEachPayloadInKb = 2;
        configFile = Config.save(ser);
    }

    @AfterClass
    public static void tearDownClass() {
        configFile.delete();
    }

    @Override
    protected void testPojo(Clients o) {
        Object original = BENCH.JSON_SOURCE().nextPojo();
        if (!o.equals(original)) {
            System.out.println("Difference in Clients!");
            System.out.println("   Original   : " + original);
            System.out.println("   Transformed: " + o);
            System.out.println();
            fail();
        }
    }

    @Override
    protected Class<Clients> pojoType() {
        return Clients.class;
    }

}
