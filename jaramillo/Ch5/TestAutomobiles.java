/*
1. Create an Automobile class for a dealership.
2. Include fields for an ID number, make, model, color, year, vin number, miles per gallon, and speed.
3. Include get and set methods for each field.
4. Do not allow the ID to be negative or more than 9999; if it is, set the ID to 0.
5. Do not allow the year to be earlier than 2000 or later than 2017; if it is, set the year to 0.
6. Do not allow the miles per gallon to be less than 10 or more than 60; if it is, set the miles per gallon to 0.
7. Car speed should be initialized as 0.
8. Include a constructor that accepts arguments for each field value and uses the set methods to assign the values.
9. Also write two methods, Accelerate () and Brake ().
10. Whenever Accelerate () is called, increase the speed by 5, and whenever Brake () is called, decrease the speed by 5.
11. To allow users to specify the speed to increase (or decrease), create two overloading methods for Accelerate () and Brake ()
    that accept a single parameter specifying the increasing (or decreasing) speed.
12. Write an application that declares several Automobile objects and demonstrates that all the methods work correctly.
13. Save the files as Automobile.java and TestAutomobiles.java.
*/

package jaramillo.Ch5;

import java.util.Scanner;

public class TestAutomobiles {
    public static void main(String[] args) {
        
        // Scanner method
        Scanner input = new Scanner(System.in);

        // Creating Automobile Objects
        Automobile carOne = new Automobile(21, "Nissan", "Sentra", "Red", 2010, 212121, 35, 0);
        Automobile carTwo = new Automobile(-21, "Toyota", "RAV4", "White", 1999, 17381996, 5, 0);
        Automobile carThree = new Automobile(10001, "Ford", "F-350", "Black", 2018, 123456789, 61, 0);
        Automobile carFour = new Automobile(9998, "Buick", "Encore  ", "Blue", 2017, 987654321, 60, 0);

        // Testing Methods
        carOne.displayAutomobile();
        carTwo.displayAutomobile();
        carThree.displayAutomobile();
        carFour.displayAutomobile();

        // accelerate and brake
        System.out.println("");
        carOne.accelerate(21);
        carOne.accelerate(21.5);    
        carOne.brake(21);
        carOne.brake(21.5);
        




        input.close();
    }
}
