import java.util.Scanner;

public class LexicographicalComparison {

    public static void compareStrings(String str1, String str2) {
        int i = 0;
        while (i < str1.length() && i < str2.length()) {
            if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
                return;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
                return;
            }
            i++;
        }
        if (str1.length() < str2.length()) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else if (str1.length() > str2.length()) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
        } else {
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();
        compareStrings(str1, str2);
    }
}
