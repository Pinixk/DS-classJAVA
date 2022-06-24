package Exercise.Exercise_04;

public class Exercise_04_02 {
    public static void main(String[] args) {

        int num2 = 0;
        int total = 0;
        for (int i = 0; i <= 20; i++) {
            if (!(i % 2 == 0 || i % 3 == 0))
                num2 += i;

            if (i % 2 != 0 && i % 3 != 0) {
                total += i;
            }

        }
        System.out.println(num2);
        System.out.println(total);

    }
}
