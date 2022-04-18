
package praktikum10;
import java.util.Scanner;

public class TesObjekBangunRuang {


    public static void main(String args[]) {
        // TODO code application logic here
        boolean isiObj;
        String warnaObj;
        int a, b, c;
        Scanner ky = new Scanner(System.in);
        System.out.print("Sisi 1 : ");
        a = Integer.parseInt(ky.nextLine());
        System.out.print("Sisi 2 : ");
        b = Integer.parseInt(ky.nextLine());
        System.out.print("Sisi 3 : ");
        c = Integer.parseInt(ky.nextLine());
        System.out.print("Warna : ");
        warnaObj = ky.nextLine();
        System.out.print("Isi (true / false) : ");
        isiObj = ky.nextBoolean();
        
        
        GeometricObjek obj1 = new Triangle(a, b, c);
        obj1.setIsi(isiObj);
        obj1.setWarna(warnaObj);
        
        // printAll
        System.out.println("Luas Segitiga : " + obj1.getArea());
        System.out.println("Keliling Segitiga : " + obj1.getPerimeter());
        System.out.println("Warna : " + obj1.getWarna());
        System.out.println("Isi : " + obj1.getIsi());
        
        
        
    }
}
