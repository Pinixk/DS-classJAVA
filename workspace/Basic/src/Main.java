public class Main {
   public static void main(String[] args) {
     
      int answer = (int)(Math.random()*100)+1;
      int input = 0;
      int count = 0;

      java.util.Scanner s = new java.util.Scanner(System.in);

      do {
         count++;
         System.out.println("1과 100사이 값을 입력하세요 :");
         input = s.nextInt();

         if(input>answer) System.out.println("값이 큽니다");
         else if(input<answer) System.out.println("값이 작습니다");
         else if(input==answer) {
            System.out.println("맞았습니다"); 
            System.out.println("시도 횟수는"+count+"번 입니다");
            break;
         }

      } while (true);
   }
}