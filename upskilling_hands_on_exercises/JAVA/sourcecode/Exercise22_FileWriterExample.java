import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Exercise 22 - File Writer Example
 * Objective:
 * Write user input to a text file.
 */

public class Exercise22_FileWriterExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        try {

            FileWriter writer = new FileWriter("output.txt");

            writer.write(text);

            writer.close();

            System.out.println("Data has been written to output.txt successfully.");

        } catch (IOException e) {

            System.out.println("Error writing to file: " + e.getMessage());

        }

        scanner.close();
    }
}