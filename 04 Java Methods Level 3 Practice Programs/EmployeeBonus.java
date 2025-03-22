import java.util.*;
 
public class EmployeeBonus {
    public static double[][] generateSalaryAndService(int numEmployees) {
        double[][] data = new double[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 10000 + Math.random() * 90000;
            data[i][1] = 1 + Math.random() * 9;
        }
        return data;
    }
    public static double[][] calculateNewSalaryAndBonus(double[][] data) {
        double[][] result = new double[data.length][3];
        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double yearsOfService = data[i][1];
            double bonus = (yearsOfService > 5) ? salary * 0.05 : salary * 0.02;
            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = salary + bonus;
        }
        return result;
    }
    public static void displaySummary(double[][] data) {
        double oldSalarySum = 0, newSalarySum = 0, totalBonus = 0;
        System.out.println("Emp OldSalary Bonus NewSalary");
        for (int i = 0; i < data.length; i++) {
            oldSalarySum += data[i][0];
            totalBonus += data[i][1];
            newSalarySum += data[i][2];
            System.out.println((i + 1) + " " + data[i][0] + " " + data[i][1] + " " + data[i][2]);
        }
        System.out.println("Total " + oldSalarySum + " " + totalBonus + " " + newSalarySum);
    }
    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] salaryAndService = generateSalaryAndService(numEmployees);
        double[][] newSalaries = calculateNewSalaryAndBonus(salaryAndService);
        displaySummary(newSalaries);
    }
}