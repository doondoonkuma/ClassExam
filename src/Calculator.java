
public class Calculator implements Calc {
	// Calc �������̽��� ��� �޼��带 �ݵ�� �����ؾ� ��
	public int add(int num1, int num2) {  // �� ������?�� �����.
		
		return num1 + num2; // ���� �ƹ��ų� �����Ѵ�. �̰� �� �������.
	}
	public int substract(int num1, int num2) {  // �� ������?�� �����.
		
		return num1 - num2; // ���� �ƹ��ų� �����Ѵ�. �̰� �� �������.
	}
	public int times(int num1, int num2) {  // �� ������?�� �����.
	
		return num1 * num2; // ���� �ƹ��ų� �����Ѵ�. �̰� �� �������.
	}
	public int divide(int num1, int num2) {  // �� ������?�� �����.
		if (num2 != 0)  // num2�� 0�� �Ǹ� �ȵǴϱ�!
			return num1/num2;
		else
			return Calc.ERROR;
	}
}
