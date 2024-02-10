import java.util.Scanner;

public class CircleFormulas {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Prompt the user for the double radius value
            System.out.println("Enter the radius: ");
            double radius = input.nextDouble();

            // Calculate and output the diameter of the circle
            double diameter = 2.0 * radius;
            System.out.printf("The diameter of the circle is %.4f%n", diameter);

            // Calculate and output the circumference of the circle
            double circumference = 2.0 * Math.PI * radius;
            System.out.printf("The circumference of the circle is %.4f%n", circumference);

            // Calculate and output the area of the circle
            double area = Math.PI * Math.pow(radius, 2.0);
            System.out.printf("The area of the circle is %.4f%n", area);
        }
    }
}
