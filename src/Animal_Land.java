
public class Animal_Land {

	public static void main(String[] args) {
		// AnimalŬ���� �׽�Ʈ

//		*Ŭ���� ����
//		1. ���� Ŭ���� ����
//		- Animal
//		- ������(����Ʈ(����), ũ��(30 ~ 200)�� �ӵ�(0)�� ����Ʈ�� ����)
//		- �����ε��� ������(�Ű����� 1�� : �����̸�)
//		- �����ε��� ������(�Ű�����2�� : �����̸�, ũ��)
//
//		2. �Ӽ� ����
//		- ���� �̸�(String Ÿ��)
//		- ũ��(������) : ����, ����, ����
//		- �޸��� �ӵ�
//
//		3. �޼��� ����
//		- �޸��� �ӵ� ����(�⺻ ����(10), �־��� �� ����) : 0 ~ 100 ���̸� ����
//		- �޸��� �ӵ� ����(�⺻ ����(10), �־��� �� ����) : 0 ~ 100 ���̸� ����
//		- get, set ����(����)
//
//		4. �׽�Ʈ Ŭ���� �����Ͽ� �׽�Ʈ(����, �ڳ���, �⸰ --)
//
//		hint - get, set�� ���� �̸�, �ӵ�, ũ�� �ϱ� 3���� ������ ��
		
		
		Animal a1 = new Animal();
		System.out.println(a1.getName() + "�� �����Դ� " + a1.getWeight() + "�̰�, �ӵ��� " + a1.getSpeed() + " �̴�.");
		a1.setName("����");
		a1.setWeight(150);
		a1.setSpeed(20);
		System.out.println(a1.getName() + "�� �����Դ� " + a1.getWeight() + "�̰�, �ӵ��� " + a1.getSpeed() + " �̴�.");
		
		Animal a2 = new Animal("ȣ����");
		a2.setWeight(200);
		a2.setSpeed(30);
		System.out.println(a2.getName() + "�� �����Դ� " + a2.getWeight() + "�̰�, �ӵ��� " + a2.getSpeed() + " �̴�.");
		a2.speedUp(20);
		System.out.println(a2.getName() + "�� �����Դ� " + a2.getWeight() + "�̰�, �ӵ��� " + a2.getSpeed() + " �̴�.");
		a2.speedDown(120);
		System.out.println(a2.getName() + "�� �����Դ� " + a2.getWeight() + "�̰�, �ӵ��� " + a2.getSpeed() + " �̴�.");
		
		
		
		
		Animal a3 = new Animal("�⸰");
		a3.setWeight(400);
		a3.setSpeed(60);
		System.out.println(a3.getName() + "�� �����Դ� " + a3.getWeight() + "�̰�, �ӵ��� " + a3.getSpeed() + " �̴�.");
		
		
		


		
		
		
	}

}
