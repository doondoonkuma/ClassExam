//������(����154p) 
public class Person {
	String name;
	int height;
	int weight;
	
	// �����ڰ� �Ѱ��� ���� ��� ����Ʈ �����ڰ� ������
	// ������ �ۼ� ��Ģ : 1.Ŭ������� ���� 2.��ȯŸ���� ����� �Ѵ�(���� ��ü�� ����.)
	
	// ��������� ����Ʈ �����ڰ� �ʿ��ϴ�.
	public Person() {       // �� ������ �������̴�.
		
	}
	// �����ε��� ������
	public Person(String pName) {  // ������ �̸��� ����, �Ű������� �޶�� �Ѵ�.(�Ű������� ����, Ÿ��, ���� �� �ƹ��ų� �޶� ��� ����.) String n : �Ű�����
		name = pName;
	}
	
	// �����ε��� ������
//	public Person(String pName, int pHeight, int pWeight) {
//		name = pName;
//		height = pHeight;
//		weight = pWeight;
//	}         
	
	// ������ ���ÿ� �� �ϴ� ���.
	
	// �޼���
	public String getName() {
		return name;
	} 
	
	
	// ����1. Ű�� �����Ը� ���� ������ �� �ִ� �޼��� �߰�
	//�������� ����
		
	public int getHeight() {
		return height;
	}	
	
	public int getWeight() {
		return height;
	}
	
	/*���� �Ѱ�
	public Person(int pHeight, int pWeight) {
		height = pHeight;
		weight = pWeight;  */		
		
	
	// ����2. ����, Ű, �����Ը� �Ѳ����� ������ �� �ִ� �޼��� �߰�   / �̰� ��¥ ���� �ʿ�..
	//�������� ����
	public void setPerson(String pName, int pHeight, int pWeight) {
		name = pName;
		height = pHeight;
		weight = pWeight;
		return;  //���� ��ȯ(���� ����)
	}	
	
	
	
	
}
