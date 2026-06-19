import java.util.Scanner;

/**
 * Exercise 21 - Invalid Age Exception Demo
 * Objective:
 * Create and use a custom exception.
 */

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {

        super(message);

    }
}

public class Exercise21_InvalidAgeExceptionDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age < 18) {

                throw new InvalidAgeException(
                        "Age must be 18 or above.");

            }

            System.out.println("You are eligible.");

        } catch (InvalidAgeException e) {

            System.out.println("Exception: " + e.getMessage());

        }

        scanner.close();
    }
}