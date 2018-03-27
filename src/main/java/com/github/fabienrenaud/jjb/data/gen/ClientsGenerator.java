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

        obj.clients = new ArrayList<>();
        while (approxSize < size) {
            approxSize += appendClient(obj, size - approxSize);
            approxSize += 1; // ,
        }

        return approxSize;
    }


    private static int appendClient(final Clients uc, final int sizeAvailable) {
        int expectedSize = 2; // {}

        Client u = new Client();
        u._id = Math.abs(RandomUtils.nextLong());
        expectedSize += 9 + Long.toString(u._id).length(); // ,'_id':''
        u.index = RandomUtils.nextInt(0, Integer.MAX_VALUE);
        expectedSize += 11 + Integer.toString(u.index).length(); // ,'index':''
        u.guid = RandomUtils.nextUUID();
        expectedSize += 10 + 36; // ,'guid':''
        u.isActive = RandomUtils.nextInt(0, 2) == 1;
        expectedSize += 17 + (u.isActive ? 4 : 5); // ,'isActive':''
        u.balance = RandomUtils.randomBigDecimal();
        expectedSize += 16 + u.balance.toPlainString().length(); // ,'balance':''
        u.picture = RandomUtils.randomAlphanumeric(100);
        expectedSize += 16 + u.picture.length(); // ,'picture':''
        u.age = RandomUtils.nextInt(0, 100);
        expectedSize += 9 + Integer.toString(u.age).length(); // ,'age':''
        u.eyeColor = EyeColor.fromNumber(RandomUtils.nextInt(3));
        expectedSize += 17 + u.eyeColor.name().length(); // ,'eyeColor':''
        u.name = RandomUtils.randomAlphanumeric(20);
        expectedSize += 10 + u.name.length(); // ,'name':''
        u.gender = RandomUtils.randomAlphanumeric(20);
        expectedSize += 12 + u.gender.length(); // ,'gender':''
        u.company = RandomUtils.randomAlphanumeric(20);
        expectedSize += 13 + u.company.length(); // ,'company':''
        u.emails = RandomUtils.stringArray(RandomUtils.nextInt(10), 20);
        int calcSize = 0;
        for(String e : u.emails) {
            calcSize += 3 + e.length();
        }
        expectedSize += 11 + calcSize; // ,'email':''
        u.phones = RandomUtils.longArray(RandomUtils.nextInt(10));
        calcSize = 0;
        for(long p : u.phones) {
            calcSize += 1 + Long.toString(p).length();
        }
        expectedSize += 11 + calcSize; // ,'phone':''
        u.address = RandomUtils.randomAlphanumeric(20);
        expectedSize += 13 + u.address.length(); // ,'address':''
        u.about = RandomUtils.randomAlphanumeric(20);
        expectedSize += 11 + u.about.length(); // ,'about':''
        u.registered = LocalDate.of(1900 + RandomUtils.nextInt(110), 1 + RandomUtils.nextInt(12), 1 + RandomUtils.nextInt(28));
        expectedSize += 16 + 10; // ,'registered':''
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

        int nPartners = RandomUtils.nextInt(0, 30);
        u.partners = new ArrayList<>();
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
            u.partners.add(Partner.create(id, name, at));
            expectedSize += Long.toString(id).length() + name.length() + 50; // {'_id':'','name':'','since':''},
        }

        uc.clients.add(u);

        return expectedSize;
    }
}
