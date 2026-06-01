

import java.util.Scanner;

/**
 * Exercise 04 - Leap Year Checker
 * Objective:
 * Check whether a given year is a leap year or not.
 */

public class Exercise04_LeapYearChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        scanner.close();
    }
}