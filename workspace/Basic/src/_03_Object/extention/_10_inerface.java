package _03_Object.extention;

public class _10_inerface {
    public static void main(String[] args) {
        Bat bat = new Bat();
        Eagle eagle = new Eagle();
        eagle.fly();

        Flyable flyable[] = new Flyable[3];
        flyable[0] = eagle;
        flyable[1] = bat;
        // 관련 있다면 형변환을 통해 값을 담을 수 있다.
    }
}

class Mammals{}
class Birds{}

class lion extends Mammals implements Groundable{}
class Rabbit extends Mammals implements Groundable{}
class Bat extends Mammals implements Flyable{
    @Override
    public void fly() {
        System.out.println("bat bat~~");
    }
}

class Eagle extends Birds implements Flyable{
    String baltop = "발톱";

    @Override
    public void fly() {
        System.out.println("eagle eagle~~"+baltop);
    }
}
class Crow extends Birds implements Flyable{
    @Override
    public void fly() {
        System.out.println("crow crow~~");
    }
}
class Penguin extends Birds implements Groundable, Swimmable{}

// 추상적 method와 상수만 가질 수 있음
// 사용한 class는 overriding 해주어야 함
interface Flyable{
    public abstract void fly();
}
interface Groundable{}
interface Swimmable{}