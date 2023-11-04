package Redo;
/*
Write a program that is similar to the popular game titled “Rock-Paper-Scissors.”
The program randomly generates the number of 1, 2, or 3 with 1 being Rock, 2 being Paper, and 3 being Scissors.
Then, the program is to prompt the user to enter a value of 1, 2, or 3.
Next, the program displays a clear readable message displaying both the computer’s selection, the user’s selection,
    and the results.
*/

import java.util.Scanner;

public class mod3redo {
    public static void main(String[] args) {
        try (Scanner userInput = new Scanner(System.in)) {

            int program = 0;
            do {
                
                //welcome message
                System.out.println("\nWelcome to Rock, Paper, Scissors!\n");

                // Variables
                int rock = 1;
                int paper = 2;
                int scissors = 3;
                int cpuSel;
                int userSel = 0;
                int loop = 0;
                int replay = 0;
                String replayAnswer;
                
                //user selection
                while (loop == 0) {
                    System.out.println("\n1 = Rock\n2 = Paper\n3 = Scissors\nSelect an option:");
                    String userSelection = userInput.nextLine();
                    if (userSelection.equalsIgnoreCase("1")) {
                        System.out.println("You have chosen Rock!");
                        userSel = rock;
                        loop++;
                        break;
                    }else if(userSelection.equalsIgnoreCase("2")) {
                        System.out.println("You have chosen Paper!");
                        userSel = paper;
                        loop++;
                        break;
                    }else if(userSelection.equalsIgnoreCase("3")) {
                        System.out.println("You have chosen Scissors!");
                        userSel = scissors;
                        loop++;
                        break;
                    }else {
                        System.out.println("Invalid Response");
                        loop = 0;
                    }
                }
                
                //cpu selection
                cpuSel = (int)(Math.random() * 3) + 1;
                System.out.println("Cpu has chosen " + cpuSel);
                
                //results
                System.out.println("You chose " + userSel + " and cpu chose " + cpuSel);
                while (loop == 1) {
                    if (userSel == cpuSel) {
                        System.out.println("\nTIE\n");
                        loop++;
                        break;
                    } else if (userSel == 1 && cpuSel == 2 || userSel == 2 && cpuSel == 3 || userSel == 3 && cpuSel == 1) {
                        System.out.println("\nLose\n");
                        loop++;
                        break;
                    } else if (userSel == 1 && cpuSel == 3 || userSel == 2 && cpuSel == 1 || userSel == 3 && cpuSel == 2) {
                        System.out.println("\nWin\n");
                        loop++;
                        break;
                    }
                }

                //replay loop
                while ( replay == 0) {
                    System.out.println("\nWould you like to play again?\nY = yes\nN = no");
                    replayAnswer = userInput.nextLine();
                    if (replayAnswer.equalsIgnoreCase("y")) {
                        replay++;
                        break;
                    } else if (replayAnswer.equalsIgnoreCase("n")) {
                        replay++;
                        program++;
                        break;
                    } else {
                        System.out.println("Please select from the following options");
                        replay = 0;
                    }
                }            
            } while (program == 0);
        }
        System.out.println("\nThank you very mucho mis friends\n");
    }
}
