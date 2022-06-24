package _04_Exception;

public class _01_Exception {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0); // Arithmetic Exception
            // throw new Exception(); // 강제적 예외 발생
            System.out.println(4);
        } catch (ArithmeticException e) { // 범위가 좁은 exception을 위로 올려야함
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println(5);
        } catch (Exception e) {
            System.out.println(6);
        } finally {
            System.out.println(7);
        }
        System.out.println(8);
    }
}
