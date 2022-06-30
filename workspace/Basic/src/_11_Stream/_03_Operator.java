package _11_Stream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class _03_Operator {
  public static void main(String[] args) {

    String directory = "C:/";
    try {
      Stream<Path> fileLiStream = Files.list(Paths.get(directory));
      fileLiStream.map(Path::toFile)                                    // file, directory 명 축출
          .peek(s->System.out.println(s.toString()))                    // 중간연산 확인
          .filter(File::isFile)                                         // file 축출
          // .filter(s->s.toString().indexOf('.') != -1)
          .map(s->s.toString().substring(s.toString().indexOf(".")+1))  // 확장자 축출
          .map(String::toUpperCase)
          .distinct().forEach(System.out::println);                     // 출력
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
