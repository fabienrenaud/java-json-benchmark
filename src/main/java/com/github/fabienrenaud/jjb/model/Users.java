package com.github.fabienrenaud.jjb.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.dslplatform.json.CompiledJson;
import com.dslplatform.json.JsonAttribute;

import java.util.List;
import java.util.Objects;

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
            if (this == o) {
                return true;
            }
            if (!(o instanceof User)) {
                return false;
            }
            User user = (User) o;
            return index == user.index &&
                    isActive == user.isActive &&
                    age == user.age &&
                    Math.abs(Double.doubleToLongBits(user.latitude) - Double.doubleToLongBits(latitude)) < 3 &&
                    Math.abs(Double.doubleToLongBits(user.longitude) - Double.doubleToLongBits(longitude)) < 3 &&
                    Objects.equals(_id, user._id) &&
                    Objects.equals(guid, user.guid) &&
                    Objects.equals(balance, user.balance) &&
                    Objects.equals(picture, user.picture) &&
                    Objects.equals(eyeColor, user.eyeColor) &&
                    Objects.equals(name, user.name) &&
                    Objects.equals(gender, user.gender) &&
                    Objects.equals(company, user.company) &&
                    Objects.equals(email, user.email) &&
                    Objects.equals(phone, user.phone) &&
                    Objects.equals(address, user.address) &&
                    Objects.equals(about, user.about) &&
                    Objects.equals(registered, user.registered) &&
                    Objects.equals(tags, user.tags) &&
                    Objects.equals(friends, user.friends) &&
                    Objects.equals(greeting, user.greeting) &&
                    Objects.equals(favoriteFruit, user.favoriteFruit);
        }

        @Override
        public int hashCode() {
            return Objects.hash(_id, index, guid, isActive, balance, picture, age, eyeColor, name, gender, company, email, phone, address, about, registered, tags, friends, greeting, favoriteFruit);
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

        public static Friend create(String id, String name) {
            Friend friend = new Friend();
            friend.id = id;
            friend.name = name;
            return friend;
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
