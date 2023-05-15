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
        return new JSONObject(JSON_SOURCE().nextString());
    }

    @Benchmark
    @Override
    public Object jakartajson() throws IOException {
        return jakarta.json.Json.createReader(JSON_SOURCE().nextInputStream()).readObject();
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
        return new org.apache.tapestry5.json.JSONObject(JSON_SOURCE().nextString());
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
        AtomicReference<Object> ref = new AtomicReference<>();
        try (InputStream is = new ByteArrayInputStream(JSON_SOURCE().nextByteArray())) {
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
        static Object toObject(Value v) {
            List<User> users = new ArrayList<>();
            List<Client> clients = new ArrayList<>();

            AtomicBoolean isUser = new AtomicBoolean(false);
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
                us.setUsers(users);
                return us;
            } else {
                Clients cs = new Clients();
                cs.setClients(clients);
                return cs;
            }
        }

        static Client toClient(Value v) {
            Client client = new Client();
            v.isJSON((k, jv) -> k.isString(key -> {
                switch (key) {
                    case "id":
                        jv.isInteger(client::setId);
                        break;
                    case "index":
                        jv.isInteger(index -> client.setIndex(index.intValue()));
                        break;
                    case "guid":
                        jv.isInteger(guid -> client.setGuid(UUID.fromString(guid.toString())));
                        break;
                    case "isActive":
                        jv.isBool(client::setIsActive);
                        break;
                    case "balance":
                        jv.isDouble(balance -> client.setBalance(new BigDecimal(balance)));
                        break;
                    case "picture":
                        jv.isString(client::setPicture);
                        break;
                    case "age":
                        jv.isInteger(age -> client.setAge(age.intValue()));
                        break;
                    case "eyeColor":
                        jv.isInteger(ec -> client.setEyeColor(EyeColor.fromNumber(ec.intValue())));
                        break;
                    case "name":
                        jv.isString(client::setName);
                        break;
                    case "gender":
                        jv.isString(client::setGender);
                        break;
                    case "company":
                        jv.isString(client::setCompany);
                        break;
                    case "emails":
                        List<String> emails = new ArrayList<>();
                        jv.isArray(av -> av
                                .isString(emails::add));
                        client.setEmails(emails.toArray(new String[0]));
                        break;
                    case "phones":
                        List<Long> phones = new ArrayList<>();
                        jv.isArray(av -> av
                                .isInteger(phones::add));
                        long[] ps = new long[phones.size()];
                        for (int i = 0; i < phones.size(); i++) {
                            ps[i] = phones.get(i);
                        }
                        client.setPhones(ps);
                        break;
                    case "address":
                        jv.isString(client::setAddress);
                        break;
                    case "about":
                        jv.isString(client::setAbout);
                        break;
                    case "registered":
                        jv.isString(registered -> client.setRegistered(LocalDate.parse(registered)));
                        break;
                    case "latitude":
                        jv.isDouble(client::setLatitude);
                        break;
                    case "longitude":
                        jv.isDouble(client::setLongitude);
                        break;
                    case "tags":
                        List<String> tags = new ArrayList<>();
                        jv.isArray(av -> av
                                .isString(tags::add));
                        client.setTags(tags);
                        break;
                    case "partners":
                        List<Partner> partners = new ArrayList<>();
                        List<Long> ids = new ArrayList<>();
                        List<String> names = new ArrayList<>();
                        List<OffsetDateTime> since = new ArrayList<>();

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
                        client.setPartners(partners);
                        break;
                }
            }));

            return client;
        }

        static User toUser(Value v) {
            User user = new User();
            v.isJSON((jk, jv) -> jk.isString(key -> {
                switch (key) {
                    case "id":
                        jv.isString(user::setId);
                        break;
                    case "index":
                        jv.isInteger(index -> user.setIndex(index.intValue()));
                        break;
                    case "guid":
                        jv.isString(user::setGuid);
                        break;
                    case "isActive":
                        jv.isBool(user::setIsActive);
                        break;
                    case "balance":
                        jv.isString(user::setBalance);
                        break;
                    case "picture":
                        jv.isString(user::setPicture);
                        break;
                    case "age":
                        jv.isInteger(age -> user.setAge(age.intValue()));
                        break;
                    case "eyeColor":
                        jv.isString(user::setEyeColor);
                        break;
                    case "name":
                        jv.isString(user::setName);
                        break;
                    case "gender":
                        jv.isString(user::setGender);
                        break;
                    case "company":
                        jv.isString(user::setCompany);
                        break;
                    case "email":
                        jv.isString(user::setEmail);
                        break;
                    case "phone":
                        jv.isString(user::setPhone);
                        break;
                    case "address":
                        jv.isString(user::setAddress);
                        break;
                    case "about":
                        jv.isString(user::setAbout);
                        break;
                    case "registered":
                        jv.isString(user::setRegistered);
                        break;
                    case "latitude":
                        jv.isDouble(user::setLatitude);
                        break;
                    case "longitude":
                        jv.isDouble(user::setLongitude);
                        break;
                    case "tags":
                        List<String> tags = new ArrayList<>();
                        jv.isArray(__v -> __v.isString(tags::add));
                        user.setTags(tags);
                        break;
                    case "friends":
                        List<Friend> friends = new ArrayList<>();
                        List<String> ids = new ArrayList<>();
                        List<String> names = new ArrayList<>();

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
                        user.setFriends(friends);
                        break;
                    case "greeting":
                        jv.isString(user::setGreeting);
                        break;
                    case "favoriteFruit":
                        jv.isString(user::setFavoriteFruit);
                        break;
                }
            }));
            return user;
        }
    }

    @Benchmark
    @Override
    public Object antons() throws Exception {
        return JSON_SOURCE().streamDeserializer().antons(JSON_SOURCE().nextString());
    }

}
