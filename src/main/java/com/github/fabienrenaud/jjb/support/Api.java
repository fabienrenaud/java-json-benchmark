package com.github.fabienrenaud.jjb.support;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by frenaud on 7/24/16.
 */
public enum Api {
    DATABIND,
    STREAM;

    public static Set<Api> fromCsv(String str) {
        if (str == null || str.trim().isEmpty()) {
            return Collections.emptySet();
        }

        Set<Api> libs = new HashSet<>();
        String[] vals = str.trim().toUpperCase().split(",");
        for (String v : vals) {
            libs.add(Api.valueOf(v));
        }

        return libs;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
