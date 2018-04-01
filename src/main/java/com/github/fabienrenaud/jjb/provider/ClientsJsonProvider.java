package com.github.fabienrenaud.jjb.provider;

import com.cedarsoftware.util.io.JsonReader;
import com.cedarsoftware.util.io.JsonWriter;
import com.dslplatform.json.DslJson;
import com.dslplatform.json.runtime.Settings;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.github.fabienrenaud.jjb.model.Clients;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializer;
import com.owlike.genson.Context;
import com.owlike.genson.Converter;
import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;
import com.owlike.genson.stream.ObjectReader;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import flexjson.transformer.AbstractTransformer;
import jodd.bean.JoddBean;
import jodd.json.TypeJsonSerializer;
import jodd.typeconverter.TypeConverter;
import jodd.typeconverter.TypeConverterManager;
import org.apache.johnzon.core.JsonProviderImpl;
import org.apache.johnzon.mapper.Mapper;
import org.eclipse.yasson.JsonBindingProvider;

import javax.annotation.Nullable;
import javax.json.bind.Jsonb;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ClientsJsonProvider implements JsonProvider<Clients> {

    private final Gson gson = new GsonBuilder()
            .registerTypeAdapter(LocalDate.class, (JsonDeserializer<LocalDate>) (json, type, jsonDeserializationContext) -> LocalDate.parse(json.getAsString()))
            .registerTypeAdapter(LocalDate.class, (JsonSerializer<LocalDate>) (value, typeOfSrc, context) -> new JsonPrimitive(value.toString()))
            .registerTypeAdapter(OffsetDateTime.class, (JsonDeserializer<OffsetDateTime>) (json, type, jsonDeserializationContext) -> OffsetDateTime.parse(json.getAsString()))
            .registerTypeAdapter(OffsetDateTime.class, (JsonSerializer<OffsetDateTime>) (value, typeOfSrc, context) -> new JsonPrimitive(value.toString()))
            .create();
    private final ObjectMapper jackson = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    private final ObjectMapper jacksonAfterburner = new ObjectMapper()
            .registerModule(new AfterburnerModule())
            .registerModule(new JavaTimeModule())
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    private final JsonFactory jacksonFactory = new JsonFactory();
    private final Genson genson = new GensonBuilder()
            .useDateAsTimestamp(false)
            .withConverter(new Converter<LocalDate>() {
                public void serialize(LocalDate object, com.owlike.genson.stream.ObjectWriter writer, Context ctx) {
                    writer.writeString(object.toString());
                }
                public LocalDate deserialize(ObjectReader reader, Context ctx) {
                    return LocalDate.parse(reader.valueAsString());
                }
            }, LocalDate.class)
            .withConverter(new Converter<OffsetDateTime>() {
                public void serialize(OffsetDateTime object, com.owlike.genson.stream.ObjectWriter writer, Context ctx) {
                    writer.writeString(object.toString());
                }
                public OffsetDateTime deserialize(ObjectReader reader, Context ctx) {
                    return OffsetDateTime.parse(reader.valueAsString());
                }
            }, OffsetDateTime.class)
            .create();
    private final Jsonb yasson = new JsonBindingProvider().create()
            .withProvider(new org.glassfish.json.JsonProviderImpl())
            .build();
	private static final AbstractTransformer FLEX_IDENTITY = new AbstractTransformer() {
		@Override
		public void transform(Object o) {
			getContext().writeQuoted(o.toString());
		}
	};
    private final JSONDeserializer<Clients> flexjsonDeser = new JSONDeserializer<Clients>()
            .use(UUID.class, (objectBinder, o, type, aClass) -> UUID.fromString((String) o))
            .use(LocalDate.class, (objectBinder, o, type, aClass) -> LocalDate.parse((String) o))
            .use(OffsetDateTime.class, (objectBinder, o, type, aClass) -> OffsetDateTime.parse((String) o));

	private final org.boon.json.ObjectMapper boon = org.boon.json.JsonFactory.create();
    private final Mapper johnzon;
    private final com.squareup.moshi.JsonAdapter<Clients> moshi =
            new Moshi.Builder().add(UUID.class, new JsonAdapter<UUID>() {
                @Nullable
                @Override
                public UUID fromJson(com.squareup.moshi.JsonReader reader) throws IOException {
                    return UUID.fromString(reader.nextString());
                }
                @Override
                public void toJson(com.squareup.moshi.JsonWriter writer, @Nullable UUID value) throws IOException {
                    writer.value(value.toString());
                }
            }).add(BigDecimal.class, new JsonAdapter<BigDecimal>() {
                @Nullable
                @Override
                public BigDecimal fromJson(com.squareup.moshi.JsonReader reader) throws IOException {
                    return new BigDecimal(reader.nextString());
                }
                @Override
                public void toJson(com.squareup.moshi.JsonWriter writer, @Nullable BigDecimal value) throws IOException {
                    writer.value(value.toPlainString());
                }
            }).add(LocalDate.class, new JsonAdapter<LocalDate>() {
                @Nullable
                @Override
                public LocalDate fromJson(com.squareup.moshi.JsonReader reader) throws IOException {
                    return LocalDate.parse(reader.nextString());
                }
                @Override
                public void toJson(com.squareup.moshi.JsonWriter writer, @Nullable LocalDate value) throws IOException {
                    writer.value(value.toString());
                }
            }).add(OffsetDateTime.class, new JsonAdapter<OffsetDateTime>() {
                @Nullable
                @Override
                public OffsetDateTime fromJson(com.squareup.moshi.JsonReader reader) throws IOException {
                    return OffsetDateTime.parse(reader.nextString());
                }
                @Override
                public void toJson(com.squareup.moshi.JsonWriter writer, @Nullable OffsetDateTime value) throws IOException {
                    writer.value(value.toString());
                }
            }).build().adapter(Clients.class);

    /*
     * DSL-json
     */
    private final DslJson<Object> dsljson = new DslJson<>(Settings.withRuntime().includeServiceLoader());
    private final DslJson<Object> dsljson_reflection = new DslJson<>(Settings.withRuntime());//don't include generated classes

    private final Map<String, Object> jsonioStreamOptions = new HashMap<>();

    public ClientsJsonProvider() {

        jsonioStreamOptions.put(JsonReader.USE_MAPS, true);
        jsonioStreamOptions.put(JsonWriter.TYPE, false);

        // set johnson JsonReader (default is `JsonProvider.provider()`)
        javax.json.spi.JsonProvider johnzonProvider = new JsonProviderImpl();
        johnzon = new org.apache.johnzon.mapper.MapperBuilder()
            .setReaderFactory(johnzonProvider.createReaderFactory(Collections.emptyMap()))
            .setGeneratorFactory(johnzonProvider.createGeneratorFactory(Collections.emptyMap()))
            .setAccessModeName("field") // default is "strict-method" which doesn't work nicely with public attributes
            .build();

        TypeConverterManager joddTypeConverterManager = JoddBean.defaults().getTypeConverterManager();
        joddTypeConverterManager.register(UUID.class, (TypeConverter<UUID>) value -> UUID.fromString((String)value));
        joddTypeConverterManager.register(LocalDate.class, (TypeConverter<LocalDate>) value -> LocalDate.parse((String)value));
        joddTypeConverterManager.register(OffsetDateTime.class, (TypeConverter<OffsetDateTime>) value -> OffsetDateTime.parse((String)value));

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

    @Override
    public Jsonb yasson() {
        return yasson;
    }

    public JSONDeserializer<Clients> flexjsonDeser() {
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
    public com.squareup.moshi.JsonAdapter<Clients> moshi() {
        return moshi;
    }

    private static final ThreadLocal<JSONSerializer> FLEXJSON_SER = ThreadLocal.withInitial(() -> new JSONSerializer()
            .transform(FLEX_IDENTITY, UUID.class)
            .transform(FLEX_IDENTITY, LocalDate.class)
            .transform(FLEX_IDENTITY, OffsetDateTime.class));

    private static final ThreadLocal<jodd.json.JsonParser> JODD_DESER = ThreadLocal.withInitial(jodd.json.JsonParser::new);

    private static final ThreadLocal<jodd.json.JsonSerializer> JODD_SER = ThreadLocal.withInitial(() -> new jodd.json.JsonSerializer()
            .withSerializer(UUID.class, (TypeJsonSerializer<UUID>) (jsonContext, value) -> {
                jsonContext.writeString(value.toString());
                return true;
            })
            .withSerializer(LocalDate.class, (TypeJsonSerializer<LocalDate>) (jsonContext, value) -> {
                jsonContext.writeString(value.toString());
                return true;
            })
            .withSerializer(OffsetDateTime.class, (TypeJsonSerializer<OffsetDateTime>) (jsonContext, value) -> {
                jsonContext.writeString(value.toString());
                return true;
            }));
}
