import java .util.*;
import java.util.Scanner;

public class WeightInPounds {
    public static void main(String[] args){
     double weight,pounds;
	 
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the value of weight: ");
     weight = input.nextDouble();
     pounds = weight*2.2;
     System.out.println(" The weight of the person in pound is " + pounds + "  and in kg is " + weight);}}