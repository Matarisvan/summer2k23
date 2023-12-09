package jaramillo.Ch10;

import java.util.*;

public class UseParty {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // data fields
        int guests;
        Party aParty = new Party();

        // user input
        System.out.print("Enter number of guests for the party: ");
        guests = input.nextInt();
        aParty.setGuests(guests);

        // display output
        System.out.println("La fiesta tiene " + aParty.getGuests() + " invitados que se quieren coger");
        aParty.displayInvitation();

    
    
        input.close();
    }    
}
