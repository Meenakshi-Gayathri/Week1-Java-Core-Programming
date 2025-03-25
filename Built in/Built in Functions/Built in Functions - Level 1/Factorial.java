import java.util.*;

public class Factorial{
 public static int calculatefactorial(int number){
  if(number>=1){
   return number*calculatefactorial(number-1);} //recursive call
  else{return 1;}
 }
 public static void main(String[] args){ 
  Scanner input = new Scanner(System.in);
  int number = input.nextInt(); 
  System.out.println(calculatefactorial(number));
 }
}