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
public class Soal1Hehe {
    
    public static int sumDigits(long n){
        int sub = 0;
        int num = (int)n;
            
            while(num > 0){
                sub = sub + num%10;
                num = num / 10;
            }
            
        /*
            for(sub=0; n!=0; n=n/10){  
                      
                    sub = sub + n % 10;  
             }
        */
        return sub;
    }
    
    public static void main(String[] args) {
        long inputan;
        Scanner ky = new Scanner(System.in);
        inputan = ky.nextLong();
        if(inputan > 0 && inputan < 10000000){
                System.out.print(sumDigits(inputan));
        }
    }
    
}
