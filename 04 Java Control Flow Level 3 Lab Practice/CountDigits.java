import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class CountDigits{
	 public static void main(String[] args) {
       int number,count=0;
	   Scanner input = new Scanner(System.in);
	   number = input.nextInt();
	   if(number == 0){System.out.println("Enter valid number");}
	   while(number!=0){
	    number = number/10;
		count++;
	   }
	   System.out.println(count);
	}
}
