package Exercise.Exercise_04;

import java.util.Scanner;

public class Exercise_04_09 {
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
            num = Integer.parseInt(input);
        } catch(Exception e){
            System.out.println("숫자를 입력하지 않아 종료합니다.");
            System.exit(-1);
        }

        while(true){
            if(num/10 == 0){    // 10보다 작은 수를 10으로 나누면 몫은 0(int이기 때문) 
                sum += num;
                break;
            } else {
                sum += num%10;  // 10으로 나누고 나머지를 합함
                num = num/10;   // 10으로 나눈 몫을 tmp에 담고 loop
            }
        }
        System.out.println("sum=" + sum);

    }
}
