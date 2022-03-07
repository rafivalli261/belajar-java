
import java.util.Scanner;


public class Praktikum1 {
    public static void main(String[] args) {
        /*
        Scanner ky = new Scanner(System.in);
        String kata1, kata2, kata3;
        kata1 = ky.nextLine();
        kata2 = ky.nextLine();
        kata3 = ky.nextLine();
        System.out.print(kata1 + " " + kata2 + " " + kata3);
        */
        /*
        Scanner ky = new Scanner(System.in);
        int input, a, b, c, d;
        input = ky.nextInt();
        a = input / 1000;
        b = (input % 1000) / 100;
        c = (input % 100) / 10;
        d = (input % 10) / 1;
        input = a + b + c + d;
        System.out.println(input); 
        */
        /*
        Scanner ky = new Scanner(System.in);
        float input, output, aneh;
        aneh = (float) 1.8;
        input = ky.nextFloat();
        output = aneh * input + 32;
        System.out.print(output);
        */
        Scanner ky = new Scanner(System.in);
        double bayarPerBulan, totalBayaran;
        double persentasiBungaTahunan;
        double persentasiBungaBulanan;
        int lamaPinjaman;
        long jumlahPinjaman;
        double pangkat;
        
        persentasiBungaTahunan = ky.nextDouble();
        lamaPinjaman = ky.nextInt();
        jumlahPinjaman = ky.nextLong();
        
        persentasiBungaBulanan = persentasiBungaTahunan / 1200;
        System.out.println(persentasiBungaBulanan);
        
        pangkat = Math.pow(1 + persentasiBungaBulanan, lamaPinjaman * 12);
        System.out.println(pangkat);

        bayarPerBulan = (jumlahPinjaman * persentasiBungaBulanan) / (1 - (1 / pangkat));
        
        totalBayaran = bayarPerBulan * lamaPinjaman * 12;
        
        System.out.printf("%.2f" ,bayarPerBulan);
        System.out.println();
        System.out.printf("%.2f" ,totalBayaran);
    }
}
