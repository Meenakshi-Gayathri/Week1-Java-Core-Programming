import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of persons:");
        int number_persons = input.nextInt();

        double[] weight = new double[number_persons];
        double[] height = new double[number_persons];
        double[] BMI = new double[number_persons];

        for (int i = 0; i < number_persons; i++) {
            System.out.println("Enter weight (in kg) and height (in cm) for person " + (i + 1) + ":");
            weight[i] = input.nextDouble();
            height[i] = input.nextDouble();

            // Convert height from cm to meters before BMI calculation
            double heightInMeters = height[i] / 100;
            BMI[i] = weight[i] / (heightInMeters * heightInMeters);

            // Determine weight status
            System.out.print("Person " + (i + 1) + " is: ");
            if (BMI[i] <= 18.4) {
                System.out.println("Underweight");
            } else if (BMI[i] <= 24.9) {
                System.out.println("Normal");
            } else if (BMI[i] <= 39.9) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obese");
            }
        }

        
    }
}
