package com.github.fabienrenaud.jjb.support;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by frenaud on 7/24/16.
 */
public enum Library {
    GSON,
    JACKSON,
    JACKSON_AFTERBURNER,
    ORGJSON,
    GENSON, JAVAXJSON,
    FLEXJSON,
    FASTJSON,
    JSONIO,
    BOON,
    JOHNZON,
    JSONSMART,
    DSLJSON,
    LOGANSQUARE,
    JSONSIMPLE,
    NANOJSON,
    JODD,
    MOSHI,
    TAPESTRY,
    JSONITER;

    public static Set<Library> fromCsv(String str) {
        if (str == null || str.trim().isEmpty()) {
            return Collections.emptySet();
        }

        Set<Library> libs = new HashSet<>();
        String[] vals = str.trim().toUpperCase().split(",");
        for (String v : vals) {
            libs.add(Library.valueOf(v));
        }

        return libs;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
