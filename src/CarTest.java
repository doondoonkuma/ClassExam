public class CarTest {

	public static void main(String[] args) {
		//차명, 속도를 멤버변수로
		//차명으로 생성가능
		//차명, 속도로 생성가능
		//인수 없이 생성가능
		//차명, 속도 각각 읽기
		//차명, 속도 각각 저장
		//차명, 속도 동시 변경
		//주어진 값으로 속도 증가
		//주어진 값으로 속도 감소
		//인수 없이 생성했을 경우 기본값 저장("자동차",150)
		//별도의 클래스에서 객체 생성하고 테스트
		
		
		Car k1 = new Car();
		Car k2 = new Car("케이5");
		Car k3 = new Car("케이5", 100);
		Car k4 = new Car("케이5", 50);
		k3.setSpeedup(10);	
		k4.setSpeeddw(10);
		
		
		
		System.out.println("차명 : " + k2.getName());
		System.out.println("속도 : " + k3.getspeed());
		System.out.println("속도 : " + k4.getspeed());
		System.out.println(k1.getname() + k1.speed);

	}

}