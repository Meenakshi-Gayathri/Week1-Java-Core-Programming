import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class BMI{
	 public static void main(String[] args) {
       double weight,height,bmi;
	   Scanner input = new Scanner(System.in);
	   weight = input.nextDouble();
	   height = input.nextDouble();
	   height /=100;
	   bmi = weight/Math.pow(height,2);
 	   if(bmi<=18.4){System.out.println(bmi + " Underweight");}
	   else if(bmi<=24.9){System.out.println(bmi + " Normal");}
	   else if(bmi<=39.9){System.out.println(bmi + " Overweight");}
	   else{System.out.println(bmi + " Obese");}
	}
}
