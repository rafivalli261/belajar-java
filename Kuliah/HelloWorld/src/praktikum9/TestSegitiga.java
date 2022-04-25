
package praktikum9;
import java.util.Scanner;

public class TestSegitiga {
    public static void main(String[] args) {
        double sisi1, sisi2, sisi3;
        String warna;
        boolean isi;
        Scanner ky = new Scanner(System.in);
        
        // input data 
        System.out.print("Sisi 1 : ");
        sisi1 = Double.parseDouble(ky.nextLine());
        System.out.print("Sisi 2 : ");
        sisi2 = Double.parseDouble(ky.nextLine());
        System.out.print("Sisi 3 : ");
        sisi3 = Double.parseDouble(ky.nextLine());
        System.out.print("Warna : ");
        warna = ky.nextLine();
        System.out.print("Isi (true/false) : ");
        isi = ky.nextBoolean();
        
        Segitiga teman = new Segitiga(sisi1, sisi2, sisi3, warna, isi);
        
        // output
        System.out.println("Luas : " + teman.getArea());
        System.out.println("Keliling : " + teman.getPerimeter());
        System.out.println("Warna : " + teman.getWarna());
        System.out.println("Isi : " + teman.getIsi());
        
    }
}
