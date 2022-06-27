package _05_JavaLang;

import java.util.Arrays;

public class _04_Math {
  public static void main(String[] args) {
    System.out.println(Math.abs(-10));        // 절대값
    System.out.println(Math.ceil(10.1));    // 올림
    System.out.println(Math.floor(10.8));   // 버림
    System.out.println(Math.round(10.5));   // 반올림
    System.out.println();

    System.out.println(Math.max(-1.4, -1.2)); // 두 개만 비교 가능
    int[] arr = new int[5];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int)(Math.random()*arr.length)+1;
    }
    System.out.println(Arrays.toString(arr));
    int max = arr[0];
    int min = arr[0];
    for (int i = 0; i < arr.length-1; i++) {
      max = Math.max(max, arr[i+1]);
    }
    for (int i = 1; i < arr.length-1; i++) {
      min = Math.min(min, arr[i+1]);
    }
    System.out.println(max);
    System.out.println(min);
    System.out.println();

    System.out.println(Math.rint(1.6)); // 2.0
    System.out.println(Math.rint(1.5)); // 1.0
    System.out.println(Math.rint(-1.5));  // -2.0
    // 6에서 반올림
    System.out.println();

    Object obj = 10;
    Integer i1 = Integer.valueOf(10);
    System.out.println( obj == i1 );

    @SuppressWarnings("unused")
    int i2 = (int)obj;
    @SuppressWarnings("unused")
    int i3 = i1;
    System.out.println();

    // wrapper class Integer로 변환
    System.out.println(Integer.valueOf("1010",2)); // 2진수를 10진수로 변환
    System.out.println(Integer.valueOf("1010",8)); // 8진수를 10진수로 변환
    System.out.println(Integer.valueOf("1010",16)); // 16진수를 10진수로 변환
    System.out.println();

    // 기본형 int로 변환
    System.out.println(Integer.parseInt("1010",2)); // 2진수를 10진수로 변환
    System.out.println(Integer.parseInt("1010",8)); // 8진수를 10진수로 변환
    System.out.println(Integer.parseInt("1010",16)); // 16진수를 10진수로 변환
    System.out.println();

    System.out.println(Integer.toBinaryString(10)); // 10진수를 2진수로 변환
    System.out.println(Integer.toOctalString(10));  // 10진수를 8진수로 변환
    System.out.println(Integer.toHexString(10));    // 10진수를 아스키코드로 변환
    System.out.println();
    
    @SuppressWarnings("unused")
    int num = Integer.parseInt("10");   // 참조형 => 일반형, Unboxing
    @SuppressWarnings("unused")
    Integer i4 = Integer.valueOf(10); // 참조형 => 참조형
    @SuppressWarnings("unused")
    Integer i5 = 10;  // 일반형 => 참조형, Autoboxing

    // Autoboxing과 unboxing은 암묵적으로 처리됨
    Object[] objs = new Object[5];
    objs[0] = true;
    objs[1] = new Object();
    objs[2] = 10;
    objs[3] = Integer.valueOf(10);

    System.out.println(objs[2]); 
    System.out.println(Integer.valueOf(10)); 
  }
}