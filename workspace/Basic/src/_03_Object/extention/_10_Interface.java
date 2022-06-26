package _03_Object.extention;

public class _10_Interface {
    public static void main(String[] args) {
        Mammals mammals[] = new Mammals[]{new Lion(),new Rabbit(),new Bat()};
        Birds birds[] = new Birds[]{new Eagle(),new Penguin(),new Crow()};
        Flyable flyable[] = new Flyable[]{new Eagle(),new Bat(), new Crow()};
        Groundable groundable[] = new Groundable[]{new Lion(),new Rabbit(), new Penguin()};

        Bat bat = new Bat();
        Eagle eagle = new Eagle();
        eagle.fly();

        flyable[0] = eagle;
        flyable[1] = bat;
        // 관련 있다면 형변환을 통해 값을 담을 수 있다.

        // Flyable flyable2 = new Flyable(); // interface 스스로 instance 생성 불가능
        Flyable flyable2 = new Flyable(){ // 익명객체, class가 interface로 형변환
            @Override
            public void fly() {}
        };

        System.out.println();

        for (int i = 0; i < flyable.length; i++) {
            flyable[i].fly();
            // System.out.println(flyable[i].name);
            // impliment한 class의 멤버변수와 Method를 직접 사용 할 수 없다.
            // impliment한 fly()만 찍을 수 있다
            // 그러나 fly()에 class의 다른 멤버변수나 method를 담아 올 수가 있다
        }
        for (int i = 0; i < mammals.length; i++) {
            System.out.println(mammals[i].name); 
        }

    }
}

class Mammals{ 
    String name; 
    public Mammals(String name){
        this.name = name;
    }
}
class Birds{
    String name; 
    public Birds(String name){
        this.name = name;
    }
}


// Mammals
class Lion extends Mammals implements Groundable{
    public Lion(){ super("사자"); }
}
class Rabbit extends Mammals implements Groundable{
    public Rabbit(){ super("토끼"); }
}
class Bat extends Mammals implements Flyable{
    public Bat(){ super("박쥐"); }
    @Override
    public void fly() {
        System.out.println("bat bat~~");
    }
}


// Birds
class Eagle extends Birds implements Flyable{
    public Eagle(){ super("독수리"); }
    String baltop = "발톱";

    @Override
    public void fly() {
        System.out.println(super.name+"eagle eagle~~"+baltop);
    }
}
class Crow extends Birds implements Flyable{
    public Crow(){ super("까마귀"); }
    @Override
    public void fly() {
        System.out.println("crow crow~~");
    }
}
class Penguin extends Birds implements Groundable, Swimmable{
    public Penguin(){ super("펭귄"); }
}


// 추상적 method와 상수만 가질 수 있음
// interface를 사용한 class는 overriding 해주어야 함
interface Flyable{
    public abstract void fly();
}
interface Groundable{}
interface Swimmable{}