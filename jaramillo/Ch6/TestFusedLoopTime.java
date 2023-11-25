package jaramillo.Ch6;

import java.time.*;

public class TestFusedLoopTime {
    public static void main(String[] args) {
        
        // init fields
        int startTime, endTime;
        int x;
        final int REPEAT = 5_000_000;
        final int FACTOR = 1_000_000;

        // declaring local date method and start time
        LocalDateTime now;
        now = LocalDateTime.now();
        startTime = now.getNano();

        // executing methods separately
        for (x = 0; x < REPEAT; x++) {
            method1();
        }
        for (x = 0; x < REPEAT; x++) {
            method2();
        }

        // comparing time taken to execute methods separately
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops executed separately: " + ((endTime - startTime) / FACTOR) + " milliseconds");

        // executing methods together (fused loop)
        now = LocalDateTime.now();
        startTime = now.getNano();
        for (x = 0; x < REPEAT; x++) {
            method1();
            method2();
        }

        // comparing time taken to execute methods together
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops exexuted together: " + ((endTime - startTime) / FACTOR) + " milliseconds");
    }

    // void methods
    public static void method1() {}
    public static void method2() {}    
}
