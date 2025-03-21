import java.util.Scanner;

public class BmiMultiDim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of persons:");
        int number = input.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double weight, height;

            do {
                System.out.println("Enter weight (in kg) for person " + (i + 1) + ":");
                weight = input.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value. Please try again.");
                }
            } while (weight <= 0);

            do {
                System.out.println("Enter height (in cm) for person " + (i + 1) + ":");
                height = input.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value. Please try again.");
                }
            } while (height <= 0);

            personData[i][0] = weight;
            personData[i][1] = height;

            double heightInMeters = height / 100;
            personData[i][2] = weight / (heightInMeters * heightInMeters);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nResults:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
