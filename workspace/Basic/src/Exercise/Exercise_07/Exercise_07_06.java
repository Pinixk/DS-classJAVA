package Exercise.Exercise_07;

class Outer { // 외부 클래스
  class Inner { // ( ) 내부 클래스 인스턴스 클래스
    int iv = 100;
  }
}

class Exercise_07_06 {
  public static void main(String[] args) {
    Outer o = new Outer();
    Outer.Inner ii = o.new Inner();
    System.out.println(ii.iv);
  }
}
