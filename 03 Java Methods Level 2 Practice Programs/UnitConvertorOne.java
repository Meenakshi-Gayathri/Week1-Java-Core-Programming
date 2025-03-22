import java.util.*;

public class UnitConvertorOne{
public static double convertYardsToFeet(double yards){
 double feet = yards*3;
 return feet;
}
public static double convertFeetToYards(double feet){
 double yards = feet*0.333333;
 return yards;
}
public static double convertMetersToInches(double meters){
 double inches = meters*39.3701;
 return inches;
}
public static double convertInchesToMeters(double inches){
 double meters = inches*0.0254;
 return meters;
}
public static double convertInchesToCm(double inches){
 double cm = inches*2.54;
 return cm;
}

public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 double yards = input.nextDouble();
 double feet = input.nextDouble();
 double meters = input.nextDouble();
 double inches = input.nextDouble();
 
 System.out.println(convertYardsToFeet(yards));
 System.out.println(convertFeetToYards(feet));
 System.out.println(convertMetersToInches(meters));
 System.out.println(convertInchesToMeters(inches));
 System.out.println(convertInchesToCm(inches));
}}