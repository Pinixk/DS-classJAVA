public class Ex1_Variable {
    // 선언
    boolean b1; // 전역변수, heap = 동적인 데이터
    static char c1; // char에만 '' 사용 가능

    public static void main(String[] args) {
        // static = methodArea, 값이 없을 경우 기본 값으로 출력
        // 지역변수는 무조건 초기화를 시켜야함
        boolean b2 = true;
        char c2 = '\u0000'; // 헥사코드
        char c3 = 'A'; // 아스키 코드
        // char c3 = 'hello'; // char는 무조건 1글자만 가능
        System.out.println(b2);

        // System.out.println(b1);
        // b1 = heap, 사용 불가, 앞에 static 붙여야 가능

        Ex1_Variable v1 = new Ex1_Variable(); // new = 생성 연산자, 초기화 시킴
        System.out.println(v1.b1); // heap이 인스턴스로 올라와서 사용 가능
        System.out.println(c1);
        System.out.println(c2 + 1); // 1
        // int가 char보다 byte단위가 커서 A가 아스키코드로 변환
        System.out.println(c3 + 1); // 66

        // 정수형, 실수형
        byte bt1 = 127;
        // byte bt2 = 200; // byte 범위를 넘어서는 값, error
        byte bt2 = (byte) 200;

        short s1 = 32767;
        short s2 = (short) 32768;

        int i1 = 2147483647;
        long l1 = 2147483648l;

        float f1 = 0.123456789f;
        double d1 = 0.1234567890123456789;

        System.out.println(bt1 + 10); // 형 변환, overflow
        System.out.println(bt2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);
    }
}