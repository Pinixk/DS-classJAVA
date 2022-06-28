package Exercise.Exercise_10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise_10_01 {
   public static void main(String[] args) {
      Calendar cal = Calendar.getInstance();
      cal.set(2020,0,1);

      for (int i = 0; i < 12; i++) {
         int sunday = cal.get(Calendar.DAY_OF_WEEK);
         int secSun = (sunday==1) ? 8 : (16-sunday) ; // 왜 16일까

         cal.set(Calendar.DAY_OF_MONTH, secSun);

         Date d = cal.getTime();

         System.out.println(new SimpleDateFormat("yyyy-MM-dd는 F번째 E요일입니다.").format(d));

         cal.add(Calendar.MONTH, 1);
         cal.set(Calendar.DAY_OF_MONTH,1);
      }
   }
}
