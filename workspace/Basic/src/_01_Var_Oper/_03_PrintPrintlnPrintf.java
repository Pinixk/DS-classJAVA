package _01_Var_Oper;

public class _03_PrintPrintlnPrintf {
    public static void main(String[] args) {
        System.out.print("h");
        System.out.print("a");
        System.out.println();       // println은 공백 가능
        System.out.println("h"); // 개행
        System.out.println("a");
        
        for (int i=2; i<10; i++){
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d*%d=%2d %n",i,j,i*j);
                // %로 대입 가능
                // %n 줄 바꿈
            }
            System.out.println();
        }
        System.out.printf("%c is %s \n", 'A',"Ace");
        System.out.printf("%4.2f \n" , 1234.56f);  // %전체자리.소수점 아래 자리
        System.out.printf("%4.2g \n", 1234.56f);  // %전체자리.소수점 아래 자리
        System.out.printf("%4.2e \n", 1234.56f);  // %전체자리.소수점 아래 자리
        // %f = 부동 소수점 형식
        // %g = 지수 형식
        // %e = 간략하게 표현
        
        // %d = 10진 정수
        // %x = 16진 정수
        // %c = 문자(char)로 출력
        // %s = 문자(string)로 출력
    }
}