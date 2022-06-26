package _03_Object.composition;

public class _05_Static_Instance {
    public static void main(String[] args) {
        Marine m1 = new Marine();
        Marine m2 = new Marine();
        Marine m3 = new Marine();
        
        m1.setAttLv(8);
        m2.setAttLv(8);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }   
}

class Marine{
    private int hp;
    static private int attLv = 6;   
    static String info(){

        // return "Marine["+hp+"]"; 
        // return toString();
        // static안에 instrance, Error

        return "Marine["+attLv+"]";
    }
    // 변수의 타입은 이름 바로 앞에 붙어야 한다.
    // static 정적 데이터, 하나가 바뀌면 전체가 바뀜

    public int getHp() { return this.hp; }
    public void setHp(int hp) { this.hp = hp; }

    @SuppressWarnings("static-access")
    public int getAttackLv() { return this.attLv;}
    @SuppressWarnings("static-access")
    public void setAttLv(int attLv) { this.attLv = attLv; }

    @Override
    public String toString() { 
        // return hp+"/"+attLv;
        return info();
        // instance 안에 static은 들어올 수 있다
    }
}