
	// 추상 클래스 교재 281p
public abstract class Computer {  // 클래스 자체도 추상 클래스로 만들어 줘야 에러가 안 나타난다.
	public abstract void display();  // 추상 메서드
	public abstract void typing();   // 추상 메서드
	public void turnOn() {
		System.out.println("전원을 켠다.");
	}
	public void turnOff() {
		System.out.println("전원을 끈다.");
	}
}
