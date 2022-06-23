package _01_Var_Oper;

// 연산자 우선순위
// 단항> 산술> 비교> 논리> 삼항> 대입
// <-- | -----------------> | <--
// 결합 순위

import javax.swing.JOptionPane;

public class _05_Operator {
    public static void main(String[] args) {
        String input = "";
        try {
            input = JOptionPane.showInputDialog(null, "숫자 2개를 입력하세요");
            // parseInt에 static이 내포되어 있으므로 new없이 사용 가능
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        System.out.printf("몫: %d, 나머지:%d \n",
                Integer.parseInt(input.split(",")[0]) / Integer.parseInt(input.split(",")[1]),
                Integer.parseInt(input.split(",")[0]) % Integer.parseInt(input.split(",")[1])
        // int%int 값은 정수
        );

        int result = (int) (Math.random() * 100); // int를 활용한 소수점 절삭 효과
        System.out.println(result);
    };
}