import java.util.Scanner;

public class RemoveCharacter {
    public static String removeChar(String text, char toRemove) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != toRemove) {
                result += text.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String text = scanner.nextLine();

        System.out.println("Enter the character to remove:");
        char toRemove = scanner.next().charAt(0);

        String modifiedString = removeChar(text, toRemove);
        System.out.println("Modified String: " + modifiedString);
    }
}
