package com.github.fabienrenaud.jjb.stream;

import com.fasterxml.jackson.core.JsonGenerator;
import com.google.gson.stream.JsonWriter;
import com.grack.nanojson.JsonAppendableWriter;
import com.owlike.genson.stream.ObjectWriter;
import org.json.JSONException;

import java.io.IOException;

public interface StreamSerializer<T> {

    org.json.JSONObject orgjson(final T obj) throws JSONException;

    javax.json.JsonObject javaxjson(final T obj) throws IOException;

    void genson(final ObjectWriter j, final T obj) throws IOException;

    void gson(final JsonWriter j, final T obj) throws IOException;

    void jackson(final JsonGenerator j, final T obj) throws IOException;

    org.json.simple.JSONObject jsonsimple(final T obj) throws IOException;

    void nanojson(final JsonAppendableWriter writer, final T obj) throws IOException;

    org.apache.tapestry5.json.JSONObject tapestry(final T obj) throws IOException;

    com.eclipsesource.json.JsonValue minimaljson(final T obj) throws IOException;

    void moshi(com.squareup.moshi.JsonWriter writer, T obj) throws IOException;

    mjson.Json mjson(final T obj) throws IOException;

    Object underscore_java(final T obj) throws IOException;
}
