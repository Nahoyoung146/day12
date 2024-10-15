package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12346);
		System.out.println("접속 대기중.");
		Socket sock1 = server.accept();
		Socket sock2 = server.accept();
		Socket sock3 = server.accept();
		System.out.println("데이터 주고 받음");

//		System.out.println("연결 되었습니다 : " + sock.getInetAddress());
//		System.out.println("수신 대기 중 . . . .");
//		InputStream in = sock.getInputStream();
//		DataInputStream dis = new DataInputStream(in);
//		String readData = dis.readUTF();
//		System.out.println("수신데이터 : " + readData);
//		
//		OutputStream os = sock.getOutputStream();
//		DataOutputStream dos = new DataOutputStream(os);
//		dos.writeUTF("서버에서 응답!!!");
//
//		dis.close();
//		in.close();
//		sock.close();
//		server.close();
	}
}