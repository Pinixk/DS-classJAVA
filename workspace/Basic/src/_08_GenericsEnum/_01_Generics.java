package _08_GenericsEnum;

import java.util.ArrayList;

public class _01_Generics {
   public static void main(String[] args) {
      // generics의 장점
      // 1) type의 안정성
      // 2) 형변환 생략으로 코드 간결화

      ArrayList<Person> list = new ArrayList<>();
      list.add(new Person());
      // list.add(100);  // generics 타입이 맞지 않음

      System.out.println(list.get(0).name); 
   }
}

class Person{
   String name;
}