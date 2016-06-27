package com.github.fabienrenaud.jjb;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Fabien Renaud
 */
public final class JacksonStreamHelper {

    private JacksonStreamHelper() {
    }

    public static SmallPojo deserializeSmallPojo(JsonParser jParser) throws IOException {
        SmallPojo r = new SmallPojo();
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
                        SmallPojo.Friend f = new SmallPojo.Friend();
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

    public static void serializeSmallPojo(final JsonGenerator j, final SmallPojo o) throws IOException {
        j.writeStartObject();
        if (o._id != null) {
            j.writeFieldName("_id");
            j.writeString(o._id);
        }
        j.writeFieldName("index");
        j.writeNumber(o.index);
        if (o.guid != null) {
            j.writeFieldName("guid");
            j.writeString(o.guid);
        }
        j.writeFieldName("isActive");
        j.writeBoolean(o.isActive);
        if (o.balance != null) {
            j.writeFieldName("balance");
            j.writeString(o.balance);
        }
        if (o.picture != null) {
            j.writeFieldName("picture");
            j.writeString(o.picture);
        }
        j.writeFieldName("age");
        j.writeNumber(o.age);
        if (o.eyeColor != null) {
            j.writeFieldName("eyeColor");
            j.writeString(o.eyeColor);
        }
        if (o.name != null) {
            j.writeFieldName("name");
            j.writeString(o.name);
        }
        if (o.gender != null) {
            j.writeFieldName("gender");
            j.writeString(o.gender);
        }
        if (o.company != null) {
            j.writeFieldName("company");
            j.writeString(o.company);
        }
        if (o.email != null) {
            j.writeFieldName("email");
            j.writeString(o.email);
        }
        if (o.phone != null) {
            j.writeFieldName("phone");
            j.writeString(o.phone);
        }
        if (o.address != null) {
            j.writeFieldName("address");
            j.writeString(o.address);
        }
        if (o.about != null) {
            j.writeFieldName("about");
            j.writeString(o.about);
        }
        if (o.registered != null) {
            j.writeFieldName("registered");
            j.writeString(o.registered);
        }
        j.writeFieldName("latitude");
        j.writeNumber(o.latitude);
        j.writeFieldName("longitude");
        j.writeNumber(o.longitude);
        if (o.tags != null) {
            j.writeFieldName("tags");
            j.writeStartArray();
            for (String t : o.tags) {
                j.writeString(t);
            }
            j.writeEndArray();
        }
        if (o.friends != null) {
            j.writeFieldName("friends");
            j.writeStartArray();
            for (SmallPojo.Friend f : o.friends) {
                j.writeStartObject();
                j.writeFieldName("id");
                j.writeString(f.id);
                j.writeFieldName("name");
                j.writeString(f.name);
                j.writeEndObject();
            }
            j.writeEndArray();
        }
        if (o.greeting != null) {
            j.writeFieldName("greeting");
            j.writeString(o.greeting);
        }
        if (o.favoriteFruit != null) {
            j.writeFieldName("favoriteFruit");
            j.writeString(o.favoriteFruit);
        }
        j.writeEndObject();
    }

}
