import java.util.Scanner;

public class SumOfNaturalWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        int num = input.nextInt();
      
        if (num < 1) {
            System.out.println("The number is not a natural number.");
        } else {            
            int sum = num * (num + 1) / 2;
      
            int sumWhile = 0, i = 1;
            while (i <= num) {
                sumWhile += i;
                i++;
            }
            
            System.out.println("Sum using formula: " + sum);
            System.out.println("Sum using while loop: " + sumWhile);
            
            if (sum == sumWhile) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is a mismatch in computations.");
            }
        }

        input.close(); 
    }
}
