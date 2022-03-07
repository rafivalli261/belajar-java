/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variable;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class DigitalRoot {
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
        double bayarPerBulan, totalBayaran, persentasiBungaBulanan, pangkat;
        double persentasiBungaTahunan;
        int lamaPinjaman;
        long jumlahPinjaman;
        
        persentasiBungaTahunan = ky.nextFloat();
        lamaPinjaman = ky.nextInt();
        jumlahPinjaman = ky.nextLong();
        
        persentasiBungaBulanan = persentasiBungaTahunan / 1200;
        
        pangkat = Math.pow(1 + persentasiBungaBulanan, lamaPinjaman * 12);

        bayarPerBulan = (jumlahPinjaman * persentasiBungaBulanan) / (1 - (1 / pangkat));
        
        totalBayaran = bayarPerBulan * lamaPinjaman * 12;
        
        System.out.printf("%.2f\n" ,bayarPerBulan);
        System.out.printf("%.2f" ,totalBayaran);
    }
}
