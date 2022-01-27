package design;

import lombok.Getter;

@Getter
final public class Address {

    private String area;
    private String city;
    private String state;
    private String country;

    public String getArea() {
        return area;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    private Address(AddressBuilder addressBuilder) {
        this.area = addressBuilder.area;
        this.city = addressBuilder.city;
        this.state = addressBuilder.state;
        this.country = addressBuilder.country;
    }

    public static class AddressBuilder {
        private String area;
        private String city;
        private String state;
        private String country;

        public AddressBuilder area(String area) {
            this.area = area;
            return this;
        }

        public AddressBuilder city(String city) {
            this.city = city;
            return this;
        }

        public AddressBuilder state(String state) {
            this.state = state;
            return this;
        }

        public AddressBuilder country(String country) {
            this.country = country;
            return this;
        }

        public Address build() {
            Address address = new Address(this);
            return address;
        }
    }
}
