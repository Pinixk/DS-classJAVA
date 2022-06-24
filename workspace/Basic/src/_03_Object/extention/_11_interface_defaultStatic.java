package _03_Object.extention;

public class _11_Interface_DefaultStatic {
    public static void main(String[] args) {
        MyInterface.staticMethod();
        // .으로 바로 접근이 가능함
        
        Child3 child3 = new Child3();
        child3.method1();
    }
}

class Child3 implements MyInterface, MyInterface2{
    // implemnet된 두 interface의 method가 충돌 될 경우 재정의 해야 한다.

    // public void method1(){
    //     System.out.println("default method1 in Child3");
    // }

    @Override
    public void method1() {
        System.out.println("method1()이 충돌나서 재정의 함");
    }
}

interface MyInterface {
    
    // public이 생각 가능
    // 기본적인 기능 구현 가능
    public default void method1(){
        System.out.println("default method1 in MyInterface");
    }
    
    default void method2(){
        System.out.println("default method2 in MyInterface");
    }

    // interface의 static method
    // MyInterface.staticMethod()로 바로 접근 가능
    static void staticMethod(){
        System.out.println("static method in MyInterface");
    }
}

interface MyInterface2 {
    
    // public이 생각 가능
    // 기본적인 기능 구현 가능
    public default void method1(){
        System.out.println("default method1 in MyInterface2");
    }
}