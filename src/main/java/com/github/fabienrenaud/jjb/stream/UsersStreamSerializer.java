package com.github.fabienrenaud.jjb.stream;

import com.fasterxml.jackson.core.JsonGenerator;
import com.github.fabienrenaud.jjb.model.Users;
import com.github.fabienrenaud.jjb.model.Users.User;
import com.github.fabienrenaud.jjb.model.Users.Friend;
import com.google.gson.stream.JsonWriter;
import com.owlike.genson.stream.ObjectWriter;

import java.io.IOException;

/**
 * Created by frenaud on 7/23/16.
 */
public class UsersStreamSerializer implements StreamSerializer<Users> {

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
}
