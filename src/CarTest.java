
public class CarTest {

	public static void main(String[] args) {
		//����, �ӵ��� ���������
		//�������� ��������
		//����, �ӵ��� ��������
		//�μ� ���� ��������
		//����, �ӵ� ���� �б�
		//����, �ӵ� ���� ����
		//����, �ӵ� ���� ����
		//�־��� ������ �ӵ� ����
		//�־��� ������ �ӵ� ����
		//�μ� ���� �������� ��� �⺻�� ����("�ڵ���",150)
		//������ Ŭ�������� ��ü �����ϰ� �׽�Ʈ
		
		
		Car k1 = new Car();
		Car k2 = new Car("����5");
		Car k3 = new Car("����5", 100);
		Car k4 = new Car("����5", 50);
		k3.setSpeedup(10);	
		k4.setSpeeddw(10);
		
		
		
		System.out.println("���� : " + k2.getName());
		System.out.println("�ӵ� : " + k3.getspeed());
		System.out.println("�ӵ� : " + k4.getspeed());
		System.out.println(k1.getname() + k1.speed);
	
	
	
	
	
	
	
	
	
	
	}

}
