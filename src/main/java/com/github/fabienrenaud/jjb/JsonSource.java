package com.github.fabienrenaud.jjb;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.github.fabienrenaud.jjb.model.User;
import com.github.fabienrenaud.jjb.model.UserCollection;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.json.JSONObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public final class JsonSource {

    private static final Path PARAMS_PATH = Paths.get(".params.txt");

    private static UserCollection[] jsonAsObject;
    private static String[] jsonAsString;
    private static byte[][] jsonAsBytes;
    private static final Random RNG = new Random();

    static {
        init();
    }

    private JsonSource() {
    }

    public static String nextString() {
        return jsonAsString[RNG.nextInt(jsonAsString.length)];
    }

    public static InputStream nextInputStream() {
        return new ByteArrayInputStream(nextByteArray());
    }

    public static byte[] nextByteArray() {
        return jsonAsBytes[RNG.nextInt(jsonAsBytes.length)];
    }

    public static Reader nextReader() {
        return new InputStreamReader(nextInputStream());
    }

    public static UserCollection nextPojo() {
        return jsonAsObject[RNG.nextInt(jsonAsObject.length)];
    }

    public static JSONObject nextJsonAsOrgJsonObject() {
        return LazyOrgJson.JSON_AS_ORG_JSON_OBJECT[RNG.nextInt(LazyOrgJson.JSON_AS_ORG_JSON_OBJECT.length)];
    }

    public static javax.json.JsonObject nextJsonAsJavaxJsonObject() {
        return LazyJavaxJson.JSON_AS_JAVAX_JSON_OBJECT[RNG.nextInt(LazyJavaxJson.JSON_AS_JAVAX_JSON_OBJECT.length)];
    }

    private static void init() {
        InitParams p = loadParams();
        if (p != null) {
            init(p);
        }
    }

    public static void init(InitParams p) {
        if (p.itemSizeInKb == 0 || p.numberOfItems == 0) {
            throw new IllegalArgumentException("itemSizeInKb=" + p.itemSizeInKb + " numberOfItems=" + p.numberOfItems);
        }

        int itemSizeInB = p.itemSizeInKb * 1000;

        jsonAsObject = new UserCollection[p.numberOfItems];
        jsonAsString = new String[p.numberOfItems];
        jsonAsBytes = new byte[p.numberOfItems][];

        final ObjectMapper jackson = new ObjectMapper();
        jackson.registerModule(new AfterburnerModule());

        try {
            for (int i = 0; i < p.numberOfItems; i++) {
                UserCollection uc = new UserCollection();
                populateUserCollection(uc, itemSizeInB);
                jsonAsObject[i] = uc;

                String json = jackson.writeValueAsString(uc);
                jsonAsString[i] = json;

                jsonAsBytes[i] = json.getBytes();
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static final class LazyOrgJson {

        private static final JSONObject[] JSON_AS_ORG_JSON_OBJECT;

        static {
            try {
                int len = jsonAsString.length;
                JSON_AS_ORG_JSON_OBJECT = new JSONObject[len];
                for (int i = 0; i < len; i++) {
                    JSON_AS_ORG_JSON_OBJECT[i] = new JSONObject(jsonAsString[i]);
                }
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    private static final class LazyJavaxJson {

        private static final javax.json.JsonObject[] JSON_AS_JAVAX_JSON_OBJECT;

        static {
            try {
                int len = jsonAsBytes.length;
                JSON_AS_JAVAX_JSON_OBJECT = new javax.json.JsonObject[len];
                for (int i = 0; i < len; i++) {
                    JSON_AS_JAVAX_JSON_OBJECT[i] = javax.json.Json.createReader(new ByteArrayInputStream(jsonAsBytes[i])).readObject();
                }
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    static int populateUserCollection(final UserCollection uc, final int sizeInB) throws IOException {
        int approxSize = 12; // {'users':[]}

        uc.users = new ArrayList<>();
        while (approxSize < sizeInB) {
            approxSize += appendUser(uc, sizeInB - approxSize);
            approxSize += 1; // ,
        }

        return approxSize;
    }

    private static int appendUser(final UserCollection uc, final int sizeAvailable) {
        int expectedSize = 2; // {}

        User u = new User();
        u._id = RandomStringUtils.randomNumeric(20);
        expectedSize += 9 + u._id.length(); // ,'_id':''
        u.index = RandomUtils.nextInt(0, Integer.MAX_VALUE);
        expectedSize += 11 + Integer.toString(u.index).length(); // ,'index':''
        u.guid = RandomStringUtils.randomAlphanumeric(20);
        expectedSize += 10 + u.guid.length(); // ,'guid':''
        u.isActive = RandomUtils.nextInt(0, 2) == 1;
        expectedSize += 17 + (u.isActive ? 4 : 5); // ,'isActive':''
        u.balance = RandomStringUtils.randomAlphanumeric(20);
        expectedSize += 16 + u.balance.length(); // ,'balance':''
        u.picture = RandomStringUtils.randomAlphanumeric(100);
        expectedSize += 16 + u.picture.length(); // ,'picture':''
        u.age = RandomUtils.nextInt(0, 100);
        expectedSize += 9 + Integer.toString(u.age).length(); // ,'age':''
        u.eyeColor = RandomStringUtils.randomAlphanumeric(20);
        expectedSize += 17 + u.eyeColor.length(); // ,'eyeColor':''
        u.name = RandomStringUtils.randomAlphanumeric(20);
        expectedSize += 10 + u.name.length(); // ,'name':''
        u.gender = RandomStringUtils.randomAlphanumeric(20);
        expectedSize += 12 + u.gender.length(); // ,'gender':''
        u.company = RandomStringUtils.randomAlphanumeric(20);
        expectedSize += 13 + u.company.length(); // ,'company':''
        u.email = RandomStringUtils.randomAlphanumeric(20);
        expectedSize += 11 + u.email.length(); // ,'email':''
        u.phone = RandomStringUtils.randomAlphanumeric(20);
        expectedSize += 11 + u.phone.length(); // ,'phone':''
        u.address = RandomStringUtils.randomAlphanumeric(20);
        expectedSize += 13 + u.address.length(); // ,'address':''
        u.about = RandomStringUtils.randomAlphanumeric(20);
        expectedSize += 11 + u.about.length(); // ,'about':''
        u.registered = RandomStringUtils.randomAlphanumeric(20);
        expectedSize += 16 + u.registered.length(); // ,'registered':''
        u.latitude = RandomUtils.nextDouble(0, 90);
        expectedSize += 14 + Double.toString(u.latitude).length(); // ,'latitude':''
        u.longitude = RandomUtils.nextDouble(0, 180);
        expectedSize += 15 + Double.toString(u.longitude).length(); // ,'longitude':''

        u.tags = new ArrayList<>();
        expectedSize += 10; // ,'tags':[]
        int nTags = RandomUtils.nextInt(0, 50);
        for (int i = 0; i < nTags; i++) {
            if (expectedSize > sizeAvailable) {
                break;
            }
            String t = RandomStringUtils.randomAlphanumeric(10);
            u.tags.add(t);
            expectedSize += t.length(); // '',
        }

        int nFriends = RandomUtils.nextInt(0, 50);
        u.friends = new ArrayList<>();
        expectedSize += 13; // ,'friends':[]
        for (int i = 0; i < nFriends; i++) {
            if (expectedSize > sizeAvailable) {
                break;
            }

            int id = RandomUtils.nextInt(0, 10000);
            String idStr = Integer.toString(id);
            String name = RandomStringUtils.randomAlphabetic(30);
            u.friends.add(new User.Friend(idStr, name));
            expectedSize += idStr.length() + name.length() + 20; // {'id':'','name':''},
        }

        u.greeting = RandomStringUtils.randomAlphanumeric(20);
        expectedSize += 14 + u.greeting.length(); // ,'greeting':''
        u.favoriteFruit = RandomStringUtils.randomAlphanumeric(20);
        expectedSize += 19 + u.favoriteFruit.length(); // ,'favoriteFruit':''

        uc.users.add(u);

        return expectedSize;
    }

    private static InitParams loadParams() {
        try {
            if (Files.exists(PARAMS_PATH)) {
                List<String> list = Files.readAllLines(PARAMS_PATH);
                return new InitParams(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void saveParams(InitParams p) {
        List<String> lines = new ArrayList<>(2);
        lines.add(String.valueOf(p.itemSizeInKb));
        lines.add(String.valueOf(p.numberOfItems));
        try {
            Files.write(PARAMS_PATH, lines);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void deleteParams() {
        try {
            if (Files.exists(PARAMS_PATH)) {
                Files.delete(PARAMS_PATH);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static final class InitParams {
        private final int itemSizeInKb;
        private final int numberOfItems;

        public InitParams(int itemSizeInKb, int numberOfItems) {
            this.itemSizeInKb = itemSizeInKb;
            this.numberOfItems = numberOfItems;
        }
    }
}
