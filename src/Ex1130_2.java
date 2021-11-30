
public class Ex1130_2 {

	public static void main(String[] args) {
		// 깊은 복사(=그냥 일반적인 복사)
		//객체배열 처리
		Book[] bookArr1 = new Book[3];   //Book 객체를 저장할 배열변수 bookArr1을 선언, 1번
		Book[] bookArr2 = new Book[3];   //Book 객체를 저장할 배열변수 bookArr1을 선언
		
		bookArr1[0] = new Book("태백산맥","조정래");    //2번 =같은 개념
		bookArr1[1] = new Book("데미안","헤르만헤세");
		bookArr1[2] = new Book("어떻게살것인가","유시민");
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i] = new Book();  //일단 디폴트 생성자로 생성해둠
		}
		
//		for (int i = 0; i < bookArr2.length; i++) {
//			bookArr2[i] = new Book("자바프로그래밍","박은종");  //아무거나 생성
//		}
		
		System.out.println("======원본======");
		for (int i = 0; i < bookArr1.length; i++) {  //원본
			bookArr1[i].showBookInfo();     //Book클래스에 출력문이 있어서 따로 출력문을 안 붙여도 된다.
		}
		
		System.out.println("======사본======");
		for (int i = 0; i < bookArr2.length; i++) {  //사본
			bookArr2[i].showBookInfo();     //Book클래스에 출력문이 있어서 따로 출력문을 안 붙여도 된다.
		}
		
		// 깊은 복사
		for (int i = 0; i < bookArr1.length; i++) {  //원본 배열 길이만큼 배정(저장)
			bookArr2[i].setBookName(bookArr1[i].getBookName()); //bookArr1을 읽어서 bookArr2에 배졍
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());  //bookArr1을 읽어서 bookArr2에 배졍
		}
		
		System.out.println("======원본======");
		for (int i = 0; i < bookArr1.length; i++) {  //원본
			bookArr1[i].showBookInfo();     //Book클래스에 출력문이 있어서 따로 출력문을 안 붙여도 된다.
		}
		
		System.out.println("======사본======");
		for (int i = 0; i < bookArr2.length; i++) {  //사본
			bookArr2[i].showBookInfo();     //Book클래스에 출력문이 있어서 따로 출력문을 안 붙여도 된다.
		}
		
		//이제 변형시킬거야 (원본수정)
		bookArr1[0].setBookName("나목");
		bookArr1[0].setAuthor("박완서");
		System.out.println("======원본======");
		for (int i = 0; i < bookArr1.length; i++) {  //원본
			bookArr1[i].showBookInfo();     //Book클래스에 출력문이 있어서 따로 출력문을 안 붙여도 된다.
		}
		
		System.out.println("======사본======");
		for (int i = 0; i < bookArr2.length; i++) {  //사본
			bookArr2[i].showBookInfo();     //Book클래스에 출력문이 있어서 따로 출력문을 안 붙여도 된다.
		}
		
		
		//얕은 복사와 깊은 복사의 차이점은 원본의 변화가 사본에 영향을 주는가 안주는가이다.
		//얕은 복사는 데이터를 공유하는 셈이고
		//깊은 복사는 오리지널이면서 변형 가능한 배열?이고..  잘 이해 하다가 마지막에 헷갈리네..
		
		
		
	}

}
