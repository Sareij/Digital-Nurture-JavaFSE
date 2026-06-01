import java.util.Random;
import java.util.Scanner;

/**
 * Exercise 10 - Number Guessing Game
 * Objective:
 * Create a game where the user guesses a randomly generated number.
 */

public class Exercise10_NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("===== Number Guessing Game =====");
        System.out.println("Guess a number between 1 and 100");

        do {

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            attempts++;

            if (guess > secretNumber) {

                System.out.println("Too High! Try Again.");

            } else if (guess < secretNumber) {

                System.out.println("Too Low! Try Again.");

            } else {

                System.out.println("Congratulations!");
                System.out.println("You guessed the correct number.");
                System.out.println("Total Attempts: " + attempts);

            }

        } while (guess != secretNumber);

        scanner.close();
    }
}