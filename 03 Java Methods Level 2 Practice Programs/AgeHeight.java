import java.util.*;

public class AgeHeight {

    public static void youngesttallest(int[] age, int[] height) {
        int youngIndex = 0;
        int tallIndex = 0;

        for (int i = 1; i < age.length; i++) {
            if (age[i] < age[youngIndex]) {
                youngIndex = i;
            }

            if (height[i] > height[tallIndex]) {
                tallIndex = i;
            }
        }

        System.out.println(age[youngIndex]);
        System.out.println(height[tallIndex]);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] age = new int[3];
        int[] height = new int[3];

        System.out.println("Enter age and height of 3 people:");
        for (int i = 0; i < 3; i++) {
            
            age[i] = input.nextInt();            
            height[i] = input.nextInt();
        }
        youngesttallest(age, height);
    }
}
