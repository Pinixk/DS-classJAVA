package _13_IO;

import javax.swing.*;

public class MyDialog extends JDialog {
  public MyDialog(JFrame frame, boolean modal) {
    // JDialog 자체가 modal창임
    super(frame, modal);
    setTitle("For you");
    setSize(400, 500);
    // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(this);
    setVisible(true);
  }
}
