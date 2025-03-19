import java.util.Scanner;
import java.util.*;

public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the perimeter of square: ");
        float perimeter = input.nextFloat();
		float side = perimeter/4;
        System.out.println("The length of the side is " + side + 
                           " whose perimeter is " + perimeter);

        input.close();
    }
}
