import java.util.Scanner;

/**
 * Exercise 09 - Student Grade Calculator
 * Objective:
 * Assign grades based on marks entered by the user.
 */

public class Exercise09_StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (0 - 100): ");
        int marks = scanner.nextInt();

        if (marks < 0 || marks > 100) {

            System.out.println("Invalid Marks!");

        } else if (marks >= 90) {

            System.out.println("Grade: A");

        } else if (marks >= 80) {

            System.out.println("Grade: B");

        } else if (marks >= 70) {

            System.out.println("Grade: C");

        } else if (marks >= 60) {

            System.out.println("Grade: D");

        } else {

            System.out.println("Grade: F");

        }

        scanner.close();
    }
}