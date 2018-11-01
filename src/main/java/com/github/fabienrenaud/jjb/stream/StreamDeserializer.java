package com.github.fabienrenaud.jjb.stream;

import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.stream.JsonReader;
import com.owlike.genson.stream.ObjectReader;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by frenaud on 7/23/16.
 */
public interface StreamDeserializer<T> {

    T genson(ObjectReader reader) throws IOException;

    T gson(JsonReader reader) throws IOException;

    T jackson(JsonParser jParser) throws IOException;

    T minimaljson(Reader reader) throws IOException;

    T moshi(com.squareup.moshi.JsonReader reader) throws IOException;

    T underscore_java(String reader) throws IOException;
}
