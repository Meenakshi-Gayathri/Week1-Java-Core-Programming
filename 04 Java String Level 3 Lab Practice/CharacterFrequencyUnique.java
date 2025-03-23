import java.util.Scanner;

public class CharacterFrequencyUnique {

    public static char[] uniqueCharacters(String text) {
        String unique = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }
            if (!found && ch != ' ') {
                unique += ch;
            }
        }
        return unique.toCharArray();
    }

    public static String[][] characterFrequencies(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                freq[ch]++;
            }
        }

        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    public static void displayFrequencies(String[][] freqData) {
        System.out.println("Character | Frequency");
        for (int i = 0; i < freqData.length; i++) {
            System.out.println("   " + freqData[i][0] + "      |    " + freqData[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        String[][] result = characterFrequencies(input);
        displayFrequencies(result);
    }
}
