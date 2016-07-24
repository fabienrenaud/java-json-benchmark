package com.github.fabienrenaud.jjb.data;

import com.github.fabienrenaud.jjb.data.gen.DataGenerator;
import com.github.fabienrenaud.jjb.provider.JsonProvider;
import com.github.fabienrenaud.jjb.stream.StreamDeserializer;
import com.github.fabienrenaud.jjb.stream.StreamSerializer;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Random;

/**
 * Created by frenaud on 7/23/16.
 */
public abstract class JsonSource<T> {

    private static final Random RNG = new Random();

    private final JsonProvider provider;

    private final T[] jsonAsObject;
    private final String[] jsonAsString;
    private final byte[][] jsonAsBytes;
    private final JSONObject[] jsonAsOrgJsonObject;
    private final javax.json.JsonObject[] jsonAsJavaxJsonObject;

    private final DataGenerator<T> dataGenerator;
    private final StreamSerializer<T> streamSerializer;
    private final StreamDeserializer<T> streamDeserializer;

    JsonSource(final int quantity, final int individualSize, final JsonProvider provider, final DataGenerator<T> dataGenerator, final StreamSerializer<T> streamSerializer, final StreamDeserializer<T> streamDeserializer) {
        this.provider = provider;

        this.jsonAsObject = newPojoArray(quantity);
        this.jsonAsString = new String[quantity];
        this.jsonAsBytes = new byte[quantity][];
        this.jsonAsOrgJsonObject = new JSONObject[quantity];
        this.jsonAsJavaxJsonObject = new javax.json.JsonObject[quantity];

        this.dataGenerator = dataGenerator;
        this.streamSerializer = streamSerializer;
        this.streamDeserializer = streamDeserializer;
        populateFields(quantity, individualSize);
    }

    private final void populateFields(final int quantity, final int individualSize) {
        try {
            for (int i = 0; i < quantity; i++) {
                T obj = pojoType().newInstance();
                dataGenerator.populate(obj, individualSize);
                jsonAsObject[i] = obj;

                String json = provider.jackson().writeValueAsString(obj);
                jsonAsString[i] = json;
                jsonAsBytes[i] = json.getBytes();
                jsonAsOrgJsonObject[i] = new JSONObject(json);
                jsonAsJavaxJsonObject[i] = javax.json.Json.createReader(new ByteArrayInputStream(jsonAsBytes[i])).readObject();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
    }

    public JsonProvider provider() {
        return provider;
    }

    public String nextString() {
        return jsonAsString[RNG.nextInt(jsonAsString.length)];
    }

    public InputStream nextInputStream() {
        return new ByteArrayInputStream(nextByteArray());
    }

    public byte[] nextByteArray() {
        return jsonAsBytes[RNG.nextInt(jsonAsBytes.length)];
    }

    public Reader nextReader() {
        return new InputStreamReader(nextInputStream());
    }

    public T nextPojo() {
        return jsonAsObject[RNG.nextInt(jsonAsObject.length)];
    }

    public JSONObject nextJsonAsOrgJsonObject() {
        return jsonAsOrgJsonObject[RNG.nextInt(jsonAsOrgJsonObject.length)];
    }

    public javax.json.JsonObject nextJsonAsJavaxJsonObject() {
        return jsonAsJavaxJsonObject[RNG.nextInt(jsonAsJavaxJsonObject.length)];
    }

    public StreamSerializer<T> streamSerializer() {
        return streamSerializer;
    }

    public StreamDeserializer<T> streamDeserializer() {
        return streamDeserializer;
    }

    abstract T[] newPojoArray(int quantity);

    public abstract Class<T> pojoType();

}
