import java.util.Scanner;

/**
 * Exercise 03 - Even or Odd Checker
 * Objective:
 * Determine whether a number entered by the user is even or odd.
 */

public class Exercise03_EvenOddChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }

        scanner.close();
    }
}