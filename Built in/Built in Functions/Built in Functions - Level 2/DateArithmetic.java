import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date (dd-MM-yyyy): ");
        String inputDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = modifiedDate.minusWeeks(3);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Original Date: " + date.format(formatter));
        System.out.println("After adding 7 days, 1 month, and 2 years: " + modifiedDate.format(formatter));
        System.out.println("After subtracting 3 weeks: " + finalDate.format(formatter));

        scanner.close();
    }
}
