import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        num = input.nextInt();
             
        String result = (num % 5 == 0) ? "Yes" : "No";
                
        System.out.println("Is the number " + num + " divisible by 5? " + result);
        
    }
}
