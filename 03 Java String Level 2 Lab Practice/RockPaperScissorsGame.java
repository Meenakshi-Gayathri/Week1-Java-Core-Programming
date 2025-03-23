
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userWins = 0;
        int computerWins = 0;
        int draws = 0;

        int numberOfGames = scanner.nextInt();
        String[][] results = new String[numberOfGames][3];

        for (int i = 0; i < numberOfGames; i++) {
            String userChoice = scanner.next().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);
            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }
        }

        displayResults(results);
        String[][] stats = getStats(userWins, computerWins, draws, numberOfGames);
        displayStats(stats);
    }

    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] getStats(int userWins, int computerWins, int draws, int totalGames) {
        String[][] stats = new String[3][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100) / totalGames) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf((computerWins * 100) / totalGames) + "%";

        stats[2][0] = "Draws";
        stats[2][1] = String.valueOf(draws);
        stats[2][2] = String.valueOf((draws * 100) / totalGames) + "%";

        return stats;
    }

    public static void displayResults(String[][] results) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }
    }

    public static void displayStats(String[][] stats) {
        System.out.println("\nPlayer\tWins\tPercentage");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }
}

