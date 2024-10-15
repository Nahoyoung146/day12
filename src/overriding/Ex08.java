package overriding;

public class Ex08 {
	public static void main(String[] args) {
		int num = 100;
		String str = "aaaa";

		Object obj01 = 111;
		Object obj02 = "aaaa";
		Object obj03 = 1.2323;
		Object obj04 = new Ex07();
		String s = (String) obj02 + "bbbb";
		System.out.println((int) obj01 * 100);
	}
}