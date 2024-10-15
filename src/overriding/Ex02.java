package overriding;

import java.util.ArrayList;

class Test02 extends ArrayList<String> {
	public void test() {
		System.out.println("상속 외 추가 기능");
	}

	// @Override
	public boolean add(String e) {
		System.out.println(e + "잘 추가 되었음!!!");
		return super.add(e);
	}

	@Override
	public String get(int index) {
		System.out.println(index + ".번째 돌려줄께요~");
		return super.get(index);
	}

}

public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.add("문자열");
		System.out.println(t.get(0));
		t.test();
	}
}