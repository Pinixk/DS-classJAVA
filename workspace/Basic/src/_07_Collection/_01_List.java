package _07_Collection;

import java.util.ArrayList;
import java.util.Date;

public class _01_List {
   public static void main(String[] args) {
      ArrayList list = new ArrayList();
      list.add(new Date());
      list.add("Hello");
      list.add(true);
      list.add(1);
      list.clear();
      System.out.println(list);

      for (int i = 1; i <= 10; i++) {
         list.add(i);
      }
      System.out.println(list);
   }
}
