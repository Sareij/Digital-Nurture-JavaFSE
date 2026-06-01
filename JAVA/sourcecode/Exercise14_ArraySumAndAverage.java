import java.util.Scanner;

/**
 * Exercise 14 - Array Sum and Average
 * Objective:
 * Calculate the sum and average of elements in an array.
 */

public class Exercise14_ArraySumAndAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        int sum = 0;
        double average;

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {

            numbers[i] = scanner.nextInt();

            sum += numbers[i];

        }

        average = (double) sum / size;

        System.out.println("Sum = " + sum);

        System.out.println("Average = " + average);

        scanner.close();
    }
}