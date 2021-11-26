
public class Book {
	//멤버변수(속성)
	private String bookName;  //ⓐ
	private String author;
	//디폴트 생성자            작업은 하지 않지만, 없으면 에러가 나타날 수 있기 때문에 생성하는 것이다.
	public Book() {
		
	}
	
	//오버로딩된 생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;     //this.bookName은 ⓐ를 말한다.
		this.author = author;
	}
	
	//메서드
	//get, set 문자열 규칙 - get, set 다음에 멤버변수의 첫글자를 대문자로 작성해야 함, 다른 문자는 동일해야 한다.
	//set으로 값을 정하고(쓰기), get으로 값을 읽어낸다.(읽기)
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {   //get은 읽는거! 리턴이 필요해!
		return author;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthor(String author) {     //set은 쓰는거! 리턴 필요 없어!
		this.author = author;
	}
	
	public void showBookInfo() {     //show 이후 아무렇게나 작성해도 상관 없다. 알아 볼 수만 있게 써라!
		System.out.println(getBookName() + ":" + getAuthor());
	}
	
	//오버로딩된 메서드
	//진입점(=메인 메서드, 보통은 사용 안함 / public static void main-을 말하는 거임)
	
}
