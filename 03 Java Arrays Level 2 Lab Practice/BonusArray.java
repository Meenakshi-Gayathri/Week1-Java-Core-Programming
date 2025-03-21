import java.util.*;

public class BonusArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        
        for (int i = 0; i < 10; i++) {
            
                System.out.println("Enter the salary and years of service for employee " + (i + 1) + ":");
                double empSalary = input.nextDouble();
                double empService = input.nextDouble();

                if (empSalary < 0 || empService < 0) {
                    System.out.println("Invalid number - Enter again");
                } else {
                    salary[i] = empSalary;
                    service[i] = empService;
                    
                }
            }
			
        for (int i = 0; i < 10; i++) {
            if (service[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

       
        System.out.println("\nEmployee-wise Details:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n", 
                              (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.println("\nSummary:");
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

       
    }
}
