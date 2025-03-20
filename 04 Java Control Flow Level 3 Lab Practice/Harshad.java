import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class Harshad{
	 public static void main(String[] args) {
       int number,sum=0,originalNumber,result=0;
	   Scanner input = new Scanner(System.in);
	   number = input.nextInt();
	   originalNumber = number;
	   while(originalNumber !=0){
	    sum +=originalNumber%10;
		originalNumber/=10;
	   }
	   if(number%sum==0){System.out.println(number + " is a Harshad Number");}
       else{System.out.println(number + " is not a Harshad Number");}
	}
}
