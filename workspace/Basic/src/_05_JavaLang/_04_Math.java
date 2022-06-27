package _05_JavaLang;

import java.util.Arrays;

public class _04_Math {
  public static void main(String[] args) {
    System.out.println(Math.abs(-10));        // 절대값
    System.out.println(Math.ceil(10.1));    // 올림
    System.out.println(Math.floor(10.8));   // 버림
    System.out.println(Math.round(10.5));   // 반올림

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

    System.out.println(Math.rint(1.6)); // 2.0
    System.out.println(Math.rint(-1.7));  // -2.0

    Object obj = 10;
    Integer i1 = Integer.valueOf(10);
    System.out.println( obj == i1 );

    int i2 = (int)obj;
    int i3 = i1;
  }
}