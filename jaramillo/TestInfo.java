package jaramillo;

public class TestInfo {
    public static void main(String[] args) {

        System.out.println("\nCalling method from another class");
        ParadiseInfo.displayInfo();
        double savings = ParadiseInfo2.computeDiscountInfo(150, 15);
        System.out.println("\nsavings is " + savings + "\n");
    }
    
}
