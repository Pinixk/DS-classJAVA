package _14_Network;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

public class _02_TcpIpClient {
  public static void main(String[] args) {
    try {

      String serverIp = JOptionPane.showInputDialog("Input Server Address", "192.168.0.127");
      System.out.println("Connection Server.... ServerIp : "+ serverIp);

      Socket socket = new Socket(serverIp, 7777);
      InputStream is = socket.getInputStream();
      DataInputStream dis = new DataInputStream(is);
      System.out.println("From Server : "+ dis.readUTF());
      dis.close();
      socket.close();
      System.out.println("Server Connection is closed");

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
