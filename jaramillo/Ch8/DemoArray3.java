package jaramillo.Ch8;

public class DemoArray3 {
    public static void main(String[] args) {

        // initializing and populating an array
        double[] salaries = {12.25, 13.55, 14.25, 16.85};
        
        System.out.println("\nSalaries one by one");

        // using for loop to display output
        for(int x = 0; x < salaries.length; x++) {
            System.out.println(salaries[x]);
        }
    }
}