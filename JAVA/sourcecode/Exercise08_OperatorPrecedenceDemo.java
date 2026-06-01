/**
 * Exercise 08 - Operator Precedence Demo
 * Objective:
 * Demonstrate how Java evaluates expressions using operator precedence.
 */

public class Exercise08_OperatorPrecedenceDemo {

    public static void main(String[] args) {

        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        int result3 = 20 / 4 + 3 * 2;
        int result4 = 8 + 4 / 2 * 3;

        System.out.println("Result 1 = " + result1);
        System.out.println("Result 2 = " + result2);
        System.out.println("Result 3 = " + result3);
        System.out.println("Result 4 = " + result4);

    }
}