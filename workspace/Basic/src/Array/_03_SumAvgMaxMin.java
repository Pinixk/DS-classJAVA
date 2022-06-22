import java.util.Arrays;

public class _03_SumAvgMaxMin {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int total = 0;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length) + 1;
            total += arr[i];
        }
        
        int max = arr[0];
        int min = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }

        System.out.println("arr 값 : " + Arrays.toString(arr));
        System.out.printf("arr 합 : %d, 평균 : %4.2f", total, (float) total / arr.length);
        System.out.println();
        System.out.printf("arr 최대값 : %d, 최소값 : %d", max, min);
    }
}
