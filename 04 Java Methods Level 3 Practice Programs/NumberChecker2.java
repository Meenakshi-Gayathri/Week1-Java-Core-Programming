import java.util.*;

public class NumberChecker2 {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigitsArray(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    public static boolean isDuckNumber(int num) {
        String str = String.valueOf(num);
        return str.contains("0");
    }

    public static boolean isArmstrongNumber(int num) {
        int[] digits = getDigitsArray(num);
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }
        }
        return new int[]{max1, max2};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < min1) {
                min2 = min1;
                min1 = digit;
            } else if (digit < min2) {
                min2 = digit;
            }
        }
        return new int[]{min1, min2};
    }

    public static void main(String[] args) {
        int num = 153;
        int[] digits = getDigitsArray(num);
        System.out.println(countDigits(num));
        System.out.println(isDuckNumber(num));
        System.out.println(isArmstrongNumber(num));
        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println(largest[0] + " " + largest[1]);
        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println(smallest[0] + " " + smallest[1]);
    }
}