import java.util.Scanner;

public class SubstringOccurrences {
    public static int countOccurrences(String text, String substring) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String text = scanner.nextLine();

        System.out.println("Enter the substring to count:");
        String substring = scanner.nextLine();

        int occurrences = countOccurrences(text, substring);
        System.out.println("The substring occurs " + occurrences + " times.");
    }
}
