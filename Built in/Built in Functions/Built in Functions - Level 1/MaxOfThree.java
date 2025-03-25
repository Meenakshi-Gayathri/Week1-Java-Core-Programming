import java.util.*;

public class MaxOfThree{
 public static int calculateMaximum(int number1,int number2,int number3){
  int max =Math.max(number3, (Math.max(number1,number2)));
  return max;
 }
 public static int calculateMinimum(int number1,int number2,int number3){
  int min =Math.min(number3, (Math.min(number1,number2)));
  return min;
 }
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int number1= input.nextInt();
  int number2= input.nextInt();
  int number3= input.nextInt();
  int result1 = calculateMaximum(number1,number2,number3);
  System.out.println("Maximum = "+ result1);
  int result2 = calculateMinimum(number1,number2,number3);
  System.out.println("Minimum = "+ result2);
 }
}