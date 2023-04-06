package com.github.fabienrenaud.jjb.provider;

import com.cedarsoftware.util.io.JsonReader;
import com.cedarsoftware.util.io.JsonWriter;
import com.dslplatform.json.DslJson;
import com.dslplatform.json.runtime.Settings;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.fasterxml.jackson.module.blackbird.BlackbirdModule;
import com.github.fabienrenaud.jjb.model.Users;
import com.google.gson.Gson;
import com.owlike.genson.Genson;
import com.squareup.moshi.Moshi;

import flexjson.JSONDeserializer;
import io.avaje.jsonb.JsonType;
import io.avaje.jsonb.stream.JsonStream;
import io.avaje.jsonb.jackson.JacksonAdapter;
import io.quarkus.qson.generator.QsonMapper;
import org.apache.johnzon.core.JsonProviderImpl;
import org.apache.johnzon.mapper.Mapper;
import org.eclipse.yasson.JsonBindingProvider;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import jakarta.json.bind.Jsonb;

public class UsersJsonProvider implements JsonProvider<Users> {

    private final Gson gson = new Gson();
    private final jakarta.json.stream.JsonGeneratorFactory jakartaJsonFactory = jakarta.json.Json.createGeneratorFactory(null);
    private final ObjectMapper jackson = new ObjectMapper();
    private final ObjectMapper jacksonAfterburner = new ObjectMapper()
            .registerModule(new AfterburnerModule());
    private final ObjectMapper jacksonBlackbird = new ObjectMapper()
            .registerModule(new BlackbirdModule());
    private final JsonFactory jacksonFactory = new JsonFactory();
    private final Genson genson = new Genson();
    private final Jsonb yasson = new JsonBindingProvider().create()
            .withProvider(new org.glassfish.json.JsonProviderImpl())
            .build();
    private final JSONDeserializer<Users> flexjsonDeser = new JSONDeserializer<>();
    private final org.boon.json.ObjectMapper boon = org.boon.json.JsonFactory.create();
    private final org.apache.johnzon.mapper.Mapper johnzon;
    private final com.squareup.moshi.JsonAdapter<Users> moshi = new Moshi.Builder().build().adapter(Users.class);
    private final QsonMapper qson = new QsonMapper();

    /*
     * DSL-json
     */
    private final DslJson<Object> dsljson = new DslJson<>(Settings.withRuntime().includeServiceLoader());
    private final DslJson<Object> dsljson_reflection = new DslJson<>(Settings.withRuntime());//don't include generated classes

    private final Map<String, Object> jsonioStreamOptions = new HashMap<>();

    private final JsonType<Users> avajeJsonb_jackson = io.avaje.jsonb.Jsonb.newBuilder().adapter(new JacksonAdapter(/* serializeNulls */ true, /* serializeEmpty */ true, /* failOnUnknown */ false)).build().type(Users.class);
    private final JsonType<Users> avajeJsonb_default = io.avaje.jsonb.Jsonb.newBuilder().adapter(new JsonStream(/* serializeNulls */ true, /* serializeEmpty */ true, /* failOnUnknown */ false)).build().type(Users.class);

    public UsersJsonProvider() {
        jsonioStreamOptions.put(JsonReader.USE_MAPS, true);
        jsonioStreamOptions.put(JsonWriter.TYPE, false);

        // set johnson JsonReader (default is `JsonProvider.provider()`)
        jakarta.json.spi.JsonProvider johnzonProvider = new JsonProviderImpl();
        johnzon = new org.apache.johnzon.mapper.MapperBuilder()
            .setReaderFactory(johnzonProvider.createReaderFactory(Collections.emptyMap()))
            .setGeneratorFactory(johnzonProvider.createGeneratorFactory(Collections.emptyMap()))
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
    public ObjectMapper jacksonBlackbird() {
        return jacksonBlackbird;
    }

    @Override
    public JsonFactory jacksonFactory() {
        return jacksonFactory;
    }

    @Override
    public jakarta.json.stream.JsonGeneratorFactory jakartajsonFactory() {
        return jakartaJsonFactory;
    }

    @Override
    public Genson genson() {
        return genson;
    }

    @Override
    public Jsonb yasson() {
        return yasson;
    }

    public JSONDeserializer<Users> flexjsonDeser() {
        return flexjsonDeser;
    }

    public flexjson.JSONSerializer flexjsonSer() {
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
    public DslJson<Object> dsljson() {
        return dsljson;
    }

    @Override
    public DslJson<Object> dsljson_reflection() {
        return dsljson_reflection;
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

    @Override
    public JsonType<Users> avajeJsonb_jackson() {
        return avajeJsonb_jackson;
    }

    @Override
    public JsonType<Users> avajeJsonb_default() {
        return avajeJsonb_default;
    }

    private static final ThreadLocal<flexjson.JSONSerializer> FLEXJSON_SER = ThreadLocal.withInitial(flexjson.JSONSerializer::new);

    @Override
    public QsonMapper qson() {
        return qson;
    }

    private static final ThreadLocal<jodd.json.JsonParser> JODD_DESER = ThreadLocal.withInitial(jodd.json.JsonParser::new);

    private static final ThreadLocal<jodd.json.JsonSerializer> JODD_SER = ThreadLocal.withInitial(jodd.json.JsonSerializer::new);
}
