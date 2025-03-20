import java.util.Scanner;

public class SumUntilZeroInfinite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        double total = 0.0,number;
                
        while (true) {
		    System.out.print("Enter another number (Enter 0 to stop): ");
            number = input.nextDouble(); 
            if(number<=0){break;} 
            total += number; 			
        } 
        		
        System.out.println("Total sum: " + total);
        input.close(); 
    }
}
