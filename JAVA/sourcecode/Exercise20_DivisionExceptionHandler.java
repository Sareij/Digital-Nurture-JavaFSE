import java.util.Scanner;

/**
 * Exercise 20 - Division Exception Handler
 * Objective:
 * Handle division by zero using try-catch.
 */

public class Exercise20_DivisionExceptionHandler {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter first integer: ");
            int number1 = scanner.nextInt();

            System.out.print("Enter second integer: ");
            int number2 = scanner.nextInt();

            int result = number1 / number2;

            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {

            System.out.println("Error: Division by zero is not allowed.");

        }

        scanner.close();
    }
}