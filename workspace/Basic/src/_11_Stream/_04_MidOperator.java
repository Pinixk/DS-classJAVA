package _11_Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class _04_MidOperator {
  public static void main(String[] args) {
    Stream<String[]> strArrStream = Stream.of(
      new String[]{"abc","def","ghi"},
      new String[]{"ABC","DEF","GHI"}
    );
    // Stream<Stream<String>> strStream = strArrStream.map(Arrays::stream);

    Stream<String> strStream = strArrStream.flatMap(Arrays::stream);
    strStream.map(String::toUpperCase).distinct().sorted().
    forEach(System.out::println);
    System.out.println();

  }
}

class Value{}