import java.util.Scanner;

/**
 * Exercise 05 - Multiplication Table
 * Objective:
 * Print the multiplication table of a number up to 10.
 */

public class Exercise05_MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("\nMultiplication Table of " + number);

        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " x " + i + " = " + (number * i));

        }

        scanner.close();
    }
}