package com.github.fabienrenaud.jjb.provider;

import com.cedarsoftware.util.io.JsonReader;
import com.cedarsoftware.util.io.JsonWriter;
import com.dslplatform.json.DslJson;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.github.fabienrenaud.jjb.model.Users;
import com.google.gson.Gson;
import com.jsoniter.extra.PreciseFloatSupport;
import com.owlike.genson.Genson;
import com.squareup.moshi.Moshi;
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
    private final org.boon.json.ObjectMapper boon = org.boon.json.JsonFactory.create();
    private final org.apache.johnzon.mapper.Mapper johnzon;
    private final com.squareup.moshi.JsonAdapter<Users> moshi = new Moshi.Builder().build().adapter(Users.class);

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

        johnzon = new org.apache.johnzon.mapper.MapperBuilder()
            .setAccessModeName("field") // default is "strict-method" which doesn't work nicely with public attributes
            .build();

        PreciseFloatSupport.enable();
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
        return FLEXJSON_SER.get();
    }

    @Override
    public org.boon.json.ObjectMapper boon() {
        return boon;
    }

    @Override
    public Mapper johnzon() {
        return johnzon;
    }

    @Override
    public Map<String, Object> jsonioStreamOptions() {
        return jsonioStreamOptions;
    }

    @Override
    public DslJson<Users> dsljson() {
        return dsljson;
    }

    @Override
    public jodd.json.JsonParser joddDeser() {
        return JODD_DESER.get();
    }

    @Override
    public jodd.json.JsonSerializer joddSer() {
        return JODD_SER.get();
    }

    @Override
    public com.squareup.moshi.JsonAdapter<Users> moshi() {
        return moshi;
    }

    private static final ThreadLocal<flexjson.JSONSerializer> FLEXJSON_SER = new ThreadLocal<flexjson.JSONSerializer>() {
        @Override
        protected JSONSerializer initialValue() {
            return new JSONSerializer();
        }
    };

    private static final ThreadLocal<jodd.json.JsonParser> JODD_DESER = new ThreadLocal<jodd.json.JsonParser>() {
        @Override
        protected jodd.json.JsonParser initialValue() {
            return new jodd.json.JsonParser();
        }
    };

    private static final ThreadLocal<jodd.json.JsonSerializer> JODD_SER = new ThreadLocal<jodd.json.JsonSerializer>() {
        @Override
        protected jodd.json.JsonSerializer initialValue() {
            return new jodd.json.JsonSerializer();
        }
    };
}
