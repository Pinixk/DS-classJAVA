package _11_Stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _05_FinalOperator {
  public static void main(String[] args) {
    Stream<Student> studentStream = Stream.of(
        new Student("이자바", 3, 300),
        new Student("김자바", 1, 200),
        new Student("안자바", 2, 100),
        new Student("박자바", 2, 150),
        new Student("소자바", 1, 200),
        new Student("닥자바", 3, 290),
        new Student("감자바", 3, 180));
        Optional<Student> s = studentStream.reduce(new BinaryOperator<Student>() {
          @Override
          public Student apply(Student t, Student u) {
            return t.totalScore > u.totalScore ? t : u;
          }
        });
        if (s.isPresent())
        System.out.println(s);

        Student[] stdArr = studentStream.toArray(Student[]::new);
        System.out.println(studentStream.count());
        System.out.println(studentStream.collect(Collectors.counting()));
        System.out.println(studentStream.collect(Collectors.summingInt(Student::getTotalScore)));
        System.out.println(studentStream.collect(Collectors.maxBy(Comparator.comparingInt(Student::getTotalScore))));
        System.out.println(studentStream.collect(Collectors.summarizingInt(Student::getTotalScore)));
      }
}
