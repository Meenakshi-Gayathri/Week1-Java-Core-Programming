import java.util.Arrays;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt(); //2D array declaration
            }
        }
        
        int[] arr = new int[rows * columns]; //1D array declaration
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[index++] = matrix[i][j]; //Paste the 2D arr elements in 1D arr
            }
        }
        
        System.out.println("Original 2D Array (Matrix):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Converted 1D Array:");
        System.out.println(Arrays.toString(arr)); //to avoid printing the memory ref of array      
    }
}
