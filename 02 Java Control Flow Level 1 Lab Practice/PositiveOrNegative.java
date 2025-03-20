import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        
        if(num<0){
		 System.out.println("Negative");
		}
        	
		else if(num>0){
		  System.out.println("Positive");
		} 
        else{ System.out.println("Zero");}        
    }
}
