package jaramillo.Ch4;

public class CreatePolicies2{
    public static void main(String[] args) {
        CarInsurancePolicy2 first = new CarInsurancePolicy2(123);
        CarInsurancePolicy2 second = new CarInsurancePolicy2(456, 4);
        CarInsurancePolicy2 third = new CarInsurancePolicy2(789,12, "Newcastle");

  //Display each object, and add closing curly braces for the method and the class:
        first.display(); 
        second.display(); 
        third.display();
    }
}