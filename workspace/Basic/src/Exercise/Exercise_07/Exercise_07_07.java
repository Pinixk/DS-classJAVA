package Exercise.Exercise_07;

class Outer1 {          // 외부 클래스
  static class Inner1 { // (static) 내부 클래스
    int iv = 200;
  }
}

class Exercise_07_07 {
  public static void main(String[] args) {
    Outer1.Inner1 ii = new Outer1.Inner1();
    System.out.println(ii.iv);
  }
}
