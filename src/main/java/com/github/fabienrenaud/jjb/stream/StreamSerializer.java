package com.github.fabienrenaud.jjb.stream;

import com.fasterxml.jackson.core.JsonGenerator;
import com.google.gson.stream.JsonWriter;
import com.grack.nanojson.JsonAppendableWriter;
import com.owlike.genson.stream.ObjectWriter;

import io.github.senthilganeshs.parser.json.Parser.Value;

import org.json.JSONException;

import java.io.IOException;

public interface StreamSerializer<T> {

    org.json.JSONObject orgjson(T obj) throws JSONException;

    void jakartajson(jakarta.json.stream.JsonGenerator generator, T obj) throws IOException;

    void genson(ObjectWriter j, T obj) throws IOException;

    void gson(JsonWriter j, T obj) throws IOException;

    void jackson(JsonGenerator j, T obj) throws IOException;

    org.json.simple.JSONObject jsonsimple(T obj) throws IOException;

    void nanojson(JsonAppendableWriter writer, T obj) throws IOException;

    org.apache.tapestry5.json.JSONObject tapestry(T obj) throws IOException;

    com.eclipsesource.json.JsonValue minimaljson(T obj) throws IOException;

    void moshi(com.squareup.moshi.JsonWriter writer, T obj) throws IOException;

    mjson.Json mjson(T obj) throws IOException;

    Object underscore_java(T obj) throws IOException;

    Value purejson(T obj) throws IOException;

    sk.antons.json.JsonValue antons(T obj) throws IOException;
}
