import java.util.*;

public class LeapYearChecker {

    public static String leapYear(int year) {
        if (year < 1582) {
            return "Cannot be determined";
        }
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return year + " is a leap year";
        } else {
            return year + " is not a leap year";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.println(leapYear(year));
    }
}
