package materi_umldiagram;

public class Course {

    private String namaCourse;
    private int kode;
    private Student[] classList = new Student[0];
    private Faculty faculty;

    Course() {

    }

    Course(String namaCourse, int kode) {
        this.namaCourse = namaCourse;
        this.kode = kode;
    }

    public void addStudent(Student s) {
        Student[] temp = new Student[classList.length + 1];
        for (int i = 0; i < classList.length; i++) {
            temp[i] = classList[i];
        }
        temp[classList.length] = s;
        classList = temp;

    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void setNamaCourse(String namaCourse) {
        this.namaCourse = namaCourse;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getNamaCourse() {
        return this.namaCourse;
    }

    public int getKode() {
        return this.kode;
    }

}
