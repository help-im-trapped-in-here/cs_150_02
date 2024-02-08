import java.util.Scanner;

public class BasicInput {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInt;
      double userDouble;
      char userChar;          // FIXME (1): Define char variable
      String userString;      // FIXME (1): Define String variable

      System.out.println("Enter integer:");
      userInt = scnr.nextInt();
      
      // FIXME (1): Finish reading other items into variables, then output the four values on a single line separated by a space
      System.out.println("Enter double:");
      userDouble = scnr.nextDouble();

      System.out.println("Enter character:");
      userChar = scnr.next().charAt(0);

      scnr.nextLine(); // Consume the newline character
      System.out.println("Enter string:");
      userString = scnr.nextLine();

      // Output the four values on a single line separated by a space
      System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);

      // FIXME (2): Output the four values in reverse
      System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);

      // FIXME (3): Cast the double to an integer, and output that integer
      int castedInt = (int) userDouble;
      System.out.println(userDouble + " cast to an integer is " + castedInt);
   }
}
