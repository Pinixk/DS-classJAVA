package _02_Array;

public class _06_2Dimention {
    public static void main(String[] args) {
        int[][] arr = {{100,100,100},{90,90,90},{80,80,80},{70,70,70}};

        int[][] sum = new int[arr.length+1][arr[0].length+1];

        for (int i = 0; i < arr.length; i++) {                  // arr의 행 길이
            for (int j = 0; j < arr[i].length; j++) {           // arr의 열 길이
                sum[i][j] = arr[i][j];                          // arr을 sum에 복사
                sum[i][arr[i].length] += arr[i][j];             // 행의 합을 끝에 출력
                sum[arr.length][j] += arr[i][j];                // 열의 합을 끝에 출력
                sum[arr.length][arr[i].length] += arr[i][j];    // 모든 원소의 합을 출력
            }
        }
        _05_2Dimension.printArr(sum);
    }
}
