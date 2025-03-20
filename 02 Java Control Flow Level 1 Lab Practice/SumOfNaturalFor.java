import java.util.Scanner;

public class SumOfNaturalFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        int num = input.nextInt();
      
        if (num < 1) {
            System.out.println("The number is not a natural number.");
        } else {            
            int sum = num * (num + 1) / 2;
      
            int sumFor = 0, i = 1;
            for(i=1;i<=num;i++) {
                sumFor += i;                
            }
            
            System.out.println("Sum using formula: " + sum);
            System.out.println("Sum using for loop: " + sumFor);
            
            if (sum == sumFor) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is a mismatch in computations.");
            }
        }

        input.close(); 
    }
}
