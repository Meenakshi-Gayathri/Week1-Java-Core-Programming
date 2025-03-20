import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class Armstrong{
	 public static void main(String[] args) {
       int number,sum=0,originalNumber,reminder,result=0;
	   Scanner input = new Scanner(System.in);
	   number = input.nextInt();
	   originalNumber = number;
	   while(originalNumber !=0){
	    reminder = originalNumber%10;
		result+=Math.pow(reminder,3);
		originalNumber/=10;
	   }
	   if(result==number){System.out.println(number + " is an Armstrong Number");}
       else{System.out.println(number + " is not an Armstrong Number");}
	}
}
