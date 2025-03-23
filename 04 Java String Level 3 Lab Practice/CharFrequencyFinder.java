
import java.util.Scanner;

public class CharFrequencyFinder {

    public static String[][] findFrequencies(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                freq[ch]++;
            }
        }

        boolean[] visited = new boolean[256];
        String[][] result = new String[text.length()][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!visited[ch] && ch != ' ') {
                visited[ch] = true;
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                index++;
            }
        }

        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }

        return finalResult;
    }

    public static void displayFrequencies(String[][] frequencies) {
        System.out.println("Character | Frequency");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("   " + frequencies[i][0] + "      |    " + frequencies[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine().toLowerCase();

        String[][] frequencies = findFrequencies(text);
        displayFrequencies(frequencies);
    }
}

