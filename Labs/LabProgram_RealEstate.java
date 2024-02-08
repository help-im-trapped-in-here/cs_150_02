package Labs;
import java.util.Scanner;

public class LabProgram_RealEstate {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int currentPrice;
        int lastMonthsPrice;
        double priceChange;
        double estimatedMortgage;

        currentPrice = scnr.nextInt();
        lastMonthsPrice = scnr.nextInt();

        // Calculate the change in price
        priceChange = (double) (currentPrice - lastMonthsPrice);

        // Estimate the monthly mortgage
        estimatedMortgage = (double) (currentPrice * 0.00425);

        // Output the results
        System.out.printf("This house is $%d. The change is $%.0f since last month.%n", currentPrice, priceChange);
        System.out.printf("The estimated monthly mortgage is $%.1f.%n", estimatedMortgage); 


    }
}
