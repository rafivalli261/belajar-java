package praktikum6.soal1;
// @author Rafi
// kelas bisa dibuat di luar file main, atau di dalam file main

public class CobaSegiempat {

    public static void main(String[] args) {
        segiempat obj1 = new segiempat(4, 40);
        segiempat obj2 = new segiempat(3.5, 35.9);
        System.out.println("Lebar Objek 1 : " + obj1.getLebar());
        System.out.println("Panjang Objek 1 : " + obj1.getPanjang());
        System.out.println("Luas Objek 1 : " + obj1.getLuas());
        System.out.println("Keliling Objek 1 : " + obj1.getKeliling());
        System.out.println("");
        System.out.println("Lebar Objek 2 : " + obj2.getLebar());
        System.out.println("Panjang Objek 2 : " + obj2.getPanjang());
        System.out.println("Luas Objek 2 : " + obj2.getLuas());
        System.out.println("Keliling Objek 2 : " + obj2.getKeliling());
        
    }
}
