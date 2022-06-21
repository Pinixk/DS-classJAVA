public class VariableCastType {
    public static void main(String[] args) {
        byte b1 = 100;
        int i1 = 100;
        b1 = (byte) i1; // 큰 범위가 작은 범위로 형변환 : 명시적 형변환
        i1 = b1; // 작은 범위가 큰 범위로 형변환 : 묵시적 형변환

        long l1;
        l1 = i1;
        i1 = (int) l1; // long이 아닌 int

        long total;
        total = i1 + l1;

        int hap;
        hap = (int) (i1 + l1);

        float f1 = 100.0f;
        total = (long)(l1 + f1);

        
    }
}