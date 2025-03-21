import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int[] multiplicationResult = new int[4]; //6 to 9 (no.of values = 4)
        
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (6 + i); //indexing the final value
        }
        
        System.out.println("Multiplication Table of " + number + " from 6 to 9:");
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (6 + i) + " = " + multiplicationResult[i]);
        }
        
        input.close();
    }
}
