
public class GoldCustomer extends Customer {

	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);  //�θ�Ŭ������ ������ ȣ��(����Ʈ �����ڴ� �ڵ� ȣ�� ������ �׷��� ���� ��� ����� ��� �Ѵ�.)
		                                  //��������� ������ �� �� ȣ�� �ϸ� ����Ʈ �����ڴ� �ڵ� ȣ�� �Ұ���..(�̰� �򰥸���.)
		customerGrade = "GOLD";
		bonusRatio = 0.02;    //���ʽ�
		saleRatio = 0.1;      //������
	}
	
	//�������� �޼���
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //���ʽ� ����Ʈ ������Ʈ, ���� ��ȯ
		return price - (int)(price * saleRatio);
	}
	//showCustomerInfo() �޼���� ����Ŭ���� �״�� ���
	
	
	
}


