package com.github.fabienrenaud.jjb.data.gen;

import com.github.fabienrenaud.jjb.model.Users;
import com.github.fabienrenaud.jjb.model.Users.User;
import com.github.fabienrenaud.jjb.model.Users.Friend;
import com.github.fabienrenaud.jjb.RandomUtils;

import java.util.ArrayList;

/**
 * Created by frenaud on 7/23/16.
 */
public class UsersGenerator implements DataGenerator<Users> {

    @Override
    public int populate(Users obj, int size) {
        int approxSize = 12; // {'users':[]}

        obj.users = new ArrayList<>();
        while (approxSize < size) {
            approxSize += appendUser(obj, size - approxSize);
            approxSize += 1; // ,
        }

        return approxSize;
    }


    private static int appendUser(final Users uc, final int sizeAvailable) {
        int expectedSize = 2; // {}

        User u = new User();
        u._id = RandomUtils.randomNumeric(20);
        expectedSize += 9 + u._id.length(); // ,'_id':''
        u.index = RandomUtils.nextInt(0, Integer.MAX_VALUE);
        expectedSize += 11 + Integer.toString(u.index).length(); // ,'index':''
        u.guid = RandomUtils.randomAlphanumeric(20);
        expectedSize += 10 + u.guid.length(); // ,'guid':''
        u.isActive = RandomUtils.nextInt(0, 2) == 1;
        expectedSize += 17 + (u.isActive ? 4 : 5); // ,'isActive':''
        u.balance = RandomUtils.randomAlphanumeric(20);
        expectedSize += 16 + u.balance.length(); // ,'balance':''
        u.picture = RandomUtils.randomAlphanumeric(100);
        expectedSize += 16 + u.picture.length(); // ,'picture':''
        u.age = RandomUtils.nextInt(0, 100);
        expectedSize += 9 + Integer.toString(u.age).length(); // ,'age':''
        u.eyeColor = RandomUtils.randomAlphanumeric(20);
        expectedSize += 17 + u.eyeColor.length(); // ,'eyeColor':''
        u.name = RandomUtils.randomAlphanumeric(20);
        expectedSize += 10 + u.name.length(); // ,'name':''
        u.gender = RandomUtils.randomAlphanumeric(20);
        expectedSize += 12 + u.gender.length(); // ,'gender':''
        u.company = RandomUtils.randomAlphanumeric(20);
        expectedSize += 13 + u.company.length(); // ,'company':''
        u.email = RandomUtils.randomAlphanumeric(20);
        expectedSize += 11 + u.email.length(); // ,'email':''
        u.phone = RandomUtils.randomAlphanumeric(20);
        expectedSize += 11 + u.phone.length(); // ,'phone':''
        u.address = RandomUtils.randomAlphanumeric(20);
        expectedSize += 13 + u.address.length(); // ,'address':''
        u.about = RandomUtils.randomAlphanumeric(20);
        expectedSize += 11 + u.about.length(); // ,'about':''
        u.registered = RandomUtils.randomAlphanumeric(20);
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
            String t = RandomUtils.randomAlphanumeric(10);
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
            String name = RandomUtils.randomAlphabetic(30);
            u.friends.add(Friend.create(idStr, name));
            expectedSize += idStr.length() + name.length() + 20; // {'_id':'','name':''},
        }

        u.greeting = RandomUtils.randomAlphanumeric(20);
        expectedSize += 14 + u.greeting.length(); // ,'greeting':''
        u.favoriteFruit = RandomUtils.randomAlphanumeric(20);
        expectedSize += 19 + u.favoriteFruit.length(); // ,'favoriteFruit':''

        uc.users.add(u);

        return expectedSize;
    }
}
