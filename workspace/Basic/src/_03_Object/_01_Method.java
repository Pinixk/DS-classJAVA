package _03_Object;

public class _01_Method {
    public static void main(String[] args) {
        Mymath mymath = new Mymath();

    }
}

class Mymath {
    int add(int a, int b) {
        int result = 0;
        result = a + b;

        return result;
    }

    boolean add2(boolean a, boolean b) {
        return a || b;
    }
}