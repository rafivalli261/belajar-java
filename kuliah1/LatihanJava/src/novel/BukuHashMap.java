/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novel;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author ASUS
 */
public class BukuHashMap {
    public static void main(String[] args) {
        
        // membuat objek hashmap
        HashMap<String, Buku> books = new HashMap<>();
        
        // membuat objek buku
        Buku bukuJava = new Buku("Tutorial Java", "Petani Kode");
        Buku bukuKotlin = new Buku("Pemrograman Kotlin", "Petani Kode");
        Buku bukuAndroid = new Buku("Analisis Desain Algotirma Android", "Petani Kode");
        
        // mengisi objek hashmap dengan objek buku
        books.put("java", bukuJava);
        books.put("kotlin", bukuKotlin);
        books.put("android", bukuAndroid);
        
        // cetak semua buku
        /*
        for(Map.Entry b: books.entrySet()){
        Buku buku = (Buku) b.getValue();
        System.out.println(b.getKey() + ": " + buku.getTitle());
        }
         */
        books.entrySet().forEach(b -> {
            Buku buku = (Buku) b.getValue();
            System.out.println(b.getKey() + ": " + buku.getTitle());
        });
    }
}
