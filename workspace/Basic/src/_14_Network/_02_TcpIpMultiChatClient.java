package _14_Network;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class _02_TcpIpMultiChatClient {
  public static void main(String[] args) {
    String serverIp = JOptionPane.showInputDialog("Input Server IP", "192.168.0.127");
    String nickname = JOptionPane.showInputDialog("Input Your Nicname");
    Scanner s = new Scanner(System.in);
    DataOutputStream dos;
    
    try {
      Socket socket = new Socket(serverIp, 7777);
      Receirver receirver = new Receirver(socket);
      receirver.start();
      
      dos = new DataOutputStream(socket.getOutputStream());
      dos.writeUTF(nickname);
      while(dos != null){
        dos.writeUTF("["+nickname+"]"+s.nextLine());
      }
    } catch (Exception e) {}

  }
}

class Receirver extends Thread {

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
        String str = in.readUTF();
        System.out.println(str);

      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

}