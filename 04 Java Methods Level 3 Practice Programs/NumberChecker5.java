import java.util.*; 

public class NumberChecker5 {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeonNumber(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int num = 9;
        System.out.println(isPrime(num));
        System.out.println(isNeonNumber(num));
    }
}