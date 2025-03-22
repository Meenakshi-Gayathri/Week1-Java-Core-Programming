import java.util.*;

public class NumberChecker3 {

    public static int[] getDigitsArray(int num) {
        String numStr = Integer.toString(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int num) {
        int[] digits = getDigitsArray(num);
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    public static int[][] digitFrequency(int num) {
        int[] digits = getDigitsArray(num);
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }
        for (int digit : digits) {
            freq[digit][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        int num = 21;
        int[] digits = getDigitsArray(num);
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad number: " + isHarshadNumber(num));
        System.out.println("Digit frequency:");
        int[][] freq = digitFrequency(num);
        for (int[] pair : freq) {
            System.out.println(pair[0] + ": " + pair[1]);
        }
    }
}
