import java.util.*;
import java.lang.Math;

public class Factors {
    public static int[] findfactor(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result[index++] = i;
            }
        }
        return result;
    }

    public static int sumoffactors(int[] result) {
        int sum = 0;
        for (int factor : result) {
            sum += factor;
        }
        return sum;
    }

    public static long productoffactors(int[] result) {
        long product = 1;
        for (int factor : result) {
            product *= factor;
        }
        return product;
    }

    public static double squareoffactors(int[] result) {
        double squareSum = 0;
        for (int factor : result) {
            squareSum += Math.pow(factor, 2);
        }
        return squareSum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] result = findfactor(number);

        System.out.print("Factors: ");
        for (int factor : result) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Sum of Factors: " + sumoffactors(result));
        System.out.println("Product of Factors: " + productoffactors(result));
        System.out.println("Sum of Squares of Factors: " + squareoffactors(result));
    }
}