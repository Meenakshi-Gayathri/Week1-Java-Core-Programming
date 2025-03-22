import java.util.*;

public class Handshake{
 static void numberofshakes(int number){
  int result;
  result = (number*(number-1))/2;
  System.out.println("The number of handshakes is " +result);
  
 }
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the number");
  int number = input.nextInt();
  numberofshakes(number);
 }
}