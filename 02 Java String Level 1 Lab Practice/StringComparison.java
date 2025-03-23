import java.util.*;

public class StringComparison {
    public static boolean comparecharat(String str1, String str2) {
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean compareequals(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = input.nextLine();
        System.out.println("Enter the second string:");
        String str2 = input.nextLine();

        System.out.println("Result of comparecharat: " + comparecharat(str1, str2));
        System.out.println("Result of compareequals: " + compareequals(str1, str2));
    }
}
