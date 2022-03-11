/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;
import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class SoalTiga {
    public static void main(String[] args) {
        
        int n;
        Scanner ky = new Scanner(System.in);
        String aku, kamu;
        n = ky.nextInt();
        
        if(n >= 0 && n < 50){
            String[] namaNegara = new String[n];
            
            // input nama negara
            for(int i = 0; i< n ;i++){
                namaNegara[i] = ky.next();
            }
            
            // close
            ky.close();
            
            // urutkan
             Arrays.sort(namaNegara, Collator.getInstance());
           
            
//            for(int i = 0; i < n - 1; i++){
//                for(int j = i + 1; j < namaNegara.length; j++){
//                        aku = namaNegara[i].toLowerCase();
//                        kamu = namaNegara[j].toLowerCase();
//                            if(aku.compareTo(kamu) > 0){
//                                String temp = namaNegara[i];
//                                namaNegara[i] = namaNegara[j];
//                                namaNegara[j] = temp;
//                            }
//                }
//            }
           
           
            // tampilkan
            for(int i = 0; i < n; i++){
                System.out.println(namaNegara[i]);
            }
        }
    }
}
