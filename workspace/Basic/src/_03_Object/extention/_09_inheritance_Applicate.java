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

        System.out.println(buyer);
    }
}

class Buyer{
    int money = 300;
    int bonusPoint;
    String[] list = new String[10];
    int count = 0;

    // 방법 1
    // void buy(int price, String name){
    //     if(money >= price) money -= price;
    //     list[count++] = name;
    // }

    // 방법 2
    // void buy(Computer c){
    //     if(money >= c.price) money -= c.price;
    //     list[count++] = c.name;
    // }
    // void buy(Audio a){
    //     if(money >= a.price) money -= a.price;
    //     list[count++] = a.name;
    // }
    // void buy(Tv t){
    //     if(money >= t.price) money -= t.price;
    //     list[count++] = t.name;
    // }
    
    // 방법 3
    
}

class Tv{
    String name = "TV";
    int price = 40;
}

class Audio{
    String name = "Audio";
    int price = 100;
}

class Computer{
    String name = "Computer";
    int price = 160;
}