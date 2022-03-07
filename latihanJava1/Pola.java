import java.util.Scanner;
public class Pola{
    public static void main(String[] args) {
        int i,j;
        
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
            for (j=2*(n-i); j>=1; j--) {  
                System.out.print(" ");   
            }   
            for(j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (i = n; i >= 0; i--) {  
            for (j=2*(n-i); j>=1; j--) {  
                System.out.print(" ");   
            }   
            for (j = 0; j <= i; j++) {  
                System.out.print(j + " ");  
            }  
            System.out.println();  
        }
    }
}