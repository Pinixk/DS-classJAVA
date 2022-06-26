package Exercise.Exercise_07;

public class Exercise_07_02 {
  public static void main(String[] args) {

    SutdaDeck2 deck = new SutdaDeck2();

    System.out.println(deck.pick2(0));
    System.out.println(deck.pick2());
    deck.shuffle2();

    for (int i = 0; i < deck.cards.length; i++) {
      System.out.print(deck.cards[i] + ",");
    }

    System.out.println();
    System.out.println(deck.pick2(0));
  }
}

class SutdaDeck2 {
  final int CARD_NUM = 20;
  SutdaCard[] cards = new SutdaCard[CARD_NUM];

  SutdaDeck2() {
    for (int i = 0; i < cards.length; i++) {
      int num = i % 10 + 1;
      boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

      cards[i] = new SutdaCard(num, isKwang);
    }
  }

  void shuffle2() {

    for (int i = 0; i < cards.length; i++) {
      int rand = (int) (Math.random() * cards.length);

      SutdaCard tmp = cards[i];
      cards[i] = cards[rand];
      cards[rand] = tmp;
    }
  }

  SutdaCard pick2(int i) {
    if (i < 0 || i > CARD_NUM)
      return null;
    return cards[i];
  }

  SutdaCard pick2() {
    int i = (int) (Math.random() * cards.length);
    return pick2(i);
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
}
