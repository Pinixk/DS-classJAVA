package Exercise.Exercise_10;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Exercise_10_01_T {
   public static void main(String[] args) {
      for (int i = 1; i < 12; i++) {

         LocalDate ld = LocalDate.of(2020, i, 1);
         ld = ld.with(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH, 2); // 2번째 주
         ld = ld.with(ChronoField.DAY_OF_WEEK, 7); // 2번째 주의 요일, 월요일이 1

         System.out.println(ld+" / "+ld.getDayOfWeek());

      }
   }
}
