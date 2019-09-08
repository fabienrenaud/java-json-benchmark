package com.github.fabienrenaud.jjb.stream;

import java.io.IOException;
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
        Parser.create().parse(JSON_SOURCE().nextString()).ifSuccess(v -> ref.set(PureJson.toObject(v))).ifFailure(System.out::println);
        return ref.get();
    }
    
    
    interface PureJson {
        public static Object toObject(final Value v) {
            List<User> users = new ArrayList<>();
            List<Client> clients = new ArrayList<>();
         
            final AtomicBoolean isUser = new AtomicBoolean(false);
            v.isJSON((k, _v) -> k.isString(key -> 
                _v.isArray(__v -> {
                    if(key.equals("users")) {
                        users.add(toUser(__v));
                        isUser.set(true);
                    } else if (key.equals("clients")) {
                        clients.add(toClient(__v));
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
            v.isJSON((k, _v) -> k.isString(key -> {
                switch(key) {
                case "_id":
                    _v.isInteger(id -> client._id = id);
                    break;
                case "index":
                    _v.isInteger(index -> client.index = index.intValue());
                    break;
                case "guid":
                    _v.isInteger(guid -> client.guid = UUID.fromString(guid.toString()));
                    break;
                case "isActive":
                    _v.isBool(isActive -> client.isActive = isActive);
                    break;
                case "balance":
                    _v.isDouble(balance -> client.balance = new BigDecimal(balance));
                    break;
                case "picture":
                    _v.isString(picture -> client.picture = picture);
                    break;
                case "age":
                    _v.isInteger(age -> client.age = age.intValue());
                    break;
                case "eyeColor":
                    _v.isInteger(ec -> client.eyeColor = EyeColor.fromNumber(ec.intValue()));
                    break;
                case "name":
                    _v.isString(name -> client.name = name);
                    break;
                case "gender":
                    _v.isString(gender -> client.gender = gender);
                    break;
                case "company":
                    _v.isString(company -> client.company = company);
                    break;
                case "emails":
                    List<String> emails = new ArrayList<>();
                    _v.isArray(__v -> __v
                        .isString(emails::add));
                    client.emails = emails.toArray(new String[emails.size()]);
                    break;
                case "phones":
                    List<Long> phones = new ArrayList<>();
                    _v.isArray(__v -> __v
                        .isInteger(phones::add));
                    long[] ps = new long[phones.size()];
                    for (int i = 0; i < phones.size(); i ++) {
                        ps[i] = phones.get(i);
                    }
                    client.phones = ps;
                    break;
                case "address":
                    _v.isString(address -> client.address = address);
                    break;
                case "about":
                    _v.isString(about -> client.about = about);
                    break;
                case "registered":
                    _v.isString(registered -> client.registered = LocalDate.parse(registered));
                    break;
                case "latitude":
                    _v.isDouble(latitude -> client.latitude = latitude);
                    break;
                case "longitude":
                    _v.isDouble(longitude -> client.longitude = longitude);
                    break;
                case "tags":
                    final List<String> tags = new ArrayList<>();
                    _v.isArray(__v -> __v
                        .isString(tags::add));
                    client.tags = tags;
                    break;
                case "partners":
                    final List<Partner> partners = new ArrayList<>();
                    final List<Long> ids = new ArrayList<>();
                    final List<String> names = new ArrayList<>();
                    final List<OffsetDateTime> since = new ArrayList<>();
                    
                    _v.isArray(__v -> __v
                        .isJSON((_k, ___v) -> _k.isString(_key -> {
                            switch(_key) {
                            case "id":
                                ___v.isInteger(ids::add);
                                break;
                            case "name":
                                ___v.isString(names::add);
                                break;
                            case "since":
                                ___v.isString(time -> since.add(OffsetDateTime.parse(time)));
                                break;
                            }
                        })));
                    
                    for (int i = 0; i< ids.size(); i ++) {
                        partners.add(Partner.create(ids.get(i), names.get(i), since.get(i)));
                    }
                    client.partners = partners;
                    break;
                }            
            }));
            
            return client;
        }
        
        static User toUser (final Value v) {
            final User user = new User();
            v.isJSON((k, _v) -> k.isString(key -> {
               switch(key) {
               case "_id":
                   _v.isString(id -> user._id = id);
                   break;
               case "index":
                   _v.isInteger(index -> user.index = index.intValue());
                   break;
               case "guid":
                   _v.isString(guid -> user.guid = guid);
                   break;
               case "isActive":
                   _v.isBool(isActive -> user.isActive = isActive);
                   break;
               case "balance":
                   _v.isString(balance -> user.balance = balance);
                   break;
               case "picture":
                   _v.isString(picture -> user.picture = picture);
                   break;
               case "age":
                   _v.isInteger(age -> user.age = age.intValue());
                   break;
               case "eyeColor":
                   _v.isString(ec -> user.eyeColor = ec);
                   break;
               case "name":
                   _v.isString(name -> user.name = name);
                   break;
               case "gender":
                   _v.isString(gender -> user.gender = gender);
                   break;
               case "company":
                   _v.isString(company -> user.company = company);
                   break;
               case "email":
                   _v.isString(email -> user.email = email);
                   break;
               case "phone":
                   _v.isString(phone -> user.phone = phone);
                   break;
               case "address":
                   _v.isString(address -> user.address = address);
                   break;
               case "about":
                   _v.isString(about -> user.about = about);
                   break;
               case "registered":
                   _v.isString(registered -> user.registered = registered);
                   break;
               case "latitude":
                   _v.isDouble(latitude -> user.latitude = latitude);
                   break;
               case "longitude":
                   _v.isDouble(longitude -> user.longitude = longitude);
                   break;
               case "tags":
                   final List<String> tags = new ArrayList<>();
                   _v.isArray(__v -> __v.isString(tags::add));
                   user.tags = tags;
                   break;
               case "friends":
                   final List<Friend> friends = new ArrayList<>();
                   final List<String> ids = new ArrayList<>();
                   final List<String> names = new ArrayList<>();
                   
                   _v.isArray(__v -> __v
                       .isJSON((_k, ___v) -> _k.isString(_key -> {
                           switch (_key) {
                           case "id":
                               ___v.isString(ids::add);
                               break;
                           case "name":
                               ___v.isString(names::add);
                               break;
                           }
                       })));
                   
                   for (int i = 0; i < ids.size(); i ++) {
                       friends.add(Friend.create(ids.get(i), names.get(i)));
                   }
                   user.friends = friends;
                   break;
               case "greeting":
                   _v.isString(greeting -> user.greeting = greeting);
                   break;
               case "favoriteFruit":
                   _v.isString(fav -> user.favoriteFruit = fav);
                   break;
               }
            }));
            return user;
        }
    }
}
