package com.github.fabienrenaud.jjb;

import jakarta.json.spi.JsonProvider;
import java.io.ByteArrayOutputStream;

/**
 *
 * @author Fabien Renaud
 */
public final class JsonUtils {

    /**
     * The JSON-P implementation behind the jakartajson and yasson entries. It is named here rather than
     * found with {@link JsonProvider#provider()}, which returns whichever implementation the classpath lists
     * first (johnzon's, in the shaded jar).
     */
    public static final JsonProvider JAKARTA_JSON_PROVIDER = new org.eclipse.parsson.JsonProviderImpl();

    private JsonUtils() {
    }

    public static void printJakartaJsonProvider() {
        System.out.println("Jsonp Provider:" + JAKARTA_JSON_PROVIDER.getClass().getCanonicalName());
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
