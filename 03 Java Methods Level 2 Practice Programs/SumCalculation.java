import java.util.*;

public class SumCalculation {

    
    public static int sumrecursion(int number) {
        if (number <= 1) {
            return number;
        }
        return number + sumrecursion(number - 1);
    }

    
    public static int sumformula(int number) {
        return (number * (number + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt(); 
        while(true){
        if (number <= 0) {
            System.out.println("Error: Only natural numbers (greater than 0) are allowed.");
            break;
        }}	
		
        int sumUsingRecursion = sumrecursion(number);
        int sumUsingFormula = sumformula(number);

        System.out.println("Sum using recursion: " + sumUsingRecursion);
        System.out.println("Sum using formula: " + sumUsingFormula);
		
		if(sumUsingRecursion == sumUsingFormula){
		 System.out.println("Both the results are equal");
		}
    }
}
