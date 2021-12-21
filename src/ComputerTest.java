
public class ComputerTest {

	public static void main(String[] args) {
//		Computer c1 = new Computer();  // 추상클래스는 객체생성 하지 않음
		Computer c2 = new DeskTop();
		c2.turnOn();
		c2.display();
		c2.typing();
		c2.turnOff();
	}

}