import java.util.*;

public class UnitConvertor{
public static double convertKmToMiles(double km){
 double miles = km*0.621371;
 return miles;
}
public static double convertMilesToKm(double miles){
 double km = miles*1.60934;
 return km;
}
public static double convertMetersToFeet(double meters){
 double feet = meters*3.28084;
 return feet;
}
public static double convertFeetToMeters(double feet){
 double meters = feet*0.3048;
 return meters;
}

public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 double km = input.nextDouble();
 double miles = input.nextDouble();
 double meters = input.nextDouble();
 double feet = input.nextDouble();
 System.out.println(convertKmToMiles(km));
 System.out.println(convertMilesToKm(miles));
 System.out.println(convertMetersToFeet(meters));
 System.out.println(convertFeetToMeters(feet));
}}