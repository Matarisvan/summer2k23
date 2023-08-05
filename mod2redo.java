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

            //variables to be used
            double Q;
            double waterMass;
            double finalTemp;
            double initTemp;
            int consTemp = 4184;
            
            
            //intro to assignment
            System.out.println("\nMod 2 Redo - Water Heater Energy\n\nHow much water are you heating up in kg?");
            
            //collecting variable information
            waterMass = userInput.nextDouble();
            System.out.println("What is your water's current temperature in Celsius?");
            initTemp = userInput.nextDouble();
            System.out.println("What is your water's desired temperature in Celsius?");
            finalTemp = userInput.nextDouble();
            System.out.println("\nWater Mass: " + waterMass + "\ninitTemp = " + initTemp + "\nfinalTemp = " + finalTemp);

            //equation
            Q = waterMass * (finalTemp - initTemp) * consTemp;
            System.out.println("\nYou need " + Q + " Joules of energy");

        }
    System.out.println("\nGracias!\n");
    }    
}
