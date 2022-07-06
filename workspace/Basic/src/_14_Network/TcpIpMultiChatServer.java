package _14_Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpIpMultiChatServer {
	HashMap<String, DataOutputStream> clients;
	
	public TcpIpMultiChatServer() {
		clients = new HashMap<>();
		Collections.synchronizedMap(clients);
	}
	
	public void start() {
		ServerSocket ss = null;
		Socket socket = null;
		try {
			ss = new ServerSocket(7777);
			System.out.println("Server is started");
			
			while(true) {
				socket = ss.accept();//접속하는 계정당 socket이 생성
				System.out.println("["+socket.getInetAddress()+":"
						+socket.getPort()+"] is Accepted");
				//socket이 생성되면서 각각의 thread가 생성됨.
				new ServerReceiver(socket).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		public ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (Exception e) { }
		}
		@Override
		public void run() {
			String nickName = "";
			try {
				nickName = in.readUTF();
				clients.put(nickName, out);
				sendToAll("["+nickName+"]님이 입장하셨습니다.");
				System.out.println("서버 접속자 수: "+clients.size());
				//in(DataInputStream)이 null이면 종료=>socket이 소멸될 때와 같음.
				while(in != null) {
					//in.readUTF()에 들어오는 값이 있으면 전체에게 보냄
					sendToAll(in.readUTF());
				}
			} catch (IOException e) { 
  		} finally {
  			clients.remove(nickName);
  			sendToAll("["+nickName+"]님이 나가셨습니다.");
  			System.out.println("서버 접속자 수: "+clients.size());
  		}
		}
	}
	
	private void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator();
		while(it.hasNext()) {
			try {
				DataOutputStream out = clients.get(it.next());
				out.writeUTF(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new TcpIpMultiChatServer().start();
	}
}