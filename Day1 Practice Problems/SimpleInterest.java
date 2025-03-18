import java .util.*;
import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args){
     double P,T,R,SI;
	 
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the value of P: ");
     P = input.nextDouble();
     System.out.println("Enter the value of T: ");
     T = input.nextDouble();
     System.out.println("Enter the value of R: ");
     R = input.nextDouble();
     SI = (P*T*R)/100;
     System.out.println("  The Simple Interest is " + SI + "  for Principal " + P + " Rate of Interest " + R + " and Time " + T );}}