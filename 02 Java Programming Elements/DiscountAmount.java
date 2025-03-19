import java.util.*;

public class DiscountAmount{
    public static void main(String[] args) {
        int fee = 125000;
		float discountPercent = 10;
		float discount = discountPercent/100*fee;
		float discounted_fee = fee - discount;
        System.out.println("The discount amount is INR " + discount+ 
                           " and final discounted fee is INR " + discounted_fee);
}
}