/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p_arrayterbesar;

/**
 *
 * @author ASUS
 */
public class P_ArrayTerbesar {
    public static void main(String[] args) {
        int [] data = {22, 76, -53, 34, 31, 61, 21};
        int max;
        max = data[0];
        for(int i = 0; i < data.length; i++){
            if(data[i] > max){
                max = data[i];
            }
        }
        System.out.println("Nilai terbesar adalah " + max);
    }
    
}
