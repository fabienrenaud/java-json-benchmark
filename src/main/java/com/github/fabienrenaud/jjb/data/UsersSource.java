package com.github.fabienrenaud.jjb.data;

import com.github.fabienrenaud.jjb.data.gen.UsersGenerator;
import com.github.fabienrenaud.jjb.model.Users;
import com.github.fabienrenaud.jjb.stream.UsersStreamDeserializer;
import com.github.fabienrenaud.jjb.stream.UsersStreamSerializer;

/**
 * Created by frenaud on 7/23/16.
 */
public class UsersSource extends JsonSource<Users> {

    public UsersSource(int quantity, int individualSize) {
        super(quantity, individualSize, new UsersGenerator(), new UsersStreamSerializer(), new UsersStreamDeserializer());
    }

    @Override
    Users[] newPojoArray(int quantity) {
        return new Users[quantity];
    }

    @Override
    public Class<Users> pojoType() {
        return Users.class;
    }
}
