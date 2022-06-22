public class JExercise_04_01 {
  public static void main(String[] args) {
    // 1번
    int x = 15;
    System.out.println(x > 10 && x < 20);
    char ch = 'x';
    System.out.println(ch == 'x' || ch == 'X');
    System.out.println(ch >= '0' && ch <= '9');
    System.out.println(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z');
    int year = new Date().getYear();
    System.out.println(year % 400 == 0 || year % 4 == 0 || year % 100 != 0);
    boolean powerOn = false;
    System.out.println(!powerOn ? "true" : "false");
    String str = "yes";
    System.out.println(str.equals("yes"));

    // // 8번
    // int value = (int) (Math.random() * 6) + 1;
    // System.out.println("value:" + value);

    // // 9번
    // int num = 12345;
    // int sum = 0;

    // while(num>0){
    // sum += num%10;
    // num /= 10;
    // }
    // System.out.println("sum="+sum);

    // // 10번
    // // 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
    // int answer = (int) (Math.random() * 100) + 1;
    // int input = 0; // 사용자입력을 저장할 공간
    // int count = 0; // 시도횟수를 세기위한 변수

    // // Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
    // java.util.Scanner s = new java.util.Scanner(System.in);

    // do {
    // count++;
    // System.out.print("1과 100사이의 값을 입력하세요 :");
    // input = s.nextInt(); // input . 입력받은 값을 변수 에 저장한다

    // if (answer > input) {
    // System.out.println("더 큰 수를 입력하세요");
    // } else if (answer < input) {
    // System.out.println(" 더 작은 수를 입력하세요");
    // } else {
    // System.out.println("맞췄습니다");
    // System.out.println("시도횟수는" + count + "번입니다");
    // break; // do-while문을 벗어난다
    // }
    // } while (true); // 무한반복문

  }
}
