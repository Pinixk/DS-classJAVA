package Exercise.Exercise_04;

public class Exercise_04_01 {
  public static void main(String[] args) {

    // 1.
    int x = 15;
    System.out.println(x > 10 && x < 20);

    // 2.
    char ch1=1;
    System.out.println(!(ch1==' ' || ch1=='\t'));

    // 3.
    char ch2 = 'x';
    System.out.println(ch2 == 'x' || ch2 == 'X');

    // 4.
    char ch3=0;
    System.out.println(ch3 >= '0' && ch3 <= '9');

    // 5.
    char ch4 = 'A';
    System.out.println((ch4 >= 'A' && ch4 <= 'Z') || (ch4 >= 'a' && ch4 <= 'z'));

    // 6.
    int year = (int)(Math.random()*100);
    System.out.println(year % 400 == 0 || year % 4 == 0 || year % 100 != 0);

    // 7.
    boolean powerOn = false;
    System.out.println(!powerOn ? "true" : "false");

    // 8.
    String str = "yes";
    System.out.println(str.equals("yes"));

  }
}
