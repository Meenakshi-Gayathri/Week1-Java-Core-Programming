import java.util.Scanner;
import java.lang.Math;

public class TallestYoungest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int age1 = input.nextInt();
        int age2 = input.nextInt();
        int age3 = input.nextInt();
		float h1 = input.nextFloat();
		float h2 = input.nextFloat();
		float h3 = input.nextFloat();
		int youngestAge = Math.min(age1, Math.min(age2, age3));
        float tallestHeight = Math.max(h1, Math.max(h2, h3));

        String youngestFriend = (youngestAge == age1) ? "Amar" : (youngestAge == age2) ? "Akbar" : "Anthony";
        String tallestFriend = (tallestHeight == h1) ? "Amar" : (tallestHeight == h2) ? "Akbar" : "Anthony";

        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
        input.close();
    }
}
