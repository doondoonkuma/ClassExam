
public class Ex1130_1 {

	public static void main(String[] args) {
		// �迭����
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1,2,3,4,5};
		
		
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");    //""���� ���� �������� ���� �Է��� ���� ��
		}
		System.out.println();          //���� ���ϰ� �ϱ� ���� �� �ٲ޿����� ���
		//�⺻ Ÿ���� ����� ������(int, double, float, char, ...)
		System.arraycopy(array1, 0, array2, 1, 4);
		//������ ����� ���� �����ȴ�.
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();  
		
		array1[2] = 300;  //�迭1 ����
		//�迭1 Ȯ��(������)
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println(); 
		
		//�迭2 ����Ʈ �ϸ� ��ȭ ����     ->�������� 300�� ��Ÿ����, ���⼭�� �ʱ�ȭ �߱⶧����? ��Ÿ���� �ʴ°� ����.
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		//-----------------------------------------
		//��ü�迭 ó��
		Book[] bookArr1 = new Book[3];   //Book ��ü�� ������ �迭���� bookArr1�� ����, 1��
		Book[] bookArr2 = new Book[3];   //Book ��ü�� ������ �迭���� bookArr1�� ����
		
		//�����ܰ�
		Book aaa;   //�� ����     1�� =���� ����
		aaa = new Book("aaa","bbb");  //�̰� �� ��ü ����, 2��
		
		bookArr1[0] = new Book("�¹���","������");    //2�� =���� ����
		bookArr1[1] = new Book("���̾�","�츣���켼");
		bookArr1[2] = new Book("��Ի���ΰ�","���ù�");
		
		System.out.println("======����======");
		for (int i = 0; i < bookArr1.length; i++) {  //����
			bookArr1[i].showBookInfo();     //BookŬ������ ��¹��� �־ ���� ��¹��� �� �ٿ��� �ȴ�.
		}
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);  //��������
		
		System.out.println("======�纻======");
		for (int i = 0; i < bookArr2.length; i++) {  //�纻
			bookArr2[i].showBookInfo();     //BookŬ������ ��¹��� �־ ���� ��¹��� �� �ٿ��� �ȴ�.
		}
		
		//���� ����
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
		
		
		
		
		
		
		
	}

}
