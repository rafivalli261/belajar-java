package praktikum6.soal1;

// kelas bisa dibuat di luar file main, atau di dalam file main
public class CobaSegiempat {
    public static void main(String[] args) {
        segiempat obj1 = new segiempat();
        segiempat obj2 = new segiempat(3, 4);
        System.out.println("Luas Objek 1 : " + obj1.getLuas());
        System.out.println("Luas Objek 2 : " + obj2.getLuas());
    }
}
