import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Exercise 27 - Lambda Sorting Example
 * Objective:
 * Sort a list of strings using a lambda expression.
 */

public class Exercise27_LambdaSortingExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Sai");
        names.add("Arun");
        names.add("Priya");
        names.add("Karthik");
        names.add("Divya");

        System.out.println("Before Sorting:");
        System.out.println(names);

        Collections.sort(names, (name1, name2) -> name1.compareTo(name2));

        System.out.println("\nAfter Sorting:");
        System.out.println(names);

    }
}