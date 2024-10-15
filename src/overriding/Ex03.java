package overriding;

final class A03 { // final은 상속 불가능 따라서 오버라이딩도 불가능
	public void test() {
		System.out.println("a03 기본 기능");
	}
}

class B03 {
	private A03 a;

	public B03() {
		a = new A03();
	}

	public void b03() {
		System.out.println("b03 기능");
		a.test();
	}
}

public class Ex03 {
	public static void main(String[] args) {
		B03 b = new B03();
		b.b03();
	}
}