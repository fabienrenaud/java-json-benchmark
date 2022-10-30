package com.github.fabienrenaud.jjb.data.gen;

import com.github.fabienrenaud.jjb.model.Users;
import com.github.fabienrenaud.jjb.model.Users.User;
import com.github.fabienrenaud.jjb.model.Users.Friend;
import com.github.fabienrenaud.jjb.RandomUtils;

import java.util.ArrayList;

public class UsersGenerator implements DataGenerator<Users> {

    @Override
    public int populate(Users obj, int size) {
        int approxSize = 12; // {'users':[]}

        obj.setUsers(new ArrayList<>());
        while (approxSize < size) {
            approxSize += appendUser(obj, size - approxSize);
            approxSize += 1; // ,
        }

        return approxSize;
    }


    private static int appendUser(Users uc, int sizeAvailable) {
        int expectedSize = 2; // {}

        User u = new User();
        u.set_id(RandomUtils.randomNumeric(20));
        expectedSize += 9 + u.get_id().length(); // ,'_id':''
        u.setIndex(RandomUtils.nextInt(0, Integer.MAX_VALUE));
        expectedSize += 11 + Integer.toString(u.getIndex()).length(); // ,'index':''
        u.setGuid(RandomUtils.randomAlphanumeric(20));
        expectedSize += 10 + u.getGuid().length(); // ,'guid':''
        u.setIsActive(RandomUtils.nextInt(0, 2) == 1);
        expectedSize += 17 + (u.getIsActive() ? 4 : 5); // ,'isActive':''
        u.setBalance(RandomUtils.randomAlphanumeric(20));
        expectedSize += 16 + u.getBalance().length(); // ,'balance':''
        u.setPicture(RandomUtils.randomAlphanumeric(100));
        expectedSize += 16 + u.getPicture().length(); // ,'picture':''
        u.setAge(RandomUtils.nextInt(0, 100));
        expectedSize += 9 + Integer.toString(u.getAge()).length(); // ,'age':''
        u.setEyeColor(RandomUtils.randomAlphanumeric(20));
        expectedSize += 17 + u.getEyeColor().length(); // ,'eyeColor':''
        u.setName(RandomUtils.randomAlphanumeric(20));
        expectedSize += 10 + u.getName().length(); // ,'name':''
        u.setGender(RandomUtils.randomAlphanumeric(20));
        expectedSize += 12 + u.getGender().length(); // ,'gender':''
        u.setCompany(RandomUtils.randomAlphanumeric(20));
        expectedSize += 13 + u.getCompany().length(); // ,'company':''
        u.setEmail(RandomUtils.randomAlphanumeric(20));
        expectedSize += 11 + u.getEmail().length(); // ,'email':''
        u.setPhone(RandomUtils.randomAlphanumeric(20));
        expectedSize += 11 + u.getPhone().length(); // ,'phone':''
        u.setAddress(RandomUtils.randomAlphanumeric(20));
        expectedSize += 13 + u.getAddress().length(); // ,'address':''
        u.setAbout(RandomUtils.randomAlphanumeric(20));
        expectedSize += 11 + u.getAbout().length(); // ,'about':''
        u.setRegistered(RandomUtils.randomAlphanumeric(20));
        expectedSize += 16 + u.getRegistered().length(); // ,'registered':''
        u.setLatitude(RandomUtils.nextDouble(0, 90));
        expectedSize += 14 + Double.toString(u.getLatitude()).length(); // ,'latitude':''
        u.setLongitude(RandomUtils.nextDouble(0, 180));
        expectedSize += 15 + Double.toString(u.getLongitude()).length(); // ,'longitude':''

        u.setTags(new ArrayList<>());
        expectedSize += 10; // ,'tags':[]
        int nTags = RandomUtils.nextInt(0, 50);
        for (int i = 0; i < nTags; i++) {
            if (expectedSize > sizeAvailable) {
                break;
            }
            String t = RandomUtils.randomAlphanumeric(10);
            u.getTags().add(t);
            expectedSize += t.length(); // '',
        }

        int nFriends = RandomUtils.nextInt(0, 50);
        u.setFriends(new ArrayList<>());
        expectedSize += 13; // ,'friends':[]
        for (int i = 0; i < nFriends; i++) {
            if (expectedSize > sizeAvailable) {
                break;
            }

            int id = RandomUtils.nextInt(0, 10000);
            String idStr = Integer.toString(id);
            String name = RandomUtils.randomAlphabetic(30);
            u.getFriends().add(Friend.create(idStr, name));
            expectedSize += idStr.length() + name.length() + 20; // {'id':'','name':''},
        }

        u.setGreeting(RandomUtils.randomAlphanumeric(20));
        expectedSize += 14 + u.getGreeting().length(); // ,'greeting':''
        u.setFavoriteFruit(RandomUtils.randomAlphanumeric(20));
        expectedSize += 19 + u.getFavoriteFruit().length(); // ,'favoriteFruit':''

        uc.getUsers().add(u);

        return expectedSize;
    }
}
