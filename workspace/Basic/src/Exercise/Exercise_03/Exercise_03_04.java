package Exercise.Exercise_03;

public class Exercise_03_04 {
    public static void main(String[] args) {
    
        // 4번
        int numOfApples = 123;
        int sizeOfBucket = 10;
        // int numOfBucket = (int)Math.ceil((double)numOfApples / sizeOfBucket);
        int numOfBucket = numOfApples/sizeOfBucket + 
        (numOfApples%sizeOfBucket == 0 ? 0 : 1);

        System.out.println("필요한 바구니의 수 :"+numOfBucket);
        
    }
}
