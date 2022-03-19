/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class Soal4Hehe {
    public static void Say(){
        System.out.println("Hai Kamu");
    }
// method mencetak "Hai Kamu!"
    
public static void Say(String a){
    System.out.println("Hai " + a + "!");
}
// method mencetak "Hai a!"
    
public static void Say(int b, String a){
    for(int i = 0; i < b; i++){
        System.out.println("Hai " + a + "!");
    }
}
// method mencetak "Hai a!" sebanyak b
    
    public static void main(String[] args) {
        String a;
        int b;
        
        Say();
        
        a = "Firman";
        Say(a);
        
        b = 3;
        Say(b, a);
        
    }
}
