import java.util.*;
import java.util.Scanner;


class TravelComputation {
   
   public static void main(String[] args) {

      
      String name, fromCity , viaCity , toCity; 
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the name: ");
	  name = input.nextLine();
      System.out.println("Enter the fromCity: ");
	  fromCity = input.nextLine();
      System.out.println("Enter the viaCity: ");
	  viaCity = input.nextLine();
      System.out.println("Enter the toCity: ");	
      toCity = input.nextLine();	  
      double distanceFromToVia, distanceViaToFinalCity; 
	  System.out.println("Enter the distanceFromToVia: ");	
      distanceFromToVia = input.nextDouble();
	  System.out.println("Enter the distanceViaToFinalCity: ");	
      distanceViaToFinalCity = input.nextDouble();	  
      int timeFromToVia = 4 * 60 + 4;     
      int timeViaToFinalCity = 4 * 60 + 25;
  
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;
     
      int totalTime = timeFromToVia + timeViaToFinalCity;
      
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   }
}
