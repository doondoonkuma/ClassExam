
public class BookClass {  // Object Ŭ������ ����Ŭ����
	int bookNumber;
	String bookTitle;
	
	public BookClass(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override //�ٷ� �Ʒ� �޼��忡 ���ؼ� ������ �Ű澴��. ��Ÿ�� �߻��ϸ� �˷��شٴ��� ���
	public String toString() {  // toString()�޼��� ������
		return bookTitle + " : " + bookNumber;
	}
	
}
