import java.util.*;

public class LcmGcd{
 
 public static int calculategcd(int num1,int num2){
  while(num2!=0){
	  int temp = num2;
	  num2 = num1%num2;
	  num1=temp;
  }
  return num1;
 }
 public static int calculatelcm(int num1,int num2,int result1){
	 int lcm = (num1*num2)/result1;
	 return lcm;
 }
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int num1 = input.nextInt();
  int num2 = input.nextInt();
  int result1 = calculategcd(num1,num2);
  System.out.println(result1);
  int result2 = calculatelcm(num1,num2,result1);
  System.out.println(result2);
 }
}