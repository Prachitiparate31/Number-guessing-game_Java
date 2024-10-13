import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;

        // Initialize the number of attempts
        int attempts = 0;

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have 6 attempts to guess the number.");

        while (attempts < 6) {
            // Ask the user for their guess
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();

            // Check if the user's guess is valid
            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
                continue;
            }

            // Increment the number of attempts
            attempts++;

            // Check if the user's guess is correct
            if (userGuess == numberToGuess) {
                System.out.println(" Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Your guess is too low. Try again!");
            } else {
                System.out.println("Your guess is too high. Try again!");
            }
        }

        // Check if the user ran out of attempts
        if (attempts == 6) {
            System.out.println("Sorry, you didn't guess the number. The number was " + numberToGuess + ".");
        }

        // Close the Scanner object
        scanner.close();
    }
}