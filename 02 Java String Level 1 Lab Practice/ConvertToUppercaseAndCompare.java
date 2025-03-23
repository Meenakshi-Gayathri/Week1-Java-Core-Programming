import java.util.*;

public class ConvertToUppercaseAndCompare {

    public static String convertToUppercase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
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

        String userDefinedUppercase = convertToUppercase(text);
        String builtInUppercase = text.toUpperCase();

        boolean areEqual = compareStrings(userDefinedUppercase, builtInUppercase);

        System.out.println("Uppercase using user-defined method: " + userDefinedUppercase);
        System.out.println("Uppercase using built-in method: " + builtInUppercase);
        System.out.println("Are both results equal? " + areEqual);
    }
}
