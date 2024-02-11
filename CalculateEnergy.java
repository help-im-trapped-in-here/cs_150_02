public class CalculateEnergy {
    public static void main(String[] args) {
       java.util.Scanner scnr = new java.util.Scanner(System.in);

       System.out.println("Enter the amount of water in kilograms: ");
       double m = scnr.nextDouble();

       System.out.println("Enter the initial temperature: ");
       double f = scnr.nextDouble();

       System.out.println("Enter the final temperature: ");
       double i = scnr.nextDouble();

    //    Calculate energy needed to heat water from an initial temperature to a final temperature.
    //    double q;

       System.out.println("The energy needed is "  + m * (i - f) * 4184);
    }
 }
