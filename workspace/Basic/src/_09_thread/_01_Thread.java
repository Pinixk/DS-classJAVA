package _09_Thread;

public class _01_Thread {
   public static void main(String[] args) {
      System.out.println("Main Thread Started");

      // Tread class 적용법
      MyThread t1 = new MyThread();
      t1.start();

      // interface를 이용한 Thread 사용법
      MyRunnable r1 = new MyRunnable();
      Thread t2 = new Thread(r1);
      t2.start();

      System.out.println("Main Thread is finished");
      // Main Thread Started
      // Main Thread is finished
      // finished Runnable
      // finished Thread
   }
}

// Tread class 적용법
class MyThread extends Thread {
   @Override
   public void run() {
      try {
         Thread.sleep(1500);
         System.out.println("finished Thread");
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}

// interface를 이용한 Thread 사용법
class MyRunnable implements Runnable {
   @Override
   public void run() {
      try {
         Thread.sleep(1500);
         System.out.println("finished Runnable");
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}