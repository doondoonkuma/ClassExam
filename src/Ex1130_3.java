
public class Ex1130_3 {

	public static void main(String[] args) {
		// ȥ�� �ڵ��غ���
		
		//�� ��ü 3�� ���� �ϰ� å 3�� ���� �ϱ�
		Book[] bookArr1 = new Book[3];   //Book ��ü�� ������ �迭���� bookArr1�� ����, 1��
		Book[] bookArr2 = new Book[3];
		
		
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i] = new Book();  //�ϴ� ����Ʈ �����ڷ� �����ص�
		}
		
		//å�� 3�� ���� �ϱ�
		bookArr1[0] = new Book("ũ���绡����","ũ����");    //2�� =���� ����
		bookArr1[1] = new Book("�帲�ڵ�","����");
		bookArr1[2] = new Book("��Ÿ����","Fami");
		
		//����� å�� ���� / ����, �纻 ���-
		System.out.println("======����======");
		for (int i = 0; i < bookArr1.length; i++) {  //����
			bookArr1[i].showBookInfo();     
		}
		
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);
		for (int i = 0; i < bookArr1.length; i++) {    
			bookArr2[i].setBookName(bookArr1[i].getBookName()); //���� ���縦 ����ؼ� �纻�� ���縦 �ϴ� ���� ����.
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());  
		}
		
		//���� �� 3��° å�� "�ڹ����α׷���","������"
		bookArr1[2] = new Book("�ڹ����α׷���","������");
		
		System.out.println("======����======");
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}
		
		System.out.println("======�纻======");
		for (int i = 0; i < bookArr2.length; i++) {
			bookArr2[i].showBookInfo();
		}
		
		//������ 2��° å�� ���������� ����ǵ��� "�ڹ�","ȭ����"���� ������Ʈ
		bookArr1[1].setBookName("�ڹ�");
		bookArr1[1].setAuthor("ȭ����");
		System.out.println("======����======");
		for (int i = 0; i < bookArr1.length; i++) {
			bookArr1[i].showBookInfo();
		}
		
		System.out.println("======�纻======");
		for (int i = 0; i < bookArr2.length; i++) {   //�� �纻�� ���������?
			bookArr2[i].showBookInfo();
		}
		
		System.out.println("===============");
		
		//���� for���� �迭 (����218p)
		String[] strArr = {"�ڹ�", "�ȵ���̵�", "C", "�ڹٽ�ũ��Ʈ", "���̽�"}; 
		
		for ( String lang  : strArr  ) {
			System.out.print(lang);
		}
		System.out.println();
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		//  (   A    :    B    ) -> A���� �տ��� �ʱ�ȭ�� ���¸� ��ġ(string�� ������, lang�� ���������̰� �� �ȿ����� ����� �� �ִ�. �迭�� Ÿ��) B�� �迭�� ���Ѵ�.
		// �����ϴ� �ڵ��� �ƴϴ�.
		
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
