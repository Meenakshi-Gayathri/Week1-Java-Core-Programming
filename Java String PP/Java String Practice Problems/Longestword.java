import java.util.*;

public class Longestword {
    public static String printlongest(String text) {
        int maxlength = 0, currlen = 0;
        String longestword = "", currword = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c != ' ') {
                currlen++;
                currword += c;
            } else {
                if (currlen > maxlength) {
                    maxlength = currlen;
                    longestword = currword;
                }
                currlen = 0;
                currword = "";
            }
        }

        if (currlen > maxlength) {
            longestword = currword;
        }

        return longestword;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = in.nextLine();
        System.out.println("Longest word: " + printlongest(text));
    }
}
