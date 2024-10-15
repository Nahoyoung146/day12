package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client02 {
	public static void main(String[] args) throws Exception {
		Socket sock = new Socket("192.168.51.67", 12346);
		Scanner input = new Scanner(System.in);
		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		System.out.print("입력 : ");
		String msg = input.next();
		dos.writeUTF(msg);

		InputStream in = sock.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		msg = dis.readUTF();
		System.out.println("받은 데이터 : " + msg);

		dos.close();
		os.close();
		sock.close();
	}
}