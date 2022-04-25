package materi_umldiagram;

import java.util.ArrayList;

public class Student {

    private String nama;
    private String nim;
    // private Course[] courseList = new Course[0];
    private ArrayList<Course> courseList = new ArrayList<>();

    Student() {

    }

    Student(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    /*
    public void addCourse(Course c) {
        Course[] temp = new Course[courseList.length + 1];
        for (int i = 0; i < courseList.length; i++) {
            temp[i] = courseList[i];
        }
        temp[courseList.length] = c;
        courseList = temp;
    }
     */
    public void addCourse(Course c) {
        this.courseList.add(c);
    }

    public ArrayList<Course> getCourse() {
        return this.courseList;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }

}

/*
st
nama: string
nim : string
getcourse

cr
namecourse : string
code : int
getsudent
get faculty


faculty
namefaculty : string
id : int


 */
