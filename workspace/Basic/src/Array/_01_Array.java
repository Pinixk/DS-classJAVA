public class _01_Array {
    public static void main(String[] args) {
        // 배열 선언 양식
        // 배열도 객체
        // 사용 시점에 따라 초기화 시점을 정함

        int arr[] = new int[5];  
        // JAVA는 배열의 크기를 정해줘야 한다. 변경 불가.
        // int 타입의 엘레먼트가 10개
        // element의 값 0(int)

        int arr2[] = new int[]{1,2,3,4,5};
        int arr3[] = {1,2,3,4,5}; 

        int arr4[]; // 초기화 전 상태
        arr4 = new int[5];
        arr4[0] = 1;
        arr4[1] = 2;
        arr4[2] = 3;
        arr4[3] = 4;
        arr4[4] = 5;

        int arr5[];
        arr5 =  new int[]{1,2,3,4,5};
        // arr5 = {1,2,3,4,5}; // 안됨

        System.out.println(arr5[1]);
    }
}
