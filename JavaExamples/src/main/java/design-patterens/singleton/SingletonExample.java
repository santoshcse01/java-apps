package design;

import com.example.demo.design.patterens.builder.Address;

public class SingletonExample {

    public static void main(String[] a) {
        Address address = new Address.AddressBuilder().area("area").build();
        User user = User.getInstance("san", address);
        System.out.println(user.getAddress().getArea());
    }

}
