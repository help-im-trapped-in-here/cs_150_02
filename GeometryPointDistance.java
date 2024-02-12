import java.util.Scanner;

public class GeometryPointDistance {
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {

            // Get four numbers for point coordinates
            double x1 = scnr.nextDouble();
            double y1 = scnr.nextDouble();
            double x2 = scnr.nextDouble();
            double y2 = scnr.nextDouble();

            // Compute distance
            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            // Print distance using printf()
            System.out.printf("Distance between points is: %2.5f\n", distance);
        }
    }
}
