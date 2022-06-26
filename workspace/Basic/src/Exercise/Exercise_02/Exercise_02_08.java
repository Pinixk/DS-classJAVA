package Exercise.Exercise_02;

public class Exercise_02_08 {
   public static void main(String[] args) {
      
      // 8번
      int x = 1;
      int y = 2;
      int z = 3;

      int tmp = x;
      x = y;
      y = z;
      z = tmp;

      System.out.println("x=" + x);
      System.out.println("y=" + y);
      System.out.println("z=" + z);
   }
}
