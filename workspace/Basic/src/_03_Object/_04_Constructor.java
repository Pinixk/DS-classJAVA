package _03_Object;

public class _04_Constructor {
    public static void main(String[] args) {
        Foo foo2 = new Foo(); // 기본 생성자, JVM이 생성함
        Foo foo = new Foo("곰돌이", "꿀");
        // class에서 생성자를 만들면 기본 생성자 못 만듬
        // 생성자 overloading으로 해결 가능
    }
}

class Foo {
    private String name;
    private String like;

    public Foo() {
    }
    // 생성자(Counstructor), 초기화를 목적으로 함
    // method의 일종
    // return type이 없음
    // 객체의 개념을 온전하게 가져오기 위함

    public Foo(String name, String like) {
        this.name = name;
        this.like = like;
    }
}