package praktikum9;

public class TestPersonEtc {

    public static void main(String[] args) {
        Staff orang1 = new Staff("Hu Tao", "Liyue", "085512347654", "hu.tao@wfp.com", 7000000.0, "Wanshen Funeral Parlor", "Leader");
        Faculty orang2 = new Faculty("Zhong Li", "Liyue", "085309452718", "zhongli123@wfp.com", 5000000.0, "Wanshen Funeral Parlor", 8, "Sun Tzu");
        Employee orang3 = new Employee("Jean Gunnhildr", "Mondstadt", "087912344321", "jeanxd321@favmond.co.te", 10000000.0, "Favonius Knight");
        Student orang4 = new Student("Diluc Ragvindr", "Mondstadt", "085212890976", "dilucxj123@monstadt.com");
        Person orang5 = new Person("Eula Lawrence", "Mondstadt", "087612361984", "eula.l@favmond.co.te");

        System.out.println(orang1.toString());
        System.out.println(orang2.toString());
        System.out.println(orang3.toString());
        System.out.println(orang4.toString());
        System.out.println(orang5.toString());
    }
}
