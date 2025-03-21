import java.util.*;
import java.util.Scanner;

public class FactorArray{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int number = input.nextInt();
  if (number < 1) {
    System.out.println("Error");            
  }
  int maxFactor=10;
  int[] factors = new int[maxFactor];
  int index = 0;
  for(int i=1;i<=number;i++){
   if(number%i==0){
    if(index==maxFactor){
	 maxFactor *= 2;
	 int[] temp = new int[maxFactor];
	 for(int j=0;j<index;j++){
	  temp[j]=factors[j];
	 }
	 factors = temp;
	}
	factors[index++]=i;
   }
  }
   System.out.print("Factors of " + number + ": ");
   System.out.print(Arrays.toString(Arrays.copyOf(factors,index)));        
 }
}