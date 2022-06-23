package _01_Var_Oper;

public class _02_VariableCastType {
    public static void main(String[] args) {
        byte b1 = 100;
        byte b2 = 100;

        byte bHap = (byte)(b1 + b2); // byte, short, char는 연산시 int로 변환
        System.out.println(bHap);

        int i1 = 100;
        b1 = (byte) i1; // 큰 범위가 작은 범위로 형변환 : 명시적 형변환
        i1 = b1; // 작은 범위가 큰 범위로 형변환 : 묵시적 형변환

        long l1;
        l1 = i1;
        i1 = (int) l1; // long이 아닌 int

        long total;
        total = i1 + l1;
        System.out.println(total);

        int hap;
        hap = (int) (i1 + l1);
        System.out.println(hap);

        float f1 = 100.0f;
        total = (long)(l1 + f1);
    }
}