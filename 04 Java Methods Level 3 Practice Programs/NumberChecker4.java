import java.util.*;

public class NumberChecker4 {

    public static int[] getDigitsArray(int num) {
        String numStr = Integer.toString(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int[] reverseArray(int[] digits) {
        int n = digits.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = digits[i];
            digits[i] = digits[n - i - 1];
            digits[n - i - 1] = temp;
        }
        return digits;
    }

    public static boolean isPalindrome(int num) {
        int[] digits = getDigitsArray(num);
        int[] reversed = reverseArray(digits.clone());
        return Arrays.equals(digits, reversed);
    }

    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num)); // Output: true
    }
}
