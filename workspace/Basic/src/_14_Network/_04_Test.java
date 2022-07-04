package _14_Network;

import java.io.DataInputStream;
import java.net.Socket;
import javax.swing.*;
import _12_Swing.BaseFrm;

public class _04_Test extends BaseFrm {

  private JTextArea ta;
  private JScrollPane scp;
  private JTextField chat;
  private Socket socket;
  private String nickName;

  public _04_Test() {
    super("MultiChat", 400, 500);
    String serverIp = JOptionPane.showInputDialog("Input Server IP", "192.168.0.127");
    nickName = JOptionPane.showInputDialog("Input Your Nicname");

    try {
      socket = new Socket(serverIp, 7777);
    } catch (Exception e) {
      e.printStackTrace();
    }

    Receirver r = new Receirver(socket);
    r.start();
    chat.requestFocus();

  }

  public static void main(String[] args) {
    new _04_Test();
  }

  @Override
  public void init() {
    ta = new JTextArea();
    ta.setEditable(false);
    scp = new JScrollPane(ta);
    chat = new JTextField();
  }

  @Override
  public void arrange() {
    setTitle("My Memo");
    add(scp);
    add(chat, "South");
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
          ta.append(in.readUTF());
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }

}
