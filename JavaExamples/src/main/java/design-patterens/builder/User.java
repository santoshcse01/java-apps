package design;

import lombok.Getter;

@Getter
final public class User {

    private long uid;
    private String name;
    private String rollNum;
    private Address address;

    private User(UserBuilder userBuilder) {
        this.uid = userBuilder.uid;
        this.name = userBuilder.name;
        this.rollNum = userBuilder.rollNum;
        this.address = userBuilder.address;
    }

    public static class UserBuilder {
        private long uid;
        private String name;
        private String rollNum;
        private Address address;

        public UserBuilder uid(long uid) {
            this.uid = uid; return this;
        }

        public UserBuilder name(String name) {
            this.name = name; return this;
        }

        public UserBuilder rollNum(String rollNum) {
            this.rollNum = rollNum; return this;
        }

        public UserBuilder address(Address address) {
            this.address = address; return this;
        }

        public User builder() {
            User user = new User(this);
            return user;
        }
    }

}
