package _07_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _03_Set {
   public static void main(String[] args) {
      Set set = new HashSet<>();

      set.add(1);
      set.add(2);
      set.add(3);
      set.add(4);
      Iterator it = set.iterator();
      while(it.hasNext()){
         System.out.print(it.next()+",");
      }

      Set lotto = new HashSet<>();
      while(lotto.size()<7){
         int ball = (int)(Math.random()*45)+1;
         lotto.add(ball);
      }
      System.out.println();
      System.out.println(lotto);
   }
}
