package com.github.fabienrenaud.jjb;

import javax.json.spi.JsonProvider;

/**
 * Created by frenaud on 7/3/16.
 */
public final class JsonHelp {

    private JsonHelp() {
    }

    public static void printJsonpInfo() {
        System.out.println("Jsonp Provider:" + JsonProvider.provider().getClass().getCanonicalName());
        System.out.println();
    }
}
