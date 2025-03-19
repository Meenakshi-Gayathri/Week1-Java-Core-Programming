import java .util.*;
import java.util.Scanner;

public class CelsiusResult{
    public static void main(String[] args){
     float celsius,farenheit;
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the value of farenheit: ");
     farenheit = input.nextFloat();
     celsius = (farenheit-32)*5/9;
     System.out.println("The "  +farenheit +" farenheit is " +celsius + " celsius " );}}