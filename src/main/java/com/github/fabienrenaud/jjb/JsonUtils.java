package com.github.fabienrenaud.jjb;

import javax.json.spi.JsonProvider;

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
}
