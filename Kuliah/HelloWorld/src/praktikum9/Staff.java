package praktikum9;

public class Staff extends Employee {

    private String title;

    Staff() {
        super();
        this.title = "no title, sad";
    }

    Staff(String name, String address, String phoneNumber, String email, double salary, String office, String title) {
        super(name, address, phoneNumber, email, salary, office);
        this.title = title;
    }

    public String toString() {
        return ("Staff : " + super.getName());
    }

}
