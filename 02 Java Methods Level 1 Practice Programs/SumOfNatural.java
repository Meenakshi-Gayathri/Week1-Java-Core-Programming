import java.util.*;

public class SumOfNatural{
 static int sum(int number){
  int i,sum=0;
  for(i=1;i<=number;i++){
   sum += i;
  }
  return sum;
  
 }
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int number = input.nextInt();
  int result = sum(number);
  System.out.println(result);
 }
}