
public class Ex1126_2 {

	public static void main(String[] args) {
		// ���� �迭 ���� - �ƽ�Ű�ڵ� ���� ��� (����206p / �迭�� ���� �����ϰ� ����� �迭�� ���)
		
		char[] alpha = new char[26];
		char ch = 'A';   // ����� ���� ����
//		System.out.println(ch);  // ���� ��µ�
//		System.out.println((int)ch);  //���ڷ� ����� ������ int(������ �ڷ���)�� �༭ ���ڷ� ĳ���� �ϰڴ�! ���Ϸ� ���ذ� �� �ʤ���
		
		for(int i = 0; i < alpha.length; i++, ch++) {  //���� /length�� �ǹ̰� ������ []�� �뷮��ŭ�� 
			alpha[i] = ch;  
		}
		
		for(int i = 0; i < alpha.length; i++) {
			System.out.println(alpha[i] + ":" + (int)alpha[i]);
		}
		
//		System.out.println(alpha[25]);
	
	
	}

}
