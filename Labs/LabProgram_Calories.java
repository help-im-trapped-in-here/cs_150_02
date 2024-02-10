package Labs;

import java.util.Scanner;

public class LabProgram_Calories {
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            // System.out.println("Enter age in years:");
            double age = scnr.nextDouble();

            // System.out.println("Enter weight in pounds:");
            double weight = scnr.nextDouble();

            // System.out.println("Enter heart rate in beats per minute:");
            double heartRate = scnr.nextDouble();

            // System.out.println("Enter time in minutes:");
            double time = scnr.nextDouble();

            // Calculate the average calories burned
            double caloriesBurned = ((age * 0.2757) + (weight * 0.03295) + (heartRate * 1.0781) - 75.4991) * time / 8.368;

            // Output the result with two digits after the decimal point
            System.out.printf("Calories: %.2f calories%n", caloriesBurned);
        }
    }
}
