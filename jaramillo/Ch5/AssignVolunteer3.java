package jaramillo.Ch5;

import java.util.Scanner;

public class AssignVolunteer3{
    public static void main(String[] args) {
        //Scanner
       Scanner input = new Scanner(System.in);
        //Variables
        int donationType;
        String volunteer;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
        final String Invalid_INPUT = "invalid";
        String message;

        //Outputs
        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anything else " ); 
        donationType = input.nextInt();

        //Decisions if...else
        if(donationType == CLOTHING_CODE){
            volunteer = CLOTHING_PRICER;
            message = ("a clothing donation");}
        else if (donationType == OTHER_CODE){
            volunteer = OTHER_PRICER;
            message = ("a non-clothing donation");
        }else{
            volunteer =Invalid_INPUT;
            message = Invalid_INPUT;
        }

        //Outputs
        System.out.println("You entered " + donationType); 
        System.out.println("The volunteer who will price this item is " + volunteer);
        System.out.println("This is " + message);

        input.close();
    }
}