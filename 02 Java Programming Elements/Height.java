import java.util.Scanner; 

public class Height {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in cm: ");
        double height = input.nextDouble();  

        double feet = height / 30.48;  
        int feetPart = (int) feet;  
        double inches = (height / 2.54);  

        System.out.println("Your Height in cm is " + height + 
                           " while in feet is " + feetPart + " feet " + " and inches is " + String.format("%.2f", inches) + " inches.");
        
       
    }
}
