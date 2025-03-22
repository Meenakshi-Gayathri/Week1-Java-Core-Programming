import java.util.*;

public class SmallestLargest{
 public static int[] findsmallestandlargest(int number1,int number2,int number3){
        int smallest,largest;
        if (number1 <= number2 && number1 <= number3) {
            smallest = number1;
        } else if (number2 <= number1 && number2 <= number3) {
            smallest = number2;
        } else {
            smallest = number3;
        }

        
        if (number1 >= number2 && number1 >= number3) {
            largest = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            largest = number2;
        } else {
            largest = number3;
        }
		return new int[]{smallest, largest};
 } 
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int number1= input.nextInt();
  int number2= input.nextInt();
  int number3= input.nextInt();
  int[] result = findsmallestandlargest(number1, number2, number3);
  System.out.println(result[0]);
  System.out.println(result[1]);
 }
}