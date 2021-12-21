
public class VIPCustomer extends Customer { //(교재 236p)이 클래스는 방금 만든 클래스에서 상속 받을 수 있다.(지금은 프라이빗이 걸려있다.)
	
	private int agentID;
	double saleRatio;

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);  //부모클래스의 생성자 호출(디폴트 생성자는 자동 호출 되지만 그렇지 않은 경우 만들어 줘야 한다.)
		                                  //명시적으로 생성자 두 개 호출 하면 디폴트 생성자는 자동 호출 불가능..(이건 헷갈린다.)
		customerGrade = "VIP";
		bonusRatio = 0.05;    //보너스
		saleRatio = 0.1;      //할인율
		this.agentID = agentID;
	}
	//메서드 오버라이딩
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //보너스 포인트 업데이트, 가격 반환
		return price - (int)(price * saleRatio);
	}
	
	//메서드 오버라이딩
	public String showCustomerInfo() {
//		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
		return super.showCustomerInfo() + ":" + agentID;  //부모쪽거 반환받아오기 단, 누구건지 모름
		
	}
	
}
