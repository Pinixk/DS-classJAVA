public class JExercise_04_05 {
    public static void main(String[] args) {

        // 7번
        String str = "12445";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        System.out.println("sum=" + sum);

    }
}
