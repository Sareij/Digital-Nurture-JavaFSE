import java.util.HashMap;
import java.util.Scanner;

/**
 * Exercise 25 - Student HashMap Manager
 * Objective:
 * Store student IDs and names using HashMap.
 */

public class Exercise25_StudentHashMapManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, String> students = new HashMap<>();

        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {

            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            students.put(id, name);

        }

        System.out.print("\nEnter Student ID to search: ");
        int searchId = scanner.nextInt();

        if (students.containsKey(searchId)) {

            System.out.println("Student Name: " + students.get(searchId));

        } else {

            System.out.println("Student ID not found.");

        }

        scanner.close();
    }
}