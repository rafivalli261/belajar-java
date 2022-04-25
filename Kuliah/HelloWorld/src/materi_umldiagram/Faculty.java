package materi_umldiagram;

public class Faculty {

    private String nameFaculty;
    private int id;
    private Course[] courseList;

    Faculty() {

    }

    Faculty(String nameFaculty, int id) {
        this.nameFaculty = nameFaculty;
        this.id = id;
    }

    public void addCourse(Course c) {
        Course[] temp = new Course[courseList.length + 1];
        for (int i = 0; i < courseList.length; i++) {
            temp[i] = courseList[i];
        }
        temp[courseList.length] = c;
        courseList = temp;

    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameFaculty() {
        return this.nameFaculty;
    }

    public int getId() {
        return this.id;
    }

}
