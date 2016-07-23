package com.github.fabienrenaud.jjb.stream;

import com.fasterxml.jackson.core.JsonParser;
import com.github.fabienrenaud.jjb.model.Users;
import com.github.fabienrenaud.jjb.model.Users.User;
import com.github.fabienrenaud.jjb.model.Users.Friend;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.owlike.genson.stream.ObjectReader;
import com.owlike.genson.stream.ValueType;

import java.io.IOException;
import java.util.ArrayList;

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
                uc.users = new ArrayList<>();
                while (jParser.nextToken() != com.fasterxml.jackson.core.JsonToken.END_ARRAY) {
                    uc.users.add(jacksonUser(jParser));
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
}
