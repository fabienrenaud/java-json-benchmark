package com.github.fabienrenaud.jjb.provider;

import com.dslplatform.json.DslJson;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.owlike.genson.Genson;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import io.quarkus.qson.generator.QsonMapper;
import org.apache.johnzon.mapper.Mapper;

import jakarta.json.bind.Jsonb;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.ProtoMessage;

public interface JsonProvider<T> {

    Gson gson();

    ObjectMapper jackson();

    ObjectMapper jacksonAfterburner();

    ObjectMapper jacksonBlackbird();

    JsonFactory jacksonFactory();

   jakarta.json.stream.JsonGeneratorFactory jakartajsonFactory();

    Genson genson();

    Jsonb yasson();

    JSONDeserializer<T> flexjsonDeser();

    JSONSerializer flexjsonSer();

    org.boon.json.ObjectMapper boon();

    Mapper johnzon();

    DslJson<Object> dsljson();

    DslJson<Object> dsljson_reflection();

    jodd.json.JsonParser joddDeser();

    jodd.json.JsonSerializer joddSer();

    com.squareup.moshi.JsonAdapter<T> moshi();

    io.avaje.jsonb.JsonType<T> avajeJsonb_jackson();

    io.avaje.jsonb.JsonType<T> avajeJsonb_default();

    QsonMapper qson();

    ProtoMessage<?> quickbufPojo();

    JsonSink quickbufSink();

}
