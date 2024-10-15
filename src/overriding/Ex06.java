package overriding;

class A06 {
	public void test() {
		System.out.println("aaaa");
	}
}

class B06 extends A06 {
	public void test() {
		System.out.println("bbbb");
	}
}

class C06 extends A06 {
	public void test() {
		System.out.println("cccc");
	}
}

public class Ex06 {
	public static void main(String[] args) {
		A06 a = new A06();
//		B06 b = new B06();
//		C06 c = new C06();
//		a.test();
//		b.test();
//		c.test();
		a = new A06();
		a.test();
		a = new B06();
		a.test();
		a = new C06();
		a.test();
	}
}