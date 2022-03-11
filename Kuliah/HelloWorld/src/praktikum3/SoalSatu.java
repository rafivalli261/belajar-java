/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class SoalSatu {
    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        String str1, str2;
        
        // input
        str1 = ky.nextLine();
        str2 = ky.nextLine();
        
        // ubah ke non-kapital
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // bungkus dalam array
        char[] karakter1 = str1.toCharArray();
        char[] karakter2 = str2.toCharArray();
        
        // urutkan
        Arrays.sort(karakter1);
        Arrays.sort(karakter2);
        
        // cek kesamaan panjang karakter
        if(str1.length() != str2.length()){
            System.out.println("not anagram"); // bila tidak sama
        }
        else {
                if(Arrays.equals(karakter1, karakter2)){
                    System.out.println("anagram");
                }
                else{
                    System.out.println("not anagram");
                }
        }
    }
}
