package _10_Lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class _05_Method_Reference {
   public static void main(String[] args) {

      //람다식이 하나의 매서드만 호출 할 경우 사용
      Function<String,Integer> f = s -> Integer.parseInt(s);
      Function<String,Integer> f1 = Integer::parseInt;   // 매서드 참조
      
      Function<Integer, int[]> f2 = i -> new int[i];  // 크기가 i인 배열 반환
      Function<Integer, int[]> f3 = int[]::new;  // 배열의 매서드 참조

      Supplier<MyClass> s = () -> new MyClass();
      Supplier<MyClass> s1 = MyClass::new;   // 생성자의 매서드 참조
      
   }
}

class MyClass{}