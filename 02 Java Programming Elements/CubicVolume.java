import java.util.*;
import java.lang.Math;

public class CubicVolume{
    public static void main(String[] args) {
        double volume_km,volume_miles;
		double pi = 3.14;
		int r = 6378;
		volume_km = (4/3)*pi*(Math.pow(r,3));
		volume_miles = volume_km * 0.239913;
        System.out.println("The volume of earth in cubic kilometers is " + volume_km+ 
                           " and cubic miles is " + volume_miles);
}
}