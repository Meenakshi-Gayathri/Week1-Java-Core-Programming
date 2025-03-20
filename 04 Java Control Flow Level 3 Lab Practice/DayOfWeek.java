import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        int month, date, year;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter month (1-12): ");
        month = input.nextInt();
        System.out.print("Enter day (1-31): ");
        date = input.nextInt();
        System.out.print("Enter year: ");
        year = input.nextInt();
        
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (date + x + (31 * m0) / 12) % 7;
        
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        System.out.println("Day of the week: " + days[d0]);
        
        input.close();
    }
}