package com.github.fabienrenaud.jjb;

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

    public static SmallPojo deserializeSmallPojo(ObjectReader reader) throws IOException {
        SmallPojo r = new SmallPojo();

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
                                SmallPojo.Friend f = new SmallPojo.Friend();
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

    public static void serializeSmallPojo(final ObjectWriter j, final SmallPojo o) throws IOException {
        j.beginObject();
        if (o._id != null) {
            j.writeString("_id", o._id);
        }
        j.writeNumber("index", o.index);
        if (o.guid != null) {
            j.writeString("guid", o.guid);
        }
        j.writeBoolean("isActive", o.isActive);
        if (o.balance != null) {
            j.writeString("balance", o.balance);
        }
        if (o.picture != null) {
            j.writeString("picture", o.picture);
        }
        j.writeNumber("age", o.age);
        if (o.eyeColor != null) {
            j.writeString("eyeColor", o.eyeColor);
        }
        if (o.name != null) {
            j.writeString("name", o.name);
        }
        if (o.gender != null) {
            j.writeString("gender", o.gender);
        }
        if (o.company != null) {
            j.writeString("company", o.company);
        }
        if (o.email != null) {
            j.writeString("email", o.email);
        }
        if (o.phone != null) {
            j.writeString("phone", o.phone);
        }
        if (o.address != null) {
            j.writeString("address", o.address);
        }
        if (o.about != null) {
            j.writeString("about", o.about);
        }
        if (o.registered != null) {
            j.writeString("registered", o.registered);
        }
        j.writeNumber("latitude", o.latitude);
        j.writeNumber("longitude", o.longitude);
        if (o.tags != null) {
            j.writeName("tags");
            j.beginArray();
            for (String t : o.tags) {
                j.writeString(t);
            }
            j.endArray();
        }
        if (o.friends != null) {
            j.writeName("friends");
            j.beginArray();
            for (SmallPojo.Friend f : o.friends) {
                j.beginObject();
                j.writeString("id", f.id);
                j.writeString("name", f.name);
                j.endObject();
            }
            j.endArray();
        }
        if (o.greeting != null) {
            j.writeString("greeting", o.greeting);
        }
        if (o.favoriteFruit != null) {
            j.writeString("favoriteFruit", o.favoriteFruit);
        }
        j.endObject();
    }

}
