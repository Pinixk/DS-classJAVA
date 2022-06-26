package _01_Var_Oper;

public class _01_Variable {
    // 선언
    boolean b1; // 전역변수, heap = 동적인 데이터
    static char c1; // char에만 '' 사용 가능

    public static void main(String[] args) {
        // static = methodArea, 값이 없을 경우 기본 값으로 출력
        // 지역변수는 무조건 초기화를 시켜야함

        boolean b2 = true;
        System.out.println(b2);
        // boolean = 1byte

        char c2 = '\u0000'; // 헥사코드
        char c3 = 'A'; // 아스키 코드
        // char c3 = 'hello'; // char는 무조건 1글자만 가능
        // char = 2byte

        // System.out.println(b1);
        // b1 = heap, 사용 불가, 앞에 static 붙여야 가능

        _01_Variable v1 = new _01_Variable(); // new = 생성 연산자, 초기화 시킴
        System.out.println(v1.b1); // heap이 인스턴스로 올라와서 사용 가능

        System.out.println(c1);     // ' '
        System.out.println(c2 + 1); // 1
        System.out.println(c3 + 1); // 66
        // int가 char보다 byte단위가 커서 A가 아스키코드로 변환

        // 정수형, 실수형
        byte bt1 = 127;
        // byte bt2 = 200; // byte 범위를 넘어서는 값, error
        byte bt2 = (byte) 200;
        // byte = 1byte

        short s1 = 32767;
        short s2 = (short) 32768;
        // short = 2byte

        int i1 = 2147483647;    // int = 4byte
        long l1 = 2147483648l;  // long = 8byte

        float f1 = 0.123456789f;            // float = 8byte
        double d1 = 0.1234567890123456789;  // double = 11byte

        System.out.println();
        System.out.println(bt1 + 10); // 형 변환
        System.out.println(bt2);  // overflow
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);

        // boolean = 1byte
        // char = 2byte
        // double(11byte) > float(8byte) > long(8byte) > 
        // int(4byte) > short(2byte) > byte(1byte)
    }
}