
public class Ex1130_2 {

	public static void main(String[] args) {
		// ���� ����(=�׳� �Ϲ����� ����)
		//��ü�迭 ó��
		Book[] bookArr1 = new Book[3];   //Book ��ü�� ������ �迭���� bookArr1�� ����, 1��
		Book[] bookArr2 = new Book[3];   //Book ��ü�� ������ �迭���� bookArr1�� ����
		
		bookArr1[0] = new Book("�¹���","������");    //2�� =���� ����
		bookArr1[1] = new Book("���̾�","�츣���켼");
		bookArr1[2] = new Book("��Ի���ΰ�","���ù�");
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i] = new Book();  //�ϴ� ����Ʈ �����ڷ� �����ص�
		}
		
//		for (int i = 0; i < bookArr2.length; i++) {
//			bookArr2[i] = new Book("�ڹ����α׷���","������");  //�ƹ��ų� ����
//		}
		
		System.out.println("======����======");
		for (int i = 0; i < bookArr1.length; i++) {  //����
			bookArr1[i].showBookInfo();     //BookŬ������ ��¹��� �־ ���� ��¹��� �� �ٿ��� �ȴ�.
		}
		
		System.out.println("======�纻======");
		for (int i = 0; i < bookArr2.length; i++) {  //�纻
			bookArr2[i].showBookInfo();     //BookŬ������ ��¹��� �־ ���� ��¹��� �� �ٿ��� �ȴ�.
		}
		
		// ���� ����
		for (int i = 0; i < bookArr1.length; i++) {  //���� �迭 ���̸�ŭ ����(����)
			bookArr2[i].setBookName(bookArr1[i].getBookName()); //bookArr1�� �о bookArr2�� ����
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());  //bookArr1�� �о bookArr2�� ����
		}
		
		System.out.println("======����======");
		for (int i = 0; i < bookArr1.length; i++) {  //����
			bookArr1[i].showBookInfo();     //BookŬ������ ��¹��� �־ ���� ��¹��� �� �ٿ��� �ȴ�.
		}
		
		System.out.println("======�纻======");
		for (int i = 0; i < bookArr2.length; i++) {  //�纻
			bookArr2[i].showBookInfo();     //BookŬ������ ��¹��� �־ ���� ��¹��� �� �ٿ��� �ȴ�.
		}
		
		//���� ������ų�ž� (��������)
		bookArr1[0].setBookName("����");
		bookArr1[0].setAuthor("�ڿϼ�");
		System.out.println("======����======");
		for (int i = 0; i < bookArr1.length; i++) {  //����
			bookArr1[i].showBookInfo();     //BookŬ������ ��¹��� �־ ���� ��¹��� �� �ٿ��� �ȴ�.
		}
		
		System.out.println("======�纻======");
		for (int i = 0; i < bookArr2.length; i++) {  //�纻
			bookArr2[i].showBookInfo();     //BookŬ������ ��¹��� �־ ���� ��¹��� �� �ٿ��� �ȴ�.
		}
		
		
		//���� ����� ���� ������ �������� ������ ��ȭ�� �纻�� ������ �ִ°� ���ִ°��̴�.
		//���� ����� �����͸� �����ϴ� ���̰�
		//���� ����� ���������̸鼭 ���� ������ �迭?�̰�..  �� ���� �ϴٰ� �������� �򰥸���..
		
		
		
	}

}
