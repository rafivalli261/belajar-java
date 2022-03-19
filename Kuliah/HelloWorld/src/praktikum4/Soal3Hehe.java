/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;
import java.util.Scanner;

/**
 *
 * @author ASUS
 * 
 Buatlah sebuah program yang akan menerima angka n 
 * sebagai sebuah bilangan positif dan sebuah metode 
 * yang akan menghasilkan segitiga angka dengan ukuran tertentu. 
 * Method header yang digunakan :

public static void displayPattern(int n)
Input Format

4

Constraints

0<n<10000
Output Format

      1
    2 1
  3 2 1
4 3 2 1
 */

public class Soal3Hehe {
    
    public static void displayPattern(int n){
        int i,j;
        for(i = 1; i <= n; i++) {
            for (j=2*(n-i); j>=1; j--) {  
                System.out.print("  ");   
            }   
            for(j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int i,j,n;
        Scanner ky = new Scanner(System.in);
        n = ky.nextInt();
        if(n > 0 && n < 10000){
            displayPattern(n);
        }
    }
}
