import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = scanner.nextLine();

        char mostFrequentChar = '\0';
        int maxFrequency = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            int frequency = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    frequency++;
                }
            }

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentChar = currentChar;
            }
        }

        if (mostFrequentChar != '\0') {
            System.out.println("The most frequently occurring character is: " + mostFrequentChar);
            System.out.println("It occurs " + maxFrequency + " times.");
        } else {
            System.out.println("No characters found.");
        }
    }
}
