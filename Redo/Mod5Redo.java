/*
CSD320 Module 5 Assigment

Write a program that uses a while loop to display the following math operations 
both in the smaller to larger order and then the larger to smaller order 
with the denominator being 3 through 99.
Ensure your application displays the mathematical results.
1/3.0 + 1/5.0 + 1/7.0 + ··· + 1/95.0 + 1/97.0 + 1/99.0
1/99.0 + 1/97.0 + 1/95.0 + ··· + 1/7.0 + 1/5.0 + 1/3.0
*/

package Redo;

import java.util.*;

public class Mod5Redo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int program = 0;
        int loop = 0;
        int mainAns = 0;
        String progAns;
        String loopAns;

        
        do {
            System.out.println("\nThere are 2 equations:");          
            do {
                loop = 0;  
                System.out.print("\nEquation 1: 1/3.0 + 1/5.0 + 1/7.0 + ··· + 1/95.0 + 1/97.0 + 1/99.0\nEquation 2: 1/99.0 + 1/97.0 + 1/95.0 + ··· + 1/7.0 + 1/5.0 + 1/3.0\nWhich would you like to run? ");
                progAns = input.nextLine();
                if (progAns.equalsIgnoreCase("1")) {
                    equationOne();
                    mainAns ++;
                } else if (progAns.equalsIgnoreCase("2")) {
                    equationTwo();
                    mainAns++;
                } else {
                    System.out.println("\nInvalid Option. Please select 1 or 2");
                }
            } while (mainAns == 0);
            
            System.out.println("Would you like to run one again?\n1 = Yes\n2 = No");
            do {                
                loopAns = input.nextLine();
                if (loopAns.equalsIgnoreCase("1")) {
                    mainAns = 0;
                    loop++;
                } else if (loopAns.equalsIgnoreCase("2")) {
                    loop++;
                    program++;
                } else {
                    System.out.println("\nInvalid Option. Please select an option:\n1 = Rerun program\n2 = Exit Program");
                }
            } while (loop == 0);
        } while (program == 0);

        System.out.println("\nArigatouuuuuuuuuuuuu!!!\n");

        input.close();
    }
    
    // equation 1 method
    public static void equationOne() {
        double denominator;
        double numerator = 1;
        double total = 0;
        for (denominator = 3; denominator <=99; denominator+=2) {
            total += numerator/denominator;
            System.out.println(numerator + "/" + denominator + " = " + total + "\nPlus:");
        }
    }

    // equation 2 method
    public static void equationTwo(){
        double denominator = 99;
        double numerator = 1;
        double total = 0;
        while (denominator >= 3) {
            total += numerator/denominator;
            System.out.println(numerator + "/" + denominator + " = " + total + "\nPlus:");
            denominator -= 2;
        }
    }


}
