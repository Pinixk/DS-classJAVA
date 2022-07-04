import java.awt.Font;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import _12_Swing.BaseFrm;

public class Main extends BaseFrm {
  public static void main(String[] args) {
    new Main();
  }

  private JTextArea ta;
  private JScrollPane scp;
  private JTextField tf;
  private Socket socket;
  private DataOutputStream out;
  private String nickName;

  public Main(){
    super("Chat room", 400, 500);
    String serverIp = JOptionPane.showInputDialog("Input Server Ip", "192.168.0.127");
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
        out.writeUTF("["+nickName+"]"+tf.getText());
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
