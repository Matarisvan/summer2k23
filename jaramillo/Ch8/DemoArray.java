package jaramillo.Ch8;

public class DemoArray {
    public static void main(String[] args) {

        // creating array
        double[] salaries = new double[4];

        // assigning values to array elements
        salaries[0] = 12.25;
        salaries[1] = 13.55;
        salaries[2] = 14.25;
        salaries[3] = 16.85;

        System.out.println("\nSalaries one by one");
        System.out.println(salaries[0] + "\n" + salaries[1] + "\n" + salaries[2] + "\n" + salaries[3]);
    }
}