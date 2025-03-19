import java .util.*;
import java.util.Scanner;

public class IntOperation{
    public static void main(String[] args){
     int a,b,c,op1,op2,op3,op4;
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the value of a: ");
     a = input.nextInt();
     System.out.println("Enter the value of b: ");
     b = input.nextInt();
	 System.out.println("Enter the value of c: ");
     c = input.nextInt();
     op1 = a+b*c;
	 op2 = a*b+c;
	 op3 = c+a/b;
	 op4 = a%b+c;
     System.out.println("The result of each of the operations are " + op1 + " , " + op2  + " , " + op3 + " , " + op4);}}