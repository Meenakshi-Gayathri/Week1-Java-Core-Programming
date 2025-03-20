import java.util.Scanner;

public class CheckLargest {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
	    num3 = input.nextInt();
        String result1 = (num1>num2 && num1>num3)? "Yes":"No" ; 
		String result2 = (num2>num1 && num2>num3)? "Yes":"No" ; 
		String result3 = (num3>num1 && num3>num2)? "Yes":"No" ; 
                        
        System.out.println("Is the first number the smallest? " + result1);
		System.out.println("Is the second number the smallest? " + result2);
		System.out.println("Is the third number the smallest? " + result3);
        
    }
}
