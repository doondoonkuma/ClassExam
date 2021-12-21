
public class VIPCustomer extends Customer { //(���� 236p)�� Ŭ������ ��� ���� Ŭ�������� ��� ���� �� �ִ�.(������ �����̺��� �ɷ��ִ�.)
	
	private int agentID;
	double saleRatio;

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);  //�θ�Ŭ������ ������ ȣ��(����Ʈ �����ڴ� �ڵ� ȣ�� ������ �׷��� ���� ��� ����� ��� �Ѵ�.)
		                                  //��������� ������ �� �� ȣ�� �ϸ� ����Ʈ �����ڴ� �ڵ� ȣ�� �Ұ���..(�̰� �򰥸���.)
		customerGrade = "VIP";
		bonusRatio = 0.05;    //���ʽ�
		saleRatio = 0.1;      //������
		this.agentID = agentID;
	}
	//�޼��� �������̵�
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //���ʽ� ����Ʈ ������Ʈ, ���� ��ȯ
		return price - (int)(price * saleRatio);
	}
	
	//�޼��� �������̵�
	public String showCustomerInfo() {
//		return customerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ��" + bonusPoint + "�Դϴ�.";
		return super.showCustomerInfo() + ":" + agentID;  //�θ��ʰ� ��ȯ�޾ƿ��� ��, �������� ��
		
	}
	
}
