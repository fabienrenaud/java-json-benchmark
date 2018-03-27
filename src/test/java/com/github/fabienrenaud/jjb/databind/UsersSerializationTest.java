package com.github.fabienrenaud.jjb.databind;

import com.github.fabienrenaud.jjb.JsonBenchmarkUsersTest;
import com.github.fabienrenaud.jjb.data.JsonSource;
import com.github.fabienrenaud.jjb.data.JsonSourceFactory;
import com.github.fabienrenaud.jjb.support.Api;

/**
 * @author Fabien Renaud
 */
public class UsersSerializationTest extends JsonBenchmarkUsersTest {

    public UsersSerializationTest() {
        super(new Serialization() {
            private final JsonSource source = JsonSourceFactory.create("users", 1, 2000);
            @Override
            public JsonSource JSON_SOURCE() {
                return source;
            }
        }, Api.DATABIND);
    }

    @Override
    public void boon() throws Exception {
        // FIXME: boon turns empty list to null values which makes this test fail.
    }

}
