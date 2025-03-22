import java.util.*;

public class TrianglePark{
 static void perimeter(int a,int b,int c){
  int distance = 5;
  int perimeter = a+b+c;
  double rounds = distance/perimeter;
  System.out.println("The number of rounds is " +rounds);
  
 }
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the sides of the triangle in km");
  int side1 = input.nextInt();
  int side2 = input.nextInt();
  int side3 = input.nextInt();
  perimeter(side1,side2,side3);
 }
}