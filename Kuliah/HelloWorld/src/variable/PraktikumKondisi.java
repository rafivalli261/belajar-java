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
public class PraktikumKondisi {
    public static void main(String[] args) {
        /*
        int bulan;
        Scanner ky = new Scanner(System.in);
        bulan = ky.nextInt();
        switch(bulan){
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
                break;
            default:
                System.out.println("Input Error");
        }
        */
        /*
        int bulan, tahun;
        Scanner ky = new Scanner(System.in);
        bulan = ky.nextInt();
        tahun = ky.nextInt();
        if(bulan == 2){
            if(tahun % 4 == 0){
                System.out.println(29);
            }
            else{
                System.out.println(28);
            }
        }
        else{
            if(bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 || bulan == 8 || bulan == 10 || bulan == 12){
                System.out.println(31);
            }
            else{
                System.out.println(30);
            }
        }
         */
        /*
         int bulan, tahun;
        Scanner ky = new Scanner(System.in);
        bulan = ky.nextInt();
        tahun = ky.nextInt();
        switch(bulan){
            case 1:
                System.out.print(31);
                break;
            case 2:
                if(tahun % 400 == 0 || tahun % 100 != 0 && tahun % 4 == 0){
                    System.out.println(29);
                }
                else{
                    System.out.println(28);
                }
                break;
            case 3:
                System.out.print(31);
                break;
            case 4:
                System.out.print(30);
                break;
            case 5:
                System.out.print(31);
                break;
            case 6:
                System.out.print(30);
                break;
            case 7:
                System.out.print(31);
                break;
            case 8:
                System.out.print(31);
                break;
            case 9:
                System.out.print(30);
                break;
            case 10:
                System.out.print(31);
                break;
            case 11:
                System.out.print(30);
                break;
            case 12:
                System.out.print(31);
                break;
            default:
                System.out.println("Input Error");
        }
        */
        
        int bil, balikBil = 0, sisa;
        Scanner ky = new Scanner(System.in);
        bil = ky.nextInt();

        int bilAsli = bil;
        
            while (bil != 0) {
                sisa = bil % 10;
                balikBil = balikBil * 10 +sisa;
                bil /= 10;
            }

            if (bilAsli < 9) {
                System.out.println("Not Palindrome");
            }
            else if (bilAsli== balikBil){
                System.out.println("Palindrome");
            }
            else {
                System.out.println("Not Palindrome");
            }
        
        
        
    }
    
}
