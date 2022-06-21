import java.util.Date;

public class JExercise_04 {
  public static void main(String[] args) {
    // 1번
    // int x = 15;
    // System.out.println(x > 10 && x < 20);
    // char ch = 'x';
    // System.out.println(ch == 'x' || ch == 'X');
    // System.out.println(ch >= '0' && ch <= '9');
    // System.out.println(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z');
    // int year = new Date().getYear();
    // System.out.println(year % 400 == 0 || year % 4 == 0 || year % 100 != 0);
    // boolean powerOn = false;
    // System.out.println(!powerOn?"true":"false");
    // String str = "yes";
    // System.out.println(str.equals("yes"));

    // 2번
    // int num2 = 0;
    // for (int i = 0; i <= 20; i++) {
    //   if(!(i%2==0 || i%3==0)) num2 += i;
    // }
    // System.out.println(num2);

    // 3번
    // int sum = 0;
    // int totalSum = 0;
    // for(int i=1; i<=10; i++){
    //   sum += i;
    //   totalSum += sum;
    // }
    // System.out.println(totalSum);

    // 4번
    int sum = 0;
    for (int i = 0; i <= 150; i++){
      if(i%2==0) sum += i;
      else sum -= i;
      if(sum>=100) System.out.println(sum);
    }
  }
}
