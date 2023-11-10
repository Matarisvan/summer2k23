package jaramillo.Ch4;

public class CarInsurancePolicy2 {
    // fields
    private int policyNumber;
    private int numPayments;
    private String residentCity;

    // New constructor that requires parameters for a 3 fields.
    public CarInsurancePolicy2(int num, int payments, String city){
        policyNumber = num;
        numPayments = payments;
        residentCity = city;
    }

    // Suppose the agency that sells car insurance policies is in the city of Mayfield. 
    //Create a two-parameter constructor that requires only a policy number and the number of payments. 
    //This constructor assigns Mayfield to residentCity.
    public CarInsurancePolicy2(int num, int payments) {
        policyNumber = num; 
        numPayments = payments; 
        residentCity = "Mayfield";
    }
    //Add a third constructor that requires only a policy number parameter. This constructor uses the default values of 
    //two annual payments and Mayfield as the resident city. (Later in this chapter, you will learn how to eliminate the duplicated assignments in these constructors.)
    public CarInsurancePolicy2(int num) {
        this(num, 2);
    }
    //Add a display() method that outputs all the insurance policy data:
    public void display(){
        System.out.println("Policy #" + policyNumber + ". " + numPayments + " payments annually. Driver resides in " + residentCity + ".");}

}