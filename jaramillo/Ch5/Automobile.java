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

public class Automobile {

    //fields
    private int idNumber;
    private String make;
    private String model;
    private String color;
    private int year;
    private int vinNumber;
    private int mpg;
    private int speed;

    //get and set methods
    public int getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(int setId) {
        if (setId >= 0 && setId <= 9999)  {
            idNumber = setId;
        } else {
            idNumber = 0;
        }
    }
    public String getMake() {
        return make;
    }
    public void setMake(String setMake) {
        make = setMake;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String setModel) {
        model = setModel;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String setColor) {
        color = setColor;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int setYear) {
        if (setYear >=2000 && setYear<= 2017) {
            year = setYear;
        } else {
            year = 0;
        }
    }
    public int getVin() {
        return vinNumber;
    }
    public void setVin(int setVin) {
        vinNumber = setVin;
    }
    public int getMpg() {
        return mpg;
    }
    public void setMpg(int setMpg) {
        if (setMpg >= 10 && setMpg <= 60) {
            mpg = setMpg;
        } else {
            mpg = 0;
        }
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int setSpeed) {
        speed = setSpeed;
    }

    // Constructors
    public Automobile(int idNumber, String make, String model, String color, int year, int vinNumber, int mpg, int speed) {
        setIdNumber(idNumber);
        setMake(make);
        setModel(model);
        setColor(color);
        setYear(year);
        setVin(vinNumber);
        setMpg(mpg);
        setSpeed(speed);
    }

    // display method
    public void displayAutomobile() {
        System.out.println("\nID Number: " + idNumber + "\nMake: " + make + "\nModel: " + model + "\nColor: " + color + "\nYear: " + year + "\nVIN: " + vinNumber + "\nMPG: " + mpg + "\nCurrent Speed: " + speed);
    }

    // Accelerate and Break Methods
    public void accelerate(int x) {
        x += 5;
        System.out.println(make + " " + model + " speed is now " + x + "mpg\n");
    }
    public void accelerate(double x) {
        x += 5;
        System.out.println(make + " " + model + " speed is now " + x + "mpg\n");
    }
    public void brake(int x) {
        x -= 5;
        if (x < 0) {
            speed = 0;
        }
        System.out.println(make + " " + model + " speed is now " + x + "mpg\n");
    }
    public void brake(double x) {
        x -= 5;
        if (x < 0) {
            speed = 0;
        }
        System.out.println(make + " " + model + " speed is now " + x + "mpg\n");
    }
}
