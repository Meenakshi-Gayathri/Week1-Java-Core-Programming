
import java.util.Scanner;

public class ManualTrim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int[] bounds = findTrimBounds(input);
        String trimmed = customSubstring(input, bounds[0], bounds[1]);
        String builtInTrim = input.trim();
        boolean isEqual = compareStrings(trimmed, builtInTrim);

        System.out.println("Custom Trimmed: \"" + trimmed + "\"");
        System.out.println("Built-in Trimmed: \"" + builtInTrim + "\"");
        System.out.println("Match: " + isEqual);
    }

    public static int[] findTrimBounds(String str) {
        int len = getLength(str);
        int start = 0;
        int end = len - 1;

        while (start < len && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end };
    }

    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        int len1 = getLength(str1);
        int len2 = getLength(str2);
        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }
}

