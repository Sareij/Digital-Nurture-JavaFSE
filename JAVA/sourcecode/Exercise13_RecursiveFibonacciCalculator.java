import java.util.Scanner;

/**
 * Exercise 13 - Recursive Fibonacci Calculator
 * Objective:
 * Calculate the nth Fibonacci number using recursion.
 */

public class Exercise13_RecursiveFibonacciCalculator {

    public static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Number at Position " + n + " = " + fibonacci(n));

        scanner.close();
    }
}