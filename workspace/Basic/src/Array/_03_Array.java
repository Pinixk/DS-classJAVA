import java.util.Arrays;

public class _03_Array {
    public static void main(String[] args) {
        int total=0;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            total += arr[i];
        }
        System.out.println("arr 값 : "+Arrays.toString(arr));

        System.out.println("arr 합 : "+total);
        System.out.println("arr 평균 : "+(float)total/arr.length);
    }
}
