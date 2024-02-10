package Labs;

import java.util.Scanner;

public class LabProgram_Ints {
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {

            System.out.println("Enter a number between 0 and 1000: ");

            double numToSum = scnr.nextDouble();
            


            // Output the result 
            System.out.printf("The sum of the integers is %.2f", numToSum);

        }
    }
    
}
