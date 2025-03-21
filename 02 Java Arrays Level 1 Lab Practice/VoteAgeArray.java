import java.util.*;
import java.util.Scanner;

public class VoteAgeArray{
 public static void main(String[] args){ 
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the array size: ");
  int size = input.nextInt();
  int[] age = new int[size];
  for(int i=0;i<size;i++){age[i] = input.nextInt();}
  for(int i=0;i<size;i++){
   if(age[i]>=18){System.out.println("The student with the age " +age[i] +" can vote ");}
   else{System.out.println("The student with the age " +age[i] +" cannot vote ");}
   }
 }
}