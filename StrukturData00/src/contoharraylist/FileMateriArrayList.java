package contoharraylist;

import java.util.ArrayList; // import kelas ArrayList

public class FileMateriArrayList {

    public static void main(String[] args) {
        /*
        Java ArrayList
        Kelas ArrayList berisi array yang dapat  berubah ukuran, 
        berada dalam package java.util
        
        Perbedaan array bawaan dengan ArrayList pada java yaitu 
        ukuran dari suatu array tidak dapat diubah 
        (jika kamu ingin menambah atau menghapus elemen ke/dari array,
        kamu harus membuat array baru). 
        Sedangkan pada ArrayList, elemen dapat ditambahkan dengan bebas. 
        Sintaks keduanya pun sangat berbeda
        
         */

        // contoh : membuat sebuah ArrayList objek 
        // dengan nama hero yang menyimpan nilai Strings
        ArrayList<String> hero = new ArrayList<>(); // membuat objek ArrayList

        // Menambah Item
        hero.add("Teuku Umar");
        hero.add("Kapitan Pattimura");
        hero.add("Pangeran Diponegoro");
        hero.add("Tuanku Imam Bonjol");
        // System.out.println(hero);

        // Mengakses salah satu elemen dalam ArrayList
        // pakai method get() dan indexnya
        hero.get(1);
        // System.out.println(hero.get(0));

        // ##### Mengubah elemen
        // pakai method set(), index, dan argumen baru
        hero.set(0, "Cut Nyak Dien");
        // System.out.println(hero);

        // ##### Menghapus elemen
        // pakai remove(), index | untuk menghapus elemen spesifik
        //hero.remove(0);
        // pakai clear() | untuk menghapus semua elemen
        //hero.clear();
        // ## Ukuran ArrayList ##
        // dapat diketahui dengan method size()
        hero.size();
        // System.out.println(hero.size());
        // ## Loop elemen ArrayList ##
        // melakukan loop melalui elemen-elemen pada ArrayList
        // dengan for loop, dan method size
        /*
        for (int i = 0; i < hero.size(); i++) {
        System.out.println(hero.get(i));
        }
         */
        // bisa juga dengan for-each
        /*
        hero.forEach(i -> {
            System.out.println(i);
        });
        */
        
        
        
    }
}
