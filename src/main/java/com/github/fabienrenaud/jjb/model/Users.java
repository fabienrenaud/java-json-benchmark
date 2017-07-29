package com.github.fabienrenaud.jjb.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.dslplatform.json.CompiledJson;
import com.dslplatform.json.JsonAttribute;

import java.util.List;

/**
 * Created by frenaud on 7/3/16.
 */
@JsonObject
@CompiledJson
@jodd.json.meta.JSON
public class Users {

    @JsonField
    @jodd.json.meta.JSON
    public List<User> users;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users)) return false;

        Users that = (Users) o;

        return users != null ? users.equals(that.users) : that.users == null;
    }

    @Override
    public int hashCode() {
        return users != null ? users.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Users{" + "users=" + users + '}';
    }

    @JsonObject
    @CompiledJson
    public static final class User {

        @JsonField
        public String _id;
        @JsonField
        public int index;
        @JsonField
        public String guid;
        @JsonField
        public boolean isActive;
        @JsonField
        public String balance;
        @JsonField
        public String picture;
        @JsonField
        public int age;
        @JsonField
        public String eyeColor;
        @JsonField
        public String name;
        @JsonField
        public String gender;
        @JsonField
        public String company;
        @JsonField
        public String email;
        @JsonField
        public String phone;
        @JsonField
        public String address;
        @JsonField
        public String about;
        @JsonField
        public String registered;
        @JsonField
        public double latitude;
        @JsonField
        public double longitude;
        @JsonField
        @JsonAttribute(nullable = false)
        @jodd.json.meta.JSON
        public List<String> tags;
        @JsonField
        @JsonAttribute(nullable = false)
        @jodd.json.meta.JSON
        public List<Friend> friends;
        @JsonField
        public String greeting;
        @JsonField
        public String favoriteFruit;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User)) return false;

            User user = (User) o;

            if (index != user.index) return false;
            if (isActive != user.isActive) return false;
            if (age != user.age) return false;
            if (Double.compare(user.latitude, latitude) != 0) return false;
            if (Double.compare(user.longitude, longitude) != 0) return false;
            if (_id != null ? !_id.equals(user._id) : user._id != null) return false;
            if (guid != null ? !guid.equals(user.guid) : user.guid != null) return false;
            if (balance != null ? !balance.equals(user.balance) : user.balance != null) return false;
            if (picture != null ? !picture.equals(user.picture) : user.picture != null) return false;
            if (eyeColor != null ? !eyeColor.equals(user.eyeColor) : user.eyeColor != null) return false;
            if (name != null ? !name.equals(user.name) : user.name != null) return false;
            if (gender != null ? !gender.equals(user.gender) : user.gender != null) return false;
            if (company != null ? !company.equals(user.company) : user.company != null) return false;
            if (email != null ? !email.equals(user.email) : user.email != null) return false;
            if (phone != null ? !phone.equals(user.phone) : user.phone != null) return false;
            if (address != null ? !address.equals(user.address) : user.address != null) return false;
            if (about != null ? !about.equals(user.about) : user.about != null) return false;
            if (registered != null ? !registered.equals(user.registered) : user.registered != null) return false;
            if (tags != null ? !tags.equals(user.tags) : user.tags != null) return false;
            if (friends != null ? !friends.equals(user.friends) : user.friends != null) return false;
            if (greeting != null ? !greeting.equals(user.greeting) : user.greeting != null) return false;
            return favoriteFruit != null ? favoriteFruit.equals(user.favoriteFruit) : user.favoriteFruit == null;
        }

        @Override
        public int hashCode() {
            int result;
            long temp;
            result = _id != null ? _id.hashCode() : 0;
            result = 31 * result + index;
            result = 31 * result + (guid != null ? guid.hashCode() : 0);
            result = 31 * result + (isActive ? 1 : 0);
            result = 31 * result + (balance != null ? balance.hashCode() : 0);
            result = 31 * result + (picture != null ? picture.hashCode() : 0);
            result = 31 * result + age;
            result = 31 * result + (eyeColor != null ? eyeColor.hashCode() : 0);
            result = 31 * result + (name != null ? name.hashCode() : 0);
            result = 31 * result + (gender != null ? gender.hashCode() : 0);
            result = 31 * result + (company != null ? company.hashCode() : 0);
            result = 31 * result + (email != null ? email.hashCode() : 0);
            result = 31 * result + (phone != null ? phone.hashCode() : 0);
            result = 31 * result + (address != null ? address.hashCode() : 0);
            result = 31 * result + (about != null ? about.hashCode() : 0);
            result = 31 * result + (registered != null ? registered.hashCode() : 0);
            temp = Double.doubleToLongBits(latitude);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            temp = Double.doubleToLongBits(longitude);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            result = 31 * result + (tags != null ? tags.hashCode() : 0);
            result = 31 * result + (friends != null ? friends.hashCode() : 0);
            result = 31 * result + (greeting != null ? greeting.hashCode() : 0);
            result = 31 * result + (favoriteFruit != null ? favoriteFruit.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "JsonDataObj{" + "_id=" + _id + ", index=" + index + ", guid=" + guid + ", isActive=" + isActive + ", balance=" + balance + ", picture=" + picture + ", age=" + age + ", eyeColor=" + eyeColor + ", name=" + name + ", gender=" + gender + ", company=" + company + ", email=" + email + ", phone=" + phone + ", address=" + address + ", about=" + about + ", registered=" + registered + ", latitude=" + latitude + ", longitude=" + longitude + ", tags=" + tags + ", friends=" + friends + ", greeting=" + greeting + ", favoriteFruit=" + favoriteFruit + '}';
        }
    }

    @JsonObject
    @CompiledJson
    public static final class Friend {

        @JsonField
        public String id;
        @JsonField
        public String name;

        public Friend() {
        }

        public Friend(String id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Friend)) return false;

            Friend friend = (Friend) o;

            if (id != null ? !id.equals(friend.id) : friend.id != null) return false;
            return name != null ? name.equals(friend.name) : friend.name == null;
        }

        @Override
        public int hashCode() {
            int result = id != null ? id.hashCode() : 0;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "Friend{" + "id=" + id + ", name=" + name + '}';
        }

    }

}
