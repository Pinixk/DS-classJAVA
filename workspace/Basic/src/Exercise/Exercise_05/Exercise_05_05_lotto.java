package Exercise.Exercise_05;

import java.util.Arrays;

import _02_Array._04_ShuffleSort;

public class Exercise_05_05_lotto {
    public static void main(String[] args) {
        int lotto[] = new int[45];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = i+1;
        }
        _04_ShuffleSort.shuffle(lotto);
        
        shuffle(lotto);
        System.out.println();
        pick6Balls(lotto);
    }


    static void pick6Balls(int[] arr){
        System.out.print("[");
        for (int i = 0; i < 6; i++) {
            if (i!=0) System.out.print(",");
            System.out.print(arr[i]);    
        }
        System.out.print("]");
    }

    static void shuffle(int[] arr) { // 메인에 static이 붙어있기 때문에 같이 붙여준다.
        for (int i = 0; i < arr.length; i++) {
            int rand = (int) (Math.random() * 10);
            int tmp = arr[i];
            arr[i] = arr[rand];
            arr[rand] = tmp;
        }
        System.out.print(Arrays.toString(arr));
    }
}
