package com.github.fabienrenaud.jjb.stream;

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
        }, Api.STREAM);
    }
}
