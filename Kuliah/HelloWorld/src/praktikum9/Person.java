package praktikum9;

public class Person {

    // name, address, phone, number
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    Person() {
        this.name = "no name";
        this.address = "nomad";
        this.phoneNumber = "no money, can't afford to buy single phone";
        this.email = "no phone, no email";
    }

    Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Person : " + this.getName();
    }

}
