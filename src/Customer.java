public class Customer {
	//상속(교재 234p)
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//디폴트 생성자
	public Customer() {
		initCustomer();
	}
	
	//오버로딩된 생성자
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	//get-
	public String getCustomerName() {
		return customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	
	
	//생성자에서 사용할 메서드
	private void initCustomer() {  //외부에서 접근 불가능하도록
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //보너스 포인트 업데이트, 가격 반환
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}

}