package com.github.fabienrenaud.jjb.data.gen;

import com.github.fabienrenaud.jjb.RandomUtils;
import com.github.fabienrenaud.jjb.model.Clients;
import com.github.fabienrenaud.jjb.model.Clients.Client;
import com.github.fabienrenaud.jjb.model.Clients.EyeColor;
import com.github.fabienrenaud.jjb.model.Clients.Partner;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;

public class ClientsGenerator implements DataGenerator<Clients> {

    @Override
    public int populate(Clients obj, int size) {
        int approxSize = 14; // {'clients':[]}

        obj.setClients(new ArrayList<>());
        while (approxSize < size) {
            approxSize += appendClient(obj, size - approxSize);
            approxSize += 1; // ,
        }

        return approxSize;
    }


    private static int appendClient(Clients uc, int sizeAvailable) {
        int expectedSize = 2; // {}

        Client u = new Client();
        u.setId(Math.abs(RandomUtils.nextLong()));
        expectedSize += 9 + Long.toString(u.getId()).length(); // ,'id':''
        u.setIndex(RandomUtils.nextInt(0, Integer.MAX_VALUE));
        expectedSize += 11 + Integer.toString(u.getIndex()).length(); // ,'index':''
        u.setGuid(RandomUtils.nextUUID());
        expectedSize += 10 + 36; // ,'guid':''
        u.setIsActive(RandomUtils.nextInt(0, 2) == 1);
        expectedSize += 17 + (u.getIsActive() ? 4 : 5); // ,'isActive':''
        u.setBalance(RandomUtils.randomBigDecimal());
        expectedSize += 16 + u.getBalance().toPlainString().length(); // ,'balance':''
        u.setPicture(RandomUtils.randomAlphanumeric(100));
        expectedSize += 16 + u.getPicture().length(); // ,'picture':''
        u.setAge(RandomUtils.nextInt(0, 100));
        expectedSize += 9 + Integer.toString(u.getAge()).length(); // ,'age':''
        u.setEyeColor(EyeColor.fromNumber(RandomUtils.nextInt(3)));
        expectedSize += 17 + u.getEyeColor().name().length(); // ,'eyeColor':''
        u.setName(RandomUtils.randomAlphanumeric(20));
        expectedSize += 10 + u.getName().length(); // ,'name':''
        u.setGender(RandomUtils.randomAlphanumeric(20));
        expectedSize += 12 + u.getGender().length(); // ,'gender':''
        u.setCompany(RandomUtils.randomAlphanumeric(20));
        expectedSize += 13 + u.getCompany().length(); // ,'company':''
        u.setEmails(RandomUtils.stringArray(RandomUtils.nextInt(10), 20));
        int calcSize = 0;
        for (String e : u.getEmails()) {
            calcSize += 3 + e.length();
        }
        expectedSize += 11 + calcSize; // ,'email':''
        u.setPhones(RandomUtils.longArray(RandomUtils.nextInt(10)));
        calcSize = 0;
        for (long p : u.getPhones()) {
            calcSize += 1 + Long.toString(p).length();
        }
        expectedSize += 11 + calcSize; // ,'phone':''
        u.setAddress(RandomUtils.randomAlphanumeric(20));
        expectedSize += 13 + u.getAddress().length(); // ,'address':''
        u.setAbout(RandomUtils.randomAlphanumeric(20));
        expectedSize += 11 + u.getAbout().length(); // ,'about':''
        u.setRegistered(LocalDate.of(1900 + RandomUtils.nextInt(110), 1 + RandomUtils.nextInt(12), 1 + RandomUtils.nextInt(28)));
        expectedSize += 16 + 10; // ,'registered':''
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

        int nPartners = RandomUtils.nextInt(0, 30);
        u.setPartners(new ArrayList<>());
        expectedSize += 13; // ,'partners':[]
        for (int i = 0; i < nPartners; i++) {
            if (expectedSize > sizeAvailable) {
                break;
            }

            long id = RandomUtils.nextLong();
            String name = RandomUtils.randomAlphabetic(30);
            OffsetDateTime at = OffsetDateTime.of(
                    1900 + RandomUtils.nextInt(110),
                    1 + RandomUtils.nextInt(12),
                    1 + RandomUtils.nextInt(28),
                    RandomUtils.nextInt(24),
                    RandomUtils.nextInt(60),
                    RandomUtils.nextInt(60),
                    RandomUtils.nextInt(1000000000),
                    ZoneOffset.UTC
            );
            u.getPartners().add(Partner.create(id, name, at));
            expectedSize += Long.toString(id).length() + name.length() + 50; // {'id':'','name':'','since':''},
        }

        uc.getClients().add(u);

        return expectedSize;
    }
}
