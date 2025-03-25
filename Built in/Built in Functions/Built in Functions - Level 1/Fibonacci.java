import java.util.*;

public class Fibonacci{
 public static void calculatefibo(int testcase){
  int num1=0;
  int num2=1;
  for(int i=0;i<testcase;i++){
   System.out.print(num1 + " ");
   int num3 = num1+num2;
   num1=num2;
   num2=num3;   
  }
 }
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int testcase = input.nextInt();
  calculatefibo(testcase);
  
 }
}