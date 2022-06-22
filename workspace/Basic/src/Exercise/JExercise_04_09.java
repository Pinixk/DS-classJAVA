import java.util.Scanner;

public class JExercise_04_09 {
    public static void main(String[] args) {

        // int num = 12345;
        // int sum = 0;

        // while (num > 0) {
        //     sum += num % 10;
        //     num /= 10;
        // }
        // System.out.println("sum=" + sum);

        Scanner s = new Scanner(System.in);
        System.out.println("Input number");
        String input = s.nextLine();

        int num = 0;
        int sum = 0;
        try{
            num = Integer.parseInt(input)
        } catch(Exception e){
            System.out.println("숫자를 입력하지 않아 종료합니다.");
            System.exit(-1);
        }

        int tmp = 0;
        while(tmp>=10){
            tmp = num/10;
            sum += tmp%10;
        }

        System.out.println("sum=" + sum);

    }
}
