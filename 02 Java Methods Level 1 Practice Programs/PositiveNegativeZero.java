import java.util.*;

public class PositiveNegativeZero{
 static int check(int number){
  if(number<0){return -1;}
  else if(number==0){return 1;}
  else{return 0;}  
 }
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the number");
  int number = input.nextInt();
  check(number);
  if (number == -1) {System.out.println("The number is negative.");}
  else if (number == 0) {System.out.println("The number is zero.");}
  else {System.out.println("The number is positive.");}
        
 }
}