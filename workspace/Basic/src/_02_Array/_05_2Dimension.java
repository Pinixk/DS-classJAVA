public class _05_2Dimension {
    public static void main(String[] args) {
        int[] arr[] = new int[3][3];
        printArr(arr);
    }

    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { // arr.length, 행의 길이
            for (int j = 0; j < arr[i].length; j++) { // arr[i].length, 열의 길이
                if (j != 0)
                    System.out.print(',');
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    
}
