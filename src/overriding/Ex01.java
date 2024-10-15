package overriding;

class Ferrari {
	private int ye;

	public Ferrari(int ye) {
		this.ye = ye;
	}

	public int getYe() {
		return ye;
	}

	public void speed() {
		System.out.println(ye + "년식 페라리 속도 : 300km");
	}

}

class NewFerrari extends Ferrari {
	public NewFerrari(int ye) {
		super(ye);
	}

	public void autoSystem() {
		System.out.println("자동 운전 모드 실행!!!");
	}

	public void newSpeed() {
		System.out.println(getYe() + "년식 페라리 400km");
	}

	public void speed() {
		System.out.println(getYe() + "년식 페라리 500km");
	}
}

public class Ex01 {
	public static void main(String[] args) {
//		Ferrari fe = new Ferrari(2024);
//		fe.speed();
		NewFerrari nf = new NewFerrari(2025);
		nf.speed();
		// nf.newSpeed();
		nf.autoSystem();
	}
}