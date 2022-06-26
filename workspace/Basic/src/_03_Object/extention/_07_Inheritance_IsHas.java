package _03_Object.extention;

public class _07_Inheritance_IsHas {
    public static void main(String[] args) {
        Firebat firebat = new Firebat();
        firebat.move(100, 100);
        System.out.println(firebat.x+"/"+firebat.y);
        firebat.steamPack();
        // 클래스 간의 관걔를 고려해야 한다.

        Car car = new Car();
        car.engine.gitong = 8;
        System.out.println(car.engine.gitong+"기통");
    }
}

// 상속 관계 :: is a 관계
class Unit {
    int x;
    int y;
    int hp;
    int attackLv;
    int armor;

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Firebat extends Unit {
    void steamPack() {
        System.out.println("스팀팩~~~~~!");
    }
}

// 포함 관계 :: has a 관계
class Car {
    int wheel;
    int door;
    Engine engine = new Engine(); // has a 관계
}

class Engine {
    int gitong;
    int mph;
    int cc;
}