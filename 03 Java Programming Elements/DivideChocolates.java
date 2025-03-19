import java .util.*;
import java.util.Scanner;

public class DivideChocolates{
    public static void main(String[] args){
     int  numberOfchocolates, numberOfChildren,count,remaining;
	 
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the value of chocolates: ");
     numberOfchocolates = input.nextInt();
     System.out.println("Enter the value of children: ");
     numberOfChildren = input.nextInt();
	 count = numberOfchocolates/numberOfChildren;
	 remaining = numberOfchocolates % numberOfChildren;
     System.out.println(" The number of chocolates each child gets is " + count + " and the number of remaining chocolates are " + remaining);}}