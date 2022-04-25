package praktikum9;

public class Faculty extends Employee {

    private int officeHours;
    private String rank;

    Faculty() {
        super();
        this.officeHours = 0;
        this.rank = "still unrated";
    }

    Faculty(String name, String address, String phoneNumber, String email, double salary, String office, int officeHours, String rank) {
        super(name, address, phoneNumber, email, salary, office);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String toString() {
        return "Faculty Member : " + super.getName();
    }
}
