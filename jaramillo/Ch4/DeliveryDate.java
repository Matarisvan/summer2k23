package jaramillo.Ch4;
import java.time.*;
import java.util.Scanner;

public class DeliveryDate {
    public static void main(String[] args) {
        
        // imported packages
        Scanner input = new Scanner(System.in);
        LocalDate orderDate;
        
        // declaring variables
        int mes;
        int dia;
        int ano;
        final int semanaParaEnvio = 2;
        
        // output
        System.out.print("\nTe vamos a ordenar una pinche mugre\nEn cual mes lo quieres? ");
        mes = input.nextInt();
        System.out.print("Y en cual dia? ");
        dia = input.nextInt();
        System.out.print("Y en cual pinche ano? ");
        ano = input.nextInt();
        orderDate = LocalDate.of(ano, mes, dia);
        System.out.println("El dia en que tu ordenaste es: " + orderDate + "\nTe llegara el pinche " + orderDate.plusWeeks(semanaParaEnvio) + "\n");

        input.close();
    }
    
}
