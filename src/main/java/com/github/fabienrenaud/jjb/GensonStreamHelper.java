package com.github.fabienrenaud.jjb;

import com.github.fabienrenaud.jjb.model.User;
import com.github.fabienrenaud.jjb.model.UserCollection;
import com.owlike.genson.stream.ObjectReader;
import com.owlike.genson.stream.ObjectWriter;
import com.owlike.genson.stream.ValueType;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Fabien Renaud
 */
public final class GensonStreamHelper {

    private GensonStreamHelper() {
    }

    public static UserCollection deserializeUserCollection(ObjectReader reader) throws IOException {
        UserCollection uc = new UserCollection();
        reader.beginObject();
        while (reader.hasNext()) {
            reader.next();
            String fieldname = reader.name();
            if ("users".equals(fieldname)) {
                uc.users = new ArrayList<>();
                reader.beginArray();
                while (reader.hasNext()) {
                    reader.next();
                    uc.users.add(deserializeUser(reader));
                }
                reader.endArray();
            }
        }
        reader.endObject();
        return uc;
    }

    public static User deserializeUser(ObjectReader reader) throws IOException {
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
                                User.Friend f = new User.Friend();
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

    public static void serialize(final ObjectWriter j, final UserCollection uc) throws IOException {
        j.beginObject();
        if (uc.users != null) {
            j.writeName("users");
            j.beginArray();
            for (User u : uc.users) {
                serialize(j, u);
            }
            j.endArray();
        }
        j.endObject();
    }

    private static void serialize(final ObjectWriter j, final User u) throws IOException {
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
            for (User.Friend f : u.friends) {
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

}
