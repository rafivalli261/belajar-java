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
public class No1 {
    public static void main(String[] args) {
        /*
        int[] angka = new int[3];
        int hasil;
        Scanner myScan = new Scanner(System.in);
        for(int i = 0; i < 3 ;i++){
            System.out.print("Masukkan Angka : ");
            angka[i] = myScan.nextInt();
        }
        hasil = angka[0] + angka[1] + angka[2];
        System.out.println("Hasil penambahan : " + hasil);
        hasil = angka[0] - angka[1] - angka[2];
        System.out.println("Hasil pengurangan : " + hasil);
        hasil = angka[0] * angka[1] * angka[2];
        System.out.println("Hasil perkalian : " + hasil);
        hasil = angka[0] / angka[1] / angka[2];
        System.out.println("Hasil pembagian : " + hasil);
        */
        double a, b, c;
        Scanner ky = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        a = ky.nextDouble();
        System.out.print("Masukkan Angka : ");
        b = ky.nextDouble();
        System.out.print("Masukkan Angka : ");
        c = ky.nextDouble();
        System.out.println("Penjumlahan : " + (a +b +c));
        System.out.println("Pengurangan : " + (a - b - c));
        System.out.println("Perkalian : " + (a * b * c));
        System.out.println("Pembagian : " + (a / b / c));
    }
}

/*
Cara Membuat Array pada Java

// cara pertama
String[] nama;

// cara kedua
String nama[];

// cara ketiga dengan kata kunci new
String[] nama = new String[5];
*/