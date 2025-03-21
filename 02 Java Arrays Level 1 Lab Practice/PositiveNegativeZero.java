import java.util.*;
import java.util.Scanner;

public class PositiveNegativeZero{
 public static void main(String[] args){ 
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the array size: ");
  int size = input.nextInt();
  int[] numbers = new int[size];
  
  for(int i=0;i<size;i++){
   numbers[i] = input.nextInt();
   if(numbers[i]<0){System.out.println("The number is negative " + numbers[i]);}
   else if(numbers[i]>0){System.out.println("The number is positive " + numbers[i]);}
   else{System.out.println("The number is zero " + numbers[i]);}
   }
   
	   if(numbers[0]==numbers[size-1]){System.out.println("The first and the last element are equal ");}
	   else if(numbers[0]>numbers[size-1]){System.out.println("The first element is greater ");}
	   else{System.out.println("The last number is greater ");}
   
 }
}