package com.github.fabienrenaud.jjb.provider;

import com.cedarsoftware.util.io.JsonReader;
import com.cedarsoftware.util.io.JsonWriter;
import com.dslplatform.json.DslJson;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.github.fabienrenaud.jjb.model.Users;
import com.google.gson.Gson;
import com.owlike.genson.Genson;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import org.apache.johnzon.mapper.Mapper;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by frenaud on 7/24/16.
 */
public class UsersJsonProvider implements JsonProvider<Users> {

    private final Gson gson = new Gson();
    private final ObjectMapper jackson = new ObjectMapper();
    private final ObjectMapper jacksonAfterburner = new ObjectMapper();
    private final JsonFactory jacksonFactory = new JsonFactory();
    private final Genson genson = new Genson();
    private final JSONDeserializer<Users> flexjsonDeser = new JSONDeserializer<>();
    private final JSONSerializer flexjsonSer = new JSONSerializer();
    private final org.boon.json.ObjectMapper boon = org.boon.json.JsonFactory.create();
    private final org.apache.johnzon.mapper.Mapper johnson;

    /*
     * DSL-json
     */
    private final DslJson<Users> dsljson = new DslJson<>();
    private final ThreadLocal<com.dslplatform.json.JsonWriter> dsljsonwriter = new ThreadLocal<>();

    private final Map<String, Object> jsonioStreamOptions = new HashMap<>();

    public UsersJsonProvider() {
        jacksonAfterburner.registerModule(new AfterburnerModule());

        jsonioStreamOptions.put(JsonReader.USE_MAPS, true);
        jsonioStreamOptions.put(JsonWriter.TYPE, false);

        johnson = new org.apache.johnzon.mapper.MapperBuilder()
            .setAccessModeName("field") // default is "strict-method" which doesn't work nicely with public attributes
            .build();
    }

    @Override
    public Gson gson() {
        return gson;
    }

    @Override
    public ObjectMapper jackson() {
        return jackson;
    }

    @Override
    public ObjectMapper jacksonAfterburner() {
        return jacksonAfterburner;
    }

    @Override
    public JsonFactory jacksonFactory() {
        return jacksonFactory;
    }

    @Override
    public Genson genson() {
        return genson;
    }

    public JSONDeserializer<Users> flexjsonDeser() {
        return flexjsonDeser;
    }

    public JSONSerializer flexjsonSer() {
        return flexjsonSer;
    }

    @Override
    public org.boon.json.ObjectMapper boon() {
        return boon;
    }

    @Override
    public Mapper johnson() {
        return johnson;
    }

    @Override
    public Map<String, Object> jsonioStreamOptions() {
        return jsonioStreamOptions;
    }

    @Override
    public DslJson<Users> dsljson() {
        return dsljson;
    }
}
