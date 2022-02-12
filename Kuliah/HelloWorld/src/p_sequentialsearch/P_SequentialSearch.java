package p_sequentialsearch;
import java.util.Scanner;

// @author ASUS 

public class P_SequentialSearch {
    public static void main(String[] args) {
        int arr[];
        arr = new int[]{1, 4, 2, 3, 6, 5, 7};
        
        // membuat metode input, dalam hal ini scanner
        Scanner input = new Scanner(System.in);
        boolean get = false;
        int point = 0, searchItem;
        
        // memasukkan nilai yang dicari kedalam variable searchItem
        System.out.println("Masukkan angka yang dicari : ");
        searchItem = input.nextInt();
        
        // proses mencari apakah nilai searchItem ada dalam variable arr
        for(int i = 0; i < arr.length; i++){
            if(searchItem == arr[i]){
                
                // status get(dapat) akan berubah menjadi true saat ada
                // nilai didalam arr yang sama dengan searchItem
                get = true;
                
                // menyimpan posisi index ditemukannya nilai tersebut
                point = i;
                
                // break berguna untuk keluar dari perulangan
                break;
                
            }
        }
        
        // jika nilai ditemukan, maka ...
        if (get)
            System.out.println("Angka " + searchItem + " ditemukan dalam array ke-" + point);
        
        // jika nilai tidak ditemukan, maka ..
        else
            System.out.println("Angka tidak ditemukan!");
        
    }
}
