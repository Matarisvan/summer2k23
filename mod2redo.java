/*
Write a program that calculates the energy needed to heat water from an
    initial temperature to a final temperature.
Your program should prompt the user to enter the amount of water in kilograms 
    and the initial and final temperature of the water.
The formula to use for this program is:
Q = waterMass ( finalTemperature – initialTemperature ) x 4184
waterMass is water weight in kilograms
finalTemperature and initialTemperature are temperatures in Celsius
Q is the results in Joules
*/

import java.util.Scanner;

public class mod2redo {
    public static void main(String[] args) {
        
        //import scanner
        try (Scanner userInput = new Scanner(System.in)) {

            //intro to assignment
            System.out.println("\nMod 2 Redo - Water Heater Energy\nType something:  ");
            String answer;
            answer = userInput.nextLine();
            System.out.println("you chose " + answer);

        }


        

    System.out.println("\nGracias!\n");
    }    
}
