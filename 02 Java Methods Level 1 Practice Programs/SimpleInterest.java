import java.util.*;

public class SimpleInterest{
 static void calculateSimpleInterest(){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the principal amount");
  int principal = input.nextInt();
  System.out.println("Enter the time");
  int time = input.nextInt();
  System.out.println("Enter the rate of interest");
  int rate = input.nextInt();
  int simpleinterest = (principal*rate*time)/100;
  System.out.println("The Simple Interest is " +simpleinterest + " for Principal " +principal +" Rate of Interest " +rate + " and Time " +time);
 }
 public static void main(String[] args){
  calculateSimpleInterest();
 }
}