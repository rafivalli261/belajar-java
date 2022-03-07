// @author ASUS

package variable;
import java.util.Scanner;

public class CobaVariable {
    public static void main(String[] args) {
        String nama;
        int umur;
        double ipk;
        boolean senang;
        
        try (Scanner ky = new Scanner(System.in)) {
            System.out.print("Masukkan nama : ");
            nama = ky.nextLine();
            System.out.print("Masukkan umur : ");
            umur = ky.nextInt();
            System.out.print("Masukkan IPK : ");
            ipk = ky.nextDouble();
            System.out.println("Apakah anda senang ?(true/false)");
            senang = ky.nextBoolean();
                    
            System.out.println("Halo " + nama + " yang telah berusia " + umur +" tahun, yang IPK nya " + ipk);
            if(senang){
                System.out.println("Wah, saya turut senang");
            }
            else{
                System.out.println("Wah, anda tidak senang!");
            }
        }
    }
}
