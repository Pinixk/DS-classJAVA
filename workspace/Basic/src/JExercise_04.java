import java.util.Date;

public class JExercise04 {
  public static void main(String[] args) {
    int x = 15;
    System.out.println(x > 10 && x < 20);
    char ch = 'x';
    System.out.println(ch == 'x' || ch == 'X');
    System.out.println(ch >= '0' && ch <= '9');
    System.out.println(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z');
    int year = new Date().getYear();
    System.out.println(year % 400 == 0 || year % 4 == 0 || year % 100 != 0);
    boolean powerOn = false;
    System.out.println(!powerOn?"true":"false");
    String str = "yes";
    System.out.println(str.equals("yes"));
  }
}
