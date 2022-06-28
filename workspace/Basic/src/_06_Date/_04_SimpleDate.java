package _06_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _04_SimpleDate {
   public static void main(String[] args) {
      Date d = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat
      ("yyyy-MM-dd hh:mm:ss E");
      // 년도-월-일 시간:분:초 요일
      System.out.println(sdf.format(d)+"요일");
   }
}