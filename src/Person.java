//생성자(교재154p) 
public class Person {
	String name;
	int height;
	int weight;
	
	// 생성자가 한개도 없을 경우 디폴트 생성자가 존재함
	// 생성자 작성 규칙 : 1.클래스명과 동일 2.반환타입이 없어야 한다(문법 자체가 없다.)
	
	// 명시적으로 디폴트 생성자가 필요하다.
	public Person() {       // 빈 껍데기 생성자이다.
		
	}
	// 오버로딩된 생성자
	public Person(String pName) {  // 생성자 이름이 동일, 매개변수는 달라야 한다.(매개변수는 갯수, 타입, 순서 등 아무거나 달라도 상관 없다.) String n : 매개변수
		name = pName;
	}
	
	// 오버로딩된 생성자
//	public Person(String pName, int pHeight, int pWeight) {
//		name = pName;
//		height = pHeight;
//		weight = pWeight;
//	}         
	
	// 생성과 동시에 셋 하는 방법.
	
	// 메서드
	public String getName() {
		return name;
	} 
	
	
	// 문제1. 키와 몸무게를 각각 추출할 수 있는 메서드 추가
	//선생님의 정답
		
	public int getHeight() {
		return height;
	}	
	
	public int getWeight() {
		return height;
	}
	
	/*내가 한거
	public Person(int pHeight, int pWeight) {
		height = pHeight;
		weight = pWeight;  */		
		
	
	// 문제2. 성명, 키, 몸무게를 한꺼번에 변경할 수 있는 메서드 추가   / 이거 진짜 이해 필요..
	//선생님의 정답
	public void setPerson(String pName, int pHeight, int pWeight) {
		name = pName;
		height = pHeight;
		weight = pWeight;
		return;  //제어 반환(값은 없음)
	}	
	
	
	
	
}
