/**  
 *  Program 2a : Draw a right-facing arrow
 *  CS150-1002
 *  02/01/2024
 *  @author Lorenzo Bartolo
*/

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int baseChar = scnr.nextInt();
        int headChar = scnr.nextInt();

        // Print the right-facing arrow
        for (int i = 1; i <= headChar; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(headChar);
            }
            for (int k = 1; k <= headChar; k++) {
                System.out.print(headChar);
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(baseChar);
            }
            System.out.println();
        }

        for (int i = 1; i <= headChar; i++) {
            for (int j = 1; j <= headChar - i; j++) {
                System.out.print(headChar);
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(headChar);
            }
            for (int l = 1; l <= headChar; l++) {
                System.out.print(baseChar);
            }
            System.out.println();
        }
    }
}
