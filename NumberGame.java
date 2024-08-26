
import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int score = 0;
        int rounds = 0;
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = rand.nextInt(100) + 1;
            int numberOfTries = 0;
            boolean win = false;

            while (win == false && numberOfTries < 10) {
                System.out.println("Guess a number between 1 and 100 (Attempt " + (numberOfTries + 1) + "/10):");
                int guess = input.nextInt();
                numberOfTries++;

                if (guess == numberToGuess) {
                    win = true;
                    score++;
                    System.out.println("Congratulations! You found the number in " + numberOfTries + " tries.");
                } else if (guess < numberToGuess) {
                    System.out.println("Your guess is too low");
                } else if (guess > numberToGuess) {
                    System.out.println("Your guess is too high");
                }
            }

            if (!win) {
                System.out.println("Sorry, you didn't guess the number. The correct answer was " + numberToGuess + ".");
            }

            rounds++;
            System.out.println("Your score: " + score + "/" + rounds + " rounds");
            System.out.println("Play again? (yes/no)");
            playAgain = input.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing! Your final score is " + score + "/" + rounds + " rounds.");
    }
}
