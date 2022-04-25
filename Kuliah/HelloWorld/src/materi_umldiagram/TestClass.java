package materi_umldiagram;

// name nim course
public class TestClass {

    public static void main(String[] args) {
        Student st1 = new Student("Farhan Baihaqi", "21345");
        Course cr1 = new Course("PBO", 1221);
        Faculty fc1 = new Faculty("FPMIPA", 12);
        
        System.out.println("Nama Mahasiswa : " + st1.getNama());
        System.out.println("NIM Mahasiswa : " + st1.getNim());
        
        System.out.println("Nama Fakultas : " + fc1.getNameFaculty());
        System.out.println("ID : " + fc1.getId());
        
        System.out.println("Course : " + cr1.getNamaCourse());
        System.out.println("Kode : " + cr1.getKode());
        
        Course[] cl;
        st1.addCourse(cr1);
        cl = st1.getCourse();
        System.out.println(cl);
        
        
    }
}
