public class BookArray {

	public static void main(String[] args) {
		// Book 배열 테스트
		/*int[] aaa = new int[5];   //문법 설명을 위해 그냥 작성.*/
		
		Book[] library = new Book[5];   //Book객체를 저장할 수 있는 배열 객체 생성 **북 객체에 저장할 수 있게만 한거지 저장이 된건 아니다. 책은 저장할 수 있는데 책이 없다!-의 의미
//		for(int i = 0; i < library.length; i++) {
//			System.out.println(library[i]);
//		}
		library[0] = new Book("크림히어로즈","디디"); //객체생성하여 배열에 저장, 객체는 만들어진 상태여서 쓸 수 있지만 객체 생성을 해야 하므로 new ~~ 를 만든다.
		library[1] = new Book("무지막지네","무지");
		library[2] = new Book("순무농장","윤순무");
		library[3] = new Book("렉돌열한스푼","클로에");
		library[4] = new Book("크집사빨간맛","도도");
		
//		for(int i = 0; i < library.length; i++) {
//			library[i].showBookInfo();
//		}
		
//		for(int i = 0; i < library.length; i++) {
//			System.out.println(library[i]);
//		}
		
		for(int i = 3; i < 5; i--) {
			library[i].showBookInfo();
		}                                        //거꾸로 배열 출력해보기! 5의 인덱스에서 4번째부터 출력하는것이 되는가? 해결!!
		
		
		
	}

}