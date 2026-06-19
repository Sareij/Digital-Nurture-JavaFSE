import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercise 28 - Stream Even Number Filter
 * Objective:
 * Filter and display even numbers using Stream API.
 */

public class Exercise28_StreamEvenNumberFilter {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers =
                numbers.stream()
                       .filter(number -> number % 2 == 0)
                       .collect(Collectors.toList());

        System.out.println("Original List:");
        System.out.println(numbers);

        System.out.println("\nEven Numbers:");
        System.out.println(evenNumbers);
    }
}