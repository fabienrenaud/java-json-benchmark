package com.github.fabienrenaud.jjb;

import com.cedarsoftware.util.io.JsonReader;
import com.cedarsoftware.util.io.JsonWriter;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.github.fabienrenaud.jjb.model.UserCollection;
import com.google.gson.Gson;
import com.owlike.genson.Genson;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

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
    public static final JSONDeserializer<UserCollection> FLEXJSON_DESER = new JSONDeserializer<>();
    public static final JSONSerializer FLEXJSON_SER = new JSONSerializer();

    public static final Map<String, Object> JSONIO_STREAM_OPTIONS = new HashMap<>();

    static BiConsumer<Integer, Object> consumer;

    static {
        JACKSON_AFTERBURNER.registerModule(new AfterburnerModule());

        JSONIO_STREAM_OPTIONS.put(JsonReader.USE_MAPS, true);
        JSONIO_STREAM_OPTIONS.put(JsonWriter.TYPE, false);
    }

    public static void assertTrue(boolean b) {
        if (!b) {
            throw new IllegalStateException();
        }
    }

}
