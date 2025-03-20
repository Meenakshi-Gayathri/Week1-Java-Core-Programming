import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println("No greatest factor exists for " + number);
        } else {
            int greatestFactor = 1;
            int i = number - 1;

            while (i >= 1) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
                i--;
            }

            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }
        
        input.close();
    }
}
