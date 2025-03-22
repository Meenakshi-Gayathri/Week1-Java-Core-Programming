import java.util.*;

public class SpringSeason{
 static boolean checkdate(int month,int day){
  if((month == 3 && day >= 20 && day <= 31)||
          (month == 4 && day >= 1 && day <= 30)  ||  
          (month == 5 && day >= 1 && day <= 31)  ||  
          (month == 6 && day >= 1 && day <= 20)) {
		 return true;
		}
        	
  else{ return false;}        
 
 }
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the month");
  int month = input.nextInt();
  System.out.println("Enter the day");
  int day = input.nextInt();
  checkdate(month,day);
 if (checkdate(month, day)) {
            System.out.println("It's a Spring Season");
 } else {
            System.out.println("Not a Spring Season");
        }  
 }
}