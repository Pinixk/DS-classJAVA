package _11_Stream;

import java.util.Optional;

public class _04_Optional {
  public static void main(String[] args) {
    Optional<Value> opt = Optional.of(new Value()); // Optional 객체 생성
    Optional<Value> opt1 = Optional.ofNullable(null); // null일 경우 에러발생 안함
    Optional<Value> opt2 = Optional.<Value>empty(); // 빈객체로 초기화
    Value v = opt.get();

    if (opt.isPresent())
      v = opt.get();
  }
}
