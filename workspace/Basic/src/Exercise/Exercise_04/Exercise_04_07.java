package Exercise.Exercise_04;

import java.util.Scanner;

public class Exercise_04_07 {
    public static void main(String[] args) {

        // String str = "12445";
        // int sum = 0;

        // for (int i = 0; i < str.length(); i++) {
        //     sum += str.charAt(i) - '0';
        // }
        // System.out.println("sum=" + sum);

        Scanner s = new Scanner(System.in);
        System.out.println("Input number");
        String input = s.nextLine();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            sum += (c>='0' && c<='9') ? c-'0': 0 ;
        }
        System.out.println("sum=" + sum);
        s.close();
    }
}
