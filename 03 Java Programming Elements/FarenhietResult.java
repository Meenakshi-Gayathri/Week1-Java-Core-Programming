import java .util.*;
import java.util.Scanner;

public class FarenheitResult{
    public static void main(String[] args){
     float celsius,farenheit;
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the value celsius: ");
     celsius = input.nextFloat();
     farenheit = (celsius*9/5)+32;
     System.out.println("The " + +celsius +" celsius is " +farenheit + " fahrenheit" );}}