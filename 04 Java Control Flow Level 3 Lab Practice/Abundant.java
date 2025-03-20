import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class Abundant{
	 public static void main(String[] args) {
       int number,sum=0;
	   Scanner input = new Scanner(System.in);
	   number = input.nextInt();
	   for(int i=1;i<number;i++){
	    if(number%i==0){
		 sum = sum+i;
		}
	   }
	   if(sum>number){System.out.println(number + " is an Abundant Number");}
       else{System.out.println(number + " is not an Abundant Number");}
	}
}
