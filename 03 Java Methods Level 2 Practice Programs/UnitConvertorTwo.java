import java.util.*;

public class UnitConvertorTwo {
    
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double kilograms = pounds * 0.453592;
        return kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double pounds = kilograms * 2.20462;
        return pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double liters = gallons * 3.78541;
        return liters;
    }

    public static double convertLitersToGallons(double liters) {
        double gallons = liters * 0.264172;
        return gallons;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        System.out.print("Enter weight in Pounds: ");
        double pounds = input.nextDouble();

        System.out.print("Enter weight in Kilograms: ");
        double kilograms = input.nextDouble();

        System.out.print("Enter volume in Gallons: ");
        double gallons = input.nextDouble();

        System.out.print("Enter volume in Liters: ");
        double liters = input.nextDouble();

        System.out.println("Fahrenheit to Celsius: " + convertFahrenheitToCelsius(fahrenheit));
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(pounds));
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(kilograms));
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(gallons));
        System.out.println("Liters to Gallons: " + convertLitersToGallons(liters));
    }
}
