package com.github.fabienrenaud.jjb.stream;

import com.fasterxml.jackson.core.JsonGenerator;
import com.google.gson.stream.JsonWriter;
import com.owlike.genson.stream.ObjectWriter;

import java.io.IOException;

/**
 * Created by frenaud on 7/23/16.
 */
public interface StreamSerializer<T> {

    void genson(final ObjectWriter j, final T obj) throws IOException;

    void gson(final JsonWriter j, final T obj) throws IOException;

    void jackson(final JsonGenerator j, final T obj) throws IOException;
}
