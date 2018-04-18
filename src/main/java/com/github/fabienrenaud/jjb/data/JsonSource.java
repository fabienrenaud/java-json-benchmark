package com.github.fabienrenaud.jjb.data;

import com.github.fabienrenaud.jjb.RandomUtils;
import com.github.fabienrenaud.jjb.data.gen.DataGenerator;
import com.github.fabienrenaud.jjb.provider.JsonProvider;
import com.github.fabienrenaud.jjb.stream.StreamDeserializer;
import com.github.fabienrenaud.jjb.stream.StreamSerializer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by frenaud on 7/23/16.
 */
public abstract class JsonSource<T> {

    static {
        JsonSourceInits.jsoniter();
    }

    private final JsonProvider<T> provider;

    private final T[] jsonAsObject;
    private final String[] jsonAsString;
    private final byte[][] jsonAsBytes;
    private final ThreadLocal<ByteArrayInputStream[]> jsonAsByteArrayInputStream;

    private final DataGenerator<T> dataGenerator;
    private final StreamSerializer<T> streamSerializer;
    private final StreamDeserializer<T> streamDeserializer;

    JsonSource(final int quantity, final int individualSize, final JsonProvider provider, final DataGenerator<T> dataGenerator, final StreamSerializer<T> streamSerializer, final StreamDeserializer<T> streamDeserializer) {
        this.provider = provider;

        this.jsonAsObject = newPojoArray(quantity);
        this.jsonAsString = new String[quantity];
        this.jsonAsBytes = new byte[quantity][];

        this.dataGenerator = dataGenerator;
        this.streamSerializer = streamSerializer;
        this.streamDeserializer = streamDeserializer;
        populateFields(quantity, individualSize);

        this.jsonAsByteArrayInputStream = ThreadLocal.withInitial(() -> {
            ByteArrayInputStream[] arr = new ByteArrayInputStream[quantity];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = new ByteArrayInputStream(jsonAsBytes[i]);
            }
            return arr;
        });
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
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
    }

    public JsonProvider<T> provider() {
        return provider;
    }

    public String nextString() {
        return jsonAsString[index(jsonAsString.length)];
    }

    public InputStream nextInputStream() {
        ByteArrayInputStream[] arr = jsonAsByteArrayInputStream.get();
        ByteArrayInputStream bais = arr[index(arr.length)];
        bais.reset();
        return bais;
    }

    public byte[] nextByteArray() {
        return jsonAsBytes[index(jsonAsBytes.length)];
    }

    public Reader nextReader() {
        return new InputStreamReader(nextInputStream());
    }

    public BufferedSource nextOkioBufferedSource() {
        return Okio.buffer(new ForwardingSource(Okio.source(nextInputStream())) {
            @Override
            public void close() {
            }
        });
    }

    public T nextPojo() {
        return jsonAsObject[index(jsonAsObject.length)];
    }

    public StreamSerializer<T> streamSerializer() {
        return streamSerializer;
    }

    public StreamDeserializer<T> streamDeserializer() {
        return streamDeserializer;
    }

    abstract T[] newPojoArray(int quantity);

    public abstract Class<T> pojoType();

    private int index(final int bound) {
        return bound == 1 ? 0 : RandomUtils.nextInt(bound);
    }
}
