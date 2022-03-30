public class Ex1126_2 {

	public static void main(String[] args) {
		// 문자 배열 연습 - 아스키코드 연속 출력 (교재206p / 배열에 먼저 저장하고 저장된 배열을 출력)
		
		char[] alpha = new char[26];
		char ch = 'A';   // 저장용 시작 문자
//		System.out.println(ch);  // 문자 출력됨
//		System.out.println((int)ch);  //문자로 등록한 변수를 int(정수형 자료형)을 줘서 숫자로 캐스팅 하겠다! 웬일로 이해가 잘 됨ㅎㅎ
		
		for(int i = 0; i < alpha.length; i++, ch++) {  //저장 /length의 의미가 설정한 []의 용량만큼을 
			alpha[i] = ch;  
		}
		
		for(int i = 0; i < alpha.length; i++) {
			System.out.println(alpha[i] + ":" + (int)alpha[i]);
		}
		
//		System.out.println(alpha[25]);
	
	
	}

}