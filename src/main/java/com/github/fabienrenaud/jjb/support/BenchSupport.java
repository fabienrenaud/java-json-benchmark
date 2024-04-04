package com.github.fabienrenaud.jjb.support;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public enum BenchSupport {
    USERS(
        new Libapi(Library.GSON, Api.DATABIND, Api.STREAM),
        new Libapi(Library.JACKSON, Api.DATABIND, Api.STREAM),
        new Libapi(Library.JACKSON_AFTERBURNER, Api.DATABIND),
        new Libapi(Library.JACKSON_BLACKBIRD, Api.DATABIND),
        new Libapi(Library.ORGJSON, Api.STREAM),
        new Libapi(Library.GENSON, Api.DATABIND, Api.STREAM),
        new Libapi(Library.YASSON, Api.DATABIND),
        new Libapi(Library.JAKARTAJSON, Api.STREAM),
        new Libapi(Library.FLEXJSON, Api.DATABIND),
        new Libapi(Library.FASTJSON, Api.DATABIND),
        new Libapi(Library.JSONIO, Api.STREAM),
        new Libapi(Library.BOON, Api.DATABIND),
        new Libapi(Library.JOHNZON, Api.DATABIND),
        new Libapi(Library.JSONSMART, Api.DATABIND),
        new Libapi(Library.DSLJSON, Api.DATABIND),
        new Libapi(Library.DSLJSON_REFLECTION, Api.DATABIND),
        new Libapi(Library.AVAJEJSONB_JACKSON, Api.DATABIND),
        new Libapi(Library.AVAJEJSONB, Api.DATABIND),
        new Libapi(Library.LOGANSQUARE, Api.DATABIND),
        new Libapi(Library.JSONSIMPLE, Api.STREAM),
        new Libapi(Library.NANOJSON, Api.STREAM),
        new Libapi(Library.JODD, Api.DATABIND),
        new Libapi(Library.MOSHI, Api.DATABIND, Api.STREAM),
        new Libapi(Library.TAPESTRY, Api.STREAM),
        new Libapi(Library.MINIMALJSON, Api.STREAM),
        new Libapi(Library.MJSON, Api.STREAM),
        new Libapi(Library.UNDERSCORE_JAVA, Api.STREAM),
        new Libapi(Library.QSON, Api.DATABIND),
        new Libapi(Library.PUREJSON, Api.STREAM),
        new Libapi(Library.ANTONS, Api.STREAM),
        new Libapi(Library.QUICKBUF_JSON, Api.DATABIND),
        new Libapi(Library.WAST, Api.DATABIND)
    ),
    CLIENTS(
            new Libapi(Library.GSON, Api.DATABIND),
            new Libapi(Library.JACKSON, Api.DATABIND),
            new Libapi(Library.JACKSON_AFTERBURNER, Api.DATABIND),
            new Libapi(Library.JACKSON_BLACKBIRD, Api.DATABIND),
            new Libapi(Library.ORGJSON),
            new Libapi(Library.GENSON, Api.DATABIND),
            new Libapi(false, Library.YASSON, Api.DATABIND),
            new Libapi(Library.JAKARTAJSON),
            new Libapi(Library.FLEXJSON, Api.DATABIND),
            new Libapi(Library.FASTJSON, Api.DATABIND),
            new Libapi(Library.JSONIO),
            new Libapi(false, Library.BOON, Api.DATABIND),
            new Libapi(false, Library.JOHNZON, Api.DATABIND),
            new Libapi(false, Library.JSONSMART, Api.DATABIND),
            new Libapi(Library.DSLJSON, Api.DATABIND),
            new Libapi(Library.DSLJSON_REFLECTION, Api.DATABIND),
            new Libapi(Library.AVAJEJSONB_JACKSON, Api.DATABIND),
            new Libapi(Library.AVAJEJSONB, Api.DATABIND),
            new Libapi(Library.LOGANSQUARE, Api.DATABIND),
            new Libapi(Library.JSONSIMPLE),
            new Libapi(Library.NANOJSON),
            new Libapi(Library.JODD, Api.DATABIND),
            new Libapi(Library.MOSHI, Api.DATABIND),
            new Libapi(Library.WAST, Api.DATABIND),
            new Libapi(Library.TAPESTRY),
            new Libapi(Library.MINIMALJSON),
            new Libapi(Library.UNDERSCORE_JAVA),
            new Libapi(Library.ANTONS)
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
            .filter(Libapi::active)
            .map(Libapi::lib)
            .collect(Collectors.toSet());
    }
}
