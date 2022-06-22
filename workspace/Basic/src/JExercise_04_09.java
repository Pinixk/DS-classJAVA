import java.util.Scanner;

public class JExercise_04_09 {
    public static void main(String[] args) {

        // int num = 12345;
        // int sum = 0;

        // while(num>0){
        // sum += num%10;
        // num /= 10;
        // }
        // System.out.println("sum="+sum);

        Scanner s = new Scanner(System.in);
        System.out.println("Input number");
        String input = s.nextLine();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            sum += (c >= '0' && c <= '9') ? c - '0' : 0;
        }
        System.out.println("sum=" + sum);

    }
}
