package Redo;
/*
 Write a program that prompts a user to enter two strings and then checks the strings entered
 and reports if either the first string is a substring of the second string, 
 or if the second string is a substring of the first string
*/

import java.util.Scanner;

public class mod4redo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //welcome message
        System.out.println("\nWelcome to mod 4 redo\nyou will type 2 lines of text and see if one is within the other\n");
        
        //variables
        int program = 0;
        int replay = 0;
        String ans1;
        String ans2;

        //user input
        System.out.println("Please enter your first line of text");
        ans1 = input.nextLine();
        System.out.println("Please enter your second line of text");
        ans2 = input.nextLine();

        //results
        System.out.println("\nYou entered:\nLine 1: " + ans1 + "\nLine 2: " + ans2);
        if (ans2.contains(ans1)) {
            System.out.println("Your first line \'" + ans1 + "\' is indeed a substring of your second line");
        } else {
            System.out.println("Line 1 IS NOT a substring of line 2");
        }
        if (ans1.contains(ans2)){
            System.out.println("Your second line \'" + ans2 + "\' is indeed a substring of your first line");
        } else {
            System.out.println("Line 2 IS NOT a substring of line 1");
        }
            

        

        System.out.println("\nGracias amigos\n");
        input.close();
    }
}
