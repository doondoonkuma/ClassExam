import java.util.ArrayList;  //어레이 리스트라는 클래스를 사용하겠다!-의 의미 / ~~util.*;는 util 아래의 리스트 모두에게 적용? 하는 경로
public class Ex1130_5 {

	public static void main(String[] args) {
		// ArrayList 클래스 활용(교재 222p)
		ArrayList<Book> library = new ArrayList<Book>(); //제네릭 타입으로 생성
		
		System.out.println("==============================");
		for (int i = 0; i < library.size(); i++) {
			//임시변수를 만든 후에 이것으로 반환
			Book book = library.get(i);   //객체를 반환한다.
			book.showBookInfo();
		}
//		Book abc = new Book("태백산맥", "조정래");
		library.add(new Book("크집사빨간맛","크집사"));  //inline 객체 생성, 간결하지만 변수가 다른 곳에서는 재활용 되지 않는다.
		library.add(new Book("드림코딩","엘리"));
		library.add(new Book("기타연주","Fami"));
		
		System.out.println("==============================");
		for (int i = 0; i < library.size(); i++) {
			//임시변수를 만든 후에 이것으로 반환
			Book book = library.get(i);   //객체를 반환한다.
			book.showBookInfo();
		}
		
		//향상된 for문을 활용해보자!
		System.out.println("==============================");
		for (Book abc : library) {
			abc.showBookInfo();
		}
		
		
		
	}

}
