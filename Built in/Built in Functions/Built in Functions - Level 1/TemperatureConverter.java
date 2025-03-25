import java.util.*;

public class TemperatureConverter{
 public static double celtofar(double celcius){
  double fahrenheit = (celcius*9/5)+32;
  return fahrenheit;
 }
 public static double fartocel(double fahrenheit){
  double celcius = (fahrenheit-32)*5/9;
  return celcius;
 }
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the celsius: ");
  double celcius = input.nextDouble();
  System.out.println("Enter the fahrenheit: ");
  double fahrenheit = input.nextDouble();
  System.out.println(celtofar(celcius));
  System.out.println(fartocel(fahrenheit));
 }
}