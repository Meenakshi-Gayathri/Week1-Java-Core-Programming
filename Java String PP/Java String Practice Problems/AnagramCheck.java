import java.util.Scanner;

public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            int count1 = 0, count2 = 0;

            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == c) {
                    count1++;
                }
                if (str2.charAt(j) == c) {
                    count2++;
                }
            }

            if (count1 != count2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams of each other.");
        } else {
            System.out.println("The strings are not anagrams of each other.");
        }
    }
}
