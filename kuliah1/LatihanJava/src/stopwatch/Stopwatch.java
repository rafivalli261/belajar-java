package stopwatch;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * @author Rafi
 */

class Stopwatch1 {

    private final long nanoSecondPerMilisecond = 1000000;
    private final long nanoSecondsPerSecond = 1000000000;
    private final long nanoSecondsPerMinute = 60000000000L;
    private final long nanoSecondsPerHour = 3600000000000L;

    private long stopwatchStartTime = 0;
    private long stopwatchStopTime = 0;
    private boolean stopwatchRunning = false;

    public void start() {
        this.stopwatchStartTime = System.nanoTime();
        this.stopwatchRunning = true;
    }

    public void stop() {
        this.stopwatchStopTime = System.nanoTime();
        this.stopwatchRunning = false;
    }

    public long getElapsedMilisecond() {
        long elapsedTime;

        if (stopwatchRunning) {
            elapsedTime = (System.nanoTime() - stopwatchStartTime);
        } else {
            elapsedTime = (stopwatchStopTime - stopwatchStartTime);
        }

        return elapsedTime / nanoSecondPerMilisecond;
    }

    public long getElapsedSeconds() {
        long elapsedTime;

        if (stopwatchRunning) {
            elapsedTime = (System.nanoTime() - stopwatchStartTime);
        } else {
            elapsedTime = (stopwatchStopTime - stopwatchStartTime);
        }

        return elapsedTime / nanoSecondsPerSecond;
    }

    public long getElapsedMinutes() {
        long elapsedTime;
        if (stopwatchRunning) {
            elapsedTime = (System.nanoTime() - stopwatchStartTime);
        } else {
            elapsedTime = (stopwatchStopTime - stopwatchStartTime);
        }

        return elapsedTime / nanoSecondsPerMinute;
    }

    public long getElapsedHours() {
        long elapsedTime;
        if (stopwatchRunning) {
            elapsedTime = (System.nanoTime() - stopwatchStartTime);
        } else {
            elapsedTime = (stopwatchStopTime - stopwatchStartTime);
        }

        return elapsedTime / nanoSecondsPerHour;
    }

}

public class Stopwatch {

    public static void main(String[] args) {
        Stopwatch1 st1 = new Stopwatch1();
        st1.start();
        // Fibonacci(45);
        Scanner ky = new Scanner(System.in);
        int x = ky.nextInt();
        st1.stop();
        System.out.println("Elapsed time in miliseconds : " + st1.getElapsedMilisecond());
        System.out.println("Elapsed time in seconds : " + st1.getElapsedSeconds());
        System.out.println("Elapsed time in minutes : " + st1.getElapsedMinutes());
        System.out.println("Elapsed time in hours : " + st1.getElapsedHours());

    }

    private static BigInteger Fibonacci(int n) {
        if (n < 2) {
            return BigInteger.ONE;
        } else {
            return Fibonacci(n - 1).add(Fibonacci(n - 2));
        }
    }

}
