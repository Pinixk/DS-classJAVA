package Exercise.Exercise_10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise_10_02 {
   public static void main(String[] args) {

      // 양식 정하기
      SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
      SimpleDateFormat df2 = new SimpleDateFormat("입력하신 날짜는 E요일입니다");

      @SuppressWarnings("resource")
      Scanner s1 = new Scanner(System.in);

      Date inDate = null;

      do {
         System.out.println("날짜를 yyyy/MM/dd의 형태로 입렵해주세요(예: 2017/05/11)");

         try {
            System.out.print(">>");
            inDate = df.parse(s1.nextLine());
            break;
         } catch (Exception e) {
         }
      } while (true);

      System.out.println(df2.format(inDate));
   }
}
