package Exercise.Exercise_07;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        int
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Exercise_07_01 {
    SutdaDeck deck = new SutdaDeck();

    public static void main(String[] args) {
        for (int i = 0; i < deck.cards.length; i++) {
            System.out.println(deck.cards[i] + ",");
        }
    }
}