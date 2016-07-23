package com.github.fabienrenaud.jjb.data;

/**
 * Created by frenaud on 7/23/16.
 */
public final class JsonSourceFactory {

    private JsonSourceFactory() {
    }

    public static JsonSource<?> create(final String dataType, final int quantity, final int size) {
        String data = dataType.toLowerCase();
        switch (data) {
            case "users":
                return new UsersSource(quantity, size);
            default:
                throw new IllegalArgumentException("'" + data + "' is not a valid data type.");
        }
    }
}
