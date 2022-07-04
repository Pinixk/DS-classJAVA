package _14_Network;

import java.awt.Font;
import java.io.*;
import java.net.Socket;
import javax.swing.*;
import _12_Swing.BaseFrm;

public class _04_Test extends BaseFrm {

  private JTextArea ta;
  private JScrollPane scp;
  private JTextField tf;
  private Socket socket;
  private String nickName;
  private DataOutputStream out;

  public _04_Test() {
    super("Multitf", 400, 500);
    String serverIp = JOptionPane.showInputDialog("Input Server IP", "192.168.0.127");
    nickName = JOptionPane.showInputDialog("Input Your Nicname");

    try {
      socket = new Socket(serverIp, 7777);
      out = new DataOutputStream(socket.getOutputStream());
      out.writeUTF(nickName);

    } catch (Exception e) {
      e.printStackTrace();
    }

    Receirver r = new Receirver(socket);
    r.start();
    tf.requestFocus();

  }

  public static void main(String[] args) {
    new _04_Test();
  }

  @Override
  public void init() {
    ta = new JTextArea();
    ta.setEditable(false);
    scp = new JScrollPane(ta);
    tf = new JTextField();
    tf.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
    ta.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
    tf.addActionListener(e -> {
      try {
        out.writeUTF("[" + nickName + "]"+tf.getText());
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

  private class Receirver extends Thread {
    Socket socket;
    DataInputStream in;

    public Receirver(Socket socket) {
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
