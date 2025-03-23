
import java.util.Scanner;

public class CalendarGenerator {

    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", 
                           "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getNumberOfDays(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }

    public static void printCalendar(int month, int year) {
        String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        System.out.println("MONTH: " + getMonthName(month) + " " + year);
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.print("  " + daysOfWeek[i]);
        }
        System.out.println();

        int firstDay = getFirstDayOfMonth(month, year);
        int numberOfDays = getNumberOfDays(month, year);

        for (int i = 0; i < firstDay; i++) {
            System.out.print("     ");
        }

        for (int i = 1; i <= numberOfDays; i++) {
            if (i < 10) {
                System.out.print("    " + i);
            } else {
                System.out.print("   " + i);
            }

            if ((i + firstDay) % 7 == 0 || i == numberOfDays) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        System.out.print("Enter the month: ");
        int month = sc.nextInt();
        printCalendar(month, year);
    }
}

