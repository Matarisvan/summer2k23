package jaramillo;

import java.util.Scanner;

public class ParadiseInfo2 {
    public static void main(String[] args) {

        displayInfo();

        Scanner input = new Scanner(System.in);
        double price;
        double discount;
        double savings;

        System.out.print("Enter cutoff price for discount >> ");
        price = input.nextDouble();

        System.out.print("Enter discount rate as a whole number >>");
        discount = input.nextDouble();

        savings = computeDiscountInfo(price, discount);

        System.out.println(("Special this week on any service over " + price));
        System.out.println("Discount of " + discount + " percent");
        System.out.println("Thats's a savings of at least $" + savings);

        input.close();
    }
    
    public static void displayInfo(){
        System.out.println("Paradise Day Spa wants to pamper you.");
        System.out.println("We will make you look good");
    }
    public static double computeDiscountInfo(double price, double discountRate) {
        double savings;
        savings = price * discountRate / 100;
        return savings;
    }
}
