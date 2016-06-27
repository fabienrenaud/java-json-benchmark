package com.github.fabienrenaud.jjb;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.google.gson.Gson;
import com.owlike.genson.Genson;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

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

    static {
        JACKSON_AFTERBURNER.registerModule(new AfterburnerModule());
    }

    public static void assertTrue(boolean b) {
        if (!b) {
            throw new IllegalStateException();
        }
    }

}
