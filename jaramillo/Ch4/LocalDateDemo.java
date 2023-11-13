package jaramillo.Ch4;

import java.time.*;

public class LocalDateDemo {
    public static void main(String[] args) {

        // LocalDate variables
        LocalDate tiempo = LocalDate.now();
        LocalDate ayer = LocalDate.of(1996, 8, 7);

        // variable output
        System.out.println("\nToday's Date is " + tiempo);
        System.out.println("The year is " + tiempo.getYear() + ", the night of the " + tiempo.getDayOfMonth() + "th day of the " + tiempo.getMonthValue() + "th month was a brutal one");
        System.out.println("Yo naci " + ayer);
        System.out.println("Ese dia si fue bien chingon. Era un " + ayer.getDayOfWeek() + " al principios de " + ayer.getMonth() + "\n");
    }
}