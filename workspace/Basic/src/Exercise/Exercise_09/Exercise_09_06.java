package Exercise.Exercise_09;

class Exercise_09_01 {
  public static void main(String[] args) {
    SutdaCard2 c1 = new SutdaCard2(3, true);
    SutdaCard2 c2 = new SutdaCard2(3, true);
    System.out.println("c1=" + c1);
    System.out.println("c2=" + c2);
    System.out.println("c1.equals2(c2):" + c1.equals(c2));
  }
}

class SutdaCard2 {
  int num;
  boolean isKwang;

  SutdaCard2() {
    this(1, true);
  }

  SutdaCard2(int num, boolean isKwang) {
    this.num = num;
    this.isKwang = isKwang;
  }

  public String toString() {
    return num + (isKwang ? "K" : "");
  }

  @Override
  public boolean equals(Object obj2) {
    if (obj2 instanceof SutdaCard2) {
      SutdaCard2 tmp = (SutdaCard2) obj2;
      return num == tmp.num && isKwang == tmp.isKwang;
    }
    return false;
  }

}
