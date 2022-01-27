package design;

public class BuildExample {

    public static void main(String []a) {
        Address address = new Address.AddressBuilder().area("kala nagar").city("vizag").state("AP").country("india").build();
        User user = new User.UserBuilder().uid(101).name("santosh").rollNum("123456789").address(address).builder();
    }

}
