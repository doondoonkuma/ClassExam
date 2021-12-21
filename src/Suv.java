
public class Suv extends Vehicle {  //vehicle을 상속 받는거야!
	public Suv (String carName) {
		this.carName = carName;
	}
	public void move() { //부모 클래스의 무브를 재 정의 하는거야!
		System.out.println(carName + " : 산길을 간다.");
	}
}