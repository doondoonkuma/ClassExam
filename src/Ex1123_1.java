
public class Ex1123_1 {
	
	//사칙연산기
	int result;  //연산결과저장용 속성 , 클래스의 가장 기본
	int num1;    //계산에 사용되는 왼쪽 속성
	int num2;    //계산에 사용되는 오른쪽 속성
	
	// 디폴트 생성자를 반드시 구현(내용 없어도 됨)
	public Ex1123_1() {    //디폴트 생성자이다. 하는 일은 없지만 클래스2의 디폴트 값에 에러를 막기 위해 생성한 것이다.
		
	}
	
	// 생성자를 만들어 보자(클래스명과 동일, 반환타입 없음(return도 없음), 나머지는 메서드 정의 방법과 동일 // 외워버려)
	// 오버로딩된 생성자
	public Ex1123_1(int n1, int n2) {    //매개변수 있는 생성자이다. 다른 변수 명으로 사용해도 상관은 없다.
		num1 = n1;    //속성에 정보를 줘야 한다. 정보를 저장하는 num1에 n1을 대입	
		num2 = n2;	  //속성에 정보를 줘야 한다. 정보를 저장하는 num2에 n2을 대입, 이제부터 num1, num2를 이용하여 계산해야 하므로 또 메서드를 만들어야 한다.
	}

	
	// set으로 값을 정하고(쓰기), get으로 값을 읽어낸다.(읽기) / get, set 진짜 중요..그냥 다 외우래
	// 데이터 쓰기 num1,2에 대하여
	public void setNum1(int n1) {      //너 이 일 하고 끝내! -의 의미, set 이후 변수 명은 사용자 마음대로
		num1 = n1;
	}
	
	// 데이터 읽기
	public int getNum1() {   //호출만 하고 바로 읽어내면 되니까 인수는 필요 없어!
		return num1;
	}
	
	public void setNum2(int n2) {
		num2 = n2;
	}
	
	public int getNum2() {
		return num2;
	}
	
	
	
	
	
	
	
	
	
	
	// 메서드(+) // 메인 만드는거야-   //여기를 이해 못했다면 위에 라인을 이해 못했다는 말이다. 이해하고 넘어가야 한다.
	public int add() {           //여기는 밑에 덧셈 메서드에서 정보가 있으니까 불러오는 셈이다.
		result = num1 + num2;
		return result;
	}
	// 메서드(-)
	public int subtract () {
		result = num1 - num2;
		return result;
	}
	// 메서드(*)
	public int product () {
		result = num1 * num2;
		return result;
	}
	// 메서드(/)
	public int devide () {
		result = num1 / num2;
		return result;
	}
	
	
	
	
	
	
	
	//덧셈 메서드 ↑(Overloading 된 메서드, 이름을 목적에 맞게 통일해서 오버로딩 하는 것이 협업 하기 좋다.)
	public int add (int n1, int n2) {    //num1,2 변수이름이 아니어도 상관 없다. 공식 : public 반환타입 메서드명(매개변수 리스트);
		num1 = n1;          
		num2 = n2;          //num1,2의 매개변수를 설정하여 지역변수로 만들어 주면 메인코딩에서는 결과값이 0으로 안나올...걸? 지역변수는 임시적인 속성이 강하다.
		result = n1 + n2;   //덧셈실행, 순서 : 위에서 두 수 받아서 더하고 밑에서 리턴
		return result;      //덧셈 하여 나온 result값을 리턴!
	}
	
	//뺄셈 메서드 subtract를 이용하여 뺄셈 메서드를 만들어 보자!	
	public int subtract (int n1, int n2) {    //매개변수를 다른걸로 만들어도 상관 없지만 복잡해지므로 그냥 있는거 사용해도 된다.
		num1 = n1;
		num2 = n2;
		result = n1 - n2;   //뺄셈실행
		return result;
	}
	
	//곱셈 메서드
	public int product (int n1, int n2) {    
		num1 = n1;
		num2 = n2;
		result = n1 * n2;   //곱셈실행
		return result;
	}
	
	//나눗셈 메서드
	public int devide (int n1, int n2) {    
		num1 = n1;
		num2 = n2;
		result = n1 / n2 ;  //나눗셈실행, 정수와 정수를 나누어서 정수값 결과를 출력
		return result;
	}
	
	
	
}
