package com.github.fabienrenaud.jjb;

import com.github.fabienrenaud.jjb.model.User;
import com.github.fabienrenaud.jjb.model.User.Friend;
import com.github.fabienrenaud.jjb.model.UserCollection;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Fabien Renaud
 */
public final class GsonStreamHelper {

    private GsonStreamHelper() {
    }

    public static UserCollection deserializeUserCollection(JsonReader reader) throws IOException {
        UserCollection uc = new UserCollection();
        reader.beginObject();

        JsonToken token;
        while ((token = reader.peek()) != JsonToken.END_OBJECT) {
            if (token == JsonToken.NAME) {
                String fieldname = reader.nextName();
                if ("users".equals(fieldname)) {
                    uc.users = new ArrayList<>();
                    reader.beginArray();
                    while (reader.peek() != JsonToken.END_ARRAY) {
                        uc.users.add(deserializeUser(reader));
                    }
                    reader.endArray();
                }
            }
        }
        reader.endObject();
        return uc;
    }

    private static User deserializeUser(JsonReader reader) throws IOException {
        User r = new User();
        while (true) {
            JsonToken token = reader.peek();
            switch (token) {
                case BEGIN_OBJECT:
                    reader.beginObject();
                    break;
                case END_OBJECT:
                    reader.endObject();
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

    public static void serialize(final JsonWriter j, final UserCollection uc) throws IOException {
        j.beginObject();
        if (uc.users != null) {
            j.name("users");
            j.beginArray();
            for (User u : uc.users) {
                serialize(j, u);
            }
            j.endArray();
        }
        j.endObject();
    }

    private static void serialize(final JsonWriter j, final User u) throws IOException {
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
            for (User.Friend f : u.friends) {
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

}
