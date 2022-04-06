package praktikum7.soal1;

import java.util.Scanner;

/**
 *
 * @author Rafi
 */
class TimeX {

    // properti
    private final long milisekonPerSekon = 1000;

    private long startTime = 0;
    private long endTime = 0;

    TimeX() {
        this.startTime = System.currentTimeMillis();

    }

    // setter
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    // getter
    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getElapsedTime() {
        long elapsedTime = endTime - startTime;
        return elapsedTime / milisekonPerSekon;
    }

}

public class Waktu2 {

    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        TimeX time = new TimeX();
        boolean loop = true;

        while (loop) {
            char init = ky.next().charAt(0);
            if (init == 'S') {
                time.start();
            } else {
                time.stop();
                loop = false;
            }

        }

        System.out.println(time.getElapsedTime() + " detik");

    }
}
