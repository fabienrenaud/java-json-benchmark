package com.github.fabienrenaud.jjb.provider;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.owlike.genson.Genson;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import org.apache.johnzon.mapper.Mapper;

import java.util.Map;

/**
 * Created by frenaud on 7/24/16.
 */
public interface JsonProvider {

    Gson gson();

    ObjectMapper jackson();

    ObjectMapper jacksonAfterburner();

    JsonFactory jacksonFactory();

    Genson genson();

    JSONDeserializer<?> flexjsonDeser();

    JSONSerializer flexjsonSer();

    org.boon.json.ObjectMapper boon();

    Mapper johnson();

    Map<String, Object> jsonioStreamOptions();
}
