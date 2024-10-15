package thread;

class A01 {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("A01 : " + i);
		}
	}
}

class B01 {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("B01 : " + i);
		}
	}
}

public class Ex01 {
	public static void main(String[] args) {
		A01 a = new A01();
		B01 b = new B01();
		a.run();
		b.run();
		System.out.println("프로그램 종료!!!");
	}
}