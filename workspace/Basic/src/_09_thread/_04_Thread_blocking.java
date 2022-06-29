package _09_thread;

import javax.swing.JOptionPane;

public class _04_Thread_blocking {
   public static void main(String[] args) {
      Bomb b = new Bomb();
      b.start();

      String input = JOptionPane.showInputDialog(null, "Which do you want red(0) or blue(1)?");

      if (input == null) {b.setChoice(2);} 
      else {b.setChoice(Integer.parseInt(input));}

   }
}

class Bomb extends Thread {

   private boolean stop = false;
   private int choice = (int) (Math.random() * 2);

   public int getChoice() {
      return this.choice;
   }

   public void setChoice(int choice) {

      if (this.choice == choice) {
         System.out.println("살았다");
      } else {
         System.out.println("Boom~~~~~~!");
      }
      stop = true;
   }

   @Override
   public void run() {
      for (int i = 10; i > 0; i--) {
         if (!stop) {
            System.out.println(i);
            try {Thread.sleep(1000);} catch (Exception e) {}
         } else {
            break;
         }
      }
      if (!stop){
         System.out.println("Boom~~~~~~!");
         System.exit(-1);
      }
   }

}
