package _05_JavaLang;

public class _01_Equals {
  public static void main(String[] args) {
    Value v1 = new Value(10);
    Value v2 = new Value(10);

    System.out.println(v1 == v2);
    System.out.println(v1.equals(v2));
  }
}

class Value {
  int val;

  Value(int value) {this.val = value;}

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Value) {  // instanceof : 상속 관계 여부 확인
      Value tmp = (Value)obj;   // 자부자 관계, 명시적 형변환
      return val == tmp.val;
    }
    return false;
  }
}