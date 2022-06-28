package _07_Collection;

import java.util.ArrayList;

public class _01_List {
   public static void main(String[] args) {
      
      // generics 비설정
      @SuppressWarnings("rawtypes")
      ArrayList al = new ArrayList();
      // al.add(new Date()); 
      // al.add("Hello");
      // al.add(true);
      // al.add(1);
      al.clear();
      System.out.println(al);


      // generics 설정
      ArrayList<Integer> list = new ArrayList<>();
      
      for (int i = 1; i <= 10; i++) {
         list.add(i);
      }

      int total = 0;
      for (int i : list) { 
      // generics를 int로 설정했기에 int로 받을 수 있음
      // generics 설정 안 했을 시 Object로 받을 수 있음
         total += i;
      }

      total = 0;
      for (int i= 0; i < list.size(); i++) {  
         total += list.get(i);
         // 형변환 없이 generics타입으로 연산 가능
      }

      System.out.println(list);
      System.out.println(total);
   }
}
