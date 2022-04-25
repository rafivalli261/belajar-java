package praktikum9;

public class Employee extends Person {

    protected double salary;
    protected java.util.Date dateHired;
    protected String office;

    Employee() {
        super();
        this.salary = 0.0;
        this.dateHired = null;
        this.office = "no work";
    }

    Employee(String name, String address, String phoneNumber, String email, double salary, String office) {
        super(name, address, phoneNumber, email);
        this.dateHired = new java.util.Date();
        this.salary = salary;
        this.office = office;
    }

    public String toString() {
        return "Employee : " + super.getName();
    }
}
