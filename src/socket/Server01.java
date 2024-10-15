package socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		System.out.println("접속을 기다립니다.");
		Socket sock = server.accept();
		System.out.println("연결 되었습니다 : " + sock.getInetAddress());
		System.out.println("수신 대기 중 . . . .");
		InputStream in = sock.getInputStream();
		int readData = in.read();
		System.out.println("수신 데이터 : " + readData);

		in.close();
		sock.close();
		server.close();
	}
}