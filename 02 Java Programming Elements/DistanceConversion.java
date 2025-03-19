import java.util.*;

public class DistanceConversion {
    public static void main(String[] args) {
        double km;
		Scanner input = new Scanner(System.in);
		km = input.nextInt();
		double miles = km *0.6213745;
        System.out.println("The total miles is " + miles+ 
                           " mile for the given " + km + "km");
}
}