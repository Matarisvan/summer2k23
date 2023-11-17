package jaramillo.Ch5;

import java.util.Scanner;

public class AssignVolunteer2{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int donationType;
        String volunteer;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
        final String invalidInput = "invalid";
        String message;
        
        System.out.println("What type of donation is this?");
        System.out.print("Enter 1 for clothing, 2 for anything else... "); 
        donationType = input.nextInt();
       

        if (donationType == 1){
            volunteer = CLOTHING_PRICER;
            message = ("a clothing donation");
        } else if (donationType == 2) {
            volunteer = OTHER_PRICER;
            message = ("a non-clothing donation");
        } else if (donationType == 3) {
            volunteer = "don cheto";
            message = "porque te tatuatis";
        } else {
            volunteer = invalidInput;
            message = invalidInput;
        }

        System.out.println("You entered " + donationType); 
        System.out.println("The volunteer who will price this item is " + volunteer);
        System.out.println("This is " + message);

        input.close();
    }
}