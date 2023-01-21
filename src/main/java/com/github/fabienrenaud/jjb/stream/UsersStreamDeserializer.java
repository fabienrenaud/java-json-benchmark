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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UsersStreamDeserializer implements StreamDeserializer<Users> {

    @Override
    public Users genson(ObjectReader reader) throws IOException {
        Users uc = new Users();
        reader.beginObject();
        while (reader.hasNext()) {
            reader.next();
            String fieldname = reader.name();
            if ("users".equals(fieldname)) {
                uc.setUsers(new ArrayList<>());
                reader.beginArray();
                while (reader.hasNext()) {
                    reader.next();
                    uc.getUsers().add(gensonUser(reader));
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
                case "id":
                    r.setId(reader.valueAsString());
                    break;
                case "index":
                    r.setIndex(reader.valueAsInt());
                    break;
                case "guid":
                    r.setGuid(reader.valueAsString());
                    break;
                case "isActive":
                    r.setIsActive(reader.valueAsBoolean());
                    break;
                case "balance":
                    r.setBalance(reader.valueAsString());
                    break;
                case "picture":
                    r.setPicture(reader.valueAsString());
                    break;
                case "age":
                    r.setAge(reader.valueAsInt());
                    break;
                case "eyeColor":
                    r.setEyeColor(reader.valueAsString());
                    break;
                case "name":
                    r.setName(reader.valueAsString());
                    break;
                case "gender":
                    r.setGender(reader.valueAsString());
                    break;
                case "company":
                    r.setCompany(reader.valueAsString());
                    break;
                case "email":
                    r.setEmail(reader.valueAsString());
                    break;
                case "phone":
                    r.setPhone(reader.valueAsString());
                    break;
                case "address":
                    r.setAddress(reader.valueAsString());
                    break;
                case "about":
                    r.setAbout(reader.valueAsString());
                    break;
                case "registered":
                    r.setRegistered(reader.valueAsString());
                    break;
                case "latitude":
                    r.setLatitude(reader.valueAsDouble());
                    break;
                case "longitude":
                    r.setLongitude(reader.valueAsDouble());
                    break;
                case "greeting":
                    r.setGreeting(reader.valueAsString());
                    break;
                case "favoriteFruit":
                    r.setFavoriteFruit(reader.valueAsString());
                    break;
                case "tags":
                    if (reader.getValueType() == ValueType.ARRAY) {
                        r.setTags(new ArrayList<>());
                        reader.beginArray();
                        while (reader.hasNext()) {
                            reader.next();
                            r.getTags().add(reader.valueAsString());
                        }
                        reader.endArray();
                    }
                    break;
                case "friends":
                    if (reader.getValueType() == ValueType.ARRAY) {
                        r.setFriends(new ArrayList<>());
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
                                            f.setId(reader.valueAsString());
                                            break;
                                        case "name":
                                            f.setName(reader.valueAsString());
                                            break;
                                    }
                                }
                                reader.endObject();
                                r.getFriends().add(f);
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
                    uc.setUsers(new ArrayList<>());
                    reader.beginArray();
                    while (reader.peek() != JsonToken.END_ARRAY) {
                        uc.getUsers().add(gsonUser(reader));
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
                        case "id":
                            r.setId(reader.nextString());
                            break;
                        case "index":
                            r.setIndex(reader.nextInt());
                            break;
                        case "guid":
                            r.setGuid(reader.nextString());
                            break;
                        case "isActive":
                            r.setIsActive(reader.nextBoolean());
                            break;
                        case "balance":
                            r.setBalance(reader.nextString());
                            break;
                        case "picture":
                            r.setPicture(reader.nextString());
                            break;
                        case "age":
                            r.setAge(reader.nextInt());
                            break;
                        case "eyeColor":
                            r.setEyeColor(reader.nextString());
                            break;
                        case "name":
                            r.setName(reader.nextString());
                            break;
                        case "gender":
                            r.setGender(reader.nextString());
                            break;
                        case "company":
                            r.setCompany(reader.nextString());
                            break;
                        case "email":
                            r.setEmail(reader.nextString());
                            break;
                        case "phone":
                            r.setPhone(reader.nextString());
                            break;
                        case "address":
                            r.setAddress(reader.nextString());
                            break;
                        case "about":
                            r.setAbout(reader.nextString());
                            break;
                        case "registered":
                            r.setRegistered(reader.nextString());
                            break;
                        case "latitude":
                            r.setLatitude(reader.nextDouble());
                            break;
                        case "longitude":
                            r.setLongitude(reader.nextDouble());
                            break;
                        case "greeting":
                            r.setGreeting(reader.nextString());
                            break;
                        case "favoriteFruit":
                            r.setFavoriteFruit(reader.nextString());
                            break;
                        case "tags":
                            r.setTags(new ArrayList<>());
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
                                        r.getTags().add(reader.nextString());
                                        break;
                                }
                            }
                            break;
                        case "friends":
                            r.setFriends(new ArrayList<>());
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
                                        r.getFriends().add(f);
                                        break;
                                    case NAME:
                                        String fn = reader.nextName();
                                        switch (fn) {
                                            case "id":
                                                f.setId(reader.nextString());
                                                break;
                                            case "name":
                                                f.setName(reader.nextString());
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
                    uc.setUsers(new ArrayList<>());
                    while (jParser.nextToken() != com.fasterxml.jackson.core.JsonToken.END_ARRAY) {
                        uc.getUsers().add(jacksonUser(jParser));
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
                case "id":
                    jParser.nextToken();
                    r.setId(jParser.getValueAsString());
                    break;
                case "index":
                    jParser.nextToken();
                    r.setIndex(jParser.getIntValue());
                    break;
                case "guid":
                    jParser.nextToken();
                    r.setGuid(jParser.getValueAsString());
                    break;
                case "isActive":
                    jParser.nextToken();
                    r.setIsActive(jParser.getBooleanValue());
                    break;
                case "balance":
                    jParser.nextToken();
                    r.setBalance(jParser.getValueAsString());
                    break;
                case "picture":
                    jParser.nextToken();
                    r.setPicture(jParser.getValueAsString());
                    break;
                case "age":
                    jParser.nextToken();
                    r.setAge(jParser.getIntValue());
                    break;
                case "eyeColor":
                    jParser.nextToken();
                    r.setEyeColor(jParser.getValueAsString());
                    break;
                case "name":
                    jParser.nextToken();
                    r.setName(jParser.getValueAsString());
                    break;
                case "gender":
                    jParser.nextToken();
                    r.setGender(jParser.getValueAsString());
                    break;
                case "company":
                    jParser.nextToken();
                    r.setCompany(jParser.getValueAsString());
                    break;
                case "email":
                    jParser.nextToken();
                    r.setEmail(jParser.getValueAsString());
                    break;
                case "phone":
                    jParser.nextToken();
                    r.setPhone(jParser.getValueAsString());
                    break;
                case "address":
                    jParser.nextToken();
                    r.setAddress(jParser.getValueAsString());
                    break;
                case "about":
                    jParser.nextToken();
                    r.setAbout(jParser.getValueAsString());
                    break;
                case "registered":
                    jParser.nextToken();
                    r.setRegistered(jParser.getValueAsString());
                    break;
                case "latitude":
                    jParser.nextToken();
                    r.setLatitude(jParser.getDoubleValue());
                    break;
                case "longitude":
                    jParser.nextToken();
                    r.setLongitude(jParser.getDoubleValue());
                    break;
                case "greeting":
                    jParser.nextToken();
                    r.setGreeting(jParser.getValueAsString());
                    break;
                case "favoriteFruit":
                    jParser.nextToken();
                    r.setFavoriteFruit(jParser.getValueAsString());
                    break;
                case "tags":
                    r.setTags(new ArrayList<>());
                    jParser.nextToken();
                    while (jParser.nextToken() != com.fasterxml.jackson.core.JsonToken.END_ARRAY) {
                        r.getTags().add(jParser.getValueAsString());
                    }
                    break;
                case "friends":
                    r.setFriends(new ArrayList<>());
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
                                    f.setId(jParser.getValueAsString());
                                    break;
                                case "name":
                                    jParser.nextToken();
                                    f.setName(jParser.getValueAsString());
                                    break;
                            }
                        }
                        r.getFriends().add(f);
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
            uc.setUsers(new ArrayList<>());
            for (com.eclipsesource.json.JsonValue vi : jsarr) {
                uc.getUsers().add(minimaljsonUser(vi.asObject()));
            }
        }
        return uc;
    }

    private User minimaljsonUser(com.eclipsesource.json.JsonObject jso) {
        com.eclipsesource.json.JsonValue v;
        User u = new User();

        if ((v = jso.get("id")) != null) {
            u.setId(v.asString());
        }
        if ((v = jso.get("index")) != null) {
            u.setIndex(v.asInt());
        }
        if ((v = jso.get("guid")) != null) {
            u.setGuid(v.asString());
        }
        if ((v = jso.get("isActive")) != null) {
            u.setIsActive(v.asBoolean());
        }
        if ((v = jso.get("balance")) != null) {
            u.setBalance(v.asString());
        }
        if ((v = jso.get("picture")) != null) {
            u.setPicture(v.asString());
        }
        if ((v = jso.get("age")) != null) {
            u.setAge(v.asInt());
        }
        if ((v = jso.get("eyeColor")) != null) {
            u.setEyeColor(v.asString());
        }
        if ((v = jso.get("name")) != null) {
            u.setName(v.asString());
        }
        if ((v = jso.get("gender")) != null) {
            u.setGender(v.asString());
        }
        if ((v = jso.get("company")) != null) {
            u.setCompany(v.asString());
        }
        if ((v = jso.get("email")) != null) {
            u.setEmail(v.asString());
        }
        if ((v = jso.get("phone")) != null) {
            u.setPhone(v.asString());
        }
        if ((v = jso.get("address")) != null) {
            u.setAddress(v.asString());
        }
        if ((v = jso.get("about")) != null) {
            u.setAbout(v.asString());
        }
        if ((v = jso.get("registered")) != null) {
            u.setRegistered(v.asString());
        }
        if ((v = jso.get("latitude")) != null) {
            u.setLatitude(v.asDouble());
        }
        if ((v = jso.get("longitude")) != null) {
            u.setLongitude(v.asDouble());
        }
        if ((v = jso.get("greeting")) != null) {
            u.setGreeting(v.asString());
        }
        if ((v = jso.get("favoriteFruit")) != null) {
            u.setFavoriteFruit(v.asString());
        }
        if ((v = jso.get("tags")) != null) {
            com.eclipsesource.json.JsonArray jsonarr = v.asArray();
            u.setTags(new ArrayList<>());
            for (com.eclipsesource.json.JsonValue vi : jsonarr) {
                u.getTags().add(vi.asString());
            }
        }
        if ((v = jso.get("friends")) != null) {
            com.eclipsesource.json.JsonArray jsonarr = v.asArray();
            u.setFriends(new ArrayList<>());
            for (com.eclipsesource.json.JsonValue vi : jsonarr) {
                com.eclipsesource.json.JsonObject jso0 = vi.asObject();
                Friend f = new Friend();
                f.setId(jso0.get("id").asString());
                f.setName(jso0.get("name").asString());
                u.getFriends().add(f);
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
                    users.setUsers(new ArrayList<>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        users.getUsers().add(moshiUser(reader));
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
                case "id":
                    user.setId(reader.nextString());
                    break;
                case "index":
                    user.setIndex(reader.nextInt());
                    break;
                case "guid":
                    user.setGuid(reader.nextString());
                    break;
                case "isActive":
                    user.setIsActive(reader.nextBoolean());
                    break;
                case "balance":
                    user.setBalance(reader.nextString());
                    break;
                case "picture":
                    user.setPicture(reader.nextString());
                    break;
                case "age":
                    user.setAge(reader.nextInt());
                    break;
                case "eyeColor":
                    user.setEyeColor(reader.nextString());
                    break;
                case "name":
                    user.setName(reader.nextString());
                    break;
                case "gender":
                    user.setGender(reader.nextString());
                    break;
                case "company":
                    user.setCompany(reader.nextString());
                    break;
                case "email":
                    user.setEmail(reader.nextString());
                    break;
                case "phone":
                    user.setPhone(reader.nextString());
                    break;
                case "address":
                    user.setAddress(reader.nextString());
                    break;
                case "about":
                    user.setAbout(reader.nextString());
                    break;
                case "registered":
                    user.setRegistered(reader.nextString());
                    break;
                case "latitude":
                    user.setLatitude(reader.nextDouble());
                    break;
                case "longitude":
                    user.setLongitude(reader.nextDouble());
                    break;
                case "tags":
                    user.setTags(new ArrayList<>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        user.getTags().add(reader.nextString());
                    }
                    reader.endArray();
                    break;
                case "friends":
                    user.setFriends(new ArrayList<>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        user.getFriends().add(moshiFriend(reader));
                    }
                    reader.endArray();
                    break;
                case "greeting":
                    user.setGreeting(reader.nextString());
                    break;
                case "favoriteFruit":
                    user.setFavoriteFruit(reader.nextString());
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
                    friend.setId(reader.nextString());
                    break;
                case "name":
                    friend.setName(reader.nextString());
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
        Map<String, Object> jso = com.github.underscore.U.fromJson(string);
        Object v;
        Users uc = new Users();

        if ((v = jso.get("users")) != null) {
            List<Object> jsarr = (List<Object>) v;
            uc.setUsers(new ArrayList<>());
            for (Object vi : jsarr) {
                uc.getUsers().add(underscore_java((Map<String, Object>) vi));
            }
        }
        return uc;
    }

    private User underscore_java(Map<String, Object> jso) {
        Object v;
        User u = new User();

        if ((v = jso.get("id")) != null) {
            u.setId((String) v);
        }
        if ((v = jso.get("index")) != null) {
            u.setIndex(((Long) v).intValue());
        }
        if ((v = jso.get("guid")) != null) {
            u.setGuid((String) v);
        }
        if ((v = jso.get("isActive")) != null) {
            u.setIsActive(((Boolean) v));
        }
        if ((v = jso.get("balance")) != null) {
            u.setBalance((String) v);
        }
        if ((v = jso.get("picture")) != null) {
            u.setPicture((String) v);
        }
        if ((v = jso.get("age")) != null) {
            u.setAge(((Long) v).intValue());
        }
        if ((v = jso.get("eyeColor")) != null) {
            u.setEyeColor((String) v);
        }
        if ((v = jso.get("name")) != null) {
            u.setName((String) v);
        }
        if ((v = jso.get("gender")) != null) {
            u.setGender((String) v);
        }
        if ((v = jso.get("company")) != null) {
            u.setCompany((String) v);
        }
        if ((v = jso.get("email")) != null) {
            u.setEmail((String) v);
        }
        if ((v = jso.get("phone")) != null) {
            u.setPhone((String) v);
        }
        if ((v = jso.get("address")) != null) {
            u.setAddress((String) v);
        }
        if ((v = jso.get("about")) != null) {
            u.setAbout((String) v);
        }
        if ((v = jso.get("registered")) != null) {
            u.setRegistered((String) v);
        }
        if ((v = jso.get("latitude")) != null) {
            u.setLatitude(v instanceof BigDecimal ? ((BigDecimal) v).doubleValue() : (Double) v);
        }
        if ((v = jso.get("longitude")) != null) {
            u.setLongitude(v instanceof BigDecimal ? ((BigDecimal) v).doubleValue() : (Double) v);
        }
        if ((v = jso.get("greeting")) != null) {
            u.setGreeting((String) v);
        }
        if ((v = jso.get("favoriteFruit")) != null) {
            u.setFavoriteFruit((String) v);
        }
        if ((v = jso.get("tags")) != null) {
            List<Object> jsonarr = (List<Object>) v;
            u.setTags(new ArrayList<>());
            for (Object vi : jsonarr) {
                u.getTags().add((String) vi);
            }
        }
        if ((v = jso.get("friends")) != null) {
            List<Object> jsonarr = (List<Object>) v;
            u.setFriends(new ArrayList<>());
            for (Object vi : jsonarr) {
                Map<String, Object> jso0 = (Map<String, Object>) vi;
                Friend f = new Friend();
                f.setId((String) jso0.get("id"));
                f.setName((String) jso0.get("name"));
                u.getFriends().add(f);
            }
        }

        return u;
    }
}
