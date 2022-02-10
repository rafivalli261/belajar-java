//package kuliah1;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class newJavaFile{
    
    public static void main(String[] args) {
        String nama;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Masukkan nama anda : ");
        nama = keyboard.nextLine();
        System.out.println("Hello World");
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Halo " + nama + " " + i);
        }
        
    }
}