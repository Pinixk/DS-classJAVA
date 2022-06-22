import java.util.Arrays;

public class _03_Array {
    public static void main(String[] args) {
        int sum=0;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            sum +=  arr[i];
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(arr));
    }
}
