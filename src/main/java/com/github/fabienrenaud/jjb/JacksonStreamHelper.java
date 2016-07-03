package com.github.fabienrenaud.jjb;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.github.fabienrenaud.jjb.model.User;
import com.github.fabienrenaud.jjb.model.UserCollection;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Fabien Renaud
 */
public final class JacksonStreamHelper {

    private JacksonStreamHelper() {
    }

    public static UserCollection deserializeUserCollection(JsonParser jParser) throws IOException {
        UserCollection uc = new UserCollection();
        while (jParser.nextToken() != JsonToken.END_OBJECT) {
            String fieldname = jParser.getCurrentName();
            if ("users".equals(fieldname)) {
                uc.users = new ArrayList<>();
                while (jParser.nextToken() != JsonToken.END_ARRAY) {
                    uc.users.add(deserializeUser(jParser));
                }
            }
        }
        return uc;
    }

    private static User deserializeUser(JsonParser jParser) throws IOException {
        User r = new User();
        while (jParser.nextToken() != JsonToken.END_OBJECT) {
            String fieldname = jParser.getCurrentName();
            if (fieldname == null) {
                continue;
            }
            switch (fieldname) {
                case "_id":
                    jParser.nextToken();
                    r._id = jParser.getValueAsString();
                    break;
                case "index":
                    jParser.nextToken();
                    r.index = jParser.getIntValue();
                    break;
                case "guid":
                    jParser.nextToken();
                    r.guid = jParser.getValueAsString();
                    break;
                case "isActive":
                    jParser.nextToken();
                    r.isActive = jParser.getBooleanValue();
                    break;
                case "balance":
                    jParser.nextToken();
                    r.balance = jParser.getValueAsString();
                    break;
                case "picture":
                    jParser.nextToken();
                    r.picture = jParser.getValueAsString();
                    break;
                case "age":
                    jParser.nextToken();
                    r.age = jParser.getIntValue();
                    break;
                case "eyeColor":
                    jParser.nextToken();
                    r.eyeColor = jParser.getValueAsString();
                    break;
                case "name":
                    jParser.nextToken();
                    r.name = jParser.getValueAsString();
                    break;
                case "gender":
                    jParser.nextToken();
                    r.gender = jParser.getValueAsString();
                    break;
                case "company":
                    jParser.nextToken();
                    r.company = jParser.getValueAsString();
                    break;
                case "email":
                    jParser.nextToken();
                    r.email = jParser.getValueAsString();
                    break;
                case "phone":
                    jParser.nextToken();
                    r.phone = jParser.getValueAsString();
                    break;
                case "address":
                    jParser.nextToken();
                    r.address = jParser.getValueAsString();
                    break;
                case "about":
                    jParser.nextToken();
                    r.about = jParser.getValueAsString();
                    break;
                case "registered":
                    jParser.nextToken();
                    r.registered = jParser.getValueAsString();
                    break;
                case "latitude":
                    jParser.nextToken();
                    r.latitude = jParser.getDoubleValue();
                    break;
                case "longitude":
                    jParser.nextToken();
                    r.longitude = jParser.getDoubleValue();
                    break;
                case "greeting":
                    jParser.nextToken();
                    r.greeting = jParser.getValueAsString();
                    break;
                case "favoriteFruit":
                    jParser.nextToken();
                    r.favoriteFruit = jParser.getValueAsString();
                    break;
                case "tags":
                    r.tags = new ArrayList<>();
                    jParser.nextToken();
                    while (jParser.nextToken() != JsonToken.END_ARRAY) {
                        r.tags.add(jParser.getValueAsString());
                    }
                    break;
                case "friends":
                    r.friends = new ArrayList<>();
                    jParser.nextToken(); // current token is "[", move next.
                    while (jParser.nextToken() != JsonToken.END_ARRAY) {
                        User.Friend f = new User.Friend();
                        while (jParser.nextToken() != JsonToken.END_OBJECT) {
                            String fn = jParser.getCurrentName();
                            if (fn == null) {
                                continue;
                            }
                            switch (fn) {
                                case "id":
                                    jParser.nextToken();
                                    f.id = jParser.getValueAsString();
                                    break;
                                case "name":
                                    jParser.nextToken();
                                    f.name = jParser.getValueAsString();
                                    break;
                            }
                        }
                        r.friends.add(f);
                    }
                    break;
            }
        }
        return r;
    }

    public static void serialize(final JsonGenerator j, final UserCollection uc) throws IOException {
        j.writeStartObject();
        if (uc.users != null) {
            j.writeFieldName("users");
            j.writeStartArray();
            for (User u : uc.users) {
                serialize(j, u);
            }
            j.writeEndArray();
        }
        j.writeEndObject();
    }

    private static void serialize(final JsonGenerator j, final User u) throws IOException {
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
            for (User.Friend f : u.friends) {
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
