public class Ex1130_3 {

	public static void main(String[] args) {
		// 혼자 코딩해보기
		
		//북 객체 3개 생성 하고 책 3권 저장 하기
		Book[] bookArr1 = new Book[3];   //Book 객체를 저장할 배열변수 bookArr1을 선언, 1번
		Book[] bookArr2 = new Book[3];
		
		
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i] = new Book();  //일단 디폴트 생성자로 생성해둠
		}
		
		//책을 3권 저장 하기
		bookArr1[0] = new Book("크집사빨간맛","크집사");    //2번 =같은 개념
		bookArr1[1] = new Book("드림코딩","엘리");
		bookArr1[2] = new Book("기타연주","Fami");
		
		//저장된 책을 복사 / 원본, 사본 출력-
		System.out.println("======원본======");
		for (int i = 0; i < bookArr1.length; i++) {  //원본
			bookArr1[i].showBookInfo();     
		}
		
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);
		for (int i = 0; i < bookArr1.length; i++) {    
			bookArr2[i].setBookName(bookArr1[i].getBookName()); //깊은 복사를 사용해서 사본에 복사를 하는 것이 좋다.
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());  
		}
		
		//복사 후 3번째 책을 "자바프로그래밍","박은종"
		bookArr1[2] = new Book("자바프로그래밍","박은종");
		
		System.out.println("======원본======");
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}
		
		System.out.println("======사본======");
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		//원본의 2번째 책을 원본에서만 변경되도록 "자바","화이팅"으로 업데이트
		bookArr1[1].setBookName("자바");
		bookArr1[1].setAuthor("화이팅");
		System.out.println("======원본======");
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}
		
		System.out.println("======사본======");
		for (int i = 0; i < bookArr2.length; i++) {   //왜 사본도 변경됐을까?
			bookArr2[i].showBookInfo();
		}
		
		System.out.println("===============");
		
		//향상된 for문과 배열 (교재218p)
		String[] strArr = {"자바", "안드로이드", "C", "자바스크립트", "파이썬"}; 
		
		for ( String lang  : strArr  ) {
			System.out.print(lang);
		}
		System.out.println();
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		//  (   A    :    B    ) -> A에는 앞에서 초기화한 형태를 위치(string은 문자형, lang은 지역변수이고 이 안에서만 사용할 수 있다. 배열의 타입) B는 배열을 말한다.
		// 권장하는 코딩은 아니다.
		
		System.out.println();
		int[] Numbers = {100, 200, 300, 500, 1000};
		
		for ( int num : Numbers) {
			System.out.print(num);
		}
		for ( int i = 0; i < Numbers.length; i++) {
			System.out.print(Numbers[i] + " ");
		}

	}

}