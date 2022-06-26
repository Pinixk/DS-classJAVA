package _03_Object.extention;

public class _09_inheritance_Applicate {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        Tv tv = new Tv();
        Audio audio = new Audio();
        Computer computer = new Computer();

        // buyer.buy(tv.price,tv.name);
        // buyer.buy(audio.price,audio.name);
        // buyer.buy(computer.price,computer.name);

        buyer.buy(tv);
        buyer.buy(audio);
        buyer.buy(computer);
        // overridng 발생
        // 묵시적으로 가능

        System.out.println("남은 돈 : "+buyer.money+"만원");
        System.out.println(buyer.list[1]);
    }
}

class Buyer {
    int money = 300;
    int bonusPoint;
    String[] list = new String[10];
    int count = 0;

    // 방법 1) 일반형 속성으로 처리
    // void buy(int price, String name){
    // if(money >= price) money -= price;
    // list[count++] = name;
    // }

    // 방법 2) 참조형 타입으로 처리
    // void buy(Computer c){
    // if(money >= c.price) money -= c.price;
    // list[count++] = c.name;
    // }
    // void buy(Audio a){
    // if(money >= a.price) money -= a.price;
    // list[count++] = a.name;
    // }
    // void buy(Tv t){
    // if(money >= t.price) money -= t.price;
    // list[count++] = t.name;
    // }

    // 방법 3) 상속의 형변환으로 처리
    void buy(Item i) {
        if (money >= i.price)
            money -= i.price;
        
        list[count++] = i.name;
    }
}

// 방법 3
class Item {
    String name;
    int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

class Tv extends Item {
    // String name = "TV";
    // int price = 40;

    // 방법 3
    public Tv() {
        super("Tv", 40);
        // 자신의 바로 위 조상을 가르킴
        // 생성자의 첫 줄에 있어야 함
    }
}

class Audio extends Item {
    // String name = "Audio";
    // int price = 100;

    public Audio() {
        super("Audio", 40);
    }
}

class Computer extends Item {
    // String name = "Computer";
    // int price = 160;

    public Computer() {
        super("computer", 160);
    }
}