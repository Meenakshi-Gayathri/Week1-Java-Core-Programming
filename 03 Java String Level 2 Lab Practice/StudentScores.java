
import java.util.Scanner;

public class StudentScores {

    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 10 + (int)(Math.random() * 90);
            scores[i][1] = 10 + (int)(Math.random() * 90);
            scores[i][2] = 10 + (int)(Math.random() * 90);
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100) / 100.0;
            results[i][2] = Math.round(percentage * 100) / 100.0;
        }
        return results;
    }

    public static String[] assignGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double perc = results[i][2];
            if (perc >= 80) {
                grades[i] = "A";
            } else if (perc >= 70) {
                grades[i] = "B";
            } else if (perc >= 60) {
                grades[i] = "C";
            } else if (perc >= 50) {
                grades[i] = "D";
            } else if (perc >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Stu Physics Chemistry Math Total Average Percentage Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + " " +
                scores[i][0] + " " +
                scores[i][1] + " " +
                scores[i][2] + " " +
                results[i][0] + " " +
                results[i][1] + " " +
                results[i][2] + " " +
                grades[i]
            );
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        String[] grades = assignGrades(results);
        displayScorecard(scores, results, grades);
    } }

