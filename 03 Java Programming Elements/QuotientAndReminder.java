import java .util.*;
import java.util.Scanner;

public class QuotientAndReminder{
    public static void main(String[] args){
     int num1, num2;
     float mod_value,quotient;
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the 1st num: ");
     num1 = input.nextInt();
     System.out.println("Enter the 2nd num: ");
     num2 = input.nextInt();
     mod_value = num1%num2;
     quotient = num1/num2;
     System.out.println("The Quotient is  "+ quotient +" and Reminder is " + mod_value + " of two numbers " + num1 + " and " + num2);}}