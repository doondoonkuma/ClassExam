public class Ex1126_1 {

	public static void main(String[] args) {
		// 배열 테스트(교재199p)
		int[] stIDs = new int [10];  // 정수형 배열 선언 (초기화 안 한 상태)
		
		int[] stArr1 = {101, 102, 103, 104, 105};   // 배열 선언과 동시에 초기화
		
		int[] stArr2 = new int[] {101, 102, 103, 104, 105};  //위와 동일, 전통적인 방식이다. new []대 괄호 안에 숫자 주면 안돼! 
		
		int[] stArr3;   //일단 선언부터 하고
		stArr3 = new int[] {101, 102, 103};    //그 다음 값을 준다. 여기서는 new 생략 불가능!
		
		
		//연습문제 202p. (위의 배열 문법에서 두 번째 활용)
		for (int i = 0; i < 5; i++) {       //● 여기서부터
			System.out.println(stArr1[i]);  //인덱스는 항상 0부터 시작한다.
		}                                   //● 여기까지가 i변수의 생존 범위이다.  그렇기 때문에! -★
		
		for (int i = 1; i < 4; i++) {       
			System.out.println(stArr1[i]);  
		}                                   //-★여기서 중복 선언 해도 17~19라인 i와 21~23라인의 i는 별개의 i이다. 그래서 중복선언 해도 에러가 안뜬다.
		
		
	}

}