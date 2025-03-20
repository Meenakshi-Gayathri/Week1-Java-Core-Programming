import java.util.Scanner;

public class FirstSmallest {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
	  num3 = input.nextInt();
        String result = (num1<num2 && num1<num3)? "Yes":"No" ; 
                        
        System.out.println("Is the first number the smallest? " + result);
        
    }
}
