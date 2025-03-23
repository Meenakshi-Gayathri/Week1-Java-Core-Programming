
import java.util.Scanner;

public class ShortestLongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = customSplit(input);
        String[][] wordWithLength = getWordsWithLength(words);
        int[] shortestLongest = findShortestAndLongest(wordWithLength);

        System.out.println("Shortest Word: " + wordWithLength[shortestLongest[0]][0]);
        System.out.println("Longest Word: " + wordWithLength[shortestLongest[1]][0]);
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

    public static int[] findShortestAndLongest(String[][] wordWithLength) {
        int minIdx = 0, maxIdx = 0;
        int minLen = Integer.parseInt(wordWithLength[0][1]);
        int maxLen = minLen;

        for (int i = 1; i < wordWithLength.length; i++) {
            int currentLen = Integer.parseInt(wordWithLength[i][1]);
            if (currentLen < minLen) {
                minLen = currentLen;
                minIdx = i;
            }
            if (currentLen > maxLen) {
                maxLen = currentLen;
                maxIdx = i;
            }
        }
        return new int[] { minIdx, maxIdx };
    }
}

