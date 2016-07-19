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
    public static final org.boon.json.ObjectMapper BOON = org.boon.json.JsonFactory.create();
    public static final JSONDeserializer<UserCollection> FLEXJSON_DESER = new JSONDeserializer<>();
    public static final JSONSerializer FLEXJSON_SER = new JSONSerializer();
    public static final org.apache.johnzon.mapper.Mapper JOHNSON;

    public static final Map<String, Object> JSONIO_STREAM_OPTIONS = new HashMap<>();

    static {
        JACKSON_AFTERBURNER.registerModule(new AfterburnerModule());

        JSONIO_STREAM_OPTIONS.put(JsonReader.USE_MAPS, true);
        JSONIO_STREAM_OPTIONS.put(JsonWriter.TYPE, false);

        JOHNSON = new org.apache.johnzon.mapper.MapperBuilder()
            .setAccessModeName("field") // default is "strict-method" which doesn't work nicely with public attributes
            .build();
    }

    public static void assertTrue(boolean b) {
        if (!b) {
            throw new IllegalStateException();
        }
    }

}
