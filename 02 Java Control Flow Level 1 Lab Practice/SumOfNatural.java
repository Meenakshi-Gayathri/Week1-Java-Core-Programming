import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        
        if(num<0){
		 System.out.println("The number is not a natural number");
		}
        	
		else{
		  sum = num*(num+1)/2;
		  System.out.println(" The sum of " + num + " natural numbers is " + sum);
		}         
    }
}
