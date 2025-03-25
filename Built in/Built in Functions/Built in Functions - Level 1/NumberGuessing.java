import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {

    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");
        System.out.println("Provide feedback: type 'high' if my guess is too high, 'low' if it's too low, and 'correct' if I got it right.");

        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            int guess = generateGuess(low, high, random);
            System.out.println("Is your number " + guess + "?");

            String feedback = getUserFeedback(sc);

            switch (feedback) {
                case "high":
                    high = guess - 1;
                    break;
                case "low":
                    low = guess + 1;
                    break;
                case "correct":
                    System.out.println("Yay! I guessed your number!");
                    guessedCorrectly = true;
                    break;
                default:
                    System.out.println("Invalid input. Please type 'high', 'low', or 'correct'.");
            }

            if (low > high) {
                System.out.println("Something seems off with the feedback. Are you sure you followed the rules?");
                break;
            }
        }

        sc.close();
    }

    public static int generateGuess(int low, int high, Random random) {
        return random.nextInt(high - low + 1) + low;
    }

    public static String getUserFeedback(Scanner sc) {
        System.out.print("Your feedback: ");
        return sc.nextLine().trim().toLowerCase();
    }

    public static void main(String[] args) {
        guessingNumberGame();
    }
}
