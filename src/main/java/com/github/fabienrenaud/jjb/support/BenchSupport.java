package com.github.fabienrenaud.jjb.support;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by frenaud on 7/24/16.
 */
public enum BenchSupport {
    USERS(
        new Libapi(Library.GSON, Api.DATABIND, Api.STREAM),
        new Libapi(Library.JACKSON, Api.DATABIND, Api.STREAM),
        new Libapi(Library.JACKSON_AFTERBURNER, Api.DATABIND),
        new Libapi(Library.ORGJSON, Api.STREAM),
        new Libapi(Library.GENSON, Api.DATABIND, Api.STREAM),
        new Libapi(Library.JAVAXJSON, Api.STREAM),
        new Libapi(Library.FLEXJSON, Api.DATABIND),
        new Libapi(Library.FASTJSON, Api.DATABIND),
        new Libapi(Library.JSONIO, Api.STREAM),
        new Libapi(Library.BOON, Api.DATABIND),
        new Libapi(Library.JOHNZON, Api.DATABIND),
        new Libapi(Library.JSONSMART, Api.DATABIND),
        new Libapi(Library.DSLJSON, Api.DATABIND),
        new Libapi(Library.LOGANSQUARE, Api.DATABIND),
        new Libapi(Library.JSONSIMPLE, Api.STREAM),
        new Libapi(Library.NANOJSON, Api.STREAM),
        new Libapi(Library.JODD, Api.DATABIND),
        new Libapi(Library.MOSHI, Api.DATABIND),
        new Libapi(Library.TAPESTRY, Api.STREAM)
    );

    private final List<Libapi> libapis;

    BenchSupport(Libapi... libapis) {
        this.libapis = Arrays.asList(libapis);
    }

    public List<Libapi> libapis() {
        return libapis;
    }

    public Set<Library> supportedLibs() {
         return libapis.stream()
            .map(Libapi::lib)
            .collect(Collectors.toSet());
    }
}
