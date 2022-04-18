/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class TestObjBgnRng {
    public static void main(String[] args) {
        // lingkaran
        GeoObj lingkaran1 = new Circles(12.0, "1");
        GeoObj lingkaran2 = new Circles(14.0, "2");
        GeoObj lingkaran3 = lingkaran1.maks(lingkaran2);
        System.out.println("Lingkarang yang paling luas adalah lingkaran " + lingkaran3.getNomor());
        
        // persegi
        GeoObj persegiPanjang1 = new Rectangle(17, 5, "1");
        GeoObj persegiPanjang2 = new Rectangle(4, 18, "2");
        GeoObj persegiPanjang3 = persegiPanjang1.maks(persegiPanjang2);
        System.out.println("Persegi Panjang yang paling luas adalah persegi panjang " + persegiPanjang3.getNomor());
        
        
    }
}
