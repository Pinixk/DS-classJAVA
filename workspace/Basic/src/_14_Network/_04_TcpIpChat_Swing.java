package _14_Network;

import java.awt.Font;
import java.io.*;
import java.net.Socket;
import javax.swing.*;
import _12_Swing.BaseFrm;

public class _04_TcpIpChat_Swing extends BaseFrm {

  public static void main(String[] args) {
    new _04_TcpIpChat_Swing();
  }
  
  private JTextArea ta;
  private JScrollPane scp;
  private JTextField tf;
  private Socket socket;
  private String nickName;
  private DataOutputStream out;

  public _04_TcpIpChat_Swing() {
    super("Multitf", 400, 500);
    String serverIp = JOptionPane.showInputDialog("Input Server IP", "192.168.0.32");
    nickName = JOptionPane.showInputDialog("Input Your Nicname");

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
