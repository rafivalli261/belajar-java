/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materi_method;

/**
 *
 * @author ASUS
 */
public class Method1 {
    public static int max(int i, int j){
        if(i > j){
            return i;
        }
        else{
            return j;
        }
    }
    
    public static void main(String[] args) {
        int a = 12;
        int b = 12;
        int c = max(a, b);
        
        System.out.println("Nilai terbesar antara " + a + " dan " + b + " adalah " + c);
        
    }
    
}
