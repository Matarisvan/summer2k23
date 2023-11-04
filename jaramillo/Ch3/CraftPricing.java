/*
Caitlyn's Crafty Creations computes a retail price for each product as the cost of materials 
plus $14 multiplied by the number of hours of work required to create the product, plus $6 shipping and handling. 
Caitlyn’s Crafty Creations is having a semi-annual sale now, and everything is 25% off before shipping and handling:

Retail price = 0.75 * (cost of materials + (14 * hours of work)) + 6

Create a class that contains a main () method that prompts the user for the name of a product (for example, “woven purse”), 
the cost of materials before discount and the number of hours of work required. 
Pass the numeric data to a method that computes the retail price of the product and returns the computed value 
to the main () method where the product name and retail price are displayed. Save the program as CraftPricing.java.

Please submit the source code for your program along with a word document that includes screen shots of the compiled results and executed output.
*/

package jaramillo.Ch3;

import java.util.Scanner;

public class CraftPricing {
    public static void main(String[] args) {

        // import Scanner package
        Scanner input = new Scanner(System.in);
        
        // welcome message
        System.out.println("\nChapter 3 Assignment- Craft Pricing\n");

        // fields
        double retailPrice;
        double matCost;
        double workHours;

        System.out.println("What item would you like to purchase?");
        String item = input.nextLine();
        System.out.print("Cost of Materials: $");
        matCost = input.nextDouble();
        System.out.print("Hours of work required: ");
        workHours = input.nextDouble();

        // formulas
        retailPrice = .75 * (matCost + (14 * workHours)) + 6;

        // user output
        System.out.println("\nYou chose to purchase a \'" + item + "\'\nCost of Materials: $" + matCost + "\nHours of Work Required: " + workHours + "\nFinal Price: $" + retailPrice);

        input.close();  
    }     
}