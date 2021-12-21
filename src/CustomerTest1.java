import java.util.*;
public class CustomerTest1 {

	public static void main(String[] args) {
		 //클래스 상속 테스트 (교재 239p)
//		Customer cus = new Customer();  //상위(부모)클래스 객체 생성
//		VIPCustomer vip = new VIPCustomer();  //하위(자식)클래스 객체 생성
//		System.out.println(vip.bonusPoint);   //상위클래스의 멤버변수 사용가능
//		System.out.println(vip.customerID);   //protected로 선언되었을 경우 접근가능
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Customer a1 = new Customer(1001, "디디");
		Customer a2 = new Customer(1002, "루루");
		Customer a3 = new GoldCustomer(1003, "티티");
		Customer a4 = new GoldCustomer(1004, "라라");
		Customer a5 = new VIPCustomer(1005, "모모", 1234);
		customerList.add(a1);
		customerList.add(a2);
		customerList.add(a3);
		customerList.add(a4);
		customerList.add(a5);
		
		System.out.println("====== 고객 정보 출력 ======");
		
		for (int i = 0; i < customerList.size(); i++) {
			Customer abc /*임시변수로 만든것일 뿐*/ = customerList.get(i); //주어진 인덱스로 객체 반환
			System.out.println(abc.showCustomerInfo());
		}   //->고전 방식
		
		System.out.println("====== 고객 정보 출력 ======");
		
		for (Customer item : customerList) {
			System.out.println(item.showCustomerInfo());
		}   //->최신 방식
		
		System.out.println("====== 고객 정보 출력 ======");
		
		int price = 10000; //임시변수 프라이스를 만들어서 5명에게 다 적용시킬거야!
		for (Customer item : customerList) {
			int cost = item.calcPrice(price);  //금액은 반환되고 보너스는 내부에 적립
			System.out.println(item.getCustomerName() + "금액 : " + cost);  //->겟커스토머를 사용해야 누가 얼마인지 알 수 있지!
		}
		System.out.println("====== 고객 정보 출력 ======");
		for (Customer item : customerList) {
			System.out.println(item.showCustomerInfo());
		}
		
		
	}

}
