
package praktikum7.soal1;
import java.util.Scanner;

class Stopwatch{
    private long startTime = 0;
    private long endTime = 0;
    
    public long getStartTime(){
        return this.startTime;
    }
    
    public long getEndTime(){
        return this.endTime;
    }
    
    Stopwatch(){
         this.startTime = System.currentTimeMillis();
         System.out.println(this.startTime / 1000);
    }
    
    public void start(){
        this.startTime = System.currentTimeMillis();
        System.out.println(this.startTime / 1000);
    }
    
    public void stop(){
        this.endTime = System.currentTimeMillis();
        System.out.println(this.endTime / 1000);
    }
    
    public long getElapsedTime(){
        return ((this.endTime - this.startTime) / 1000);
    }
    
}

public class Waktu {
    public static void main(String[] args) {
        Stopwatch jam = new Stopwatch();
        String a;
        long time = 0;
        Scanner ky = new Scanner(System.in);
        for(int i = 0; i < 2; i++){
            a = ky.nextLine();
            if(a == "S"){
                jam.start();
            }
            else{
                jam.stop();
                time = jam.getElapsedTime();
            }
        }
        System.out.println(time + " detik");
        
    }
}
