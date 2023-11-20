/*
Create an Automobile class for a dealership.
Include fields for an ID number, make, model, color, year, vin number, miles per gallon, and speed.
Include get and set methods for each field.
Do not allow the ID to be negative or more than 9999; if it is, set the ID to 0.
Do not allow the year to be earlier than 2000 or later than 2017; if it is, set the year to 0.
Do not allow the miles per gallon to be less than 10 or more than 60; if it is, set the miles per gallon to 0.
Car speed should be initialized as 0.
Include a constructor that accepts arguments for each field value and uses the set methods to assign the values.
Also write two methods, Accelerate () and Brake ().
Whenever Accelerate () is called, increase the speed by 5, and whenever Brake () is called, decrease the speed by 5.
To allow users to specify the speed to increase (or decrease), create two overloading methods for Accelerate () and Brake ()
    that accept a single parameter specifying the increasing (or decreasing) speed.
Write an application that declares several Automobile objects and demonstrates that all the methods work correctly.
Save the files as Automobile.java and TestAutomobiles.java.
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
        if (setId >= 0 & setId <= 9999)  {
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
        year = setYear;
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
        mpg = setMpg;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int setSpeed) {
        speed = setSpeed;
    }
}
