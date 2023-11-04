package Redo;
/*
 Write a program that prompts a user to enter two strings and then checks the strings entered
 and reports if either the first string is a substring of the second string, 
 or if the second string is a substring of the first string
*/

import java.util.Scanner;

public class mod4redo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

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
        System.out.println("\nYou entered:\n" + ans1 + "\n&\n" + ans2);

        }

        System.out.println("\nGracias amigos\n");
    }
}
