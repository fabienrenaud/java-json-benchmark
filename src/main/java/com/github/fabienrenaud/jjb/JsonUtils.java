package com.github.fabienrenaud.jjb;

import jakarta.json.spi.JsonProvider;
import java.io.ByteArrayOutputStream;

/**
 *
 * @author Fabien Renaud
 */
public final class JsonUtils {

    private JsonUtils() {
    }

    public static void printJakartaJsonProvider() {
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

    private static final ThreadLocal<ByteArrayOutputStream> THREAD_BYTE_ARRAY_OUTPUT_STREAM = ThreadLocal.withInitial(ByteArrayOutputStream::new);

    private static final ThreadLocal<StringBuilder> THREAD_STRING_BUILDER = ThreadLocal.withInitial(StringBuilder::new);
}
