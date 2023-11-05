package jaramillo.Ch3;

import java.util.Scanner;

public class CreateSpaServices {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // creating variables
        String service;
        double price;

        // creating objects
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();

        // first service methods
        System.out.print("Enter service >> ");
        service = input.nextLine();
        System.out.print("Enter price >> ");
        price = input.nextDouble();
        firstService.setServiceDesc(service);
        firstService.setPrice(price);
        
        // second service methods
        input.nextLine();
        System.out.println("Enter service >> ");
        service = input.nextLine();
        System.out.print("Enter price >> ");
        price = input.nextDouble();
        secondService.setServiceDesc(service);
        secondService.setPrice(price);
        
        System.out.println("First service details: ");
        System.out.println(firstService.getServiceDesc() + " $" + firstService.getPrice());

        System.out.println("Second service details: ");
        System.out.println(secondService.getServiceDesc() + " $" + secondService.getPrice());
        
        
        // scanner close
        input.close();
    }
    
}