import java.util.Scanner;

public class FactorialWhile {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);       
        int num = input.nextInt();        
        int factorial = 1,i=1;
        while(i<=num)
        {
		 factorial *= i;
		 i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}