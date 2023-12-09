package jaramillo.Ch10;

import java.util.*;

public class UseDinnerParty {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // data fields
        int guests;
        int choice;
        Party aParty = new Party();
        DinnerParty aDinnerParty = new DinnerParty();

        // user input
        System.out.print("\nEnter number of guests for the party: ");
        guests = input.nextInt();
        aParty.setGuests(guests);

        // display output
        System.out.println("La fiesta tiene " + aParty.getGuests() + " invitados que se quieren coger");
        aParty.displayInvitation();

        //  inherited method
        System.out.print("Enter number of horny and hungry dinner guests: ");
        guests = input.nextInt();
        aDinnerParty.setGuests(guests);

        // dinner choice
        System.out.println("Wtf you wanna eat?\n1 for pussy\n2 for this dick");
        choice = input.nextInt();
        aDinnerParty.setDinnerChoice(choice);

        // displaying inherited method
        System.out.println("This mf dinner party got " + aDinnerParty.getGuests() + " guests who think they getting fed today xD");
        System.out.println("You chose menu option " + aDinnerParty.getDinnerChoice() + " but you ain't getting shit!");
        aDinnerParty.displayInvitation();


    
    
        input.close();
    }    
}