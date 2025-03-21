import java.util.Scanner;

public class GradingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        float[] physics = new float[numberOfStudents];
        float[] chemistry = new float[numberOfStudents];
        float[] maths = new float[numberOfStudents];
        float[] percentages = new float[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter marks for Physics for Student " + (i + 1) + ": ");
            physics[i] = input.nextFloat();
            if (physics[i] < 0) {
                System.out.println("Marks cannot be negative. Please re-enter.");
                i--;
                continue;
            }

            System.out.print("Enter marks for Chemistry for Student " + (i + 1) + ": ");
            chemistry[i] = input.nextFloat();
            if (chemistry[i] < 0) {
                System.out.println("Marks cannot be negative. Please re-enter.");
                i--;
                continue;
            }

            System.out.print("Enter marks for Maths for Student " + (i + 1) + ": ");
            maths[i] = input.nextFloat();
            if (maths[i] < 0) {
                System.out.println("Marks cannot be negative. Please re-enter.");
                i--;
                continue;
            }

            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        System.out.println("Physics Chemistry Maths Percentage Grade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(physics[i] + " " + chemistry[i] + " " + maths[i] + " " + percentages[i] + " " + grades[i]);
        }
    }
}
