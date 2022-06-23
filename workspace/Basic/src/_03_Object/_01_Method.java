package _03_Object;

public class _01_Method {
    public static void main(String[] args) {
        Mymath mm = new Mymath();

        // overloading
        // 1. 이름이 같아야 한다
        // 2. 매개 변수가 달라야 한다
        // 3. 리턴 타입은 상관 없다

        // method명이 같아도 들어가는 매개 변수가 다다를 경우에도 각각 출력 가능
        // 재사용률이 높아진다
        System.out.println(mm.add(true, 1 < 2));
    }
}

class Mymath {
    int add(int a, int b) {
        int result = 0;
        result = a + b;

        return result;
    }

    boolean add(boolean a, boolean b) {
        return a || b;
    }

    String add(String a, String b) {
        return a + " " + b;
    }

    void add(String a, byte b){ // 매개 변수 하나만 달라도 괜찮다
        // return; 생략 되어있다.
    }

    void add(byte a, int b){    // 매개 변수가 같고 순서만 달라도 괜찮다
        
    }
}