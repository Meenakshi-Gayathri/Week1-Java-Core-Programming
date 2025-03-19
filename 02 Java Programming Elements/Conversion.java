import java.util.Scanner;
import java.util.*;

public class Conversion{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the distance in feet: ");
        float feet = input.nextFloat();
		float yards = feet/3;
		float miles = feet/1760;
        System.out.println("The distance given in feet is " + feet + 
                           " and in yards and miles is " + yards + " add " + miles);

        input.close();
    }
}
