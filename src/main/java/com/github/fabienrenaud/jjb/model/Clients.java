package com.github.fabienrenaud.jjb.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.bluelinelabs.logansquare.typeconverters.DoubleBasedTypeConverter;
import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.dslplatform.json.CompiledJson;
import com.dslplatform.json.JsonAttribute;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@JsonObject
@CompiledJson
@jodd.json.meta.JSON
public class Clients {

    @JsonField
    @jodd.json.meta.JSON
    public List<Client> clients;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clients)) return false;

        Clients that = (Clients) o;

        return clients != null ? clients.equals(that.clients) : that.clients == null;
    }

    @Override
    public int hashCode() {
        return clients != null ? clients.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Clients{" + "clients=" + clients + '}';
    }

    @JsonObject
    public static final class Client {

        @JsonField
        public long _id;
        @JsonField
        public int index;
        @JsonField(typeConverter = LoganUUIDConverter.class)
        public UUID guid;
        @JsonField
        public boolean isActive;
        @JsonField(typeConverter = LoganBigDecimalConverter.class)
        public BigDecimal balance;
        @JsonField
        public String picture;
        @JsonField
        public int age;
        @JsonField(typeConverter = LoganEnumConverter.class)
        public EyeColor eyeColor;
        @JsonField
        public String name;
        @JsonField
        public String gender;
        @JsonField
        public String company;
        @JsonField
        @jodd.json.meta.JSON
        public String[] emails;
        @JsonField
        @jodd.json.meta.JSON
        public long[] phones;
        @JsonField
        public String address;
        @JsonField
        public String about;
        @JsonField(typeConverter = LoganLocalDateConverter.class)
        public LocalDate registered;
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
        public List<Partner> partners;

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Client)) {
                return false;
            }
            Client client = (Client) o;
            return index == client.index &&
                    isActive == client.isActive &&
                    age == client.age &&
                    Math.abs(Double.doubleToLongBits(client.latitude) - Double.doubleToLongBits(latitude)) < 3 &&
                    Math.abs(Double.doubleToLongBits(client.longitude) - Double.doubleToLongBits(longitude)) < 3 &&
                    Objects.equals(_id, client._id) &&
                    Objects.equals(guid, client.guid) &&
                    balance.compareTo(client.balance) == 0 &&
                    Objects.equals(picture, client.picture) &&
                    Objects.equals(eyeColor, client.eyeColor) &&
                    Objects.equals(name, client.name) &&
                    Objects.equals(gender, client.gender) &&
                    Objects.equals(company, client.company) &&
                    Arrays.equals(emails, client.emails) &&
                    Arrays.equals(phones, client.phones) &&
                    Objects.equals(address, client.address) &&
                    Objects.equals(about, client.about) &&
                    Objects.equals(registered, client.registered) &&
                    Objects.equals(tags, client.tags) &&
                    Objects.equals(partners, client.partners);
        }

        @Override
        public int hashCode() {
            return Objects.hash(_id, index, guid, isActive, balance, picture, age, eyeColor, name, gender, company, emails, phones, address, about, registered, tags, partners);
        }

        private String toStr(long[] nums) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            boolean first = true;
            for(long l : nums) {
                if (first) first = false;
                else sb.append(',');
                sb.append(l);
            }
            sb.append(']');
            return sb.toString();
        }

        @Override
        public String toString() {
            return "JsonDataObj{" + "_id=" + _id + ", index=" + index + ", guid=" + guid + ", isActive=" + isActive + ", balance=" + balance + ", picture=" + picture + ", age=" + age + ", eyeColor=" + eyeColor + ", name=" + name + ", gender=" + gender + ", company=" + company + ", emails=" + (emails != null ? Arrays.asList(emails) : null) + ", phones=" + toStr(phones) + ", address=" + address + ", about=" + about + ", registered=" + registered + ", latitude=" + latitude + ", longitude=" + longitude + ", tags=" + tags + ", partners=" + partners + '}';
        }
    }

    public static class LoganEnumConverter extends StringBasedTypeConverter<EyeColor> {
        @Override
        public Clients.EyeColor getFromString(String s) {
            return Clients.EyeColor.valueOf(s);
        }

        public String convertToString(Clients.EyeColor object) {
            return object.toString();
        }
    }

    public static class LoganBigDecimalConverter extends StringBasedTypeConverter<BigDecimal> {
        @Override
        public BigDecimal getFromString(String s) {
            return new BigDecimal(s);
        }

        public String convertToString(BigDecimal object) {
            return object.toPlainString();
        }
    }

    public static class LoganUUIDConverter extends StringBasedTypeConverter<UUID> {
        @Override
        public UUID getFromString(String s) {
            return UUID.fromString(s);
        }

        public String convertToString(UUID object) {
            return object.toString();
        }
    }

    public static class LoganLocalDateConverter extends StringBasedTypeConverter<LocalDate> {
        @Override
        public LocalDate getFromString(String s) {
            return LocalDate.parse(s);
        }

        public String convertToString(LocalDate object) {
            return object.toString();
        }
    }


    public static class LoganODTConverter extends StringBasedTypeConverter<OffsetDateTime> {
        @Override
        public OffsetDateTime getFromString(String s) {
            return OffsetDateTime.parse(s);
        }

        public String convertToString(OffsetDateTime object) {
            return object.toString();
        }
    }

    public enum EyeColor {
        BROWN,
        BLUE,
        GREEN;

        public static EyeColor fromNumber(int i) {
            if (i == 0) return BROWN;
            if (i == 1) return BLUE;
            return GREEN;
        }
    }

    @JsonObject
    public static final class Partner {

        @JsonField
        public long id;
        @JsonField
        public String name;
        @JsonField(typeConverter = LoganODTConverter.class)
        public OffsetDateTime since;

        public Partner() {
        }

        public static Partner create(long id, String name, OffsetDateTime since) {
            Partner partner = new Partner();
            partner.id = id;
            partner.name = name;
            partner.since = since;
            return partner;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Partner)) return false;

            Partner partner = (Partner) o;

            if (id != partner.id) return false;
            if (since == null && partner.since != null || since != null && !since.isEqual(partner.since)) return false;
            return name != null ? name.equals(partner.name) : partner.name == null;
        }

        @Override
        public int hashCode() {
            int result = (int)id;
            result = 31 * result + (since != null ? since.hashCode() : 0);
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "Partner{" + "id=" + id + ", name=" + name + ", since=" + since + '}';
        }

    }

}
