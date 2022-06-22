public class Exercise_04_06 {
    public static void main(String[] args) {

        // for (int i = 1; i <= 6; i++) {
        //     for (int j = 1; j <= 6; j++) {
        //         if (i + j == 6)
        //             System.out.println(i + "+" + j + "=" + (i + j));
        //     }
        // }

        final int DICE = 6;
        for (int i = 1; i < DICE; i++) {
            int diff = DICE-i;
            System.out.println(i + "+" + diff + "="+ "6");
        }

    }
}
