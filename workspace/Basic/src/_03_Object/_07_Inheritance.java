package _03_Object;

public class _07_Inheritance {


    public static void main(String[] args) {
        Firebat firebat = new Firebat();
        firebat.x = 100;
        firebat.y = 100;

    }

}

class Unit{
    int x;
    int y;
    int hp;
    int attackLv;
    int armor;
}

class Firebat extends Unit{
    void steamPack(){
        System.out.println("스팀팩~~~~~!");
    }
}