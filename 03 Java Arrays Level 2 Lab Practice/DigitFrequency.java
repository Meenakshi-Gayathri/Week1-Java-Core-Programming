import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		int[] frequency = new int[10];
		while(number!=0){
		 int digit = number%10;
		 frequency[digit]++;
		 number = number/10;
		}
		System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { 
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
        
    }
}
