import java.util.*;
import java.lang.Math;

public class WindChill {
    public static double[] calculateWindChill(double temperature, double windSpeed)
{
      double wind_chill = 35.74 + 0.6215 * temperature +  (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
	  return new double[] {wind_chill}; 
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperature = input.nextDouble();
        double windSpeed = input.nextDouble();
        double[] result = calculateWindChill(temperature, windSpeed);
        System.out.println("The wind chill is " + Arrays.toString(result));
        
    }
}
