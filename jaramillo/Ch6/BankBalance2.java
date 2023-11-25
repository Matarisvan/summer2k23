package jaramillo.Ch6;

import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        // initialize scanner
        Scanner input = new Scanner(System.in);

        // variables
        double balance;
        int response;
        int year = 1;
        final double INT_RATE = 0.03;
        
        // asking for user input
        System.out.print("Enter initial bank balance >> ");
        balance = input.nextDouble();
        input.nextLine();

        // do while loop
        do {
            balance = balance + balance * INT_RATE;
            System.out.println("After year " + year + " at " + INT_RATE + " interest rate, balance is $" + balance);
            year++;
            System.out.println("\nDo you want to see the balance at the end of another year?\n");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            response = input.nextInt();
         } while (response == 1);

        // close scanner
        input.close();
    }
    
}
