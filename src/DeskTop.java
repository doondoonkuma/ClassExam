public class DeskTop extends Computer {  //컴퓨터 클래스를 상속받을 거야!
	// 추상클래스를 상속받았을 경우 반드시 추상메서드를 구현해야 한다.
	@Override // 컴파일러에게 아래에 있는 내용을 좀 신경써줘! 라고 알려주는 기능(굳이 없어도 되지만, 오타 및 에러를 찾아내는데 좋다.)
	public void display() {  // 상속 받는 쪽에서는 abstract예약어(추상)는 쓰지 않는다.
		System.out.println("DeskTop display");
	}
	@Override // 여러개 쓰면 각별히 신경쓸게!의 의미? 잘못된 문장을 찾아내는데 굿!
	public void typing() {
		System.out.println("DeskTop typing");
	}
	
}
// 일단은 컴퓨터와 데스크탑의 관계만 이해하자