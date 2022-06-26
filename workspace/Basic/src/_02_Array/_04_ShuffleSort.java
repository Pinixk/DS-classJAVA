package _02_Array;

import java.util.Arrays;

public class _04_ShuffleSort {
    public static void main(String[] args) {
        int arr[] = new int[10]; // 참조형 변수

        // arr 초기화
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println(Arrays.toString(arr)); // 초기값 출력
        System.out.println();

        shuffle(arr); // shuffle, call by reference
        bubbleSort(arr); // 재정렬

        shuffle(arr);
        selectionSort(arr);
    }

    // shuffle
    public static void shuffle(int[] arr) { // 메인에 static이 붙어있기 때문에 같이 붙여준다.
        for (int i = 0; i < arr.length; i++) {
            int rand = (int) (Math.random() * 10);
            int tmp = arr[i];
            arr[i] = arr[rand];
            arr[rand] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 재정렬(bubble sort)
    // Arrays.sort(arr);

    // Bubble Sort
    static void bubbleSort(int[] arr) {
        int count = 0; // 정렬 횟수 체크
        for (int i = 0; i < arr.length - 2; i++) { // bubble sort의 회전수
            boolean flag = false; // 자리 바꿈이 있어났는지 알아보는 변수
            for (int j = 0; j < arr.length - i - 1; j++) { // 두 값을 비교하는 반복문
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = true;
                }
                count++;
            }
            if (!flag)
                break;
        }
        System.out.println("Bubble Sort 반복 횟수 : " + count);
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    // Selection Sort
    private static void selectionSort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0 + i; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    flag = true;
                }
                count++;
            }
            if (!flag)
                break;
        }
        System.out.println("Selection Sort 반복 횟수 : " + count);
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
}
