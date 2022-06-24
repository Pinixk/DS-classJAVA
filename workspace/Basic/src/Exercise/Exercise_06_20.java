package Exercise;

public class Exercise_06_20 {
    static int max(int[] arr){
        if(arr == null || arr[i] == '0') return -9999999;
    }
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 : "+max(data));
        System.out.println("최대값 : "+max(null));
        System.out.println("최대값 : "+max(new int[]{}));
    }
}
