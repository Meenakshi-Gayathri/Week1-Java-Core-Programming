import java.util.Scanner;
import java.lang.Math;

public class FactorFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
		if(number>=0){System.out.println("The number is positive");}
        for(int i=1;i<=number;i++){
		 if(number%i==0){
		  System.out.println(i);
		 }
		}
        input.close();
    }
}
