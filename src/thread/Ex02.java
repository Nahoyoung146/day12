package thread;

class MyThread {
	public void run() {
		System.out.println("부모 run 기능");
	}

	public void start() {
		System.out.println("부모 start 기능");
		System.out.println("start에 의해서 thread(일꾼) 생성");
		System.out.println("그리고 나서 run메소드 실행");
		System.out.println("run은 동작 시키고자 하는 code 작성");
		run();
	}
}

class A02 extends MyThread {
	public void run() {
		System.out.println("자식 run 기능");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		A02 a = new A02();
		a.start();
	}
}