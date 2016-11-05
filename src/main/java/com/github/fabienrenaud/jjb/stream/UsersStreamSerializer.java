package com.github.fabienrenaud.jjb.stream;

import com.fasterxml.jackson.core.JsonGenerator;
import com.github.fabienrenaud.jjb.model.Users;
import com.github.fabienrenaud.jjb.model.Users.Friend;
import com.github.fabienrenaud.jjb.model.Users.User;
import com.google.gson.stream.JsonWriter;
import com.owlike.genson.stream.ObjectWriter;
import org.json.JSONException;

import java.io.IOException;

/**
 * Created by frenaud on 7/23/16.
 */
public class UsersStreamSerializer implements StreamSerializer<Users> {

    @Override
    public org.json.JSONObject orgjson(final Users obj) throws JSONException {
        org.json.JSONObject jso = new org.json.JSONObject();
        if (obj.users != null) {
            org.json.JSONArray jsarr = new org.json.JSONArray();
            for (User u : obj.users) {
                jsarr.put(orgjson(u));
            }
            jso.put("users", jsarr);
        }
        return jso;
    }

    private org.json.JSONObject orgjson(final User u) throws JSONException {
        org.json.JSONObject jso = new org.json.JSONObject();
        if (u._id != null) {
            jso.put("_id", u._id);
        }
        jso.put("index", u.index);
        if (u.guid != null) {
            jso.put("guid", u.guid);
        }
        jso.put("isActive", u.isActive);
        if (u.balance != null) {
            jso.put("balance", u.balance);
        }
        if (u.picture != null) {
            jso.put("picture", u.picture);
        }
        jso.put("age", u.age);
        if (u.eyeColor != null) {
            jso.put("eyeColor", u.eyeColor);
        }
        if (u.name != null) {
            jso.put("name", u.name);
        }
        if (u.gender != null) {
            jso.put("gender", u.gender);
        }
        if (u.company != null) {
            jso.put("company", u.company);
        }
        if (u.email != null) {
            jso.put("email", u.email);
        }
        if (u.phone != null) {
            jso.put("phone", u.phone);
        }
        if (u.address != null) {
            jso.put("address", u.address);
        }
        if (u.about != null) {
            jso.put("about", u.about);
        }
        if (u.registered != null) {
            jso.put("registered", u.registered);
        }
        jso.put("latitude", u.latitude);
        jso.put("longitude", u.longitude);
        if (u.tags != null) {
            org.json.JSONArray jsarr = new org.json.JSONArray();
            for (String t : u.tags) {
                jsarr.put(t);
            }
            jso.put("tags", jsarr);
        }
        if (u.friends != null) {
            org.json.JSONArray jsarr = new org.json.JSONArray();
            for (Friend f : u.friends) {
                org.json.JSONObject jso0 = new org.json.JSONObject();
                jso0.put("id", f.id);
                jso0.put("name", f.name);
                jsarr.put(jso0);
            }
            jso.put("friends", jsarr);
        }
        if (u.greeting != null) {
            jso.put("greeting", u.greeting);
        }
        if (u.favoriteFruit != null) {
            jso.put("favoriteFruit", u.favoriteFruit);
        }
        return jso;
    }

    @Override
    public javax.json.JsonObject javaxjson(final Users obj) throws IOException {
        javax.json.JsonObjectBuilder jso = javax.json.Json.createObjectBuilder();
        if (obj.users != null) {
            javax.json.JsonArrayBuilder jsarr = javax.json.Json.createArrayBuilder();
            for (User u : obj.users) {
                jsarr.add(javaxjson(u));
            }
            jso.add("users", jsarr);
        }
        return jso.build();
    }

    private javax.json.JsonObjectBuilder javaxjson(final User u) throws IOException {
        javax.json.JsonObjectBuilder jso = javax.json.Json.createObjectBuilder();
        if (u._id != null) {
            jso.add("_id", u._id);
        }
        jso.add("index", u.index);
        if (u.guid != null) {
            jso.add("guid", u.guid);
        }
        jso.add("isActive", u.isActive);
        if (u.balance != null) {
            jso.add("balance", u.balance);
        }
        if (u.picture != null) {
            jso.add("picture", u.picture);
        }
        jso.add("age", u.age);
        if (u.eyeColor != null) {
            jso.add("eyeColor", u.eyeColor);
        }
        if (u.name != null) {
            jso.add("name", u.name);
        }
        if (u.gender != null) {
            jso.add("gender", u.gender);
        }
        if (u.company != null) {
            jso.add("company", u.company);
        }
        if (u.email != null) {
            jso.add("email", u.email);
        }
        if (u.phone != null) {
            jso.add("phone", u.phone);
        }
        if (u.address != null) {
            jso.add("address", u.address);
        }
        if (u.about != null) {
            jso.add("about", u.about);
        }
        if (u.registered != null) {
            jso.add("registered", u.registered);
        }
        jso.add("latitude", u.latitude);
        jso.add("longitude", u.longitude);
        if (u.tags != null) {
            javax.json.JsonArrayBuilder jsarr = javax.json.Json.createArrayBuilder();
            for (String t : u.tags) {
                jsarr.add(t);
            }
            jso.add("tags", jsarr);
        }
        if (u.friends != null) {
            javax.json.JsonArrayBuilder jsarr = javax.json.Json.createArrayBuilder();
            for (Friend f : u.friends) {
                javax.json.JsonObjectBuilder jso0 = javax.json.Json.createObjectBuilder();
                jso0.add("id", f.id);
                jso0.add("name", f.name);
                jsarr.add(jso0);
            }
            jso.add("friends", jsarr);
        }
        if (u.greeting != null) {
            jso.add("greeting", u.greeting);
        }
        if (u.favoriteFruit != null) {
            jso.add("favoriteFruit", u.favoriteFruit);
        }
        return jso;
    }

    @Override
    public void genson(ObjectWriter j, Users obj) throws IOException {
        j.beginObject();
        if (obj.users != null) {
            j.writeName("users");
            j.beginArray();
            for (User u : obj.users) {
                genson(j, u);
            }
            j.endArray();
        }
        j.endObject();
    }

    private void genson(final ObjectWriter j, final User u) throws IOException {
        j.beginObject();
        if (u._id != null) {
            j.writeString("_id", u._id);
        }
        j.writeNumber("index", u.index);
        if (u.guid != null) {
            j.writeString("guid", u.guid);
        }
        j.writeBoolean("isActive", u.isActive);
        if (u.balance != null) {
            j.writeString("balance", u.balance);
        }
        if (u.picture != null) {
            j.writeString("picture", u.picture);
        }
        j.writeNumber("age", u.age);
        if (u.eyeColor != null) {
            j.writeString("eyeColor", u.eyeColor);
        }
        if (u.name != null) {
            j.writeString("name", u.name);
        }
        if (u.gender != null) {
            j.writeString("gender", u.gender);
        }
        if (u.company != null) {
            j.writeString("company", u.company);
        }
        if (u.email != null) {
            j.writeString("email", u.email);
        }
        if (u.phone != null) {
            j.writeString("phone", u.phone);
        }
        if (u.address != null) {
            j.writeString("address", u.address);
        }
        if (u.about != null) {
            j.writeString("about", u.about);
        }
        if (u.registered != null) {
            j.writeString("registered", u.registered);
        }
        j.writeNumber("latitude", u.latitude);
        j.writeNumber("longitude", u.longitude);
        if (u.tags != null) {
            j.writeName("tags");
            j.beginArray();
            for (String t : u.tags) {
                j.writeString(t);
            }
            j.endArray();
        }
        if (u.friends != null) {
            j.writeName("friends");
            j.beginArray();
            for (Friend f : u.friends) {
                j.beginObject();
                j.writeString("id", f.id);
                j.writeString("name", f.name);
                j.endObject();
            }
            j.endArray();
        }
        if (u.greeting != null) {
            j.writeString("greeting", u.greeting);
        }
        if (u.favoriteFruit != null) {
            j.writeString("favoriteFruit", u.favoriteFruit);
        }
        j.endObject();
    }

    @Override
    public void gson(JsonWriter j, Users obj) throws IOException {
        j.beginObject();
        if (obj.users != null) {
            j.name("users");
            j.beginArray();
            for (User u : obj.users) {
                gson(j, u);
            }
            j.endArray();
        }
        j.endObject();
    }

    private void gson(final JsonWriter j, final User u) throws IOException {
        j.beginObject();
        if (u._id != null) {
            j.name("_id");
            j.value(u._id);
        }
        j.name("index");
        j.value(u.index);
        if (u.guid != null) {
            j.name("guid");
            j.value(u.guid);
        }
        j.name("isActive");
        j.value(u.isActive);
        if (u.balance != null) {
            j.name("balance");
            j.value(u.balance);
        }
        if (u.picture != null) {
            j.name("picture");
            j.value(u.picture);
        }
        j.name("age");
        j.value(u.age);
        if (u.eyeColor != null) {
            j.name("eyeColor");
            j.value(u.eyeColor);
        }
        if (u.name != null) {
            j.name("name");
            j.value(u.name);
        }
        if (u.gender != null) {
            j.name("gender");
            j.value(u.gender);
        }
        if (u.company != null) {
            j.name("company");
            j.value(u.company);
        }
        if (u.email != null) {
            j.name("email");
            j.value(u.email);
        }
        if (u.phone != null) {
            j.name("phone");
            j.value(u.phone);
        }
        if (u.address != null) {
            j.name("address");
            j.value(u.address);
        }
        if (u.about != null) {
            j.name("about");
            j.value(u.about);
        }
        if (u.registered != null) {
            j.name("registered");
            j.value(u.registered);
        }
        j.name("latitude");
        j.value(u.latitude);
        j.name("longitude");
        j.value(u.longitude);
        if (u.tags != null) {
            j.name("tags");
            j.beginArray();
            for (String t : u.tags) {
                j.value(t);
            }
            j.endArray();
        }
        if (u.friends != null) {
            j.name("friends");
            j.beginArray();
            for (Friend f : u.friends) {
                j.beginObject();
                j.name("id");
                j.value(f.id);
                j.name("name");
                j.value(f.name);
                j.endObject();
            }
            j.endArray();
        }
        if (u.greeting != null) {
            j.name("greeting");
            j.value(u.greeting);
        }
        if (u.favoriteFruit != null) {
            j.name("favoriteFruit");
            j.value(u.favoriteFruit);
        }
        j.endObject();
    }

    @Override
    public void jackson(JsonGenerator j, Users obj) throws IOException {
        j.writeStartObject();
        if (obj.users != null) {
            j.writeFieldName("users");
            j.writeStartArray();
            for (User u : obj.users) {
                jackson(j, u);
            }
            j.writeEndArray();
        }
        j.writeEndObject();
    }

    private void jackson(final JsonGenerator j, final User u) throws IOException {
        j.writeStartObject();
        if (u._id != null) {
            j.writeFieldName("_id");
            j.writeString(u._id);
        }
        j.writeFieldName("index");
        j.writeNumber(u.index);
        if (u.guid != null) {
            j.writeFieldName("guid");
            j.writeString(u.guid);
        }
        j.writeFieldName("isActive");
        j.writeBoolean(u.isActive);
        if (u.balance != null) {
            j.writeFieldName("balance");
            j.writeString(u.balance);
        }
        if (u.picture != null) {
            j.writeFieldName("picture");
            j.writeString(u.picture);
        }
        j.writeFieldName("age");
        j.writeNumber(u.age);
        if (u.eyeColor != null) {
            j.writeFieldName("eyeColor");
            j.writeString(u.eyeColor);
        }
        if (u.name != null) {
            j.writeFieldName("name");
            j.writeString(u.name);
        }
        if (u.gender != null) {
            j.writeFieldName("gender");
            j.writeString(u.gender);
        }
        if (u.company != null) {
            j.writeFieldName("company");
            j.writeString(u.company);
        }
        if (u.email != null) {
            j.writeFieldName("email");
            j.writeString(u.email);
        }
        if (u.phone != null) {
            j.writeFieldName("phone");
            j.writeString(u.phone);
        }
        if (u.address != null) {
            j.writeFieldName("address");
            j.writeString(u.address);
        }
        if (u.about != null) {
            j.writeFieldName("about");
            j.writeString(u.about);
        }
        if (u.registered != null) {
            j.writeFieldName("registered");
            j.writeString(u.registered);
        }
        j.writeFieldName("latitude");
        j.writeNumber(u.latitude);
        j.writeFieldName("longitude");
        j.writeNumber(u.longitude);
        if (u.tags != null) {
            j.writeFieldName("tags");
            j.writeStartArray();
            for (String t : u.tags) {
                j.writeString(t);
            }
            j.writeEndArray();
        }
        if (u.friends != null) {
            j.writeFieldName("friends");
            j.writeStartArray();
            for (Friend f : u.friends) {
                j.writeStartObject();
                j.writeFieldName("id");
                j.writeString(f.id);
                j.writeFieldName("name");
                j.writeString(f.name);
                j.writeEndObject();
            }
            j.writeEndArray();
        }
        if (u.greeting != null) {
            j.writeFieldName("greeting");
            j.writeString(u.greeting);
        }
        if (u.favoriteFruit != null) {
            j.writeFieldName("favoriteFruit");
            j.writeString(u.favoriteFruit);
        }
        j.writeEndObject();
    }

    @Override
    public org.json.simple.JSONObject jsonsimple(final Users obj) throws IOException {
        org.json.simple.JSONObject jso = new org.json.simple.JSONObject();
        if (obj.users != null) {
            org.json.simple.JSONArray jsarr = new org.json.simple.JSONArray();
            for (User u : obj.users) {
                jsarr.add(jsonsimple(u));
            }
            jso.put("users", jsarr);
        }
        return jso;
    }

    private org.json.simple.JSONObject jsonsimple(final User u) throws IOException {
        org.json.simple.JSONObject jso = new org.json.simple.JSONObject();
        if (u._id != null) {
            jso.put("_id", u._id);
        }
        jso.put("index", u.index);
        if (u.guid != null) {
            jso.put("guid", u.guid);
        }
        jso.put("isActive", u.isActive);
        if (u.balance != null) {
            jso.put("balance", u.balance);
        }
        if (u.picture != null) {
            jso.put("picture", u.picture);
        }
        jso.put("age", u.age);
        if (u.eyeColor != null) {
            jso.put("eyeColor", u.eyeColor);
        }
        if (u.name != null) {
            jso.put("name", u.name);
        }
        if (u.gender != null) {
            jso.put("gender", u.gender);
        }
        if (u.company != null) {
            jso.put("company", u.company);
        }
        if (u.email != null) {
            jso.put("email", u.email);
        }
        if (u.phone != null) {
            jso.put("phone", u.phone);
        }
        if (u.address != null) {
            jso.put("address", u.address);
        }
        if (u.about != null) {
            jso.put("about", u.about);
        }
        if (u.registered != null) {
            jso.put("registered", u.registered);
        }
        jso.put("latitude", u.latitude);
        jso.put("longitude", u.longitude);
        if (u.tags != null) {
            org.json.simple.JSONArray jsarr = new org.json.simple.JSONArray();
            for (String t : u.tags) {
                jsarr.add(t);
            }
            jso.put("tags", jsarr);
        }
        if (u.friends != null) {
            org.json.simple.JSONArray jsarr = new org.json.simple.JSONArray();
            for (Friend f : u.friends) {
                org.json.simple.JSONObject jso0 = new org.json.simple.JSONObject();
                jso0.put("id", f.id);
                jso0.put("name", f.name);
                jsarr.add(jso0);
            }
            jso.put("friends", jsarr);
        }
        if (u.greeting != null) {
            jso.put("greeting", u.greeting);
        }
        if (u.favoriteFruit != null) {
            jso.put("favoriteFruit", u.favoriteFruit);
        }
        return jso;
    }
}
