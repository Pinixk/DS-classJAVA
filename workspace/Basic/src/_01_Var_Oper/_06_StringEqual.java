package _01_Var_Oper;

import java.util.Scanner;

public class _06_StringEqual {
    public static void main(String[] args) {
        String id = "admin";
        System.out.println("ID를 입력하세요");

        @SuppressWarnings("resource")
        String input = new Scanner(System.in).nextLine();
        // if (input == id) {   // 주소값이 달라서 같아고 할 수 없다.
        if (input.equals(id)) {
            System.out.println("일치합니다");
        } else {
            System.out.println("일치하지 않습니다");
        }

        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.equals(str2) ? "같아요" : "달라요");

        String str3 = "abc";
        String str4 = "abc";
        System.out.println(str3.hashCode());   // str3의 주소값을 볼 수 있음
        System.out.println(str4.hashCode());
        System.out.println(str3 == str4 ? "같아요" : "달라요");
        
    }
}
