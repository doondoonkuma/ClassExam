
public class Ex1123_2 {

	public static void main(String[] args) {
		
		// ù ��° ��ü ���� �� �׽�Ʈ
		// �ν��Ͻ� �����ؾ� Ŭ���� ��� ����
		// ���� : Ŭ������ ������ = new ������
		// ����Ʈ �����ڴ� Ŭ������� �����ϸ� �Ű����� ����
		//���� ��� ������! 
		//1�� ���
		Ex1123_1 cal1 = new Ex1123_1();        /* ����Ʈ �����ڷμ� �ν��Ͻ� ����(��ü ����), ��ȣ�� �Ű������� ���� ���¸� �����ش�. 
		                                          Ŭ����1���� �μ� �ִ� �����ڸ� ������ٸ� Ŭ����2�� ����Ʈ �����ڴ� ������ ��Ÿ����. �׷��� Ŭ����1���� ����Ʈ �����ڸ� �����.*/
		System.out.println(cal1.num1);         //�Է¿� ����� ������ �������� ���ؼ� ������� 0
		System.out.println(cal1.num2);		   //�Է¿� ����� ������ �������� ���ؼ� ������� 0
		System.out.println(cal1.result);       //�Է¿� ����� ������ �������� ���ؼ� ������� 0
		System.out.println(cal1.add(10, 20));    // 10�� 20�� ������, add�� result���̰�, ��¹����� ��ȣ�� ���ָ� �ȴ�.
		//2�� ���
		int test = cal1.add(1, 2);   //����� test�� ��ȯ�ɰ���
		System.out.println(test);
		
		//���� ��� ������!
		//1�� ���
		Ex1123_1 TT = new Ex1123_1();
		System.out.println(TT.product(4, 4));
		//2�� ���
		int DD = TT.product(5, 5);
		System.out.println(DD);
		
		System.out.println(cal1.num1);         //�Է¿� ����� ������ �������� ���ؼ� ������� 0
		System.out.println(cal1.num2);		   //�Է¿� ����� ������ �������� ���ؼ� ������� 0 ... �̾��µ�, ���� �տ��� �Ű������� ���������� �������ִϱ� ��� ���� ������ �Ǿ���.
		System.out.println(cal1.result);	   //result�� ���� ��� ���̹Ƿ� ��� �� ���� ������ ��
		
		// �� ��° ��ü ���� �� �׽�Ʈ
		Ex1123_1 cal2 = new Ex1123_1(3, 5);    //��ü ����(�ν��Ͻ� �����̶�� �Ѵ�.) cal2���� �ϳ��� ����� ������ �Ʒ����ʹ� ��Ģ���� ����� ����������. ���ϵǴϱ�
		System.out.println(cal2.add());        
		System.out.println(cal2.subtract());
		System.out.println(cal2.product());
		System.out.println(cal2.devide());
	
		System.out.println(cal2.add(6, 7));    //���⼭ ���� ���� �����ص� ���� ����.
	
		// �� ��° ��ü ���� �� �׽�Ʈ (get, set ���� ����)
		Ex1123_1 cal3 = new Ex1123_1(10, 5);
		// 10 + 5 = 15�� ��µǵ��� ����� ����
		System.out.println(cal3.getNum1() + "+" + cal3.getNum2() + "=" + cal3.add());  //�̷��� ��� ���ϸ� ó������ �ٽ� �����ϰ� ������ ��
		
		
		// �� ��° ��ü ���� �� �׽�Ʈ
		// ����Ʈ �����ڷ� ���� �� �Ű�����(9, 10) �߰� �ϰ� ���� ��� �׽�Ʈ / Hint! get, set Ȱ��
		Ex1123_1 cal4 = new Ex1123_1(9, 10);
		System.out.println(cal4.getNum1() + "*" + cal4.getNum2() + "=" + cal4.product()); //���� �Ѱ�
		
		Ex1123_1 cal5 = new Ex1123_1();
		cal5.setNum1(9);
		cal5.setNum2(10);
		System.out.println(cal5.product());  //���� �Ѱ�
		
	}

}
