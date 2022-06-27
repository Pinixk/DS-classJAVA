package Exercise.Exercise_07;

public class Exercise_07_01_T {
  public static void main(String[] args) {
    CardDeckT deckT = new CardDeckT();
    deckT.printDeckT();
    deckT.suffleT();
    deckT.printDeckT();
  }
}

class SutdaCardT {
  private int numT;
  private boolean kwangT;

  public SutdaCardT(int num, boolean kwang) {
    this.numT = num;
    this.kwangT = kwang;
  }

  public SutdaCardT() {this(1, false);}
  public int getNumT() {return this.numT;}
  public void setNumT(int numT) {this.numT = numT;}
  public boolean isKwangT() {return this.kwangT;}
  public void setKwangT(boolean kwangT) {this.kwangT = kwangT;}

  @Override
  public String toString() {
    return numT + (kwangT ? "(k)" : "");
  }
}

class CardDeckT {
  // 1. card 20장 클래스
  SutdaCardT cardsT[] = new SutdaCardT[20];

  // 2. card 20장 초기화
  public CardDeckT() {
    for (int i = 0; i < cardsT.length; i++) {
      cardsT[i] = new SutdaCardT(
          i % 10 + 1,
          (i < 10) && (i == 0 || i == 2 || i == 7) ? true : false);
    }
  }

  void printDeckT() {
    for (int i = 0; i < cardsT.length; i++) {
      if (i != 0) System.out.print(",");
      System.out.print(cardsT[i]);
    }
    System.out.println();
  }

  // 3. card 섞기
  void suffleT() {
    
    for (int i = 0; i < cardsT.length; i++) {
      int randT = (int) (Math.random() * cardsT.length);

      SutdaCardT tmpT = cardsT[i];
      cardsT[i] = cardsT[randT];
      cardsT[randT] = tmpT;
    }
  }
}