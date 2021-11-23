
public class Ex1123_2 {

	public static void main(String[] args) {
		
		// 첫 번째 객체 생성 및 테스트
		// 인스턴스 생성해야 클래스 사용 가능
		// 문법 : 클래스명 변수명 = new 생성자
		// 디폴트 생성자는 클래스명과 동일하며 매개변수 없음
		//덧셈 방식 만들어보자! 
		//1번 방식
		Ex1123_1 cal1 = new Ex1123_1();        /* 디폴트 생성자로서 인스턴스 생성(객체 생성), 괄호는 매개변수가 없는 상태를 말해준다. 
		                                          클래스1에서 인수 있는 생성자를 만들었다면 클래스2의 디폴트 생성자는 에러가 나타난다. 그래서 클래스1에서 디폴트 생성자를 만든다.*/
		System.out.println(cal1.num1);         //입력에 사용한 정보를 저장하지 못해서 결과값은 0
		System.out.println(cal1.num2);		   //입력에 사용한 정보를 저장하지 못해서 결과값은 0
		System.out.println(cal1.result);       //입력에 사용한 정보를 저장하지 못해서 결과값은 0
		System.out.println(cal1.add(10, 20));    // 10과 20을 더하자, add의 result값이고, 출력문에서 괄호만 써주면 된다.
		//2번 방식
		int test = cal1.add(1, 2);   //결과가 test에 반환될것임
		System.out.println(test);
		
		//곱셈 방식 만들어보자!
		//1번 방식
		Ex1123_1 TT = new Ex1123_1();
		System.out.println(TT.product(4, 4));
		//2번 방식
		int DD = TT.product(5, 5);
		System.out.println(DD);
		
		System.out.println(cal1.num1);         //입력에 사용한 정보를 저장하지 못해서 결과값은 0
		System.out.println(cal1.num2);		   //입력에 사용한 정보를 저장하지 못해서 결과값은 0 ... 이었는데, ㅇㅇ 앞에서 매개변수를 지역변수로 설정해주니까 결과 값이 나오게 되었다.
		System.out.println(cal1.result);	   //result는 최종 결과 값이므로 계산 된 값이 나오게 됨
		
		// 두 번째 객체 생성 및 테스트
		Ex1123_1 cal2 = new Ex1123_1(3, 5);    //객체 생성(인스턴스 생성이라고도 한다.) cal2변수 하나만 만들어 놓으면 아래부터는 사칙연산 출력이 간편해진다. 리턴되니까
		System.out.println(cal2.add());        
		System.out.println(cal2.subtract());
		System.out.println(cal2.product());
		System.out.println(cal2.devide());
	
		System.out.println(cal2.add(6, 7));    //여기서 변수 값을 변경해도 문제 없다.
	
		// 세 번째 객체 생성 및 테스트 (get, set 만든 이후)
		Ex1123_1 cal3 = new Ex1123_1(10, 5);
		// 10 + 5 = 15가 출력되도록 만들어 보자
		System.out.println(cal3.getNum1() + "+" + cal3.getNum2() + "=" + cal3.add());  //이렇게 출력 못하면 처음부터 다시 공부하고 이해할 것
		
		
		// 네 번째 객체 생성 및 테스트
		// 디폴트 생성자로 생성 후 매개변수(9, 10) 추가 하고 곱셈 출력 테스트 / Hint! get, set 활용
		Ex1123_1 cal4 = new Ex1123_1(9, 10);
		System.out.println(cal4.getNum1() + "*" + cal4.getNum2() + "=" + cal4.product()); //내가 한거
		
		Ex1123_1 cal5 = new Ex1123_1();
		cal5.setNum1(9);
		cal5.setNum2(10);
		System.out.println(cal5.product());  //유비가 한거
		
	}

}
