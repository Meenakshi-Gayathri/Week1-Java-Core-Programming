
import java.util.Scanner;

public class WordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = customSplit(input);
        String[][] wordWithLength = getWordsWithLength(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < wordWithLength.length; i++) {
            int len = Integer.parseInt(wordWithLength[i][1]);
            System.out.println(wordWithLength[i][0] + "\t" + len);
        }
    }

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] customSplit(String text) {
        int len = getLength(text);
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }

        int[] indexes = new int[spaceCount + 2];
        indexes[0] = -1;
        int idx = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                indexes[idx++] = i;
            }
        }
        indexes[idx] = len;

        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = indexes[i] + 1; j < indexes[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int len = getLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }
        return result;
    }
}

