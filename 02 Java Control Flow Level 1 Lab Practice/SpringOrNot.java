import java.util.Scanner;

public class SpringOrNot {
    public static void main(String[] args) {
        int month,day;
        Scanner input = new Scanner(System.in);
        month = input.nextInt();
		day = input.nextInt();        
        if((month == 3 && day >= 20 && day <= 31)||
          (month == 4 && day >= 1 && day <= 30)  ||  
          (month == 5 && day >= 1 && day <= 31)  ||  
          (month == 6 && day >= 1 && day <= 20)) {
		 System.out.println("It's a Spring Season");
		}
        	
        else{ System.out.println("Not a Spring Season");}        
    }
}
