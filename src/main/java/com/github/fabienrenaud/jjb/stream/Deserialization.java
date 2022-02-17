package com.github.fabienrenaud.jjb.stream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import org.json.JSONException;
import org.json.JSONObject;
import org.openjdk.jmh.annotations.Benchmark;

import com.fasterxml.jackson.core.JsonParser;
import com.github.fabienrenaud.jjb.JsonBench;
import com.github.fabienrenaud.jjb.data.JsonSource;
import com.github.fabienrenaud.jjb.model.Clients;
import com.github.fabienrenaud.jjb.model.Clients.Client;
import com.github.fabienrenaud.jjb.model.Clients.EyeColor;
import com.github.fabienrenaud.jjb.model.Clients.Partner;
import com.github.fabienrenaud.jjb.model.Users;
import com.github.fabienrenaud.jjb.model.Users.Friend;
import com.github.fabienrenaud.jjb.model.Users.User;
import com.owlike.genson.stream.ObjectReader;

import io.github.senthilganeshs.parser.json.Parser;
import io.github.senthilganeshs.parser.json.Parser.Value;

/**
 * @author Fabien Renaud
 */
public class Deserialization extends JsonBench {

    public JsonSource JSON_SOURCE() {
        return CLI_JSON_SOURCE;
    }

    @Benchmark
    @Override
    public Object orgjson() throws JSONException {
        JSONObject node = new JSONObject(JSON_SOURCE().nextString());
        return node;
    }

    @Benchmark
    @Override
    public Object javaxjson() throws IOException {
        return javax.json.Json.createReader(JSON_SOURCE().nextInputStream()).readObject();
    }

    @Benchmark
    @Override
    public Object jackson() throws IOException {
        try (JsonParser jParser = JSON_SOURCE().provider().jacksonFactory().createParser(JSON_SOURCE().nextByteArray())) {
            return JSON_SOURCE().streamDeserializer().jackson(jParser);
        }
    }

    @Benchmark
    @Override
    public Object avajejsonb_jackson() throws IOException {
        return JSON_SOURCE().provider().avajeJsonb_jackson().fromJson(JSON_SOURCE().nextByteArray());
    }

    @Benchmark
    @Override
    public Object avajejsonb() throws IOException {
        return JSON_SOURCE().provider().avajeJsonb_default().fromJson(JSON_SOURCE().nextByteArray());
    }

    @Benchmark
    @Override
    public Object gson() throws Exception {
        try (com.google.gson.stream.JsonReader jr = new com.google.gson.stream.JsonReader(JSON_SOURCE().nextReader())) {
            return JSON_SOURCE().streamDeserializer().gson(jr);
        }
    }

    @Benchmark
    @Override
    public Object genson() throws Exception {
        try (ObjectReader reader = JSON_SOURCE().provider().genson().createReader(JSON_SOURCE().nextByteArray())) {
            return JSON_SOURCE().streamDeserializer().genson(reader);
        }
    }

    @Benchmark
    @Override
    public Object jsonio() throws Exception {
        return com.cedarsoftware.util.io.JsonReader.jsonToJava(JSON_SOURCE().nextInputStream(), JSON_SOURCE().provider().jsonioStreamOptions());
    }

    @Benchmark
    @Override
    public Object jsonsimple() throws Exception {
        return org.json.simple.JSONValue.parse(JSON_SOURCE().nextReader());
    }

    @Benchmark
    @Override
    public Object nanojson() throws Exception {
        return com.grack.nanojson.JsonParser.object().from(JSON_SOURCE().nextInputStream());
    }

    @Benchmark
    @Override
    public Object tapestry() throws Exception {
        org.apache.tapestry5.json.JSONObject node = new org.apache.tapestry5.json.JSONObject(JSON_SOURCE().nextString());
        return node;
    }

    @Benchmark
    @Override
    public Object minimaljson() throws Exception {
        return JSON_SOURCE().streamDeserializer().minimaljson(JSON_SOURCE().nextReader());
    }

    @Benchmark
    @Override
    public Object moshi() throws Exception {
        try (com.squareup.moshi.JsonReader jr = com.squareup.moshi.JsonReader.of(JSON_SOURCE().nextOkioBufferedSource())) {
            return JSON_SOURCE().streamDeserializer().moshi(jr);
        }
    }

    @Benchmark
    @Override
    public Object mjson() throws Exception {
        return mjson.Json.read(JSON_SOURCE().nextString());
    }

    @Benchmark
    @Override
    public Object underscore_java() throws Exception {
        return JSON_SOURCE().streamDeserializer().underscore_java(JSON_SOURCE().nextString());
    }

    @Benchmark
    @Override
    public Object purejson() throws Exception {
        final AtomicReference<Object> ref = new AtomicReference<>();
        try (final InputStream is = new ByteArrayInputStream(JSON_SOURCE().nextByteArray())) {
            Parser.create()
                    .parse(is)
                    .ifSuccess(v -> ref.set(PureJson.toObject(v))) //construct object if success.
                    .ifFailure(msg -> {
                        throw new RuntimeException(msg);
                    }); //crash if exception
            return ref.get();
        }
    }


    interface PureJson {
        static Object toObject(final Value v) {
            List<User> users = new ArrayList<>();
            List<Client> clients = new ArrayList<>();

            final AtomicBoolean isUser = new AtomicBoolean(false);
            v.isJSON((k, jv) -> k.isString(key ->
                    jv.isArray(av -> {
                        if (key.equals("users")) {
                            users.add(toUser(av));
                            isUser.set(true);
                        } else if (key.equals("clients")) {
                            clients.add(toClient(av));
                            isUser.set(false);
                        }
                    })));

            if (isUser.get()) {
                Users us = new Users();
                us.users = users;
                return us;
            } else {
                Clients cs = new Clients();
                cs.clients = clients;
                return cs;
            }
        }

        static Client toClient(final Value v) {
            final Client client = new Client();
            v.isJSON((k, jv) -> k.isString(key -> {
                switch (key) {
                    case "_id":
                        jv.isInteger(id -> client._id = id);
                        break;
                    case "index":
                        jv.isInteger(index -> client.index = index.intValue());
                        break;
                    case "guid":
                        jv.isInteger(guid -> client.guid = UUID.fromString(guid.toString()));
                        break;
                    case "isActive":
                        jv.isBool(isActive -> client.isActive = isActive);
                        break;
                    case "balance":
                        jv.isDouble(balance -> client.balance = new BigDecimal(balance));
                        break;
                    case "picture":
                        jv.isString(picture -> client.picture = picture);
                        break;
                    case "age":
                        jv.isInteger(age -> client.age = age.intValue());
                        break;
                    case "eyeColor":
                        jv.isInteger(ec -> client.eyeColor = EyeColor.fromNumber(ec.intValue()));
                        break;
                    case "name":
                        jv.isString(name -> client.name = name);
                        break;
                    case "gender":
                        jv.isString(gender -> client.gender = gender);
                        break;
                    case "company":
                        jv.isString(company -> client.company = company);
                        break;
                    case "emails":
                        List<String> emails = new ArrayList<>();
                        jv.isArray(av -> av
                                .isString(emails::add));
                        client.emails = emails.toArray(new String[0]);
                        break;
                    case "phones":
                        List<Long> phones = new ArrayList<>();
                        jv.isArray(av -> av
                                .isInteger(phones::add));
                        long[] ps = new long[phones.size()];
                        for (int i = 0; i < phones.size(); i++) {
                            ps[i] = phones.get(i);
                        }
                        client.phones = ps;
                        break;
                    case "address":
                        jv.isString(address -> client.address = address);
                        break;
                    case "about":
                        jv.isString(about -> client.about = about);
                        break;
                    case "registered":
                        jv.isString(registered -> client.registered = LocalDate.parse(registered));
                        break;
                    case "latitude":
                        jv.isDouble(latitude -> client.latitude = latitude);
                        break;
                    case "longitude":
                        jv.isDouble(longitude -> client.longitude = longitude);
                        break;
                    case "tags":
                        final List<String> tags = new ArrayList<>();
                        jv.isArray(av -> av
                                .isString(tags::add));
                        client.tags = tags;
                        break;
                    case "partners":
                        final List<Partner> partners = new ArrayList<>();
                        final List<Long> ids = new ArrayList<>();
                        final List<String> names = new ArrayList<>();
                        final List<OffsetDateTime> since = new ArrayList<>();

                        jv.isArray(av -> av
                                .isJSON((ak, ajv) -> ak.isString(ajk -> {
                                    switch (ajk) {
                                        case "id":
                                            ajv.isInteger(ids::add);
                                            break;
                                        case "name":
                                            ajv.isString(names::add);
                                            break;
                                        case "since":
                                            ajv.isString(time -> since.add(OffsetDateTime.parse(time)));
                                            break;
                                    }
                                })));

                        for (int i = 0; i < ids.size(); i++) {
                            partners.add(Partner.create(ids.get(i), names.get(i), since.get(i)));
                        }
                        client.partners = partners;
                        break;
                }
            }));

            return client;
        }

        static User toUser(final Value v) {
            final User user = new User();
            v.isJSON((jk, jv) -> jk.isString(key -> {
                switch (key) {
                    case "_id":
                        jv.isString(id -> user._id = id);
                        break;
                    case "index":
                        jv.isInteger(index -> user.index = index.intValue());
                        break;
                    case "guid":
                        jv.isString(guid -> user.guid = guid);
                        break;
                    case "isActive":
                        jv.isBool(isActive -> user.isActive = isActive);
                        break;
                    case "balance":
                        jv.isString(balance -> user.balance = balance);
                        break;
                    case "picture":
                        jv.isString(picture -> user.picture = picture);
                        break;
                    case "age":
                        jv.isInteger(age -> user.age = age.intValue());
                        break;
                    case "eyeColor":
                        jv.isString(ec -> user.eyeColor = ec);
                        break;
                    case "name":
                        jv.isString(name -> user.name = name);
                        break;
                    case "gender":
                        jv.isString(gender -> user.gender = gender);
                        break;
                    case "company":
                        jv.isString(company -> user.company = company);
                        break;
                    case "email":
                        jv.isString(email -> user.email = email);
                        break;
                    case "phone":
                        jv.isString(phone -> user.phone = phone);
                        break;
                    case "address":
                        jv.isString(address -> user.address = address);
                        break;
                    case "about":
                        jv.isString(about -> user.about = about);
                        break;
                    case "registered":
                        jv.isString(registered -> user.registered = registered);
                        break;
                    case "latitude":
                        jv.isDouble(latitude -> user.latitude = latitude);
                        break;
                    case "longitude":
                        jv.isDouble(longitude -> user.longitude = longitude);
                        break;
                    case "tags":
                        final List<String> tags = new ArrayList<>();
                        jv.isArray(__v -> __v.isString(tags::add));
                        user.tags = tags;
                        break;
                    case "friends":
                        final List<Friend> friends = new ArrayList<>();
                        final List<String> ids = new ArrayList<>();
                        final List<String> names = new ArrayList<>();

                        jv.isArray(jav -> jav
                                .isJSON((jak, jajv) -> jak.isString(jakk -> {
                                    switch (jakk) {
                                        case "id":
                                            jajv.isString(ids::add);
                                            break;
                                        case "name":
                                            jajv.isString(names::add);
                                            break;
                                    }
                                })));

                        for (int i = 0; i < ids.size(); i++) {
                            friends.add(Friend.create(ids.get(i), names.get(i)));
                        }
                        user.friends = friends;
                        break;
                    case "greeting":
                        jv.isString(greeting -> user.greeting = greeting);
                        break;
                    case "favoriteFruit":
                        jv.isString(fav -> user.favoriteFruit = fav);
                        break;
                }
            }));
            return user;
        }
    }
}