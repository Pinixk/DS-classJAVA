package Exercise.Exercise_07;

class Product {
  int price; // 제품의 가격
  int bonusPoint; // 제품구매 시 제공하는 보너스점수

  Product() {
    this(10000);
  }

  Product(int price) {
    this.price = price;
    bonusPoint = (int) (price / 10.0);
  }
}

class Tv extends Product {
  Tv() {
  }

  public String toString() {
    return "Tv";
  }
}

class Exercise_07_03 {
  public static void main(String[] args) {
    Tv t = new Tv();

    
    System.out.println(t);
    System.out.println(t.bonusPoint);
  }
}