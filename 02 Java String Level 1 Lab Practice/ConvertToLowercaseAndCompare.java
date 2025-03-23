import java.util.*;

public class ConvertToLowercaseAndCompare {

    public static String convertToLowercase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = in.nextLine();

        String userDefinedLowercase = convertToLowercase(text);
        String builtInLowercase = text.toLowerCase();

        boolean areEqual = compareStrings(userDefinedLowercase, builtInLowercase);

        System.out.println("Lowercase using user-defined method: " + userDefinedLowercase);
        System.out.println("Lowercase using built-in method: " + builtInLowercase);
        System.out.println("Are both results equal? " + areEqual);
    }
}
