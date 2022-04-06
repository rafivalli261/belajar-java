package contoharraylist;

import java.util.ArrayList;
import java.util.Collections; // import kelas collection
public class FileMateriArrayLlist2 {

    public static void main(String[] args) {
        /*
        Elemen dalam ArrayList sebenarnya adalah objek. 
        Contoh sebelumnya menggunakan elemen (objek) dengan tipe String
        Harap diingat bahwa String dalam java adalah objek / bukan primitif
        
        Untuk menggunakan tipe data lain seperti int, 
        harus ditulis equivalent wrapper class : Integer
        
        Boolean untuk boolean
        Character untuk char
        Double untuk double, dll
        
        */
        
        ArrayList<Integer> nomorAcak = new ArrayList<>();
        nomorAcak.add(90);
        nomorAcak.add(29);
        nomorAcak.add(57);
        nomorAcak.add(38);
        nomorAcak.add(58);
        /*
        nomorAcak.forEach(i -> {
            System.out.println(i);
        });
        */
        
        // ## Sorting ArrayList ##
        // Kelas lain pada java,util yang tak kalah keren adalah Kelas Collection
        // yang juga mencakup method sort() untuk mengurutkan elemen dalam
        // ArrayList secara alfabet atau numeric
        
        ArrayList<String> knight = new ArrayList<>();
        knight.add("Jean");
        knight.add("Eula");
        knight.add("Amber");
        knight.add("Varka");
        knight.add("Kaeya");
        knight.add("Lisa");
        knight.add("Noelle");
         Collections.sort(knight);
        knight.forEach(i ->{
            System.out.println(i);
        });
        
        
        // numeric
        Collections.sort(nomorAcak);
        nomorAcak.forEach(i -> {
            System.out.println(i);
        });
    }
    
}
