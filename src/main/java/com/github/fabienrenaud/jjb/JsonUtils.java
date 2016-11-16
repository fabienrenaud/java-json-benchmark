package com.github.fabienrenaud.jjb;

import javax.json.spi.JsonProvider;
import java.io.ByteArrayOutputStream;

/**
 *
 * @author Fabien Renaud
 */
public final class JsonUtils {

    private JsonUtils() {
    }

    public static void printJavaxJsonProvider() {
        System.out.println("Jsonp Provider:" + JsonProvider.provider().getClass().getCanonicalName());
        System.out.println();
    }

    public static ByteArrayOutputStream byteArrayOutputStream() {
        ByteArrayOutputStream baos = THREAD_BYTE_ARRAY_OUTPUT_STREAM.get();
        baos.reset();
        return baos;
    }

    public static StringBuilder stringBuilder() {
        StringBuilder b = THREAD_STRING_BUILDER.get();
        b.setLength(0);
        return b;
    }

    public static com.dslplatform.json.JsonWriter dslJsonWriter() {
        com.dslplatform.json.JsonWriter writer = THREAD_DSL_WRITER.get();
        writer.reset();
        return writer;
    }

    private static final ThreadLocal<ByteArrayOutputStream> THREAD_BYTE_ARRAY_OUTPUT_STREAM = new ThreadLocal<ByteArrayOutputStream>() {
        @Override
        protected ByteArrayOutputStream initialValue() {
            return new ByteArrayOutputStream();
        }
    };

    private static final ThreadLocal<StringBuilder> THREAD_STRING_BUILDER = new ThreadLocal<StringBuilder>() {
        @Override
        protected StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    private static final ThreadLocal<com.dslplatform.json.JsonWriter> THREAD_DSL_WRITER = new ThreadLocal<com.dslplatform.json.JsonWriter>() {
        @Override
        protected com.dslplatform.json.JsonWriter initialValue() {
            return new com.dslplatform.json.JsonWriter();
        }
    };

}
