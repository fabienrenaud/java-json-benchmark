package com.github.fabienrenaud.jjb;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.owlike.genson.stream.ObjectReader;
import com.owlike.genson.stream.ObjectWriter;
import org.json.JSONObject;
import org.openjdk.jmh.annotations.Benchmark;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Fabien Renaud
 */
public class StreamSerialization extends JsonBase {

    private static final Collection<JSONObject> ORGJSON_OBJS = new ArrayList<>(JsonSource.SIZE);
    private static final Collection<javax.json.JsonObject> JSONP_OBJS = new ArrayList<>(JsonSource.SIZE);
    private static final Collection<SmallPojo> JACKSON_OBJS = new ArrayList<>(JsonSource.SIZE);
    private static final Collection<SmallPojo> GSON_OBJS = new ArrayList<>(JsonSource.SIZE);
    private static final Collection<SmallPojo> GENSON_OBJS = new ArrayList<>(JsonSource.SIZE);
    private static final Collection<Object> JSONIO_OBJS = new ArrayList<>(JsonSource.SIZE);

    static {
        try {
            for (String jsonText : JsonSource.SMALL_JSON_TEXT.values()) {
                JSONObject jso = new JSONObject(jsonText);
                ORGJSON_OBJS.add(jso);

                SmallPojo node;
                try (JsonParser jParser = JACKSON_FACTORY.createParser(jsonText)) {
                    node = JacksonStreamHelper.deserializeSmallPojo(jParser);
                }
                JACKSON_OBJS.add(node);

                try (com.google.gson.stream.JsonReader jr = new com.google.gson.stream.JsonReader(new StringReader(jsonText))) {
                    node = GsonStreamHelper.deserializeSmallPojo(jr);
                }
                GSON_OBJS.add(node);

                Object obj = com.cedarsoftware.util.io.JsonReader.jsonToJava(jsonText, JSONIO_STREAM_OPTIONS);
                JSONIO_OBJS.add(obj);
            }

            for (byte[] jsonBytes : JsonSource.SMALL_JSON_BYTES.values()) {
                javax.json.JsonReader jsoReader = javax.json.Json.createReader(new ByteArrayInputStream(jsonBytes));
                javax.json.JsonObject jso = jsoReader.readObject();
                JSONP_OBJS.add(jso);

                SmallPojo node;
                try (ObjectReader r = GENSON.createReader(jsonBytes)) {
                    node = GensonStreamHelper.deserializeSmallPojo(r);
                }
                GENSON_OBJS.add(node);
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Benchmark
    @Override
    public void orgjson() {
        for (JSONObject o : ORGJSON_OBJS) {
            String v = o.toString();
            assertTrue(v != null);
        }
    }

    @Benchmark
    @Override
    public void jsonp() throws Exception {
        for (javax.json.JsonObject o : JSONP_OBJS) {
            OutputStream os = new ByteArrayOutputStream();
            javax.json.JsonWriter jw = javax.json.Json.createWriter(os);
            jw.writeObject(o);
            os.close();
        }
    }

    @Benchmark
    @Override
    public void jackson() throws Exception {
        for (SmallPojo o : JACKSON_OBJS) {
            OutputStream os = new ByteArrayOutputStream();
            try (JsonGenerator jGenerator = JACKSON_FACTORY.createGenerator(os)) {
                JacksonStreamHelper.serializeSmallPojo(jGenerator, o);
            }
        }
    }

    @Benchmark
    @Override
    public void gson() throws Exception {
        for (SmallPojo o : GSON_OBJS) {
            Writer w = new OutputStreamWriter(new ByteArrayOutputStream());
            StringWriter sw = new StringWriter();
            try (com.google.gson.stream.JsonWriter jw = new com.google.gson.stream.JsonWriter(w)) {
                GsonStreamHelper.serializeSmallPojo(jw, o);
            }
            w.close();
        }
    }

    @Override
    public void jackson_afterburner() throws Exception {
    }

    @Benchmark
    @Override
    public void genson() throws Exception {
        for (SmallPojo o : GENSON_OBJS) {
            OutputStream os = new ByteArrayOutputStream();
            ObjectWriter ow = GENSON.createWriter(os);
            GensonStreamHelper.serializeSmallPojo(ow, o);
            ow.close();
            os.close();
        }
    }

    @Override
    public void flexjson() throws Exception {
    }

    @Override
    public void fastjson() throws Exception {
    }

    @Benchmark
    @Override
    public void jsonio() throws Exception {
        for (Object o : JSONIO_OBJS) {
            String v = com.cedarsoftware.util.io.JsonWriter.objectToJson(o);
            assertTrue(v != null);
        }
    }
}
