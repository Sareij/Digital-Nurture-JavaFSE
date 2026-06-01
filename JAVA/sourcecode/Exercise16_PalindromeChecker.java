import java.util.Scanner;

/**
 * Exercise 16 - Palindrome Checker
 * Objective:
 * Check whether a string is a palindrome.
 */

public class Exercise16_PalindromeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String cleanedString = input.replaceAll("[^a-zA-Z0-9]", "")
                                    .toLowerCase();

        String reversedString = new StringBuilder(cleanedString)
                                    .reverse()
                                    .toString();

        if (cleanedString.equals(reversedString)) {

            System.out.println("The string is a Palindrome.");

        } else {

            System.out.println("The string is NOT a Palindrome.");

        }

        scanner.close();
    }
}