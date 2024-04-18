package com.github.fabienrenaud.jjb.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.dslplatform.json.CompiledJson;
import com.dslplatform.json.JsonAttribute;
import io.github.wycst.wast.json.annotations.JsonTypeSetting;

import java.util.List;
import java.util.Objects;

@io.avaje.jsonb.Json
@JsonObject
@CompiledJson
@jodd.json.meta.JSON
@JsonTypeSetting(enableJIT = true)
public class Users {

    @JsonField
    @jodd.json.meta.JSON
    private List<User> users;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Users)) {
            return false;
        }

        Users that = (Users) o;

        return Objects.equals(users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(users);
    }

    @Override
    public String toString() {
        return "Users{" + "users=" + users + '}';
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @io.avaje.jsonb.Json
    @JsonObject
    @CompiledJson
    @JsonTypeSetting(enableJIT = true)
    public static final class User {

        @JsonField
        private String id;
        @JsonField
        private int index;
        @JsonField
        private String guid;
        @JsonField
        private boolean isActive;
        @JsonField
        private String balance;
        @JsonField
        private String picture;
        @JsonField
        private int age;
        @JsonField
        private String eyeColor;
        @JsonField
        private String name;
        @JsonField
        private String gender;
        @JsonField
        private String company;
        @JsonField
        private String email;
        @JsonField
        private String phone;
        @JsonField
        private String address;
        @JsonField
        private String about;
        @JsonField
        private String registered;
        @JsonField
        private double latitude;
        @JsonField
        private double longitude;
        @JsonField
        @JsonAttribute(nullable = false)
        @jodd.json.meta.JSON
        private List<String> tags;
        @JsonField
        @JsonAttribute(nullable = false)
        @jodd.json.meta.JSON
        private List<Friend> friends;
        @JsonField
        private String greeting;
        @JsonField
        private String favoriteFruit;

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
                    Objects.equals(id, user.id) &&
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
            return Objects.hash(id, index, guid, isActive, balance, picture, age, eyeColor, name, gender, company, email, phone, address, about, registered, tags, friends, greeting, favoriteFruit);
        }

        @Override
        public String toString() {
            return "JsonDataObj{" + "id=" + id + ", index=" + index + ", guid=" + guid + ", isActive=" + isActive + ", balance=" + balance + ", picture=" + picture + ", age=" + age + ", eyeColor=" + eyeColor + ", name=" + name + ", gender=" + gender + ", company=" + company + ", email=" + email + ", phone=" + phone + ", address=" + address + ", about=" + about + ", registered=" + registered + ", latitude=" + latitude + ", longitude=" + longitude + ", tags=" + tags + ", friends=" + friends + ", greeting=" + greeting + ", favoriteFruit=" + favoriteFruit + '}';
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public String getGuid() {
            return guid;
        }

        public void setGuid(String guid) {
            this.guid = guid;
        }

        public boolean getIsActive() {
            return isActive;
        }

        public void setIsActive(boolean isActive) {
            this.isActive = isActive;
        }

        public String getBalance() {
            return balance;
        }

        public void setBalance(String balance) {
            this.balance = balance;
        }

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEyeColor() {
            return eyeColor;
        }

        public void setEyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getAbout() {
            return about;
        }

        public void setAbout(String about) {
            this.about = about;
        }

        public String getRegistered() {
            return registered;
        }

        public void setRegistered(String registered) {
            this.registered = registered;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public List<Friend> getFriends() {
            return friends;
        }

        public void setFriends(List<Friend> friends) {
            this.friends = friends;
        }

        public String getGreeting() {
            return greeting;
        }

        public void setGreeting(String greeting) {
            this.greeting = greeting;
        }

        public String getFavoriteFruit() {
            return favoriteFruit;
        }

        public void setFavoriteFruit(String favoriteFruit) {
            this.favoriteFruit = favoriteFruit;
        }
    }

    @io.avaje.jsonb.Json
    @JsonObject
    @CompiledJson
    @JsonTypeSetting(enableJIT = true)
    public static final class Friend {

        @JsonField
        private String id;
        @JsonField
        private String name;

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
            if (this == o) {
                return true;
            }
            if (!(o instanceof Friend)) {
                return false;
            }

            Friend friend = (Friend) o;

            return Objects.equals(id, friend.id) &&
                    Objects.equals(name, friend.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        @Override
        public String toString() {
            return "Friend{" + "id=" + id + ", name=" + name + '}';
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
