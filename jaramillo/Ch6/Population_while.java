/*
1. Assume that the population of Mexico is 121 million and that the population increases 1.05% annually (new population = current population x 1.0105). 
2. Assume that the population of the United States is 315 million and that the population is reduced 0.16% annually (new population = current population x 0.9984) . 
3. Assume that the population of Japan is 127 million and that the population increases 1.01% annually (new population = current population x 1.0101). 
4. Write an application that displays the populations for the three countries every year until both Mexican and Japanese populations pass US population.
5. Display the number of years it took for Mexico’s and Japan’s populations to exceed that of the United States. 
6. Use both while loop and for loop to accomplish the task.
7. Save the two files (one for each type of loop) as Population_while.java and Population_for.java

Zaguate - Please submit the source code for your program along with a word document that includes screen shots of the compiled results and executed output.
*/


package jaramillo.Ch6;

public class Population_while {
    public static void main(String[] args) {
        // fields
        double mexico = 121000000;
        double mexRate = 1.0105;
        double mexPop;
        double usa = 315000000;
        double usaRate = .9984;
        double usaPop;
        double japan = 127000000;
        double japRate = 1.0101;
        double japPop;
        int year = 1;

        // equations
        mexPop = mexico * mexRate;
        usaPop = usa * usaRate;
        japPop = japan * japRate;
        System.out.println("\nYear " + year + "\nUSA Population: " + usaPop + "\nMexico Population: " + mexPop + "\nJapan Population: " + japPop);

        // output
        while (usaPop > mexPop || usaPop > japPop) {            
            mexPop *= mexRate;
            usaPop *= usaRate;
            japPop *= japRate;
            year++;
            System.out.println("\nYear " + year + "\nUSA Population: " + usaPop + "\nMexico Population: " + mexPop + "\nJapan Population: " + japPop);
        }
        
    } 
}