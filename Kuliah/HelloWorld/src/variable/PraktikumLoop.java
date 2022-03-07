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
public class PraktikumLoop {
    public static void main(String[] args) {
        /*
        int theNum, theSum = 0, theSumb = 0;
        double theAverage;
        Scanner ky = new Scanner(System.in);
        
       do {
            theNum = ky.nextInt();
            if(theNum > 0){
                 theSum = theNum + theSum;
                 theSumb++;
            }
        } while(theNum != 0);
        
        ky.close();
        
        if(theSumb == 0){
            theSumb++;
        }
        
        theAverage = (double)theSum / theSumb;
        
        System.out.println(theSum);
        System.out.printf("%.1f", theAverage);
        */
        
        /*
        int n;
        Scanner ky = new Scanner(System.in);
        n = ky.nextInt();
        
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(j + " ");
            }
            
            System.out.println("");
            
        }
        for(int i = n; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                System.out.print(j + " ");
            }
            
            System.out.println("");
        }
        System.out.println("");
        for(int i =0; i <= n; i++){
            for(int j = n;j >= i; j--){ 
                System.out.print(j + " ");
            }
            System.out.println("");
        }
           */
//        int n;
//        double pound;
//        Scanner ky = new Scanner(System.in);
//        n = ky.nextInt();
//        pound = ky.nextDouble();
//        
//        for(int i = 0; i < n; i++){
//            System.out.printf("%.2f %.2f%n", pound, pound * 2.2);
//            pound++;
//        }

        int i, j;
        Scanner ky = new Scanner(System.in);
        
        int n = ky.nextInt();
        
        for(i = 0; i <= n; i++) {
            for(j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (i = n; i >= 0; i--) {  
            for (j = 0; j <= i; j++) {  
                System.out.print(j + " ");  
            }  
            System.out.println();  
        }  
        for(i = 0; i <= n; i++) {
            for (j= 2*(n-i ); j>=1; j--) {  
                System.out.print(" ");   
            }   
            for(j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (i = n; i >= 0; i--) {  
            for (j = 2*(n-i ); j >= 1; j--) {  
                System.out.print(" ");   
            }   
            for (j = 0; j <= i; j++) {  
                System.out.print(j + " ");  
            }  
            System.out.println();  
        }
        

    }
    
}
