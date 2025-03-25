import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class TimeZone {
    public static void main(String[] args) {
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		ZonedDateTime pst1 = ZonedDateTime.now(ZoneId.ofOffset("GMT", ZoneOffset.of("-08:00")));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println("GMT Time: " + gmt.format(formatter));
        System.out.println("IST Time: " + ist.format(formatter));
        System.out.println("PST Time1: " + pst.format(formatter));
		System.out.println("PST Time2: " + pst1.format(formatter));
    }
}
