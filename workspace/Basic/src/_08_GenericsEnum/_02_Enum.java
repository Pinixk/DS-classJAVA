package _08_GenericsEnum;

public class _02_Enum {
   public static void main(String[] args) {
      System.out.println(Direction.East);
      System.out.println();
      System.out.println(Direction2.East.name()); //
      System.out.println(Direction2.East.ordinal()); //
      System.out.println();
      System.out.println(Direction3.East.name());
      System.out.println(Direction3.East.ordinal());
      System.out.println(Direction3.East.getValue());
      System.out.println();
      System.out.println(Direction4.East.getSimbol());
   }
}

class Direction {
   final static int North = 0;
   final static int East = 1;
   final static int South = 2;
   final static int West = 3;
}

// 속성이 상수일 때 사용
enum Direction2{North,East,South,West}

enum Direction3 {
   North(10), East(20), South(30), West(40);

   private final int value;
   Direction3(int value){
      this.value = value;
   }

   public int getValue() {return value;}
}

enum Direction4{
   North(10,"^"), East(20,">"), South(30,"v"), West(40,"<");

   private final int value;
   private final String simbol;
   
   Direction4(int value, String simbol){
      this.value = value;
      this.simbol = simbol;
   }
   public int getValue() {return value;}
   public String getSimbol() {return simbol;}
}