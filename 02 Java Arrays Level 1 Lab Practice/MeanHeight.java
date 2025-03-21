import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] height = new double[11]; 
        double sum = 0.0; 
        
        System.out.println("Enter height values:");
        for (int i = 0; i < 11; i++) {
            height[i] = input.nextDouble(); 
            sum += height[i]; 
        }
        
        double mean = sum / 11; 
        System.out.println("Mean height: " + mean); 
        
        
    }
}
