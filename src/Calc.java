public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	// 인터페이스는 메서드의 내용을 구현하지 않음 -> 클래스에서 구현하는 것이다. 그리고 상속 보다는 보조기능이라 생각하자
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);  // 인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
	
}