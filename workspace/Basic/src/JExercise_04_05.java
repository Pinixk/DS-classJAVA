public class JExercise_04_05 {
    public static void main(String[] args) {

        // 5번
        int i = 0;
        while (i <= 10) {
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
