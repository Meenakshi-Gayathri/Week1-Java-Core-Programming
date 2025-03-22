import java.util.*;

public class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] age = new int[10];
        

        for (int i = 0; i < age.length; i++) {
            age[i] = input.nextInt();
        }

        
        for (int i = 0; i < age.length; i++) {
            System.out.println(canStudentVote(age[i]));
        }
    }
}
