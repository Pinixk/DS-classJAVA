package _03_Object.composition;

public class _04_Constructor {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Foo foo = new Foo(); // 기본 생성자, JVM이 생성함
        @SuppressWarnings("unused")
        Foo foo2 = new Foo("곰돌이", "꿀");
        // class에서 생성자를 만들면 기본 생성자 못 만듬
        // 생성자 overloading으로 해결 가능      

        System.out.println(foo);
    }
}

class Foo {
    private String name;

    private String like;

    // 생성자(Counstructor), 초기화를 목적으로 함
    // method의 일종
    // return type이 없음
    // 객체의 개념을 온전하게 가져오기 위함

    public Foo() {
        this("곰돌이 푸", "꿀"); 
        // class안에서 생성자를 만들때 default 값 지정
    }

    public Foo(String name, String like) {
        this.name = name;
        this.like = like;
    }   // 매개변수가 있는 생성자

}