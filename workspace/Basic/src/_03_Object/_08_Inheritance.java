package _03_Object;

public class _08_Inheritance {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println((child instanceof Parent) ? "상속관계" : "비상속관계");
        System.out.println((child instanceof Object) ? "상속관계" : "비상속관계");
        System.out.println((parent instanceof Object) ? "상속관계" : "비상속관계");
        System.out.println((parent instanceof Child) ? "상속관계" : "비상속관계");
        // System.out.println((parent instanceof Firebat) ? "상속관계" : "비상속관계");

        // Child c1 = new Parent(); // 형변환 :: 부 => 자, 부가 더 큰 개념이라 안됨
        Parent p1 = new Child();    // 형변환 :: 자 => 부
        Child c2 = (Child)p1;       // 형변환 :: 자 => 부 => 자
        System.out.println(p1.age); // 상속관계의 형변환 시 속성은 부모 것
        p1.eat();                   // 상속관계의 형변환 시 method는 자식 것
    }
}

class Parent {
    String name;
    int age = 80;
    void eat() {System.out.println("부모가 드세요");}
}

class Child extends Parent {
    String study;
    String name;
    int age = 30;
    void eat(){System.out.println("자식이 먹어요");}
}

class Father {int age;}
class Mother {int age;}
// class Child2 extends Father, Mother { }
// JAVA는 단일 상속만 허용
// 대신 interface가 있음