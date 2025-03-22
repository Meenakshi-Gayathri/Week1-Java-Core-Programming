import java.util.*;
import java.lang.Math;

public class QuotientRemainder{
    public static int[] findRemainderAndQuotient(int number1, int number2) 

{
        int quotient = number1/number2;
        int moduli = number1%number2;
        return new int[] {quotient,moduli};		
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number 1");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
        int[] result = findRemainderAndQuotient(number1, number2); 
        System.out.println("The quotient is " +result[0]);
		System.out.println("The moduli is " +result[1]);
    }
}
