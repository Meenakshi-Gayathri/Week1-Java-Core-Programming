import java.util.*;

public class PositiveNegative {

    public static String isPositive(int number) {
        if (number < 0) {
            return "Negative";
        } else {
            return "Positive";
        }
    }

    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            String positivity = isPositive(numbers[i]);
            System.out.print("Number " + numbers[i] + " is " + positivity);

            if (positivity.equals("Positive")) {
                System.out.println(" and " + isEven(numbers[i]));
            } else {
                System.out.println();
            }
        }

        int comparison = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparison == 1) {
            System.out.println("The first element is greater than the last element.");
        } else if (comparison == 0) {
            System.out.println("The first element is equal to the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }
    }
}
