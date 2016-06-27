package com.github.fabienrenaud.jjb;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.github.fabienrenaud.jjb.SmallPojo.Friend;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Fabien Renaud
 */
public final class GsonStreamHelper {

    private GsonStreamHelper() {
    }

    public static SmallPojo deserializeSmallPojo(JsonReader reader) throws IOException {
        SmallPojo r = new SmallPojo();
        while (true) {
            JsonToken token = reader.peek();
            switch (token) {
                case BEGIN_OBJECT:
                    reader.beginObject();
                    break;
                case END_OBJECT:
                    reader.endObject();
                    break;
                case END_DOCUMENT:
                    return r;
                case NAME:
                    String fieldname = reader.nextName();
                    switch (fieldname) {
                        case "_id":
                            r._id = reader.nextString();
                            break;
                        case "index":
                            r.index = reader.nextInt();
                            break;
                        case "guid":
                            r.guid = reader.nextString();
                            break;
                        case "isActive":
                            r.isActive = reader.nextBoolean();
                            break;
                        case "balance":
                            r.balance = reader.nextString();
                            break;
                        case "picture":
                            r.picture = reader.nextString();
                            break;
                        case "age":
                            r.age = reader.nextInt();
                            break;
                        case "eyeColor":
                            r.eyeColor = reader.nextString();
                            break;
                        case "name":
                            r.name = reader.nextString();
                            break;
                        case "gender":
                            r.gender = reader.nextString();
                            break;
                        case "company":
                            r.company = reader.nextString();
                            break;
                        case "email":
                            r.email = reader.nextString();
                            break;
                        case "phone":
                            r.phone = reader.nextString();
                            break;
                        case "address":
                            r.address = reader.nextString();
                            break;
                        case "about":
                            r.about = reader.nextString();
                            break;
                        case "registered":
                            r.registered = reader.nextString();
                            break;
                        case "latitude":
                            r.latitude = reader.nextDouble();
                            break;
                        case "longitude":
                            r.longitude = reader.nextDouble();
                            break;
                        case "greeting":
                            r.greeting = reader.nextString();
                            break;
                        case "favoriteFruit":
                            r.favoriteFruit = reader.nextString();
                            break;
                        case "tags":
                            r.tags = new ArrayList<>();
                            boolean carryOn = true;
                            while (carryOn) {
                                token = reader.peek();
                                switch (token) {
                                    case BEGIN_ARRAY:
                                        reader.beginArray();
                                        break;
                                    case END_ARRAY:
                                        reader.endArray();
                                        carryOn = false;
                                        break;
                                    case STRING:
                                        r.tags.add(reader.nextString());
                                        break;
                                }
                            }
                            break;
                        case "friends":
                            r.friends = new ArrayList<>();
                            Friend f = null;
                            carryOn = true;
                            while (carryOn) {
                                token = reader.peek();
                                switch (token) {
                                    case BEGIN_ARRAY:
                                        reader.beginArray();
                                        break;
                                    case END_ARRAY:
                                        reader.endArray();
                                        carryOn = false;
                                        break;
                                    case BEGIN_OBJECT:
                                        reader.beginObject();
                                        f = new Friend();
                                        break;
                                    case END_OBJECT:
                                        reader.endObject();
                                        r.friends.add(f);
                                        break;
                                    case NAME:
                                        String fn = reader.nextName();
                                        switch (fn) {
                                            case "id":
                                                f.id = reader.nextString();
                                                break;
                                            case "name":
                                                f.name = reader.nextString();
                                                break;
                                        }
                                        break;
                                }
                            }
                            break;
                    }
            }
        }
    }

    public static void serializeSmallPojo(final JsonWriter j, final SmallPojo o) throws IOException {
        j.beginObject();
        if (o._id != null) {
            j.name("_id");
            j.value(o._id);
        }
        j.name("index");
        j.value(o.index);
        if (o.guid != null) {
            j.name("guid");
            j.value(o.guid);
        }
        j.name("isActive");
        j.value(o.isActive);
        if (o.balance != null) {
            j.name("balance");
            j.value(o.balance);
        }
        if (o.picture != null) {
            j.name("picture");
            j.value(o.picture);
        }
        j.name("age");
        j.value(o.age);
        if (o.eyeColor != null) {
            j.name("eyeColor");
            j.value(o.eyeColor);
        }
        if (o.name != null) {
            j.name("name");
            j.value(o.name);
        }
        if (o.gender != null) {
            j.name("gender");
            j.value(o.gender);
        }
        if (o.company != null) {
            j.name("company");
            j.value(o.company);
        }
        if (o.email != null) {
            j.name("email");
            j.value(o.email);
        }
        if (o.phone != null) {
            j.name("phone");
            j.value(o.phone);
        }
        if (o.address != null) {
            j.name("address");
            j.value(o.address);
        }
        if (o.about != null) {
            j.name("about");
            j.value(o.about);
        }
        if (o.registered != null) {
            j.name("registered");
            j.value(o.registered);
        }
        j.name("latitude");
        j.value(o.latitude);
        j.name("longitude");
        j.value(o.longitude);
        if (o.tags != null) {
            j.name("tags");
            j.beginArray();
            for (String t : o.tags) {
                j.value(t);
            }
            j.endArray();
        }
        if (o.friends != null) {
            j.name("friends");
            j.beginArray();
            for (SmallPojo.Friend f : o.friends) {
                j.beginObject();
                j.name("id");
                j.value(f.id);
                j.name("name");
                j.value(f.name);
                j.endObject();
            }
            j.endArray();
        }
        if (o.greeting != null) {
            j.name("greeting");
            j.value(o.greeting);
        }
        if (o.favoriteFruit != null) {
            j.name("favoriteFruit");
            j.value(o.favoriteFruit);
        }
        j.endObject();
    }

}
