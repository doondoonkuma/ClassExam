import java.util.ArrayList;  //��� ����Ʈ��� Ŭ������ ����ϰڴ�!-�� �ǹ� / ~~util.*;�� util �Ʒ��� ����Ʈ ��ο��� ����? �ϴ� ���
public class Ex1130_5 {

	public static void main(String[] args) {
		// ArrayList Ŭ���� Ȱ��(���� 222p)
		ArrayList<Book> library = new ArrayList<Book>(); //���׸� Ÿ������ ����
		
		System.out.println("==============================");
		for (int i = 0; i < library.size(); i++) {
			//�ӽú����� ���� �Ŀ� �̰����� ��ȯ
			Book book = library.get(i);   //��ü�� ��ȯ�Ѵ�.
			book.showBookInfo();
		}
//		Book abc = new Book("�¹���", "������");
		library.add(new Book("ũ���绡����","ũ����"));  //inline ��ü ����, ���������� ������ �ٸ� �������� ��Ȱ�� ���� �ʴ´�.
		library.add(new Book("�帲�ڵ�","����"));
		library.add(new Book("��Ÿ����","Fami"));
		
		System.out.println("==============================");
		for (int i = 0; i < library.size(); i++) {
			//�ӽú����� ���� �Ŀ� �̰����� ��ȯ
			Book book = library.get(i);   //��ü�� ��ȯ�Ѵ�.
			book.showBookInfo();
		}
		
		//���� for���� Ȱ���غ���!
		System.out.println("==============================");
		for (Book abc : library) {
			abc.showBookInfo();
		}
		
		
		
	}

}
