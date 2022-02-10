/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanjava;

import java.util.HashMap;

/**
 *
 * @author ASUS
 */
public class CobaHashMap {
    public static void main(String[] args) {
//        membuat objek hashmap
        HashMap<Integer,  String> days = new HashMap<>();
        
//        Mengisi nilai ke objek days
        days.put(1, "Minggu");
        days.put(2, "Senin");
        days.put(3, "Selasa");
        days.put(4, "Rabu");
        days.put(5, "Kamis");
        days.put(6, "Jum'at");
        days.put(7, "Sabtu");
        
//        mencetak semua isi dari objek days
        System.out.println("Isi objek days : " + days);
        
        // mencetak dengan loop
        // key saja
        days.keySet().forEach(i -> {
            System.out.println(i);
        });
        
        // value saja
        /*
        loop yang biasa untuk hashmap
        for(String i : days.values()){
            System.out.println(i);
        };
        */
        // functional loop
        days.values().forEach(i -> {
            System.out.println(i);
        });

//        mengambil hari ke 2, dengan method get()
        System.out.println("Hari ke dua : " + days.get(2));
    
     /*
    Menghapus nilai hashmap ada 2 method
    remove() menghapus salah satu nilai;
    clear() menghapus semua nilai;
    */
    
    // menghapus hari minggu
    days.remove(1);
    System.out.println("Isi Objek days : " + days);
    
    // menghapus semua hari
//    days.clear();
//    System.out.println(days);
    
    /*
    Ada dua method yang dapat digunakan untuk mengubah nilai di dalam HashMap:
    
    Method put()
    Method replace()
    Apa bedanya?

    Saya kira tidak ada perbedaan. Keduanya sama-sama bisa digunakan untuk mengubah nilai.

    Namun, sepertinya untuk method replace()…

    …nilai yang akan diubah harus sudah ada di dalam HashMap.

    Sedangkan untuk method put(), dia akan menambahkan yang baru apabila belum ada di dalam HashMap.
    */
    
    // mengganti hari senin dengan Monday
    days.put(2, "Monday");
    System.out.println(days);
    
    // mengganti hari sabtu dengan Saturday
    days.replace(7, "Saturday");
    System.out.println(days);
    }
}
