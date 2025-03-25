import java.util.*;

public class PrimeNumberChecker {
    public static String primeCheck(int number) {
        if (isPrime(number)) {
            return "Prime";
        } else {
            return "Not Prime";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        String result = primeCheck(number); 
        System.out.println(result);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
