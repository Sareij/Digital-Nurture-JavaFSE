import java.util.Scanner;

/**
 * Exercise 15 - String Reversal Tool
 * Objective:
 * Reverse a string entered by the user.
 */

public class Exercise15_StringReversalTool {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder reversedString = new StringBuilder(input);

        reversedString.reverse();

        System.out.println("Reversed String: " + reversedString);

        scanner.close();
    }
}