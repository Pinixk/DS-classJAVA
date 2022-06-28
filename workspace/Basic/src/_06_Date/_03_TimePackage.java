package _06_Date;

import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class _03_TimePackage {
   public static void main(String[] args) {

      // Calendar => Date
      Calendar cc = Calendar.getInstance();
      cc.set(2022, 5, 28);
      Date d = new Date(cc.getTimeInMillis());
      System.out.println(d);
      // Date => Calendar
      cc.setTime(d);

      // LocalDate, LocalTime, LocalDateTime
      LocalDate date = LocalDate.now();
      System.out.println(date); // 2022-06-28
      @SuppressWarnings("static-access")
      LocalDate localDate = date.of(2100, 6, 1);
      localDate = localDate.plus(1, ChronoUnit.DAYS);
      localDate = localDate.plusDays(1);
      localDate = localDate.minusMonths(1);
      System.out.println(localDate); // 2100-06-01

      LocalTime time = LocalTime.now();
      System.out.println(time); // 10:35:31.376310400
      LocalTime localTime = LocalTime.of(12, 00, 00);
      System.out.println(localTime); // 12:00

      LocalDateTime ldt = LocalDateTime.now();
      System.out.println(ldt); // 2022-06-28T10:35:31.377314
      ldt = LocalDateTime.of(date, time);
      System.out.println(ldt); // 2022-06-28T10:35:31.376310400
   }
}
