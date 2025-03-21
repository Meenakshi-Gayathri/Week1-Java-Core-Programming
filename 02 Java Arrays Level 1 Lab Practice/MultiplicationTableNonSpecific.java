import java.util.Scanner;

public class MultiplicationTableNonSpecific {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number for multiplication table: ");
        int number = input.nextInt();
        int[] multiplicationTable = new int[10];
        
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }
        
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }
        
        input.close();
    }
}
