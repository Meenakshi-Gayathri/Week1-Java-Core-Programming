import java.util.*;
import java.util.Scanner;

public class LeapYearOps{
	 public static void main(String[] args) {
       int year;
       Scanner input = new Scanner(System.in);
       year = input.nextInt();
	  if(year<1582){System.out.println("Cannot be determined ");}
	  if(year>=1582){
       if(((year%400 == 0) && (year%100 == 0))|| ((year%4 == 0)&& (year%100 != 0))){
	    System.out.println( +year +" is a leap year ");}
       else{
        System.out.println( +year +" is not a leap year ");
        }
	 input.close();}}
}
