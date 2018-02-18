package com.github.fabienrenaud.jjb.data.gen;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.fabienrenaud.jjb.model.Clients;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class ClientsGeneratorTest {

    private static final int MARGIN_ERROR = 10; // %
    private static final ObjectMapper JACKSON = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

    private static final ClientsGenerator CLIENTS_GENERATOR = new ClientsGenerator();

    @Test
    public void populateClientCollection_1k() throws IOException {
        populateClientCollection(1000);
    }

    @Test
    public void populateClientCollection_10k() throws IOException {
        populateClientCollection(10000);
    }

    @Test
    public void populateClientCollection_100k() throws IOException {
        populateClientCollection(100000);
    }

    @Test
    public void populateClientCollection_1m() throws IOException {
        populateClientCollection(1000000);
    }

    private void populateClientCollection(int size) throws IOException {
        Clients uc = new Clients();
        int approxSize = CLIENTS_GENERATOR.populate(uc, size);
        String v = JACKSON.writeValueAsString(uc);
        int realSize = v.getBytes().length;
        int maxAllowedSIze = realSize + (realSize / MARGIN_ERROR);
        int minAllowedSIze = realSize - (realSize / MARGIN_ERROR);

        assertTrue("Generated payload is bigger than the maximum expected. Got: " + approxSize + ". Max expected: " + maxAllowedSIze, approxSize <= maxAllowedSIze);
        assertTrue("Generated payload is smaller than the minimum expected. Got: " + approxSize + ". Min expected: " + minAllowedSIze, approxSize >= minAllowedSIze);
    }
}
