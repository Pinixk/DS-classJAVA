package _10_Lambda;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@FunctionalInterface
interface MyFunction {void run();}
@FunctionalInterface
interface MyMax {int max(int a, int b);}


public class _01_Lambda {
   // lambda식 표기
   static MyMax mm1 = (int a, int b) -> a > b ? a : b;
   // 익명객체식 표기
   MyMax mm2 = new MyMax() {
      @Override
      public int max(int a, int b) {
         return a > b ? a : b;
      };
   };

   static MyFunction getMyFunction() {
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}

   public static void main(String[] args) {
      // static 있을 때
      System.out.println(mm1.max(1, 2));
      // static 없을 때
      _01_Lambda lambda = new _01_Lambda();
      System.out.println(lambda.mm2.max(1, 2));

      MyMax mm1 = (int a, int b) -> a > b ? a : b;
      System.out.println(mm1.max(4, 5));



      // lambda식
      MyFunction f1 = () -> System.out.println("MyFunction");
      // 풀어서
      MyFunction f0 = new MyFunction() {
         @Override
         public void run() {
            System.out.println("MyFunction");
         }
      };
      // 반환 타입이 Myfunction인 메서드
      MyFunction f2 = getMyFunction();

      f0.run();
      f1.run();
      f2.run();

      

      JButton btn = new JButton("Confirm");
      // lambda식
      btn.addActionListener(e -> System.out.println("hello"));
      // 풀어서
      btn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            System.out.println("hello");
         }
      });
   }
}
