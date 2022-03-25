/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS
 */
public class CobaSegitiga {
    public static void main(String[] args) {
        Segi3SK segi1 = new Segi3SK();
        Segi3SK segi2 = new Segi3SK(3, 4);
        
        System.out.println("Luas 1 : " + segi1.getLuas());
        System.out.println("Keliling 1 : " + segi1.getKeliling());
        System.out.println("Sisi Miring 1 = " + segi1.getSisiMiring());
        System.out.println("Alas 1 = " + segi1.getTinggi());
        System.out.println("Tinggi 1 = " + segi1.getAlas());
        System.out.println("");
        System.out.println("Luas 2 : " + segi2.getLuas());
        System.out.println("Keliling 2 : " + segi2.getKeliling());
        System.out.println("Sisi Miring 2 = " + segi2.getSisiMiring());
        System.out.println("Alas 2 = " + segi2.getTinggi());
        System.out.println("Tinggi 2 = " + segi2.getAlas());
        // a b input method
    }
}
