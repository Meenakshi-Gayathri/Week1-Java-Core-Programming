import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if (number < 1) {
            System.out.println("Error");
            return;
        }
        
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];
        int evenIndex = 0, oddIndex = 0;
        
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }
        
        // Trim arrays to the actual size
        evenNumbers = Arrays.copyOf(evenNumbers, evenIndex);
        oddNumbers = Arrays.copyOf(oddNumbers, oddIndex);
        
        // Print arrays in correct format
        System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
        System.out.println("Odd numbers: " + Arrays.toString(oddNumbers));
        
        input.close();
    }
}
