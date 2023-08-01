/*
Write a program that displays the results of:
4 x ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 )
And
4 x ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 )
In your comments, add a discussion on the difference between the two outputs and the cause. Which is best? Why?
*/


public class mod1Redo {
    public static void main(String[] args) {

        System.out.println("\nProject Name: Int vs Double vs Float\n");

        // First equation
        double firstEq = 4 * (1.0d - 1.0d/3.0d + 1.0d/5.0d - 1.0d/7.0d + 1.0d/9.0d - 1.0d/11.0d + 1.0d/13.0d);
        System.out.println("First output is 4 x (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/9.0 - 1.0/11.0 + 1.0/13.0)\nResults are: " + firstEq);
            
        // Second Equation
        int resInt =((4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)));
        System.out.println("\nSecond output is 4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)\nResults are: " + resInt);

        // Third Equation is float
        float resFloat = 4 * (1.0f - 1.0f/3.0f + 1.0f/5.0f - 1.0f/7.0f + 1.0f/9.0f - 1.0f/11.0f + 1.0f/13.0f);
        System.out.println("\nThird output is with floats\nResults are: " +resFloat);

        System.out.println("\nEnd\n");
    }    
}

/*
 * Best method is double for the most accurate answer
 */