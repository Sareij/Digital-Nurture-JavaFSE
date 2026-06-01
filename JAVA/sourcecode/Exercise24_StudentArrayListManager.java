import java.util.ArrayList;
import java.util.Scanner;

/**
 * Exercise 24 - Student ArrayList Manager
 * Objective:
 * Store and display student names using ArrayList.
 */

public class Exercise24_StudentArrayListManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> studentNames = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();

        scanner.nextLine();

        for (int i = 1; i <= count; i++) {

            System.out.print("Enter student name " + i + ": ");
            String name = scanner.nextLine();

            studentNames.add(name);

        }

        System.out.println("\nStudent List:");

        for (String name : studentNames) {

            System.out.println(name);

        }

        scanner.close();
    }
}