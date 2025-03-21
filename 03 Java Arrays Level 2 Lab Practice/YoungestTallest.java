import java.util.*;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
        int[] all_age = new int[3];
        int[] all_height = new int[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age and height for friend " + (i + 1) + ":");
            all_age[i] = input.nextInt();
            all_height[i] = input.nextInt();
        }
        
        int youngest = 0;
        int tallest = 0;
        
        for (int i = 1; i < 3; i++) {
            if (all_age[i] < all_age[youngest]) {
                youngest = i;
            }
            if (all_height[i] > all_height[tallest]) {
                tallest = i;
            }
        }
        
        System.out.println("The youngest friend is Friend " + (youngest + 1) + " with age: " + all_age[youngest]);
        System.out.println("The tallest friend is Friend " + (tallest + 1) + " with height: " + all_height[tallest]);
      
    }
}
