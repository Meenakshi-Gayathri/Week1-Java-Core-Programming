import java.util.*;

public class ProfitPercent {
    public static void main(String[] args) {
        float costPrice = 129, sellingPrice = 191;
        float profit = sellingPrice - costPrice;
        float profitPercentage = profit / costPrice * 100; 

        System.out.println("The Cost Price in INR " + costPrice + 
                           " and Selling Price is INR " + sellingPrice + "\n" + 
                           "The Profit is INR " + profit + 
                           " and the Profit Percentage is " + profitPercentage);
    }
}
