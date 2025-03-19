import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the base value: ");
        int base = input.nextInt();

        System.out.print("Enter the height value: ");
        int height = input.nextInt();

        double area = 0.5 * base * height;
        double square_cm = area * 2.54 * 2.54;

        System.out.println("The area of the triangle in square inches is " + area + 
                           " and " + square_cm + " in square centimeters.");

        input.close();
    }
}
