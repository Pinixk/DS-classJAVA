import javax.swing.JFrame;

public class App {
    // 속성, member variable 멤버 변수
    int num = 1;
    // 기능, method
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       
        new MyFrm();
    }
}

class MyFrm extends JFrame {
    public MyFrm() {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setVisible(true);
    }
}