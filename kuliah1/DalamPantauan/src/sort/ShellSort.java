/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort;

/**
 *
 * @author ASUS
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {134,167,123,128,198,115,189,167,128,118};
        int i, j, m;
        int temp, counter = 0;
        
        System.out.print("Tabel Sebelum diurut : ");
        for(i = 0; i < arr.length; i++){
            System.out.printf("%d ",arr[i]);
        }
        
        System.out.println("");
        
        // shell sort
        for(m = arr.length/2; m > 0; m/=2){
            for(j = m; j < arr.length; j++){
                for(i = j - m; i>=0; i-=m){
                    if(arr[i + m] < arr[i]){
                        counter = counter + 1;
                        temp = arr[i];
                        arr[i] = arr[i + m];
                        arr[i + m] = temp;
                    }
                }
            }
        }
        
        System.out.print("Tabel Setelah diurut : ");
        for(i = 0; i < arr.length; i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.println("");
        System.out.printf("Terjadi %d kali pertukaran%n", counter);
        
        
    }
}
