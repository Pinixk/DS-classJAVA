package _03_Object.extention;

public class _12_AbstractClass {
    public static void main(String[] args) {
        // Terran terran = new Terran();
        // 추상클래스는 스스로 인스턴스 생성 불가
        
        Medic medic = new Medic();
        System.out.println(medic.name);
        System.out.println(medic.ATTACK_LV);
        medic.fly();
        medic.steamPack();
    }
}

// 추상클래스는 스스로 인스턴스 생성 불가
// 추상 method 추가 가능
abstract class Terran implements Flyable{
    String name="메딕";
    public final int ATTACK_LV = 100;
    public abstract void steamPack();

    @Override
    public void fly(){
        System.out.println("날아올라");
    }
}

class Medic extends Terran{
    @Override
    public void steamPack() {
        System.out.println("steam~~~pack");
    }
}