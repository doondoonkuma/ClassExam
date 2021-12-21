
public class BookClass {  // Object 클래스의 하위클래스
	int bookNumber;
	String bookTitle;
	
	public BookClass(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override //바로 아래 메서드에 대해서 각별히 신경쓴다. 오타가 발생하면 알려준다던지 등등
	public String toString() {  // toString()메서드 재정의
		return bookTitle + " : " + bookNumber;
	}
	
}
