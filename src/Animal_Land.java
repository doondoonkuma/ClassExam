
public class Animal_Land {

	public static void main(String[] args) {
		// Animal클래스 테스트

//		*클래스 정의
//		1. 동물 클래스 정의
//		- Animal
//		- 생성자(디폴트(동물), 크기(30 ~ 200)와 속도(0)는 디폴트로 설정)
//		- 오버로딩된 생성자(매개변수 1개 : 동물이름)
//		- 오버로딩된 생성자(매개변수2개 : 동물이름, 크기)
//
//		2. 속성 정의
//		- 동물 이름(String 타입)
//		- 크기(몸무게) : 대형, 중형, 소형
//		- 달리는 속도
//
//		3. 메서드 정의
//		- 달리는 속도 증가(기본 증가(10), 주어진 값 증가) : 0 ~ 100 사이만 가능
//		- 달리는 속도 감소(기본 증가(10), 주어진 값 증가) : 0 ~ 100 사이만 가능
//		- get, set 정의(각각)
//
//		4. 테스트 클래스 생성하여 테스트(사자, 코끼리, 기린 --)
//
//		hint - get, set은 각각 이름, 속도, 크기 니까 3개만 있으면 돼
		
		
		Animal a1 = new Animal();
		System.out.println(a1.getName() + "의 몸무게는 " + a1.getWeight() + "이고, 속도는 " + a1.getSpeed() + " 이다.");
		a1.setName("사자");
		a1.setWeight(150);
		a1.setSpeed(20);
		System.out.println(a1.getName() + "의 몸무게는 " + a1.getWeight() + "이고, 속도는 " + a1.getSpeed() + " 이다.");
		
		Animal a2 = new Animal("호랑이");
		a2.setWeight(200);
		a2.setSpeed(30);
		System.out.println(a2.getName() + "의 몸무게는 " + a2.getWeight() + "이고, 속도는 " + a2.getSpeed() + " 이다.");
		a2.speedUp(20);
		System.out.println(a2.getName() + "의 몸무게는 " + a2.getWeight() + "이고, 속도는 " + a2.getSpeed() + " 이다.");
		a2.speedDown(120);
		System.out.println(a2.getName() + "의 몸무게는 " + a2.getWeight() + "이고, 속도는 " + a2.getSpeed() + " 이다.");
		
		
		Animal a3 = new Animal("기린");
		a3.setWeight(400);
		a3.setSpeed(60);
		System.out.println(a3.getName() + "의 몸무게는 " + a3.getWeight() + "이고, 속도는 " + a3.getSpeed() + " 이다.");
		
	}

}
