import java.util.*;

public class ReturnCharacters {
    public static char[] getCharacters(String text) {
        int size = text.length();
        char[] characters = new char[size];
        for (int i = 0; i < size; i++) {
            characters[i] = text.charAt(i);
        }
        return characters;
    }

    public static boolean compareArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string:");
        String text = in.next();

        char[] userDefinedResult = getCharacters(text);
        char[] builtInResult = text.toCharArray();
        boolean areEqual = compareArrays(userDefinedResult, builtInResult);

        System.out.println("Characters from user-defined method: " + Arrays.toString(userDefinedResult));
        System.out.println("Characters from toCharArray() method: " + Arrays.toString(builtInResult));
        System.out.println("Are both arrays equal? " + areEqual);
    }
}
