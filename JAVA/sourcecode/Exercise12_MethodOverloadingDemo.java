/**
 * Exercise 12 - Method Overloading Demo
 * Objective:
 * Demonstrate method overloading in Java.
 */

public class Exercise12_MethodOverloadingDemo {

    // Method with two integers
    public static int add(int num1, int num2) {

        return num1 + num2;

    }

    // Method with two doubles
    public static double add(double num1, double num2) {

        return num1 + num2;

    }

    // Method with three integers
    public static int add(int num1, int num2, int num3) {

        return num1 + num2 + num3;

    }

    public static void main(String[] args) {

        int result1 = add(10, 20);

        double result2 = add(12.5, 7.5);

        int result3 = add(10, 20, 30);

        System.out.println("Sum of Two Integers = " + result1);

        System.out.println("Sum of Two Doubles = " + result2);

        System.out.println("Sum of Three Integers = " + result3);

    }
}