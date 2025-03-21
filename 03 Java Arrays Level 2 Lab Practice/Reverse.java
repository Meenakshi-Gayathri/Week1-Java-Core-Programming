import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int temp = number; //hold number value
        int count = 0;

        while (temp != 0) {
            count++; //digit count
            temp /= 10; //remove last digit
        }

        int[] digits = new int[count];
        temp = number;
        //reversing the digit
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10; //last digit of number
            temp /= 10; 
        }

        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[i];
        }

        System.out.print("Reversed number: ");
		//iterate through each digit in reversedDigits array
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }
    }
}
