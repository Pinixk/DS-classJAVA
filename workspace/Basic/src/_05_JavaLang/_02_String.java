package _05_JavaLang;

import java.util.Arrays;

public class _02_String {
  public static void main(String[] args) {
    
    String str2 = "Hello";
    String str = new String("Hello");

    for (int i = 0; i < str.length(); i++) { // string에선 length가 method
      System.out.print(str.charAt(i));
    }

    System.out.println();
    System.out.println(str.compareTo("Ahello")); // 맨 앞의 문자의 아스키코드를 비교
    System.out.println(str.concat(" World"));              // 문자 병합

    System.out.println(str.contains("Hell"));            // 문자 포함 여부
    System.out.println(str.startsWith("He"));       // 시작 단어 일치 여부
    System.out.println(str.endsWith("lo"));         // 끝나는 단어 일치 여부

    System.out.println(str.equalsIgnoreCase("hELlO")); 
    System.out.println(str.intern() == str2.intern());

    System.out.println(str.indexOf("ll"));             // 문자 위치 확인
    System.out.println(str.indexOf("l",3)); // 3번째 index에서부터 위치 확인
    System.out.println(str.lastIndexOf("ll"));         // ll의 포함여부 + 위치

    System.out.println(str.replace("l", "k"));     // 문자열 대체
    System.out.println(str.replaceAll("l", "k"));   // 문자열 대체
    System.out.println(str.replaceFirst("l", "k")); // 첫 문자열만 대체

    String[] arr = str.split("");
    System.out.println(Arrays.toString(arr)); // 문자 한 단어씩 뽑아내기
    System.out.println(str.substring(2,5)); // 특정 위치 문자열 뽑기

    System.out.println(str.toUpperCase());  // 대문자
    System.out.println(str.toLowerCase());  // 소문자

    System.out.println("         blank       banksy          ");
    System.out.println("         blank       banksy          ".trim()); // 앞의 공백 처리

    System.out.println(String.valueOf(true)); // 값을 문자열로 출력

    System.out.println(0b10); // 2진수
    System.out.println(0010); // 8진수
    System.out.println(0x10); // 16진수
    
  }
}
