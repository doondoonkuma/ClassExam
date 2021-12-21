
public class Calculator implements Calc {
	// Calc 인터페이스의 모든 메서드를 반드시 구현해야 함
	public int add(int num1, int num2) {  // 빈 껍데기?를 만든다.
		
		return num1 + num2; // 정수 아무거나 리턴한다. 이게 빈 껍데기다.
	}
	public int substract(int num1, int num2) {  // 빈 껍데기?를 만든다.
		
		return num1 - num2; // 정수 아무거나 리턴한다. 이게 빈 껍데기다.
	}
	public int times(int num1, int num2) {  // 빈 껍데기?를 만든다.
	
		return num1 * num2; // 정수 아무거나 리턴한다. 이게 빈 껍데기다.
	}
	public int divide(int num1, int num2) {  // 빈 껍데기?를 만든다.
		if (num2 != 0)  // num2가 0이 되면 안되니까!
			return num1/num2;
		else
			return Calc.ERROR;
	}
}
