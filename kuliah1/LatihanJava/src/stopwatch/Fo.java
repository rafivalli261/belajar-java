
package stopwatch;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Fo {
    
    private final long nanoSecondsPerSecond = 1000000000;
    private final long nanoSecondsPerMinute = 60000000000L;
    private final long nanoSecondsPerHour = 3600000000000L;
    
    private long startTime = 0;
    private long endTime = 0;
    // private boolean isWaktuRun = false;
    private boolean isMenu = true;
    
    Scanner ky = new Scanner(System.in);
    
    private void start(){
        // this.isWaktuRun = true;
        this.startTime = System.nanoTime();
        System.out.println("Waktu tengah berjalan");
    }
    
    private void stop(){
        // this.isWaktuRun = false;
        this.endTime = System.nanoTime();
        System.out.println("Waktu yang diperoleh adalah " + this.getJam() + " jam " + this.getMenit() + " menit " + this.getDetik() + " detik");
        
    }
    
    private long getJam(){
        long time = (this.endTime - this.startTime) / nanoSecondsPerHour ;
        return time;
    }
    private long getMenit(){
        long time = ((this.endTime - this.startTime) % nanoSecondsPerHour) / nanoSecondsPerMinute ;
        return time;
    }
    private long getDetik(){
        long time = ((this.endTime - this.startTime) % nanoSecondsPerMinute) / nanoSecondsPerSecond ;
        return time;
    }
    
    private void eksekusiPilihan(int pilih){
        switch(pilih){
            case 1:
                this.start();
                break;
            case 2:
                this.stop();
                break;
            case 3:
                this.isMenu = false;
                break;
            default:
                System.out.println("Pilihan tidak ada, mungkin sedang ke lain hati");
        }
    }
    
    public void menu(){
        while(this.isMenu){
            System.out.println("******");
            System.out.println("[1] Mulai");
            System.out.println("[2] Berhenti");
            System.out.println("[3] Keluar");
            System.out.print("Pilih > ");
            this.eksekusiPilihan(ky.nextInt());
        }
    }
    
    
    
    public static void main(String[] args) {
        // membuat program penghitung waktu biasa
        Fo programUtama = new Fo();
        programUtama.menu();
    }
}

// masalah
 // kurang exception
// kurang banyak fungsinya
// sebenarnya kurang interaktif