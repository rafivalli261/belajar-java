/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6.soal2;

/**
 *
 * @author ASUS
 */
public class CobaFish {

    public static void main(String[] args) {
        Fish amber = new Fish("Amber", "AngleFish", 5);
        Fish james = new Fish("James", "Guppy", 3);
        Fish ikan3 = amber.nicestFish(james);
        System.out.println("Ikan paling jinak adalah " + ikan3.namaIkan);

    }
}
