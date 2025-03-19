import java .util.*;
import java.util.Scanner;

public class PersonTotalIncome{
    public static void main(String[] args){
     double salary,bonus,income;
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the salary: ");
     salary = input.nextDouble();
     System.out.println("Enter the bonus: ");
     bonus = input.nextDouble();
	 income = salary + bonus;
     System.out.println("The salary is INR "  +salary +" and bonus is INR " +bonus + ". Hence Total Income is INR " +income );}}