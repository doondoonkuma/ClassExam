
public class Book {
	//�������(�Ӽ�)
	private String bookName;  //��
	private String author;
	//����Ʈ ������            �۾��� ���� ������, ������ ������ ��Ÿ�� �� �ֱ� ������ �����ϴ� ���̴�.
	public Book() {
		
	}
	
	//�����ε��� ������
	public Book(String bookName, String author) {
		this.bookName = bookName;     //this.bookName�� �͸� ���Ѵ�.
		this.author = author;
	}
	
	//�޼���
	//get, set ���ڿ� ��Ģ - get, set ������ ��������� ù���ڸ� �빮�ڷ� �ۼ��ؾ� ��, �ٸ� ���ڴ� �����ؾ� �Ѵ�.
	//set���� ���� ���ϰ�(����), get���� ���� �о��.(�б�)
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {   //get�� �д°�! ������ �ʿ���!
		return author;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthor(String author) {     //set�� ���°�! ���� �ʿ� ����!
		this.author = author;
	}
	
	public void showBookInfo() {     //show ���� �ƹ����Գ� �ۼ��ص� ��� ����. �˾� �� ���� �ְ� ���!
		System.out.println(getBookName() + ":" + getAuthor());
	}
	
	//�����ε��� �޼���
	//������(=���� �޼���, ������ ��� ���� / public static void main-�� ���ϴ� ����)
	
}
