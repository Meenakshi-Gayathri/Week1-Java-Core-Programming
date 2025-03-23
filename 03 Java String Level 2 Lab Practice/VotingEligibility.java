
import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 10;
        int[] ages = generateRandomAges(numberOfStudents);
        String[][] result = checkVotingEligibility(ages);
        displayResult(result);
    }

    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10;
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        int len = getLength(ages);
        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    public static void displayResult(String[][] data) {
        System.out.println("Age\tCan Vote");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static int getLength(int[] arr) {
        int count = 0;
        try {
            while (true) {
                int val = arr[count];
                count++;
            }
        } catch (Exception e) {}
        return count;
    }
}

