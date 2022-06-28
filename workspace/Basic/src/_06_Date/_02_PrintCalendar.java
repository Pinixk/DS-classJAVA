package _06_Date;

import java.util.Calendar;
import java.util.Scanner;

public class _02_PrintCalendar {
  public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner s = new Scanner(System.in);
    System.out.println();
    System.out.println("달력 출력 프로그램입니다.(종료는 q,Q)");

    do {
      System.out.println();
      System.out.print("원하는 달력의 연도와 월을 입력하시오(예 2022 06)");
      String input = s.nextLine();
      String[] arr = input.split(" ");
      // 종료
      if (input.equalsIgnoreCase("q")) {
        System.out.println("Bye");
        System.exit(-1);
      }

      // 입력값이 2개가 아닐 때
      if (arr.length != 2) {
        System.out.println("연도와 월을 띄워서 입력하세요.(예 2022 06)");
        continue;
      }

      // 입력값이 숫자가 아닐 때
      int year = 0;
      int month = 0;
      try {
        year = Integer.parseInt(arr[0]);
        month = Integer.parseInt(arr[1]);
      } catch (Exception e) {
        System.out.println("연도와 월을 띄워서 입력하세요.(예 2022 06)");
        continue;
      }

      // 달력 뽑기
      Calendar startDay = Calendar.getInstance();
      Calendar endDay = Calendar.getInstance();
      startDay.set(year, month - 1, 1);
      endDay.set(year, month, 1);
      endDay.add(Calendar.DATE, -1);

      final int EDAY = endDay.get(Calendar.DATE);
      final int SDAY = startDay.get(Calendar.DAY_OF_WEEK);

      System.out.println();
      System.out.println("      " + year + "년 " + month + "월");
      System.out.println(" SU MO TU WE TH FR SA");

      int cnt = 0;
      for (int i = 1; i < SDAY; i++) {
        System.out.printf("%s", "   ");
        cnt++;
      }
      for (int i = 1; i <= EDAY; i++) {
        if (cnt++ % 7 == 0) {
          if (cnt > 7)
            System.out.println();
        }
        System.out.printf("%3d", i);
      }
      System.out.println();

    } while (true);
  }
}
