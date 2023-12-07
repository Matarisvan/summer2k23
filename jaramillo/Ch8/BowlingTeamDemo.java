package jaramillo.Ch8;
import java.util.*;

public class BowlingTeamDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // declarations
        String name;
        BowlingTeam bowlTeam = new BowlingTeam();
        int x;
        final int NUM_TEAM_MEMBERS = 4;

        // user input for setting team name
        System.out.print("Enter Team Name: ");
        name = input.nextLine();
        bowlTeam.setTeamName(name);

        // for loop for setting team member's names
        for(x = 0; x < NUM_TEAM_MEMBERS; x++) {
            System.out.print("Enter Team Member's Name: ");
            name = input.nextLine();
            bowlTeam.setMember(x, name);
        }

        // display output
        System.out.println("\nMembers of team " + bowlTeam.getTeamName() + ":");
        for(x = 0; x < NUM_TEAM_MEMBERS; x++) {
            System.out.println(bowlTeam.getMember(x));
        }

        input.close();
    }
}
