
public class Sedan extends Vehicle {  //vehicle을 상속 받는거야!
	public Sedan(String carName) {  //생성자 만드는중 (반드시 매개변수를 줘야 한다.)
		this.carName = carName;
	}
	public void move() { //부모 클래스의 무브를 재 정의 하는거야!
		System.out.println(carName + " : 조용하게 움직인다.");		
	}
}
