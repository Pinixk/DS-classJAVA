package _11_Stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class _02_Infinity {
   public static void main(String[] args) {
      // 무한스트림 생성 int, longs, doubles
      IntStream intStream = new Random().ints(1,5);     // begin, end
      intStream.limit(5).forEach(System.out::println);  // limit

      LongStream longStream = LongStream.range(1,45);
      longStream.forEach(System.out::print);

      System.out.println();
      IntStream lotto = IntStream.rangeClosed(1,45);
      lotto.forEach(i->System.out.printf("%3d",i));
      // lotto.forEach(new IntConsumer() {
      // @Override
      // public void accept(int value) {
      //    System.out.print(value);
      //    }
      // });

      Stream<Integer> iteratorStream = Stream.iterate(0,n->n+2);  // 무한 스트림 생성
      iteratorStream.limit(5).forEach(System.out::println);
      System.out.println();

      Stream<Integer> generatorStream = Stream.generate(()->(int)(Math.random()*10));  // 무한 스트림 생성
      generatorStream.limit(5).forEach(System.out::println);
      System.out.println();

      Stream<Path> fileList = Files.list(".");
      
   }
}
