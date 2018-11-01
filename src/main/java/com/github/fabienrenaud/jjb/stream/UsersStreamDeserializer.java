package com.github.fabienrenaud.jjb.stream;

import com.fasterxml.jackson.core.JsonParser;
import com.github.fabienrenaud.jjb.model.Users;
import com.github.fabienrenaud.jjb.model.Users.Friend;
import com.github.fabienrenaud.jjb.model.Users.User;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.owlike.genson.stream.ObjectReader;
import com.owlike.genson.stream.ValueType;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by frenaud on 7/23/16.
 */
public class UsersStreamDeserializer implements StreamDeserializer<Users> {

    @Override
    public Users genson(ObjectReader reader) throws IOException {
        Users uc = new Users();
        reader.beginObject();
        while (reader.hasNext()) {
            reader.next();
            String fieldname = reader.name();
            if ("users".equals(fieldname)) {
                uc.users = new ArrayList<>();
                reader.beginArray();
                while (reader.hasNext()) {
                    reader.next();
                    uc.users.add(gensonUser(reader));
                }
                reader.endArray();
            }
        }
        reader.endObject();
        return uc;
    }

    private User gensonUser(ObjectReader reader) throws IOException {
        User r = new User();

        reader.beginObject();
        while (reader.hasNext()) {
            reader.next();
            String fieldname = reader.name();
            if (fieldname == null) {
                continue;
            }
            switch (fieldname) {
                case "_id":
                    r._id = reader.valueAsString();
                    break;
                case "index":
                    r.index = reader.valueAsInt();
                    break;
                case "guid":
                    r.guid = reader.valueAsString();
                    break;
                case "isActive":
                    r.isActive = reader.valueAsBoolean();
                    break;
                case "balance":
                    r.balance = reader.valueAsString();
                    break;
                case "picture":
                    r.picture = reader.valueAsString();
                    break;
                case "age":
                    r.age = reader.valueAsInt();
                    break;
                case "eyeColor":
                    r.eyeColor = reader.valueAsString();
                    break;
                case "name":
                    r.name = reader.valueAsString();
                    break;
                case "gender":
                    r.gender = reader.valueAsString();
                    break;
                case "company":
                    r.company = reader.valueAsString();
                    break;
                case "email":
                    r.email = reader.valueAsString();
                    break;
                case "phone":
                    r.phone = reader.valueAsString();
                    break;
                case "address":
                    r.address = reader.valueAsString();
                    break;
                case "about":
                    r.about = reader.valueAsString();
                    break;
                case "registered":
                    r.registered = reader.valueAsString();
                    break;
                case "latitude":
                    r.latitude = reader.valueAsDouble();
                    break;
                case "longitude":
                    r.longitude = reader.valueAsDouble();
                    break;
                case "greeting":
                    r.greeting = reader.valueAsString();
                    break;
                case "favoriteFruit":
                    r.favoriteFruit = reader.valueAsString();
                    break;
                case "tags":
                    if (reader.getValueType() == ValueType.ARRAY) {
                        r.tags = new ArrayList<>();
                        reader.beginArray();
                        while (reader.hasNext()) {
                            reader.next();
                            r.tags.add(reader.valueAsString());
                        }
                        reader.endArray();
                    }
                    break;
                case "friends":
                    if (reader.getValueType() == ValueType.ARRAY) {
                        r.friends = new ArrayList<>();
                        reader.beginArray();
                        while (reader.hasNext()) {
                            if (reader.next() == ValueType.OBJECT) {
                                reader.beginObject();
                                Friend f = new Friend();
                                while (reader.hasNext()) {
                                    reader.next();
                                    String fn = reader.name();
                                    if (fn == null) {
                                        continue;
                                    }
                                    switch (fn) {
                                        case "id":
                                            f.id = reader.valueAsString();
                                            break;
                                        case "name":
                                            f.name = reader.valueAsString();
                                            break;
                                    }
                                }
                                reader.endObject();
                                r.friends.add(f);
                            }
                        }
                        reader.endArray();
                    }
                    break;
            }
        }
        reader.endObject();

        return r;
    }

    /*
     * GSON
     */

    @Override
    public Users gson(JsonReader reader) throws IOException {
        Users uc = new Users();
        reader.beginObject();

        JsonToken token;
        while ((token = reader.peek()) != JsonToken.END_OBJECT) {
            if (token == JsonToken.NAME) {
                String fieldname = reader.nextName();
                if ("users".equals(fieldname)) {
                    uc.users = new ArrayList<>();
                    reader.beginArray();
                    while (reader.peek() != JsonToken.END_ARRAY) {
                        uc.users.add(gsonUser(reader));
                    }
                    reader.endArray();
                }
            }
        }
        reader.endObject();
        return uc;
    }

    private User gsonUser(JsonReader reader) throws IOException {
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

    @Override
    public Users jackson(JsonParser jParser) throws IOException {
        Users uc = new Users();
        while (jParser.nextToken() != com.fasterxml.jackson.core.JsonToken.END_OBJECT) {
            String fieldname = jParser.getCurrentName();
            if ("users".equals(fieldname)) {
                if (jParser.nextToken() == com.fasterxml.jackson.core.JsonToken.START_ARRAY) {
                    uc.users = new ArrayList<>();
                    while (jParser.nextToken() != com.fasterxml.jackson.core.JsonToken.END_ARRAY) {
                        uc.users.add(jacksonUser(jParser));
                        if (jParser.isClosed()) {
                            throw new IOException("parser closed");
                        }
                    }
                }
            }
        }
        return uc;
    }

    private User jacksonUser(JsonParser jParser) throws IOException {
        User r = new User();
        while (jParser.nextToken() != com.fasterxml.jackson.core.JsonToken.END_OBJECT) {
            String fieldname = jParser.getCurrentName();
            if (fieldname == null) {
                break;
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
                    while (jParser.nextToken() != com.fasterxml.jackson.core.JsonToken.END_ARRAY) {
                        r.tags.add(jParser.getValueAsString());
                    }
                    break;
                case "friends":
                    r.friends = new ArrayList<>();
                    jParser.nextToken(); // current token is "[", move next.
                    while (jParser.nextToken() != com.fasterxml.jackson.core.JsonToken.END_ARRAY) {
                        Friend f = new Friend();
                        while (jParser.nextToken() != com.fasterxml.jackson.core.JsonToken.END_OBJECT) {
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

    @Override
    public Users minimaljson(Reader reader) throws IOException {
        com.eclipsesource.json.JsonObject jso = com.eclipsesource.json.Json.parse(reader).asObject();
        com.eclipsesource.json.JsonValue v;
        Users uc = new Users();

        if ((v = jso.get("users")) != null) {
            com.eclipsesource.json.JsonArray jsarr = v.asArray();
            uc.users = new ArrayList<>();
            for (com.eclipsesource.json.JsonValue vi : jsarr) {
                uc.users.add(minimaljsonUser(vi.asObject()));
            }
        }
        return uc;
    }

    private User minimaljsonUser(com.eclipsesource.json.JsonObject jso) {
        com.eclipsesource.json.JsonValue v;
        User u = new User();

        if ((v = jso.get("_id")) != null) {
            u._id = v.asString();
        }
        if ((v = jso.get("index")) != null) {
            u.index = v.asInt();
        }
        if ((v = jso.get("guid")) != null) {
            u.guid = v.asString();
        }
        if ((v = jso.get("isActive")) != null) {
            u.isActive = v.asBoolean();
        }
        if ((v = jso.get("balance")) != null) {
            u.balance = v.asString();
        }
        if ((v = jso.get("picture")) != null) {
            u.picture = v.asString();
        }
        if ((v = jso.get("age")) != null) {
            u.age = v.asInt();
        }
        if ((v = jso.get("eyeColor")) != null) {
            u.eyeColor = v.asString();
        }
        if ((v = jso.get("name")) != null) {
            u.name = v.asString();
        }
        if ((v = jso.get("gender")) != null) {
            u.gender = v.asString();
        }
        if ((v = jso.get("company")) != null) {
            u.company = v.asString();
        }
        if ((v = jso.get("email")) != null) {
            u.email = v.asString();
        }
        if ((v = jso.get("phone")) != null) {
            u.phone = v.asString();
        }
        if ((v = jso.get("address")) != null) {
            u.address = v.asString();
        }
        if ((v = jso.get("about")) != null) {
            u.about = v.asString();
        }
        if ((v = jso.get("registered")) != null) {
            u.registered = v.asString();
        }
        if ((v = jso.get("latitude")) != null) {
            u.latitude = v.asDouble();
        }
        if ((v = jso.get("longitude")) != null) {
            u.longitude = v.asDouble();
        }
        if ((v = jso.get("greeting")) != null) {
            u.greeting = v.asString();
        }
        if ((v = jso.get("favoriteFruit")) != null) {
            u.favoriteFruit = v.asString();
        }
        if ((v = jso.get("tags")) != null) {
            com.eclipsesource.json.JsonArray jsonarr = v.asArray();
            u.tags = new ArrayList<>();
            for (com.eclipsesource.json.JsonValue vi : jsonarr) {
                u.tags.add(vi.asString());
            }
        }
        if ((v = jso.get("friends")) != null) {
            com.eclipsesource.json.JsonArray jsonarr = v.asArray();
            u.friends = new ArrayList<>();
            for (com.eclipsesource.json.JsonValue vi : jsonarr) {
                com.eclipsesource.json.JsonObject jso0 = vi.asObject();
                Friend f = new Friend();
                f.id = jso0.get("id").asString();
                f.name = jso0.get("name").asString();
                u.friends.add(f);
            }
        }

        return u;
    }

    @Override
    public Users moshi(com.squareup.moshi.JsonReader reader) throws IOException {
        Users users = new Users();

        reader.beginObject();

        while (reader.hasNext()) {
            switch (reader.nextName()) {
                case "users":
                    users.users = new ArrayList<>();
                    reader.beginArray();
                    while (reader.hasNext()) {
                        users.users.add(moshiUser(reader));
                    }
                    reader.endArray();
                    break;
                default:
                    reader.skipValue();
            }
        }

        reader.endObject();

        return users;
    }

    private User moshiUser(com.squareup.moshi.JsonReader reader) throws IOException {
        User user = new User();

        reader.beginObject();

        while (reader.hasNext()) {
            switch (reader.nextName()) {
                case "_id":
                    user._id = reader.nextString();
                    break;
                case "index":
                    user.index = reader.nextInt();
                    break;
                case "guid":
                    user.guid = reader.nextString();
                    break;
                case "isActive":
                    user.isActive = reader.nextBoolean();
                    break;
                case "balance":
                    user.balance = reader.nextString();
                    break;
                case "picture":
                    user.picture = reader.nextString();
                    break;
                case "age":
                    user.age = reader.nextInt();
                    break;
                case "eyeColor":
                    user.eyeColor = reader.nextString();
                    break;
                case "name":
                    user.name = reader.nextString();
                    break;
                case "gender":
                    user.gender = reader.nextString();
                    break;
                case "company":
                    user.company = reader.nextString();
                    break;
                case "email":
                    user.email = reader.nextString();
                    break;
                case "phone":
                    user.phone = reader.nextString();
                    break;
                case "address":
                    user.address = reader.nextString();
                    break;
                case "about":
                    user.about = reader.nextString();
                    break;
                case "registered":
                    user.registered = reader.nextString();
                    break;
                case "latitude":
                    user.latitude = reader.nextDouble();
                    break;
                case "longitude":
                    user.longitude = reader.nextDouble();
                    break;
                case "tags":
                    user.tags = new ArrayList<>();
                    reader.beginArray();
                    while (reader.hasNext()) {
                        user.tags.add(reader.nextString());
                    }
                    reader.endArray();
                    break;
                case "friends":
                    user.friends = new ArrayList<>();
                    reader.beginArray();
                    while (reader.hasNext()) {
                        user.friends.add(moshiFriend(reader));
                    }
                    reader.endArray();
                    break;
                case "greeting":
                    user.greeting = reader.nextString();
                    break;
                case "favoriteFruit":
                    user.favoriteFruit = reader.nextString();
                    break;
                default:
                    reader.skipValue();
                    break;
            }
        }

        reader.endObject();

        return user;
    }

    private Friend moshiFriend(com.squareup.moshi.JsonReader reader) throws IOException {
        Friend friend = new Friend();

        reader.beginObject();

        while (reader.hasNext()) {
            switch (reader.nextName()) {
                case "id":
                    friend.id = reader.nextString();
                    break;
                case "name":
                    friend.name = reader.nextString();
                    break;
                default:
                    reader.skipValue();
                    break;
            }
        }

        reader.endObject();

        return friend;
    }

    @Override
    public Users underscore_java(String string) {
        java.util.Map<String, Object> jso = (java.util.Map<String, Object>) com.github.underscore.lodash.U.fromJson(string);
        Object v;
        Users uc = new Users();

        if ((v = jso.get("users")) != null) {
            java.util.List<Object> jsarr = (java.util.List<Object>) v;
            uc.users = new ArrayList<>();
            for (Object vi : jsarr) {
                uc.users.add(underscore_java((java.util.Map<String, Object>) vi));
            }
        }
        return uc;
    }

    private User underscore_java(java.util.Map<String, Object> jso) {
        Object v;
        User u = new User();

        if ((v = jso.get("_id")) != null) {
            u._id = (String) v;
        }
        if ((v = jso.get("index")) != null) {
            u.index = ((Long) v).intValue();
        }
        if ((v = jso.get("guid")) != null) {
            u.guid = (String) v;
        }
        if ((v = jso.get("isActive")) != null) {
            u.isActive = ((Boolean) v);
        }
        if ((v = jso.get("balance")) != null) {
            u.balance = (String) v;
        }
        if ((v = jso.get("picture")) != null) {
            u.picture = (String) v;
        }
        if ((v = jso.get("age")) != null) {
            u.age = ((Long) v).intValue();
        }
        if ((v = jso.get("eyeColor")) != null) {
            u.eyeColor = (String) v;
        }
        if ((v = jso.get("name")) != null) {
            u.name = (String) v;
        }
        if ((v = jso.get("gender")) != null) {
            u.gender = (String) v;
        }
        if ((v = jso.get("company")) != null) {
            u.company = (String) v;
        }
        if ((v = jso.get("email")) != null) {
            u.email = (String) v;
        }
        if ((v = jso.get("phone")) != null) {
            u.phone = (String) v;
        }
        if ((v = jso.get("address")) != null) {
            u.address = (String) v;
        }
        if ((v = jso.get("about")) != null) {
            u.about = (String) v;
        }
        if ((v = jso.get("registered")) != null) {
            u.registered = (String) v;
        }
        if ((v = jso.get("latitude")) != null) {
            u.latitude = (Double) v;
        }
        if ((v = jso.get("longitude")) != null) {
            u.longitude = (Double) v;
        }
        if ((v = jso.get("greeting")) != null) {
            u.greeting = (String) v;
        }
        if ((v = jso.get("favoriteFruit")) != null) {
            u.favoriteFruit = (String) v;
        }
        if ((v = jso.get("tags")) != null) {
            java.util.List<Object> jsonarr = (java.util.List<Object>) v;
            u.tags = new ArrayList<>();
            for (Object vi : jsonarr) {
                u.tags.add((String) vi);
            }
        }
        if ((v = jso.get("friends")) != null) {
            java.util.List<Object> jsonarr = (java.util.List<Object>) v;
            u.friends = new ArrayList<>();
            for (Object vi : jsonarr) {
                java.util.Map<String, Object> jso0 = (java.util.Map<String, Object>) vi;
                Friend f = new Friend();
                f.id = (String) jso0.get("id");
                f.name = (String) jso0.get("name");
                u.friends.add(f);
            }
        }

        return u;
    }
}
