package jaramillo.Ch8;
import java.util.*;

public class BowlingTeamDemo2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // declarations
        String name;
        final int NUM_TEAMS = 4;
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        int x;
        int y;
        final int NUM_TEAM_MEMBERS = 4;

        // team name for loop
        for(y = 0; y < NUM_TEAMS; y++) {
            teams[y] = new BowlingTeam();
            
            // user input for setting team name
            System.out.print("Enter Team Name: ");
            name = input.nextLine();
            teams[y].setTeamName(name);

            // for loop for setting team member's names
            for(x = 0; x < NUM_TEAM_MEMBERS; x++) {
                System.out.print("Enter Team Member's Name: ");
                name = input.nextLine();
                teams[y].setMember(x, name);
            }
        }
        
        // display output
        for(y = 0; y < NUM_TEAMS; y++) {
            System.out.println("\nMembers of team " + teams[y].getTeamName() + ":");
            for(x = 0; x < NUM_TEAM_MEMBERS; x++) {
                System.out.print(teams[y].getMember(x) + ", ");
            }
            System.out.println();
        }

        input.close();
    }
}
