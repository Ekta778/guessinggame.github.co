import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int maxAttempts = 10;
        int attempts = 0;
        int userGuess;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Guess higher.");
            } else {
                System.out.println("Too high! Guess lower.");
            }

            System.out.println("Attempts left: " + (maxAttempts - attempts));
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you're out of attempts. The number was: " + randomNumber);
        }

        scanner.close();
    }
}







