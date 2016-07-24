package com.github.fabienrenaud.jjb.stream;

import com.fasterxml.jackson.core.JsonGenerator;
import com.github.fabienrenaud.jjb.JsonBench;
import com.owlike.genson.stream.ObjectWriter;
import org.openjdk.jmh.annotations.Benchmark;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * @author Fabien Renaud
 */
public class Serialization extends JsonBench {

    @Benchmark
    @Override
    public Object orgjson() {
        return JSON_SOURCE.nextJsonAsOrgJsonObject().toString();
    }

    @Benchmark
    @Override
    public Object javaxjson() throws Exception {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        javax.json.JsonWriter jw = javax.json.Json.createWriter(os);
        jw.writeObject(JSON_SOURCE.nextJsonAsJavaxJsonObject());
        jw.close();
        os.close();
        return os;
    }

    @Benchmark
    @Override
    public Object jackson() throws Exception {
        OutputStream os = new ByteArrayOutputStream();
        try (JsonGenerator jGenerator = JSON_SOURCE.provider().jacksonFactory().createGenerator(os)) {
            Object obj = null;
            JSON_SOURCE.streamSerializer().jackson(jGenerator, JSON_SOURCE.nextPojo());
        }
        os.close();
        return os;
    }

    @Benchmark
    @Override
    public Object gson() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Writer w = new OutputStreamWriter(bos);
        try (com.google.gson.stream.JsonWriter jw = new com.google.gson.stream.JsonWriter(w)) {
            JSON_SOURCE.streamSerializer().gson(jw, JSON_SOURCE.nextPojo());
        }
        w.close();
        return bos;
    }

    @Benchmark
    @Override
    public Object genson() throws Exception {
        OutputStream os = new ByteArrayOutputStream();
        ObjectWriter ow = JSON_SOURCE.provider().genson().createWriter(os);
        JSON_SOURCE.streamSerializer().genson(ow, JSON_SOURCE.nextPojo());
        ow.close();
        os.close();
        return os;
    }

    @Benchmark
    @Override
    public Object jsonio() throws Exception {
        return com.cedarsoftware.util.io.JsonWriter.objectToJson(JSON_SOURCE.nextPojo(), JSON_SOURCE.provider().jsonioStreamOptions());
    }
}
