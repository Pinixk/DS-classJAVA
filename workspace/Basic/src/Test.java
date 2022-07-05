import java.awt.Font;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test extends Base {
  public static void main(String[] args) {
    new Test();
  }

  private JTextArea ta;
  private JScrollPane scp;
  private JTextField tf;
  private Socket socket;
  private DataOutputStream out;
  private String nickName;

  public Test() {
    super("Chat room", 400, 500);
    String serverIp = JOptionPane.showInputDialog("Input Server Ip", "192.168.0.10");
    nickName = JOptionPane.showInputDialog("Input Your Nickname");

    try {
      socket = new Socket(serverIp, 7777);
      out = new DataOutputStream(socket.getOutputStream());
      out.writeUTF(nickName);
    } catch (Exception e) {
      e.printStackTrace();
    }

    Receiver r = new Receiver(socket);
    r.start();
    tf.requestFocus();
  }

  @Override
  public void init() {

    ta = new JTextArea();
    ta.setEditable(false);
    ta.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
    scp = new JScrollPane(ta);

    tf = new JTextField();
    tf.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
    tf.addActionListener(e -> {
      try {
        String tmp = tf.getText();
        if (tmp.length() != 0 && tmp.trim().length() != 0)
          out.writeUTF("[" + nickName + "]" + tf.getText());
        tf.setText("");
      } catch (Exception e1) {
        e1.printStackTrace();
      }
    });

  }

  @Override
  public void arrange() {
    setTitle("My Memo");
    add(scp);
    add(tf, "South");
  }

  private class Receiver extends Thread {
    Socket socket;
    DataInputStream in;

    public Receiver(Socket socket) {
      try {
        this.socket = socket;
        in = new DataInputStream(socket.getInputStream());
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    @Override
    public void run() {
      while (in != null) {
        try {
          ta.append(in.readUTF() + "\n");
          ta.setCaretPosition(ta.getDocument().getLength());
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }
}

abstract class Base extends JFrame { // abstract 인스턴스 상속 불가
  private int width, height;

  public Base() {
    this(600, 400);
  }

  public Base(int width, int height) {
    this.width = width;
    this.height = height;
    init();
    arrange();
    inflate();
  }

  public Base(String title) {
    this();
    setTitle(title);
  }

  public Base(String title, int width, int height) {
    this(width, height);
    setTitle(title);
  }

  public abstract void init();

  public abstract void arrange();

  public void inflate() {
    setSize(width, height); // 창 크기 설정
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 누르면 프로그램도 종료
    setLocationRelativeTo(this); // 창 정가운데 정렬
    setVisible(true); // 가시성
  }
}
