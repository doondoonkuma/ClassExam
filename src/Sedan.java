
public class Sedan extends Vehicle {  //vehicle�� ��� �޴°ž�!
	public Sedan(String carName) {  //������ ������� (�ݵ�� �Ű������� ��� �Ѵ�.)
		this.carName = carName;
	}
	public void move() { //�θ� Ŭ������ ���긦 �� ���� �ϴ°ž�!
		System.out.println(carName + " : �����ϰ� �����δ�.");		
	}
}
