import java.util.Scanner;

public class ArrayStorage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;        
        
        while (true) {
            if (index == 10) break;
            System.out.print("Enter number: ");
            double userInput = input.nextDouble();
            if (userInput <= 0) break;
            values[index++] = userInput;
        }
        
        System.out.println("Stored numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(values[i] + " ");
            total += values[i];
        }
        System.out.println("\nTotal sum: " + total);
        
        input.close();
    }
}
