package _02_Array;

public class _06_2Dimention {
    public static void main(String[] args) {
        int[][] arr = {{100,100,100},{90,90,90},{80,80,80},{70,70,70}};

        int[][] sum = new int[arr.length+1][arr[0].length+1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum[i][j] = arr[i][j];
                sum[i][arr[i].length] += arr[i][j];
                sum[arr.length][j] += arr[i][j];
                sum[arr.length][arr[i].length] += arr[i][j];
            }
        }
        _05_2Dimension.printArr(sum);
    }
}
