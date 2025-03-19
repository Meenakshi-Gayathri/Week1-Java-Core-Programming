import java .util.*;
import java.util.Scanner;

public class AtheleteRounds{
    public static void main(String[] args){
     float side1,side2,side3,distance,rounds,perimeter;
	 
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the value of side1: ");
     side1 = input.nextFloat();
     System.out.println("Enter the value of side2: ");
     side2 = input.nextFloat();
	 System.out.println("Enter the value of side3: ");
     side3 = input.nextFloat();
	 System.out.println("Enter the value of distance to run: ");
     distance = input.nextFloat();
     perimeter = side1+side2+side3;
	 rounds = (distance/perimeter);
     System.out.println(" The total number of rounds the athlete will run is " + rounds + " to complete 5km ");}}