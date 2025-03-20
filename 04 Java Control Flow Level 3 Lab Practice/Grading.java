import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        float Physics, Chemistry, Maths, Average_percent;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter marks for Physics: ");
        Physics = input.nextFloat();
        System.out.print("Enter marks for Chemistry: ");
        Chemistry = input.nextFloat();
        System.out.print("Enter marks for Maths: ");
        Maths = input.nextFloat();
        
        Average_percent = (Physics + Chemistry + Maths) / 3;
        
        System.out.println("Average Percentage: " + Average_percent);
        
        if (Average_percent >= 80) {
            System.out.println("Grade: A");
            System.out.println("Level 4, above agency-normalized standards");
        } else if (Average_percent >= 70) {
            System.out.println("Grade: B");
            System.out.println("Level 3, at agency-normalized standards");
        } else if (Average_percent >= 60) {
            System.out.println("Grade: C");
            System.out.println("Level 2, below but approaching agency-normalized standards");
        } else if (Average_percent >= 50) {
            System.out.println("Grade: D");
            System.out.println("Level 1, well below agency-normalized standards");
        } else if (Average_percent >= 40) {
            System.out.println("Grade: E");
            System.out.println("Level 1-, above agency-normalized standards");
        } else {
            System.out.println("Grade: R");
            System.out.println("Remedial standards");
        }     
       
    }
}
