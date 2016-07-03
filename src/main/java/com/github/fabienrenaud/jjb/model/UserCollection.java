package com.github.fabienrenaud.jjb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by frenaud on 7/3/16.
 */
public class UserCollection {

    @JsonProperty("users")
    public List<User> users;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserCollection)) return false;

        UserCollection that = (UserCollection) o;

        return users != null ? users.equals(that.users) : that.users == null;

    }

    @Override
    public int hashCode() {
        return users != null ? users.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "UserCollection{" +
            "users=" + users +
            '}';
    }
}
