package _06_Date;

import java.util.Calendar;
import java.util.Date;

public class _01_DateCalendar {
  public static void main(String[] args) {

    Date d = new Date();
    System.out.println(d);
    System.out.println(d.getTime());  // 1900년 1월 1일부터

    // get, 값 구하기
    String[] weeks = {"","일","월","화","수","목","금","토"};
    Calendar c = Calendar.getInstance(); // 생성 Method, 싱글턴 패턴
    System.out.println(c.get(Calendar.YEAR));
    System.out.println(c.get(Calendar.MONTH+1));      // 0~11
    System.out.println(c.get(Calendar.DATE));
    System.out.println(c.get(Calendar.DAY_OF_WEEK));  // 1~7
    System.out.println(weeks[c.get(Calendar.DAY_OF_WEEK)]);
    System.out.println(c.get(Calendar.HOUR));
    System.out.println(c.get(Calendar.MINUTE));
    System.out.println(c.get(Calendar.SECOND));
    
    c.set(Calendar.YEAR, 2100); // set, 값 설정하기
  }
}
