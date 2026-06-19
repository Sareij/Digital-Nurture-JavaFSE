import java.util.Scanner;

/**
 * Exercise 11 - Factorial Calculator
 * Objective:
 * Calculate the factorial of a number using a for loop.
 */

public class Exercise11_FactorialCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        long factorial = 1;

        if (number < 0) {

            System.out.println("Factorial is not defined for negative numbers.");

        } else {

            for (int i = 1; i <= number; i++) {

                factorial = factorial * i;

            }

            System.out.println("Factorial of " + number + " = " + factorial);

        }

        scanner.close();
    }
}