package _10_Lambda;

import java.util.*;
import java.util.function.*;

public class _04_Collection_Functional_Interface {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++)
      list.add(i);

    // list의 모든 요소를 출력
    list.forEach(new Consumer<Integer>() {
      @Override
      public void accept(Integer i) {
        System.out.print(i + ",");
      }
    });
    // list.forEach(i -> System.out.print(i + ","));
    System.out.println();

    // list에서 2 또는 3의 배수를 제거한다.
    list.removeIf(new Predicate<Integer>() {
      public boolean test(Integer x) {
        return x % 2 == 0 || x % 3 == 0;
      };
    });
    // list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
    System.out.println(list);

    // UnaryOperator는 Function의 변형, 매개변수와 리턴의 타입이 동일
    list.replaceAll(new UnaryOperator<Integer>() {
      @Override
      public Integer apply(Integer i) {
        return i * 10;
      }
    });
    // list.replaceAll(i -> i * 10); // list의 각 요소에 10을 곱한다.
    System.out.println(list);

    Map<String, String> map = new HashMap<>();
    map.put("1", "1");
    map.put("2", "2");
    map.put("3", "3");
    map.put("4", "4");

    // map의 모든 요소를 {k,v}의 형식으로 출력한다.
    map.forEach(new BiConsumer<String, String>() {
      @Override
      public void accept(String k, String v) {
        System.out.print("{" + k + "," + v + "},");
      }
    });
    // map.forEach((k, v) -> System.out.print("{" + k + "," + v + "},"));
    System.out.println();
  }
}
