package Exercise.Exercise_07;

class Outer2 {
  int value = 10;     // Outer.this.value

  class Inner2 {      // (instance inner class) 인스턴스 클래스
    int value = 20;   // this.value

    void method1() {
      int value = 30; // value
      System.out.println(value);
      System.out.println(this.value);
      System.out.println(Outer2.this.value);
    }
  }
}

public class Exercise_07_08 {

  public static void main(String args[]) {
    Outer2 outer = new Outer2();
    Outer2.Inner2 inner = outer.new Inner2();
    inner.method1();
  }
  
}
