package com.github.fabienrenaud.jjb.support;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public enum Library {
    GSON,
    JACKSON,
    JACKSON_AFTERBURNER,
    JACKSON_BLACKBIRD,
    ORGJSON,
    YASSON,
    GENSON,
    JAKARTAJSON,
    FLEXJSON,
    FASTJSON,
    JSONIO,
    BOON,
    JOHNZON,
    JSONSMART,
    DSLJSON,
    DSLJSON_REFLECTION,
    AVAJEJSONB_JACKSON,
    AVAJEJSONB,
    LOGANSQUARE,
    JSONSIMPLE,
    NANOJSON,
    JODD,
    MOSHI,
    TAPESTRY,
    MINIMALJSON,
    MJSON,
    QSON,
    UNDERSCORE_JAVA,
    PUREJSON,
    ANTONS,
    QUICKBUF_JSON,
    WAST;

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
