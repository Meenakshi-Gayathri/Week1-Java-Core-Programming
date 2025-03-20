import java.util.*;
import java.util.Scanner;

public class PrimeOrNot{
	 public static void main(String[] args) {
       int number,i;
	   boolean is_prime = true;
       Scanner input = new Scanner(System.in);
       number = input.nextInt();
	   if(number==0 || number==1){is_prime = false;}
	   else{for(i=2;i<=number/2;++i){
	    if(number%i==0){
		 is_prime = false;
		 break;
	   }}
	   if(is_prime){System.out.println(number + " is a prime number ");}
	   else{System.out.println(number + " is not a prime number ");}
	   }
	}
}
