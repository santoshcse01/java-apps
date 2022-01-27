package design;

import com.example.demo.design.patterens.builder.Address;

public class User {

    private static User user = new User();

    private static String name;
    private static Address address;

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    private User() {}

    public static User getInstance(String name, Address address) {
        User.name = name;
        Address address1 = new Address.AddressBuilder().build();
        User.address = address1;
        return user;
    }

}
