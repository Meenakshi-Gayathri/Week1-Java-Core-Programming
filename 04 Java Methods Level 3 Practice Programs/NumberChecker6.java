import java.util.*;

public class NumberChecker6 {

    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int num) {
        int[] factors = findFactors(num);
        int sum = 0;
        for (int factor : factors) {
            if (factor != num) {
                sum += factor;
            }
        }
        return sum == num;
    }

    public static boolean isAbundantNumber(int num) {
        int[] factors = findFactors(num);
        int sum = 0;
        for (int factor : factors) {
            if (factor != num) {
                sum += factor;
            }
        }
        return sum > num;
    }

    public static boolean isDeficientNumber(int num) {
        int[] factors = findFactors(num);
        int sum = 0;
        for (int factor : factors) {
            if (factor != num) {
                sum += factor;
            }
        }
        return sum < num;
    }

    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 28;
        int[] factors = findFactors(num);
        System.out.println("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println("\nSum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));
        System.out.println("Is Perfect Number: " + isPerfectNumber(num));
        System.out.println("Is Abundant Number: " + isAbundantNumber(num));
        System.out.println("Is Deficient Number: " + isDeficientNumber(num));
        System.out.println("Is Strong Number: " + isStrongNumber(num));
    }
}