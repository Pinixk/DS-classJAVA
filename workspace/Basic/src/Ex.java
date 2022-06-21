public class Ex {
   public static void main(String[] args) {
      int x = 1;
      int y = 2;
      int z = 3;

      int tmp;
      tmp = x;
      x=y;
      y=z;
      z=tmp;

      System.out.println("x="+x);
      System.out.println("y="+y);
      System.out.println("z="+z);

      System.out.println("1"+"2");
      System.out.println(true+"");
      System.out.println('A'+'B');
      System.out.println('1'+2);
      System.out.println('1'+'2');
      System.out.println('J'+"ava");
      // System.out.println(true+null);

      byte b = 256;
      // char c = '';
      // char answer = 'o';
      // float f = 3.14;
      // double d = 1.4e3f;
   }
}