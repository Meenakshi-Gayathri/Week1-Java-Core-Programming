import java.util.*;
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        int fee;
		Scanner input = new Scanner(System.in);
		fee = input.nextInt();
		float discountPercent;
		discountPercent = input.nextFloat();
		float discount = discountPercent/100*fee;
		float discounted_fee = fee - discount;
        System.out.println("The discount amount is INR " + discount+ 
                           " and final discounted fee is INR " + discounted_fee);
}
}