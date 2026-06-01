/**
 * Exercise 07 - Type Casting Example
 * Objective:
 * Demonstrate type casting between different data types.
 */

public class Exercise07_TypeCastingDemo {

    public static void main(String[] args) {

        // Double to Int (Narrowing)
        double doubleValue = 99.99;
        int intValue = (int) doubleValue;

        System.out.println("Original Double Value: " + doubleValue);
        System.out.println("After Casting to Int: " + intValue);

        System.out.println();

        // Int to Double (Widening)
        int number = 50;
        double convertedDouble = number;

        System.out.println("Original Int Value: " + number);
        System.out.println("After Casting to Double: " + convertedDouble);

    }
}