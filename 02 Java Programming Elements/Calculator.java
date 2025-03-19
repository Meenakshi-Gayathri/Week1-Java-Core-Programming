import java.util.Scanner; 
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1,num2,add,sub,mul,div;
        System.out.print("Enter the 1st number: ");
        num1 = input.nextFloat();
		System.out.print("Enter the 2nd number: ");
        num2 = input.nextFloat();
        add = num1 + num2;
        sub = num1 - num2;		
        mul = num1 * num2;
		div = num1 / num2;
        System.out.println("The addition,subtraction,multiplication and division value of 2 numbers " + num1 + " and " + num2 +
                           " is " + add + " , " + sub +  " , " + mul +  " , " + " and " + div);
        
       
    }
}
