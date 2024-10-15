package overriding;

import java.util.ArrayList;

class A05 {

}

class B05 extends A05 {

}

class TestDTO {
	private String name;
	private int age;

	public TestDTO() {

	}

	public TestDTO(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
}

public class Ex05 {
	public static void main(String[] args) {
		TestDTO dto = new TestDTO("홍길동", 20);
		System.out.println("dto : " + dto);
		System.out.println("dto.toString : " + dto.toString());
		
		int[] arr = {1,2,3};
		ArrayList arr02 = new ArrayList();
		arr02.add(111);
		arr02.add(222);
		
		System.out.println("배열 : " + arr);
		System.out.println("리스트 : " + arr02);

		B05 b = new B05();
		System.out.println("aaa".getClass());
		System.out.println(b.getClass());
		System.out.println(b.toString());
		System.out.println(b);
	}
}