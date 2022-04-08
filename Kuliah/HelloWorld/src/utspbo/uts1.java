package utspbo;
import java.util.Scanner;
public class uts1 {
    static class Binatang{
        private String jenis;
        private String warna;
        private String aktivitas;
        
        // cons
        Binatang(){
            
        }
        
        Binatang(String jenis, String warna){
            this.jenis = jenis;
            this.warna = warna;
        }
        
        // set
        
        public void setJenis(String jenis){
            this.jenis = jenis;
        }
        
        public void setWarna(String warna){
            this.warna = warna;
        }
        
        public void setAktivitas(String aktivitas){
            this.aktivitas = aktivitas;
        }
        
        // get
        
        public String getJenis(){
            return this.jenis;
        }
        
        public String getWarna(){
            return this.warna;
        }
        
        public String getAktivitas(){
            return this.aktivitas;
        }
        
        public void aktifitas(){
            System.out.println(this.jenis + " sedang diam");
        }
        
        public void aktifitas(String A){
            this.aktivitas = A.toLowerCase();
            System.out.println(this.jenis + " sedang " + this.aktivitas);
        }
        
    }
    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);   
        int pilihan;
        String jns, wrn;
        jns = ky.nextLine();
        wrn = ky.nextLine();
        Binatang an = new Binatang(jns, wrn);
        pilihan = ky.nextInt();
        switch(pilihan){
            case 1:
                an.aktifitas();
                break;
            case 2:
                an.aktifitas(ky.next());
                break;
        }
        
    }
}
