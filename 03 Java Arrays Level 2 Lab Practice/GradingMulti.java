import java.util.Scanner;

public class GradingMulti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        float[][] marks = new float[numberOfStudents][3];
        float[] percentages = new float[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print("Enter marks for " + subject + " for Student " + (i + 1) + ": ");
                marks[i][j] = input.nextFloat();
                if (marks[i][j] < 0) {
                    System.out.println("Marks cannot be negative. Please re-enter.");
                    j--;
                }
            }

            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

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
            System.out.println(marks[i][0] + " " + marks[i][1] + " " + marks[i][2] + " " + percentages[i] + " " + grades[i]);
        }
    }
}
