
public class BookArray {

	public static void main(String[] args) {
		// Book �迭 �׽�Ʈ
		/*int[] aaa = new int[5];   //���� ������ ���� �׳� �ۼ�.*/
		
		Book[] library = new Book[5];   //Book��ü�� ������ �� �ִ� �迭 ��ü ���� **�� ��ü�� ������ �� �ְԸ� �Ѱ��� ������ �Ȱ� �ƴϴ�. å�� ������ �� �ִµ� å�� ����!-�� �ǹ�
//		for(int i = 0; i < library.length; i++) {
//			System.out.println(library[i]);
//		}
		library[0] = new Book("ũ���������","���"); //��ü�����Ͽ� �迭�� ����, ��ü�� ������� ���¿��� �� �� ������ ��ü ������ �ؾ� �ϹǷ� new ~~ �� �����.
		library[1] = new Book("����������","����");
		library[2] = new Book("��������","������");
		library[3] = new Book("�������ѽ�Ǭ","Ŭ�ο�");
		library[4] = new Book("ũ���绡����","����");
		
//		for(int i = 0; i < library.length; i++) {
//			library[i].showBookInfo();
//		}
		
//		for(int i = 0; i < library.length; i++) {
//			System.out.println(library[i]);
//		}
		
		for(int i = 3; i < 5; i--) {
			library[i].showBookInfo();
		}                                        //�Ųٷ� �迭 ����غ���! 5�� �ε������� 4��°���� ����ϴ°��� �Ǵ°�? �ذ�!!
		
		
		
	}

}
