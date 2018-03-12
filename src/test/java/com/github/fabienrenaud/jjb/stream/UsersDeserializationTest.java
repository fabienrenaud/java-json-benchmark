package com.github.fabienrenaud.jjb.stream;

import com.github.fabienrenaud.jjb.JsonBenchmarkUsersTest;
import com.github.fabienrenaud.jjb.data.JsonSource;
import com.github.fabienrenaud.jjb.data.JsonSourceFactory;
import com.github.fabienrenaud.jjb.support.Api;

/**
 * @author Fabien Renaud
 */
public class UsersDeserializationTest extends JsonBenchmarkUsersTest {

    public UsersDeserializationTest() {
        super(new Deserialization() {
            private final JsonSource source = JsonSourceFactory.create("users", 1, 2000);
            @Override
            public JsonSource JSON_SOURCE() {
                return source;
            }
        }, Api.STREAM);
    }
}
