public class PrintPrintlnPrintf {
    public static void main(String[] args) {
        System.out.print("h");
        System.out.print("a");
        System.out.println();       // println은 공백 가능
        System.out.println("h"); // 개행
        System.out.println("a");
        
        for (int i=2; i<10; i++){
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d*%d=%2d",i,j,i*j);
                // %d로 대입 가능
                System.out.println();
            }
        }

    }
}
ㅇㅁㅇㄴㄹ