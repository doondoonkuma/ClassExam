
public class GoldCustomer extends Customer {

	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);  //부모클래스의 생성자 호출(디폴트 생성자는 자동 호출 되지만 그렇지 않은 경우 만들어 줘야 한다.)
		                                  //명시적으로 생성자 두 개 호출 하면 디폴트 생성자는 자동 호출 불가능..(이건 헷갈린다.)
		customerGrade = "GOLD";
		bonusRatio = 0.02;    //보너스
		saleRatio = 0.1;      //할인율
	}
	
	//재정의한 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //보너스 포인트 업데이트, 가격 반환
		return price - (int)(price * saleRatio);
	}
	//showCustomerInfo() 메서드는 상위클래스 그대로 사용
	
	
	
}


