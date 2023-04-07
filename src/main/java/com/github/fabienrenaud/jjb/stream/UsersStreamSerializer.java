package com.github.fabienrenaud.jjb.stream;

import com.fasterxml.jackson.core.JsonGenerator;
import com.github.fabienrenaud.jjb.model.Users;
import com.github.fabienrenaud.jjb.model.Users.Friend;
import com.github.fabienrenaud.jjb.model.Users.User;
import com.google.gson.stream.JsonWriter;
import com.grack.nanojson.JsonAppendableWriter;
import com.owlike.genson.stream.ObjectWriter;

import io.github.senthilganeshs.parser.json.Parser;
import io.github.senthilganeshs.parser.json.Parser.Value;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UsersStreamSerializer implements StreamSerializer<Users> {

    @Override
    public org.json.JSONObject orgjson(Users obj) throws JSONException {
        org.json.JSONObject jso = new org.json.JSONObject();
        if (obj.getUsers() != null) {
            org.json.JSONArray jsarr = new org.json.JSONArray();
            for (User u : obj.getUsers()) {
                jsarr.put(orgjson(u));
            }
            jso.put("users", jsarr);
        }
        return jso;
    }

    private org.json.JSONObject orgjson(User u) throws JSONException {
        org.json.JSONObject jso = new org.json.JSONObject();
        if (u.getId() != null) {
            jso.put("id", u.getId());
        }
        jso.put("index", u.getIndex());
        if (u.getGuid() != null) {
            jso.put("guid", u.getGuid());
        }
        jso.put("isActive", u.getIsActive());
        if (u.getBalance() != null) {
            jso.put("balance", u.getBalance());
        }
        if (u.getPicture() != null) {
            jso.put("picture", u.getPicture());
        }
        jso.put("age", u.getAge());
        if (u.getEyeColor() != null) {
            jso.put("eyeColor", u.getEyeColor());
        }
        if (u.getName() != null) {
            jso.put("name", u.getName());
        }
        if (u.getGender() != null) {
            jso.put("gender", u.getGender());
        }
        if (u.getCompany() != null) {
            jso.put("company", u.getCompany());
        }
        if (u.getEmail() != null) {
            jso.put("email", u.getEmail());
        }
        if (u.getPhone() != null) {
            jso.put("phone", u.getPhone());
        }
        if (u.getAddress() != null) {
            jso.put("address", u.getAddress());
        }
        if (u.getAbout() != null) {
            jso.put("about", u.getAbout());
        }
        if (u.getRegistered() != null) {
            jso.put("registered", u.getRegistered());
        }
        jso.put("latitude", u.getLatitude());
        jso.put("longitude", u.getLongitude());
        if (u.getTags() != null) {
            org.json.JSONArray jsarr = new org.json.JSONArray();
            for (String t : u.getTags()) {
                jsarr.put(t);
            }
            jso.put("tags", jsarr);
        }
        if (u.getFriends() != null) {
            org.json.JSONArray jsarr = new org.json.JSONArray();
            for (Friend f : u.getFriends()) {
                org.json.JSONObject jso0 = new org.json.JSONObject();
                jso0.put("id", f.getId());
                jso0.put("name", f.getName());
                jsarr.put(jso0);
            }
            jso.put("friends", jsarr);
        }
        if (u.getGreeting() != null) {
            jso.put("greeting", u.getGreeting());
        }
        if (u.getFavoriteFruit() != null) {
            jso.put("favoriteFruit", u.getFavoriteFruit());
        }
        return jso;
    }

    @Override
    public void jakartajson(jakarta.json.stream.JsonGenerator generator, Users obj) throws IOException {
        generator.writeStartObject();
        if (obj.getUsers() != null) {
            generator.writeStartArray("users");
            for (User u : obj.getUsers()) {
                jakartajson(generator, u);
            }
            generator.writeEnd();
        }
        generator.writeEnd();
    }

    private void jakartajson(jakarta.json.stream.JsonGenerator generator, User u) throws IOException {
        generator.writeStartObject();
        if (u.getId() != null) {
            generator.write("id", u.getId());
        }
        generator.write("index", u.getIndex());
        if (u.getGuid() != null) {
            generator.write("guid", u.getGuid());
        }
        generator.write("isActive", u.getIsActive());
        if (u.getBalance() != null) {
            generator.write("balance", u.getBalance());
        }
        if (u.getPicture() != null) {
            generator.write("picture", u.getPicture());
        }
        generator.write("age", u.getAge());
        if (u.getEyeColor() != null) {
            generator.write("eyeColor", u.getEyeColor());
        }
        if (u.getName() != null) {
            generator.write("name", u.getName());
        }
        if (u.getGender() != null) {
            generator.write("gender", u.getGender());
        }
        if (u.getCompany() != null) {
            generator.write("company", u.getCompany());
        }
        if (u.getEmail() != null) {
            generator.write("email", u.getEmail());
        }
        if (u.getPhone() != null) {
            generator.write("phone", u.getPhone());
        }
        if (u.getAddress() != null) {
            generator.write("address", u.getAddress());
        }
        if (u.getAbout() != null) {
            generator.write("about", u.getAbout());
        }
        if (u.getRegistered() != null) {
            generator.write("registered", u.getRegistered());
        }
        generator.write("latitude", u.getLatitude());
        generator.write("longitude", u.getLongitude());
        if (u.getTags() != null) {
            generator.writeStartArray("tags");
            for (String t : u.getTags()) {
                generator.write(t);
            }
            generator.writeEnd();
        }
        if (u.getFriends() != null) {
            generator.writeStartArray("friends");
            for (Friend f : u.getFriends()) {
                generator.writeStartObject();
                generator.write("id", f.getId());
                generator.write("name", f.getName());
                generator.writeEnd();
            }
            generator.writeEnd();
        }
        if (u.getGreeting() != null) {
            generator.write("greeting", u.getGreeting());
        }
        if (u.getFavoriteFruit() != null) {
            generator.write("favoriteFruit", u.getFavoriteFruit());
        }
        generator.writeEnd();
    }

    @Override
    public void genson(ObjectWriter j, Users obj) throws IOException {
        j.beginObject();
        if (obj.getUsers() != null) {
            j.writeName("users");
            j.beginArray();
            for (User u : obj.getUsers()) {
                genson(j, u);
            }
            j.endArray();
        }
        j.endObject();
    }

    private void genson(ObjectWriter j, User u) throws IOException {
        j.beginObject();
        if (u.getId() != null) {
            j.writeString("id", u.getId());
        }
        j.writeNumber("index", u.getIndex());
        if (u.getGuid() != null) {
            j.writeString("guid", u.getGuid());
        }
        j.writeBoolean("isActive", u.getIsActive());
        if (u.getBalance() != null) {
            j.writeString("balance", u.getBalance());
        }
        if (u.getPicture() != null) {
            j.writeString("picture", u.getPicture());
        }
        j.writeNumber("age", u.getAge());
        if (u.getEyeColor() != null) {
            j.writeString("eyeColor", u.getEyeColor());
        }
        if (u.getName() != null) {
            j.writeString("name", u.getName());
        }
        if (u.getGender() != null) {
            j.writeString("gender", u.getGender());
        }
        if (u.getCompany() != null) {
            j.writeString("company", u.getCompany());
        }
        if (u.getEmail() != null) {
            j.writeString("email", u.getEmail());
        }
        if (u.getPhone() != null) {
            j.writeString("phone", u.getPhone());
        }
        if (u.getAddress() != null) {
            j.writeString("address", u.getAddress());
        }
        if (u.getAbout() != null) {
            j.writeString("about", u.getAbout());
        }
        if (u.getRegistered() != null) {
            j.writeString("registered", u.getRegistered());
        }
        j.writeNumber("latitude", u.getLatitude());
        j.writeNumber("longitude", u.getLongitude());
        if (u.getTags() != null) {
            j.writeName("tags");
            j.beginArray();
            for (String t : u.getTags()) {
                j.writeString(t);
            }
            j.endArray();
        }
        if (u.getFriends() != null) {
            j.writeName("friends");
            j.beginArray();
            for (Friend f : u.getFriends()) {
                j.beginObject();
                j.writeString("id", f.getId());
                j.writeString("name", f.getName());
                j.endObject();
            }
            j.endArray();
        }
        if (u.getGreeting() != null) {
            j.writeString("greeting", u.getGreeting());
        }
        if (u.getFavoriteFruit() != null) {
            j.writeString("favoriteFruit", u.getFavoriteFruit());
        }
        j.endObject();
    }

    @Override
    public void gson(JsonWriter j, Users obj) throws IOException {
        j.beginObject();
        if (obj.getUsers() != null) {
            j.name("users");
            j.beginArray();
            for (User u : obj.getUsers()) {
                gson(j, u);
            }
            j.endArray();
        }
        j.endObject();
    }

    private void gson(JsonWriter j, User u) throws IOException {
        j.beginObject();
        if (u.getId() != null) {
            j.name("id");
            j.value(u.getId());
        }
        j.name("index");
        j.value(u.getIndex());
        if (u.getGuid() != null) {
            j.name("guid");
            j.value(u.getGuid());
        }
        j.name("isActive");
        j.value(u.getIsActive());
        if (u.getBalance() != null) {
            j.name("balance");
            j.value(u.getBalance());
        }
        if (u.getPicture() != null) {
            j.name("picture");
            j.value(u.getPicture());
        }
        j.name("age");
        j.value(u.getAge());
        if (u.getEyeColor() != null) {
            j.name("eyeColor");
            j.value(u.getEyeColor());
        }
        if (u.getName() != null) {
            j.name("name");
            j.value(u.getName());
        }
        if (u.getGender() != null) {
            j.name("gender");
            j.value(u.getGender());
        }
        if (u.getCompany() != null) {
            j.name("company");
            j.value(u.getCompany());
        }
        if (u.getEmail() != null) {
            j.name("email");
            j.value(u.getEmail());
        }
        if (u.getPhone() != null) {
            j.name("phone");
            j.value(u.getPhone());
        }
        if (u.getAddress() != null) {
            j.name("address");
            j.value(u.getAddress());
        }
        if (u.getAbout() != null) {
            j.name("about");
            j.value(u.getAbout());
        }
        if (u.getRegistered() != null) {
            j.name("registered");
            j.value(u.getRegistered());
        }
        j.name("latitude");
        j.value(u.getLatitude());
        j.name("longitude");
        j.value(u.getLongitude());
        if (u.getTags() != null) {
            j.name("tags");
            j.beginArray();
            for (String t : u.getTags()) {
                j.value(t);
            }
            j.endArray();
        }
        if (u.getFriends() != null) {
            j.name("friends");
            j.beginArray();
            for (Friend f : u.getFriends()) {
                j.beginObject();
                j.name("id");
                j.value(f.getId());
                j.name("name");
                j.value(f.getName());
                j.endObject();
            }
            j.endArray();
        }
        if (u.getGreeting() != null) {
            j.name("greeting");
            j.value(u.getGreeting());
        }
        if (u.getFavoriteFruit() != null) {
            j.name("favoriteFruit");
            j.value(u.getFavoriteFruit());
        }
        j.endObject();
    }

    @Override
    public void jackson(JsonGenerator j, Users obj) throws IOException {
        j.writeStartObject();
        if (obj.getUsers() != null) {
            j.writeFieldName("users");
            j.writeStartArray();
            for (User u : obj.getUsers()) {
                jackson(j, u);
            }
            j.writeEndArray();
        }
        j.writeEndObject();
    }

    private void jackson(JsonGenerator j, User u) throws IOException {
        j.writeStartObject();
        if (u.getId() != null) {
            j.writeFieldName("id");
            j.writeString(u.getId());
        }
        j.writeFieldName("index");
        j.writeNumber(u.getIndex());
        if (u.getGuid() != null) {
            j.writeFieldName("guid");
            j.writeString(u.getGuid());
        }
        j.writeFieldName("isActive");
        j.writeBoolean(u.getIsActive());
        if (u.getBalance() != null) {
            j.writeFieldName("balance");
            j.writeString(u.getBalance());
        }
        if (u.getPicture() != null) {
            j.writeFieldName("picture");
            j.writeString(u.getPicture());
        }
        j.writeFieldName("age");
        j.writeNumber(u.getAge());
        if (u.getEyeColor() != null) {
            j.writeFieldName("eyeColor");
            j.writeString(u.getEyeColor());
        }
        if (u.getName() != null) {
            j.writeFieldName("name");
            j.writeString(u.getName());
        }
        if (u.getGender() != null) {
            j.writeFieldName("gender");
            j.writeString(u.getGender());
        }
        if (u.getCompany() != null) {
            j.writeFieldName("company");
            j.writeString(u.getCompany());
        }
        if (u.getEmail() != null) {
            j.writeFieldName("email");
            j.writeString(u.getEmail());
        }
        if (u.getPhone() != null) {
            j.writeFieldName("phone");
            j.writeString(u.getPhone());
        }
        if (u.getAddress() != null) {
            j.writeFieldName("address");
            j.writeString(u.getAddress());
        }
        if (u.getAbout() != null) {
            j.writeFieldName("about");
            j.writeString(u.getAbout());
        }
        if (u.getRegistered() != null) {
            j.writeFieldName("registered");
            j.writeString(u.getRegistered());
        }
        j.writeFieldName("latitude");
        j.writeNumber(u.getLatitude());
        j.writeFieldName("longitude");
        j.writeNumber(u.getLongitude());
        if (u.getTags() != null) {
            j.writeFieldName("tags");
            j.writeStartArray();
            for (String t : u.getTags()) {
                j.writeString(t);
            }
            j.writeEndArray();
        }
        if (u.getFriends() != null) {
            j.writeFieldName("friends");
            j.writeStartArray();
            for (Friend f : u.getFriends()) {
                j.writeStartObject();
                j.writeFieldName("id");
                j.writeString(f.getId());
                j.writeFieldName("name");
                j.writeString(f.getName());
                j.writeEndObject();
            }
            j.writeEndArray();
        }
        if (u.getGreeting() != null) {
            j.writeFieldName("greeting");
            j.writeString(u.getGreeting());
        }
        if (u.getFavoriteFruit() != null) {
            j.writeFieldName("favoriteFruit");
            j.writeString(u.getFavoriteFruit());
        }
        j.writeEndObject();
    }

    @Override
    public org.json.simple.JSONObject jsonsimple(Users obj) throws IOException {
        org.json.simple.JSONObject jso = new org.json.simple.JSONObject();
        if (obj.getUsers() != null) {
            org.json.simple.JSONArray jsarr = new org.json.simple.JSONArray();
            for (User u : obj.getUsers()) {
                jsarr.add(jsonsimple(u));
            }
            jso.put("users", jsarr);
        }
        return jso;
    }

    private org.json.simple.JSONObject jsonsimple(User u) throws IOException {
        org.json.simple.JSONObject jso = new org.json.simple.JSONObject();
        if (u.getId() != null) {
            jso.put("id", u.getId());
        }
        jso.put("index", u.getIndex());
        if (u.getGuid() != null) {
            jso.put("guid", u.getGuid());
        }
        jso.put("isActive", u.getIsActive());
        if (u.getBalance() != null) {
            jso.put("balance", u.getBalance());
        }
        if (u.getPicture() != null) {
            jso.put("picture", u.getPicture());
        }
        jso.put("age", u.getAge());
        if (u.getEyeColor() != null) {
            jso.put("eyeColor", u.getEyeColor());
        }
        if (u.getName() != null) {
            jso.put("name", u.getName());
        }
        if (u.getGender() != null) {
            jso.put("gender", u.getGender());
        }
        if (u.getCompany() != null) {
            jso.put("company", u.getCompany());
        }
        if (u.getEmail() != null) {
            jso.put("email", u.getEmail());
        }
        if (u.getPhone() != null) {
            jso.put("phone", u.getPhone());
        }
        if (u.getAddress() != null) {
            jso.put("address", u.getAddress());
        }
        if (u.getAbout() != null) {
            jso.put("about", u.getAbout());
        }
        if (u.getRegistered() != null) {
            jso.put("registered", u.getRegistered());
        }
        jso.put("latitude", u.getLatitude());
        jso.put("longitude", u.getLongitude());
        if (u.getTags() != null) {
            org.json.simple.JSONArray jsarr = new org.json.simple.JSONArray();
            jsarr.addAll(u.getTags());
            jso.put("tags", jsarr);
        }
        if (u.getFriends() != null) {
            org.json.simple.JSONArray jsarr = new org.json.simple.JSONArray();
            for (Friend f : u.getFriends()) {
                org.json.simple.JSONObject jso0 = new org.json.simple.JSONObject();
                jso0.put("id", f.getId());
                jso0.put("name", f.getName());
                jsarr.add(jso0);
            }
            jso.put("friends", jsarr);
        }
        if (u.getGreeting() != null) {
            jso.put("greeting", u.getGreeting());
        }
        if (u.getFavoriteFruit() != null) {
            jso.put("favoriteFruit", u.getFavoriteFruit());
        }
        return jso;
    }

    @Override
    public void nanojson(JsonAppendableWriter w, Users obj) throws IOException {
        JsonAppendableWriter cw = w.object();
        if (obj.getUsers() != null) {
            cw.array("users");
            for (User u : obj.getUsers()) {
                cw = nanojson(cw, u);
            }
            cw.end();
        }
        cw.end();
    }

    private JsonAppendableWriter nanojson(JsonAppendableWriter w, User u) throws IOException {
        JsonAppendableWriter cw = w.object();
        if (u.getId() != null) {
            cw.value("id", u.getId());
        }
        cw.value("index", u.getIndex());
        if (u.getGuid() != null) {
            cw.value("guid", u.getGuid());
        }
        cw.value("isActive", u.getIsActive());
        if (u.getBalance() != null) {
            cw.value("balance", u.getBalance());
        }
        if (u.getPicture() != null) {
            cw.value("picture", u.getPicture());
        }
        cw.value("age", u.getAge());
        if (u.getEyeColor() != null) {
            cw.value("eyeColor", u.getEyeColor());
        }
        if (u.getName() != null) {
            cw.value("name", u.getName());
        }
        if (u.getGender() != null) {
            cw.value("gender", u.getGender());
        }
        if (u.getCompany() != null) {
            cw.value("company", u.getCompany());
        }
        if (u.getEmail() != null) {
            cw.value("email", u.getEmail());
        }
        if (u.getPhone() != null) {
            cw.value("phone", u.getPhone());
        }
        if (u.getAddress() != null) {
            cw.value("address", u.getAddress());
        }
        if (u.getAbout() != null) {
            cw.value("about", u.getAbout());
        }
        if (u.getRegistered() != null) {
            cw.value("registered", u.getRegistered());
        }
        cw.value("latitude", u.getLatitude());
        cw.value("longitude", u.getLongitude());
        if (u.getTags() != null) {
            cw.array("tags");
            for (String t : u.getTags()) {
                cw.value(t);
            }
            cw.end();
        }
        if (u.getFriends() != null) {
            cw.array("friends");
            for (Friend f : u.getFriends()) {
                cw.object();
                cw.value("id", f.getId());
                cw.value("name", f.getName());
                cw.end();
            }
            cw.end();
        }
        if (u.getGreeting() != null) {
            cw.value("greeting", u.getGreeting());
        }
        if (u.getFavoriteFruit() != null) {
            cw.value("favoriteFruit", u.getFavoriteFruit());
        }
        cw.end();
        return cw;
    }

    @Override
    public org.apache.tapestry5.json.JSONObject tapestry(Users obj) throws IOException {
        org.apache.tapestry5.json.JSONObject jso = new org.apache.tapestry5.json.JSONObject();
        if (obj.getUsers() != null) {
            org.apache.tapestry5.json.JSONArray jsarr = new org.apache.tapestry5.json.JSONArray();
            for (User u : obj.getUsers()) {
                jsarr.add(tapestry(u));
            }
            jso.put("users", jsarr);
        }
        return jso;
    }

    private org.apache.tapestry5.json.JSONObject tapestry(User u) throws IOException {
        org.apache.tapestry5.json.JSONObject jso = new org.apache.tapestry5.json.JSONObject();
        if (u.getId() != null) {
            jso.put("id", u.getId());
        }
        jso.put("index", u.getIndex());
        if (u.getGuid() != null) {
            jso.put("guid", u.getGuid());
        }
        jso.put("isActive", u.getIsActive());
        if (u.getBalance() != null) {
            jso.put("balance", u.getBalance());
        }
        if (u.getPicture() != null) {
            jso.put("picture", u.getPicture());
        }
        jso.put("age", u.getAge());
        if (u.getEyeColor() != null) {
            jso.put("eyeColor", u.getEyeColor());
        }
        if (u.getName() != null) {
            jso.put("name", u.getName());
        }
        if (u.getGender() != null) {
            jso.put("gender", u.getGender());
        }
        if (u.getCompany() != null) {
            jso.put("company", u.getCompany());
        }
        if (u.getEmail() != null) {
            jso.put("email", u.getEmail());
        }
        if (u.getPhone() != null) {
            jso.put("phone", u.getPhone());
        }
        if (u.getAddress() != null) {
            jso.put("address", u.getAddress());
        }
        if (u.getAbout() != null) {
            jso.put("about", u.getAbout());
        }
        if (u.getRegistered() != null) {
            jso.put("registered", u.getRegistered());
        }
        jso.put("latitude", u.getLatitude());
        jso.put("longitude", u.getLongitude());
        if (u.getTags() != null) {
            org.apache.tapestry5.json.JSONArray jsarr = new org.apache.tapestry5.json.JSONArray();
            jsarr.addAll(u.getTags());
            jso.put("tags", jsarr);
        }
        if (u.getFriends() != null) {
            org.apache.tapestry5.json.JSONArray jsarr = new org.apache.tapestry5.json.JSONArray();
            for (Friend f : u.getFriends()) {
                org.apache.tapestry5.json.JSONObject jso0 = new org.apache.tapestry5.json.JSONObject();
                jso0.put("id", f.getId());
                jso0.put("name", f.getName());
                jsarr.add(jso0);
            }
            jso.put("friends", jsarr);
        }
        if (u.getGreeting() != null) {
            jso.put("greeting", u.getGreeting());
        }
        if (u.getFavoriteFruit() != null) {
            jso.put("favoriteFruit", u.getFavoriteFruit());
        }
        return jso;
    }

    @Override
    public com.eclipsesource.json.JsonValue minimaljson(Users obj) throws IOException {
        com.eclipsesource.json.JsonObject jso = com.eclipsesource.json.Json.object();
        if (obj.getUsers() != null) {
            com.eclipsesource.json.JsonArray jsarr = com.eclipsesource.json.Json.array();
            for (User u : obj.getUsers()) {
                jsarr.add(minimaljson(u));
            }
            jso.add("users", jsarr);
        }
        return jso;
    }

    private com.eclipsesource.json.JsonValue minimaljson(User u) throws IOException {
        com.eclipsesource.json.JsonObject jso = com.eclipsesource.json.Json.object();
        if (u.getId() != null) {
            jso.add("id", u.getId());
        }
        jso.add("index", u.getIndex());
        if (u.getGuid() != null) {
            jso.add("guid", u.getGuid());
        }
        jso.add("isActive", u.getIsActive());
        if (u.getBalance() != null) {
            jso.add("balance", u.getBalance());
        }
        if (u.getPicture() != null) {
            jso.add("picture", u.getPicture());
        }
        jso.add("age", u.getAge());
        if (u.getEyeColor() != null) {
            jso.add("eyeColor", u.getEyeColor());
        }
        if (u.getName() != null) {
            jso.add("name", u.getName());
        }
        if (u.getGender() != null) {
            jso.add("gender", u.getGender());
        }
        if (u.getCompany() != null) {
            jso.add("company", u.getCompany());
        }
        if (u.getEmail() != null) {
            jso.add("email", u.getEmail());
        }
        if (u.getPhone() != null) {
            jso.add("phone", u.getPhone());
        }
        if (u.getAddress() != null) {
            jso.add("address", u.getAddress());
        }
        if (u.getAbout() != null) {
            jso.add("about", u.getAbout());
        }
        if (u.getRegistered() != null) {
            jso.add("registered", u.getRegistered());
        }
        jso.add("latitude", u.getLatitude());
        jso.add("longitude", u.getLongitude());
        if (u.getTags() != null) {
            com.eclipsesource.json.JsonArray jsarr = com.eclipsesource.json.Json.array();
            for (String t : u.getTags()) {
                jsarr.add(t);
            }
            jso.add("tags", jsarr);
        }
        if (u.getFriends() != null) {
            com.eclipsesource.json.JsonArray jsarr = com.eclipsesource.json.Json.array();
            for (Friend f : u.getFriends()) {
                com.eclipsesource.json.JsonObject jso0 = com.eclipsesource.json.Json.object();
                jso0.add("id", f.getId());
                jso0.add("name", f.getName());
                jsarr.add(jso0);
            }
            jso.add("friends", jsarr);
        }
        if (u.getGreeting() != null) {
            jso.add("greeting", u.getGreeting());
        }
        if (u.getFavoriteFruit() != null) {
            jso.add("favoriteFruit", u.getFavoriteFruit());
        }
        return jso;
    }

    @Override
    public void moshi(com.squareup.moshi.JsonWriter writer, Users obj) throws IOException {
        writer.beginObject();

        if (obj.getUsers() != null) {
            writer.name("users");
            writer.beginArray();
            for (User user : obj.getUsers()) {
                moshiUser(writer, user);
            }
            writer.endArray();
        }

        writer.endObject();
    }

    private void moshiUser(com.squareup.moshi.JsonWriter writer, User user) throws IOException {
        writer.beginObject();

        if (user.getId() != null) {
            writer.name("id");
            writer.value(user.getId());
        }

        writer.name("index");
        writer.value(user.getIndex());


        if (user.getGuid() != null) {
            writer.name("guid");
            writer.value(user.getGuid());
        }

        writer.name("isActive");
        writer.value(user.getIsActive());

        if (user.getBalance() != null) {
            writer.name("balance");
            writer.value(user.getBalance());
        }

        if (user.getPicture() != null) {
            writer.name("picture");
            writer.value(user.getPicture());
        }

        writer.name("age");
        writer.value(user.getAge());

        if (user.getEyeColor() != null) {
            writer.name("eyeColor");
            writer.value(user.getEyeColor());
        }

        if (user.getName() != null) {
            writer.name("name");
            writer.value(user.getName());
        }

        if (user.getGender() != null) {
            writer.name("gender");
            writer.value(user.getGender());
        }

        if (user.getCompany() != null) {
            writer.name("company");
            writer.value(user.getCompany());
        }

        if (user.getEmail() != null) {
            writer.name("email");
            writer.value(user.getEmail());
        }

        if (user.getPhone() != null) {
            writer.name("phone");
            writer.value(user.getPhone());
        }

        if (user.getAddress() != null) {
            writer.name("address");
            writer.value(user.getAddress());
        }

        if (user.getAbout() != null) {
            writer.name("about");
            writer.value(user.getAbout());
        }

        if (user.getRegistered() != null) {
            writer.name("registered");
            writer.value(user.getRegistered());
        }

        writer.name("latitude");
        writer.value(user.getLatitude());

        writer.name("longitude");
        writer.value(user.getLongitude());

        if (user.getTags() != null) {
            writer.name("tags");
            writer.beginArray();
            for (String tag : user.getTags()) {
                writer.value(tag);
            }
            writer.endArray();
        }

        if (user.getFriends() != null) {
            writer.name("friends");
            writer.beginArray();
            for (Friend friend : user.getFriends()) {
                moshiFriend(writer, friend);
            }
            writer.endArray();
        }

        if (user.getGreeting() != null) {
            writer.name("greeting");
            writer.value(user.getGreeting());
        }

        if (user.getFavoriteFruit() != null) {
            writer.name("favoriteFruit");
            writer.value(user.getFavoriteFruit());
        }

        writer.endObject();
    }

    private void moshiFriend(com.squareup.moshi.JsonWriter writer, Friend friend) throws IOException {
        writer.beginObject();

        if (friend.getId() != null) {
            writer.name("id");
            writer.value(friend.getId());
        }

        if (friend.getName() != null) {
            writer.name("name");
            writer.value(friend.getName());
        }

        writer.endObject();
    }

    @Override
    public mjson.Json mjson(Users obj) throws IOException {
        mjson.Json usersJson = mjson.Json.object();
        if (obj.getUsers() != null) {
            mjson.Json usersArr = mjson.Json.array();
            for (User u : obj.getUsers()) {
                usersArr.add(mjson(u));
            }
            usersJson.set("users", usersArr);
        }
        return usersJson;
    }

    private mjson.Json mjson(User user) throws IOException {
        mjson.Json userJson = mjson.Json.object();
        if (user.getId() != null) {
            userJson.set("id", user.getId());
        }
        userJson.set("index", user.getIndex());
        if (user.getGuid() != null) {
            userJson.set("guid", user.getGuid());
        }
        userJson.set("isActive", user.getIsActive());
        if (user.getBalance() != null) {
            userJson.set("balance", user.getBalance());
        }
        if (user.getPicture() != null) {
            userJson.set("picture", user.getPicture());
        }
        userJson.set("age", user.getAge());
        if (user.getEyeColor() != null) {
            userJson.set("eyeColor", user.getEyeColor());
        }
        if (user.getName() != null) {
            userJson.set("name", user.getName());
        }
        if (user.getGender() != null) {
            userJson.set("gender", user.getGender());
        }
        if (user.getCompany() != null) {
            userJson.set("company", user.getCompany());
        }
        if (user.getEmail() != null) {
            userJson.set("email", user.getEmail());
        }
        if (user.getPhone() != null) {
            userJson.set("phone", user.getPhone());
        }
        if (user.getAddress() != null) {
            userJson.set("address", user.getAddress());
        }
        if (user.getAbout() != null) {
            userJson.set("about", user.getAbout());
        }
        if (user.getRegistered() != null) {
            userJson.set("registered", user.getRegistered());
        }
        userJson.set("latitude", user.getLatitude());
        userJson.set("longitude", user.getLongitude());
        if (user.getTags() != null) {
            mjson.Json tagsArr = mjson.Json.array();
            for (String tag : user.getTags()) {
                tagsArr.add(tag);
            }
            userJson.set("tags", tagsArr);
        }
        if (user.getFriends() != null) {
            mjson.Json friendsArr = mjson.Json.array();
            for (Friend friend : user.getFriends()) {
                mjson.Json friendJson = mjson.Json.object();
                friendJson.set("id", friend.getId());
                friendJson.set("name", friend.getName());
                friendsArr.add(friendJson);
            }
            userJson.set("friends", friendsArr);
        }
        if (user.getGreeting() != null) {
            userJson.set("greeting", user.getGreeting());
        }
        if (user.getFavoriteFruit() != null) {
            userJson.set("favoriteFruit", user.getFavoriteFruit());
        }
        return userJson;
    }

    @Override
    public String underscore_java(Users obj) throws IOException {
        Map<String, Object> jso = new LinkedHashMap<>();
        if (obj.getUsers() != null) {
            List<Object> jsarr = new ArrayList<>();
            for (User u : obj.getUsers()) {
                jsarr.add(underscore_java(u));
            }
            jso.put("users", jsarr);
        }
        return com.github.underscore.U.toJson(jso);
    }

    private Map<String, Object> underscore_java(User u) throws IOException {
        Map<String, Object> jso = new LinkedHashMap<>();
        if (u.getId() != null) {
            jso.put("id", u.getId());
        }
        jso.put("index", u.getIndex());
        if (u.getGuid() != null) {
            jso.put("guid", u.getGuid());
        }
        jso.put("isActive", u.getIsActive());
        if (u.getBalance() != null) {
            jso.put("balance", u.getBalance());
        }
        if (u.getPicture() != null) {
            jso.put("picture", u.getPicture());
        }
        jso.put("age", u.getAge());
        if (u.getEyeColor() != null) {
            jso.put("eyeColor", u.getEyeColor());
        }
        if (u.getName() != null) {
            jso.put("name", u.getName());
        }
        if (u.getGender() != null) {
            jso.put("gender", u.getGender());
        }
        if (u.getCompany() != null) {
            jso.put("company", u.getCompany());
        }
        if (u.getEmail() != null) {
            jso.put("email", u.getEmail());
        }
        if (u.getPhone() != null) {
            jso.put("phone", u.getPhone());
        }
        if (u.getAddress() != null) {
            jso.put("address", u.getAddress());
        }
        if (u.getAbout() != null) {
            jso.put("about", u.getAbout());
        }
        if (u.getRegistered() != null) {
            jso.put("registered", u.getRegistered());
        }
        jso.put("latitude", u.getLatitude());
        jso.put("longitude", u.getLongitude());
        if (u.getTags() != null) {
            List<Object> jsarr = new ArrayList<>();
            jsarr.addAll(u.getTags());
            jso.put("tags", jsarr);
        }
        if (u.getFriends() != null) {
            List<Object> jsarr = new ArrayList<>();
            for (Friend f : u.getFriends()) {
                Map<String, Object> jso0 = new LinkedHashMap<>();
                jso0.put("id", f.getId());
                jso0.put("name", f.getName());
                jsarr.add(jso0);
            }
            jso.put("friends", jsarr);
        }
        if (u.getGreeting() != null) {
            jso.put("greeting", u.getGreeting());
        }
        if (u.getFavoriteFruit() != null) {
            jso.put("favoriteFruit", u.getFavoriteFruit());
        }
        return jso;
    }

    @Override
    public Value purejson(Users obj) {
        Map<Parser.Value, Parser.Value> map = new LinkedHashMap<>(obj.getUsers().size());
        List<Value> arr = new ArrayList<>(obj.getUsers().size());
        for (User u : obj.getUsers()) {
            arr.add(purejson(u));
        }
        map.put(Value.string("users"), Value.arr(arr));
        return Value.json(map);
    }

    private Parser.Value purejson(User u) {
        Map<Parser.Value, Parser.Value> map = new LinkedHashMap<>();

        if (u.getId() != null) {
            map.put(Value.string("id"), Value.string(u.getId()));
        }
        map.put(Value.string("index"), Value.integer(u.getIndex()));
        if (u.getGuid() != null) {
            map.put(Value.string("guid"), Value.string(u.getGuid()));
        }
        map.put(Value.string("isActive"), Value.bool(u.getIsActive()));
        if (u.getBalance() != null) {
            map.put(Value.string("balance"), Value.string(u.getBalance()));
        }
        if (u.getPicture() != null) {
            map.put(Value.string("picture"), Value.string(u.getPicture()));
        }
        map.put(Value.string("age"), Value.integer(u.getAge()));
        if (u.getEyeColor() != null) {
            map.put(Value.string("eyeColor"), Value.string(u.getEyeColor()));
        }
        if (u.getName() != null) {
            map.put(Value.string("name"), Value.string(u.getName()));
        }
        if (u.getGender() != null) {
            map.put(Value.string("gender"), Value.string(u.getGender()));
        }
        if (u.getCompany() != null) {
            map.put(Value.string("company"), Value.string(u.getCompany()));
        }
        if (u.getEmail() != null) {
            map.put(Value.string("email"), Value.string(u.getEmail()));
        }
        if (u.getPhone() != null) {
            map.put(Value.string("phone"), Value.string(u.getPhone()));
        }
        if (u.getAddress() != null) {
            map.put(Value.string("address"), Value.string(u.getAddress()));
        }
        if (u.getAbout() != null) {
            map.put(Value.string("about"), Value.string(u.getAbout()));
        }
        if (u.getRegistered() != null) {
            map.put(Value.string("registered"), Value.string(u.getRegistered()));
        }
        map.put(Value.string("latitude"), Value.number(u.getLatitude()));
        map.put(Value.string("longitude"), Value.number(u.getLongitude()));
        if (u.getTags() != null) {
            List<Parser.Value> jsarr = new ArrayList<>(u.getTags().size());
            for (String t : u.getTags()) {
                jsarr.add(Value.string(t));
            }
            map.put(Value.string("tags"), Value.arr(jsarr));
        }
        if (u.getFriends() != null) {
            List<Value> jsarr = new ArrayList<>(u.getFriends().size());
            for (Friend f : u.getFriends()) {
                Map<Value, Value> jso0 = new LinkedHashMap<>();
                jso0.put(Value.string("id"), Value.string(f.getId()));
                jso0.put(Value.string("name"), Value.string(f.getName()));
                jsarr.add(Value.json(jso0));
            }
            map.put(Value.string("friends"), Value.arr(jsarr));
        }
        if (u.getGreeting() != null) {
            map.put(Value.string("greeting"), Value.string(u.getGreeting()));
        }
        if (u.getFavoriteFruit() != null) {
            map.put(Value.string("favoriteFruit"), Value.string(u.getFavoriteFruit()));
        }
        return Parser.Value.json(map);
    }
}
