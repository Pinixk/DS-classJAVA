package _10_Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Predicate;

public class _02_Functional_Interface {
   public static void main(String[] args) {
      Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1; // 매개변수 X, 반환값 O
      Consumer<Integer> c = i -> System.out.print(i + ","); // 매개변수 O, 반환값 X
      Predicate<Integer> p = i -> i % 2 == 0;               // 조건식, 매개변수 O, 반환값 boolean
      Function<Integer, Integer> f = i -> i / 10 * 10;      // 함수, 매개변수 O, 반환값 O


      List<Integer> list = new ArrayList<>();
      // Supplier
      makeRandomList(s, list);
      System.out.println(list);
      // Predicate, Consumer
      PrintEventNum(c, p, list);
      // Function
      List<Integer> newList = doSomething(f, list);
      System.out.println(newList);

   }

   private static <T> void makeRandomList(Supplier<T> s, List<T> list) {
      for (int i = 0; i < 10; i++) {
         list.add(s.get());
      }
   }
   
   private static <T> void PrintEventNum(Consumer<T> c, Predicate<T> p, List<T> list) {
      System.out.print("[");
      for (T i : list) {
         if (p.test(i))
         c.accept(i);
      }
      System.out.println("]");
   }
   
   private static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
      List<T> newList = new ArrayList<T>(list.size());
      for (T i : list)
         newList.add(f.apply(i));
      return newList;
   }
}
