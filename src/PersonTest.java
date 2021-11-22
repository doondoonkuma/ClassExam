
public class PersonTest {

	public static void main(String[] args) {
		// Person 클래스 테스트 / 생성자(교재154p)
		// 오버로딩된 생성자가 있을 경우 디폴트 생성자도 구현해야 한다.(내용 없어도 됨)
		Person hu1 = new Person();   //디폴트 생성자
		Person hu2 = new Person("둔둔이");     //매개변수1개 생성자
		
		System.out.println(hu2.getName());

		
		// 추가된 메서드 기능 테스트
		/* 내가 한거
		Person hu3 = new Person("박종수");
		Person hu4 = new Person("185");
		Person hu5 = new Person("74");
		
		Person hu6 = new Person("박종수",185,74);
		
		System.out.println(hu3.getName());
		System.out.println(hu4.getName());
		System.out.println(hu5.getName());
		
		System.out.println(hu6.get());    */
		
		//선생님의 정답
		Person hu3 = new Person("박종수", 185, 74);  //세 개 넣고 한 번에 출력
		System.out.println("성명 : " + hu3.getName() + ", 키 : " + hu3.getHeight() + ", 몸무게 : " + hu3.getWeight());
		
		hu3.setPerson("박종수", 180, 80);              //인적사항 변형하여 출력할 줄 아는가? -를 알아보는 기출변형문제
		System.out.println("성명 : " + hu3.getName() + ", 키 : " + hu3.getHeight() + ", 몸무게 : " + hu3.getWeight());
	
		hu1.setPerson("양정우", 180, 80);              //객체 수정할 줄 아는가?-를 알아보는 문제
		System.out.println("성명 : " + hu3.getName() + ", 키 : " + hu3.getHeight() + ", 몸무게 : " + hu3.getWeight());
	
	
	}

}
