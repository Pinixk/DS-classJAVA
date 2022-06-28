package _07_Collection;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class _05_TreeSet {
   public static void main(String[] args) {
      Set lotto = new TreeSet();

      while (lotto.size() < 7) {
         int ball = (int) (Math.random() * 45) + 1;
         lotto.add(ball);
      }
      System.out.println(lotto);



      Set set = new TreeSet();
      Ball[] balls = new Ball[5];
      int[] nums = { 2, 4, 5, 3, 1 };
      String[] colors = { "Black", "Navy", "Green", "Pink", "Red" };

      for (int i = 0; i < balls.length; i++) {
         balls[i] = new Ball(nums[i], colors[i]);
         set.add(balls[i]);
      }
      System.out.println(set);

   }
}

class Ball implements Comparable{
   int num;
   String color;

   public Ball(int num, String color) {
      this.num = num;
      this.color = color;
   }

   // @Override
   // public int compareTo(Object o) {
   //    Ball tmp = (Ball)o;
   //    if(tmp.num<num) return 1;
   //    else if(tmp.num==num) return 0;
   //    else return -1;
   // }

   @Override
   public int compareTo(Object o) {
      Ball tmp = (Ball)o;
      return -(tmp.color.compareTo(color));
   }

   // @Override
   // public boolean equals(Object obj) {
   // if (obj instanceof Ball) {
   // Ball tmp = (Ball) obj;
   // return tmp.num == num && tmp.color.equals(color);
   // }
   // return false;
   // }

   @Override
   public boolean equals(Object obj) {
      if (!(obj instanceof Ball))
         return false;
      Ball tmp = (Ball) obj;
      return tmp.num == num && tmp.color.equals(color);
   }

   @Override
   public int hashCode() {
      return Objects.hash(num, color);
   }

   @Override
   public String toString() {
      return num +"/"+ color;
   }
}
