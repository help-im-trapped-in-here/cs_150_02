package Labs;

import java.util.Scanner;

public class LabProgram_DrivingCosts {
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            // System.out.println("Enter car's gas mileage ( miles/gallon): ");
            double mileage = scnr.nextDouble();

            // System.out.println("Enter the cost of gas (dollars/gallon): ");
            double costPerGallon = scnr.nextDouble();

            // Calculate gas cost for 20 miles
            double gasCost20Miles = (20.0 / mileage) * costPerGallon;

            // Calculate gas cost for 75 miles
            double gasCost75Miles = (75.0 / mileage) * costPerGallon;

            // Calculate gas cost for 75 miles
            double gasCost500Miles = (500.0 / mileage) * costPerGallon;

            // Output the results with two digits after the decimal point
            System.out.printf("%.2f %.2f %.2f%n", gasCost20Miles,gasCost75Miles,gasCost500Miles);
        }

        
    }
}
