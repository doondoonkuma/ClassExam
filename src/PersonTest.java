
public class PersonTest {

	public static void main(String[] args) {
		// Person Ŭ���� �׽�Ʈ / ������(����154p)
		// �����ε��� �����ڰ� ���� ��� ����Ʈ �����ڵ� �����ؾ� �Ѵ�.(���� ��� ��)
		Person hu1 = new Person();   //����Ʈ ������
		Person hu2 = new Person("�е���");     //�Ű�����1�� ������
		
		System.out.println(hu2.getName());

		
		// �߰��� �޼��� ��� �׽�Ʈ
		/* ���� �Ѱ�
		Person hu3 = new Person("������");
		Person hu4 = new Person("185");
		Person hu5 = new Person("74");
		
		Person hu6 = new Person("������",185,74);
		
		System.out.println(hu3.getName());
		System.out.println(hu4.getName());
		System.out.println(hu5.getName());
		
		System.out.println(hu6.get());    */
		
		//�������� ����
		Person hu3 = new Person("������", 185, 74);  //�� �� �ְ� �� ���� ���
		System.out.println("���� : " + hu3.getName() + ", Ű : " + hu3.getHeight() + ", ������ : " + hu3.getWeight());
		
		hu3.setPerson("������", 180, 80);              //�������� �����Ͽ� ����� �� �ƴ°�? -�� �˾ƺ��� ���⺯������
		System.out.println("���� : " + hu3.getName() + ", Ű : " + hu3.getHeight() + ", ������ : " + hu3.getWeight());
	
		hu1.setPerson("������", 180, 80);              //��ü ������ �� �ƴ°�?-�� �˾ƺ��� ����
		System.out.println("���� : " + hu3.getName() + ", Ű : " + hu3.getHeight() + ", ������ : " + hu3.getWeight());
	
	
	}

}
