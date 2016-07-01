package com.github.fabienrenaud.jjb;

import com.cedarsoftware.util.io.JsonReader;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.google.gson.Gson;
import com.owlike.genson.Genson;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

import java.util.Collections;
import java.util.Map;

/**
 *
 * @author Fabien Renaud
 */
public abstract class JsonBase implements JsonBench {

    public static final Gson GSON = new Gson();
    public static final ObjectMapper JACKSON = new ObjectMapper();
    public static final ObjectMapper JACKSON_AFTERBURNER = new ObjectMapper();
    public static final JsonFactory JACKSON_FACTORY = new JsonFactory();
    public static final Genson GENSON = new Genson();
    public static final JSONDeserializer<SmallPojo> FLEXJSON_DESER = new JSONDeserializer<>();
    public static final JSONSerializer FLEXJSON_SER = new JSONSerializer();

    public static final Map<String, Object> JSONIO_STREAM_OPTIONS = Collections.singletonMap(JsonReader.USE_MAPS, true);

    static {
        JACKSON_AFTERBURNER.registerModule(new AfterburnerModule());
    }

    public static void assertTrue(boolean b) {
        if (!b) {
            throw new IllegalStateException();
        }
    }

}
