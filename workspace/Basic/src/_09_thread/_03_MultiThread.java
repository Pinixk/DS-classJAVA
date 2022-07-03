package _09_Thread;

public class _03_MultiThread {
   static long startTime = 0;
   public static void main(String[] args) {
      ThreadMulti t = new ThreadMulti();
      t.start();
      startTime = System.currentTimeMillis();

      for (int i = 0; i < 300; i++) {
         System.out.printf("%s", new String("-"));
      }

      System.out.println("소요시간1: "+(System.currentTimeMillis()-startTime));
   }
}

class ThreadMulti extends Thread {
   @Override
   public void run() {
      for (int i = 0; i < 300; i++) {
         System.out.printf("%s", new String("|"));
         System.out.println("소요시간2: "
               + (System.currentTimeMillis() - _03_MultiThread.startTime));
      }
   }
}
