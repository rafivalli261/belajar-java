package praktikum9;

public class Student extends Person {

    enum classStatus {
        Freshman,
        Sophomore,
        Junior,
        Senior
    }
    classStatus status;

    Student() {
        super();
    }

    Student(String name, String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, email);
        classStatus Sophomore = classStatus.Sophomore;
    }

    public String toString() {
        return "Student : " + super.getName();
    }

}
