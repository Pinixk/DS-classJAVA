import javax.swing.JFrame;

public class App {
    // 속성, member variable 멤버 변수
    int num = 1;
    // 기능, method
    Employee employee;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Tv tv = new Tv();
        // tv.power();
        System.out.println(tv.sw);
        // Employee emp = new Employee();
        new MyFrm();
    }
}

class Employee {
}

class MyFrm extends JFrame {
    public MyFrm() {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setVisible(true);
    }

}