package com.github.fabienrenaud.jjb;

import java.util.List;

/**
 *
 * @author Fabien Renaud
 */
public class SmallPojo {

    public String _id;
    public int index;
    public String guid;
    public boolean isActive;
    public String balance;
    public String picture;
    public int age;
    public String eyeColor;
    public String name;
    public String gender;
    public String company;
    public String email;
    public String phone;
    public String address;
    public String about;
    public String registered;
    public double latitude;
    public double longitude;
    public List<String> tags;
    public List<Friend> friends;
    public String greeting;
    public String favoriteFruit;

    public static final class Friend {

        public String id;
        public String name;

        @Override
        public String toString() {
            return "Friend{" + "id=" + id + ", name=" + name + '}';
        }

    }

    @Override
    public String toString() {
        return "JsonDataObj{" + "id=" + _id + ", index=" + index + ", guid=" + guid + ", isActive=" + isActive + ", balance=" + balance + ", picture=" + picture + ", age=" + age + ", eyeColor=" + eyeColor + ", name=" + name + ", gender=" + gender + ", company=" + company + ", email=" + email + ", phone=" + phone + ", address=" + address + ", about=" + about + ", registered=" + registered + ", latitude=" + latitude + ", longitude=" + longitude + ", tags=" + tags + ", friends=" + friends + ", greeting=" + greeting + ", favoriteFruit=" + favoriteFruit + '}';
    }
}
