/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Soal2Hehe {
    // Return the reversal of an integer, i.e., reverse(456) returns 654
    public static int reverse(int number){
        int temp = 0, sisa;
        while (number != 0) {
                sisa = number % 10;
                temp = temp * 10 +sisa;
                number /= 10;
            }
        return temp;
    }

    // Return true if number is a palindrome
    public static boolean isPalindrome(int number){
        
        int bilAsli = number;
        int balikBil = reverse(number);
        
        if (bilAsli >= 0 || bilAsli < 10000 ) {
                return false;
            }
            else if (bilAsli== balikBil){
                return true;
            }
            else {
                return false;
            }
    }
    public static void main(String[] args) {
        int bil;
        boolean cekPoli;
        Scanner ky = new Scanner(System.in);
        
        bil = ky.nextInt();

        cekPoli = isPalindrome(bil);
        

            if (cekPoli) {
                System.out.println("Palindrome");
            }
            else {
                System.out.println("Is not Palindrome");
            }
    }
    
}
