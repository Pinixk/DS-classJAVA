package _09_thread;

public class _02_SingleThread {
   public static void main(String[] args) {
      long startTime = System.currentTimeMillis(); // 시작

      System.out.println(startTime);

      for (int i = 0; i < 300; i++) {
         System.out.printf("%s", new String("-"));
      }

      System.out.println(System.currentTimeMillis() - startTime); // 중간

      for (int i = 0; i < 300; i++) {
         System.out.printf("%s", new String("|"));
      }
      System.out.println(System.currentTimeMillis() - startTime); // 끝
   }
}
