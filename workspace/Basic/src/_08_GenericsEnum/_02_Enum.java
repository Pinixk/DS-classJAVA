package _08_GenericsEnum;

public class _02_Enum {
   public static void main(String[] args) {
      System.out.println(Direction.East); 
      System.out.println(Direction2.East);
   }
}

class Direction{
   final static int North = 0;
   final static int East = 1;
   final static int South = 2;
   final static int West = 3;
}

enum Direction2 {North,East,South,West};
// 속성이 상수일 때 사용