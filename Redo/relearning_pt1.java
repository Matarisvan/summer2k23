package Redo;
/* 
 * purpose of this is to relearn previous basic knowledge of java 
 * code and tutorial on w3schools.com
*/

public class relearning_pt1 {
    public static void main(String[] args) {
        System.out.println("\nHola Mundo bello!");
        System.out.print("Hello everyone! ");
        System.out.print("testing\n");
        System.out.println("MUCHAS gracias senor 'frijoles'\n");
        
        System.out.println(9+10);
        // The real answer is 21
        
        /* Java Variable Types:
         * String - stores text
         * int - stores integers (whole numbers) without decimals
         * float - stores floating numbers with decimals
         * char - stores single characters such as 'a' or 'B' ; char values are surrounded by single quotes
         * boolean - stores values with two states: true or false
         */

        String name = "Madara";
        int miNum;
        miNum= 21;
        float miFloat = 2.1f;
        char miChar = 'D';
        boolean miBool = true;
        double miDub = 21.21d;

        System.out.println(name + miNum +" " + miFloat + miChar + " " + miDub + miBool);

        /*
         * General Rules for naming;
         * can contain letters, digits, underscores, and dollar signs
         * must begin with a letter
         * should start with lowercase letter, cannot contain whitespace
         * can also begin with $ and _
         * names are case sensitive
         * do not use reserved names (ex: "int", "boolean")
         */
        
        int dubToInt = (int) miDub;
        double intToDub = miNum;
        System.out.println(dubToInt);
        System.out.println(miDub);
        System.out.println(intToDub);
        
        System.out.println();

        //Java string length
        String hokage = "uzumaki minato";
        System.out.println(hokage + " hokage.length() characters = " + hokage.length());
        System.out.println(hokage.toUpperCase());
        System.out.println(hokage.toLowerCase());
        System.out.println(hokage.indexOf("min"));


        System.out.println();
        System.out.println("thank you\n");


        
    }
    
}