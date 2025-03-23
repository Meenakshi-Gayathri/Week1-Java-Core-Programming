import java.util.Scanner;

public class BMICalculator {

    public static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal weight";
        } else if (bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static String[][] computeBMI(double[][] data) {
        String[][] results = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;
            double bmi = weight / (heightM * heightM);
            String status = getStatus(bmi);

            results[i][0] = String.format("%.2f", heightCm);
            results[i][1] = String.format("%.2f", weight);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }
        return results;
    }

    public static void displayBMIResults(String[][] bmiResults) {
        for (int i = 0; i < bmiResults.length; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height(cm): " + bmiResults[i][0]);
            System.out.println("Weight(kg): " + bmiResults[i][1]);
            System.out.println("BMI:        " + bmiResults[i][2]);
            System.out.println("Status:     " + bmiResults[i][3]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) and height (cm) for person " + (i + 1) + ":");
            data[i][0] = input.nextDouble();
            data[i][1] = input.nextDouble();
        }

        String[][] bmiResults = computeBMI(data);
        displayBMIResults(bmiResults);
    }
}