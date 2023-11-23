package jaramillo.Ch6;

import java.util.Scanner;

public class AssignVolunteer5{
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        int donationType;
        String volunteer;
        String message;
        final int CLOTHING_CODE = 1;
        final int FURNITURE_CODE = 2;
        final int ELECTRONICS_CODE = 3;
        final int OTHER_CODE = 4;
        final String CLOTHING_PRICER = "Regina";
        final String FURNITURE_PRICER = "Walter";
        final String ELECTRONICS_PRICER = "Lydia";
        final String OTHER_PRICER = "Marco";

        // User Input
        System.out.println("What type of donation is this?");
        System.out.print("Enter an integer... " ); 
        donationType = input.nextInt();

        // loop statement
        while (donationType < CLOTHING_CODE || donationType > OTHER_CODE) {
            System.out.println("You enterd " + donationType + " which is not a valid donation type");
            System.out.print("Please enter a value between " + CLOTHING_CODE + " and " + OTHER_CODE + "... ");
            donationType = input.nextInt();
        }

        // Switch Statements
        switch (donationType) {
            case (CLOTHING_CODE): {
                volunteer = CLOTHING_PRICER;
                message = "a clothing donation";
                break;
            }
            case (FURNITURE_CODE): {
                volunteer = FURNITURE_PRICER;
                message = "a furniture donation";
                break;
            }
            case (ELECTRONICS_CODE): {
                volunteer = ELECTRONICS_PRICER;
                message = "an electronics donation";
                break;
            }
            case (OTHER_CODE): {
                volunteer = OTHER_PRICER;
                message = "another donation type";
                break;
            }
            default: {
                volunteer = "invalid";
                message = "an invalid donation type";
            }
        }

        // Outputs
        System.out.println("You entered " + donationType); 
        System.out.println("The volunteer who will price this item is " + volunteer);
        System.out.println("This is " + message);

        input.close();
    }
}