package _04_Exception;

public class _02_Throws {
    public static void main(String[] args) throws Exception{
        method1();
    }

    static void method1() throws Exception{
        method2();
    }

    static void method2() throws Exception{
        method3();
    }

    static void method3() throws Exception{ 
        // 이 method를 호출 시킨 method로 error를 위임함
        throw new Exception();
    }
}
