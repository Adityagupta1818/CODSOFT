import java.util.*;

public class GAME{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1; // random between 1-100
        int attempts = 0;
        int guess = 0;
        int maxAttempts = 7; // you can change

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100. You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (guess != numberToGuess) {
            System.out.println("Out of attempts! The correct number was " + numberToGuess);
        }

        sc.close();
    }
}